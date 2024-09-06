package com.onboarding.test.zoloz.configuration;


import com.onboarding.test.zoloz.model.Address;
import com.onboarding.test.zoloz.model.AddressDTO;
import com.onboarding.test.zoloz.service.AddressService;
import com.onboarding.test.zoloz.util.AddressUtil;
import com.onboarding.test.zoloz.util.ExcelAddress;
import lombok.RequiredArgsConstructor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.*;

@Configuration
@RequiredArgsConstructor
public class AddressInit {

    private final ResourceLoader resourceLoader;
    private final AddressService addressService;


    @Bean
    public AddressInit address() {

        final Resource resource = resourceLoader.getResource("classpath:address/addressData.xlsx");


        try (InputStream inputStream = new FileInputStream(resource.getFile())){

            Workbook wb = new XSSFWorkbook(inputStream);

            Sheet mySheet = wb.getSheetAt(3);
            System.out.println(mySheet.getPhysicalNumberOfRows());
            for(int i=1; i<mySheet.getPhysicalNumberOfRows(); i++){

                final Row row = mySheet.getRow(i);

                final String tenDigitPsgc = String.valueOf(row.getCell(ExcelAddress.TEN_DIGIT_PSGC.getValue()));
                final String name = String.valueOf(row.getCell(ExcelAddress.NAME.getValue()));
                final String correspondenceCode = String.valueOf(row.getCell(ExcelAddress.CORRESPONDENCE_CODE.getValue()));
                final String geographicLevel = String.valueOf(row.getCell(ExcelAddress.GEOGRAPHIC_LEVEL.getValue()));
                final String oldName = String.valueOf(row.getCell(ExcelAddress.OLD_NAME.getValue()));
                final String cityClass = String.valueOf(row.getCell(ExcelAddress.CITY_CLASS.getValue()));
                final String incomeClassification = String.valueOf(row.getCell(ExcelAddress.INCOME_CLASSIFICATION.getValue()));
                final String urbanRural = String.valueOf(row.getCell(ExcelAddress.URBAN_RURAL.getValue()));
                final String status = String.valueOf(row.getCell(ExcelAddress.STATUS.getValue()));


                final AddressDTO addressDTO = AddressDTO
                        .builder()
                        .tenDigitPsgc(tenDigitPsgc)
                        .name(name)
                        .correspondenceCode(correspondenceCode)
                        .geographicLevel(geographicLevel)
                        .oldName(oldName)
                        .cityClass(cityClass)
                        .incomeClassification(incomeClassification)
                        .urbanRural(urbanRural)
                        .status(status)
                        .build();


                try {
                    final int regionIndex = ExcelAddress.REGION_LAST_INDEX.getValue() + 1;
                    final int provinceLastIndex = ExcelAddress.PROVINCE_CODE_LAST_INDEX.getValue()  + 1;
                    final int municipalityLastIndex = ExcelAddress.MUNICIPALITY_LAST_INDEX.getValue()  + 1;
                    final int barangayLastIndex = ExcelAddress.BARANGAY_LAST_INDEX.getValue()  + 1;


                    final String regionKey = addressDTO.getTenDigitPsgc().substring(0, regionIndex);
                    final String provinceKey = addressDTO.getTenDigitPsgc().substring(regionIndex, provinceLastIndex);
                    final String municipalityKey = addressDTO.getTenDigitPsgc().substring(provinceLastIndex, municipalityLastIndex);
                    final String barangayKey = addressDTO.getTenDigitPsgc().substring(municipalityLastIndex, barangayLastIndex);


                    final Address address = Address.builder()
                            .code(tenDigitPsgc)
                            .regionCode(regionKey)
                            .provinceCode(provinceKey)
                            .cityCode(municipalityKey)
                            .barangayCode(barangayKey)
                            .name(name)
                            .geographicLevel(geographicLevel)
                            .build();


                    switch (geographicLevel){
                        case AddressUtil.REGION:
                            address.setProvinceCode(null);
                            address.setCityCode(null);
                            address.setBarangayCode(null);
                            break;
                        case AddressUtil.PROVINCE:
                            address.setCityCode(null);
                            address.setBarangayCode(null);
                            break;
                        case AddressUtil.MUNICIPALITY:
                            address.setBarangayCode(null);
                            break;

                            default:
                                break;
                    }

                    addressService.save(address);


//                    addressesData.putIfAbsent(regionKey, new HashMap<>());
//                    addressesData.get(regionKey).putIfAbsent(provinceKey, new HashMap<>());
//                    addressesData.get(regionKey).get(provinceKey).putIfAbsent(municipalityKey, new HashMap<>());
//                    addressesData.get(regionKey).get(provinceKey).get(municipalityKey).putIfAbsent(barangayKey, addressDTO);

                }
                catch (Exception e){

                }

            }



        }catch (IOException e) {

        }




//        try (InputStream inputStream = new FileInputStream(resource.getFile())) {
//            HSSFWorkbook wb = new HSSFWorkbook(inputStream);
//            HSSFSheet hs = wb.getSheetAt(2);
//            int number = wb.getNumberOfSheets();
//            System.out.println(number);
//            FormulaEvaluator form = wb.getCreationHelper().createFormulaEvaluator();
//            HSSFCell value = wb.getSheetAt(0).getRow(14).getCell(1);
//
//            System.out.println(hs.getSheetName());
//
////            for (Row rw : hs){
////                for(Cell cell : rw){
////                    switch(form.evaluateInCell(cell).getCellType()){
////                        case Cell.CELL_TYPE_NUMERIC:
////                            System.out.println(cell.getNumericCellValue());
////                        case Cell.CELL_TYPE_STRING:
////                            System.out.println(cell.getStringCellValue());
////                    }
////                }
////            }
//        }catch (IOException e) {
//
//        }


        return this;
    }
}
