package com.onboarding.test.zoloz.controller;

import com.onboarding.test.zoloz.model.ResponseMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FileRecordController {


    @PostMapping("/upload")
    public Mono<ResponseEntity<ResponseMessage>> uploadFile(@RequestPart("file") Mono<FilePart> filePartMono) {

        System.out.println(filePartMono);

        return null;
    }
//        return storageService.save(filePartMono).map(
//                (filename) -> ResponseEntity.ok().body(new ResponseMessage("Uploaded the file successfully: " + filename)));
    }

//    private static String partMapDescription(MultiValueMap<String, Part> partsMap) {
//        return partsMap.keySet().stream().sorted()
//                .map(key -> partListDescription(partsMap.get(key)))
//                .collect(Collectors.joining(",", "Map[", "]"));
//    }
//
//    private static Mono<String> partFluxDescription(Flux<? extends Part> partsFlux) {
//        return partsFlux.log().collectList().map(MultipartController::partListDescription);
//    }
//
//    private static String partListDescription(List<? extends Part> parts) {
//        return parts.stream().map(MultipartController::partDescription)
//                .collect(Collectors.joining(",", "[", "]"));
//    }
//
//    private static String partDescription(Part part) {
//        return part instanceof FilePart ? part.name() + ":" + ((FilePart) part).filename() : part.name();
//    }


