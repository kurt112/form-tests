package com.onboarding.test.zoloz.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TufDTO {

    @JsonProperty("Segment")
    public int segment;
    @JsonProperty("TotalAcounts")
    public int totalAcounts;
    @JsonProperty("TotalCreditLimit")
    public int totalCreditLimit;
    @JsonProperty("TUScore")
    public int tUScore;
    @JsonProperty("MaxMOB")
    public int maxMOB;
    @JsonProperty("TUSegment")
    public int tUSegment;
    @JsonProperty("RiskGrade")
    public String riskGrade;
    @JsonProperty("ScoreType")
    public String scoreType;
    @JsonProperty("PredictedProbability")
    public double predictedProbability;
    @JsonProperty("BureauRating")
    public String bureauRating;
    @JsonProperty("BureauScoreType")
    public String bureauScoreType;
    @JsonProperty("TUEF")
    public String tUEF;
    @JsonProperty("BCCTestingPurposes")
    public BCCTestingPurposes bCCTestingPurposes;
    @JsonProperty("BCC")
    public BCC bCC;
    @JsonProperty("TUCreditFullReport")
    public TUCreditFullReport tUCreditFullReport;

    @lombok.Data
    public static  class AC{
        @JsonProperty("AccountEnquiry")
        public ArrayList<AccountEnquiry> accountEnquiry;
    }

    @lombok.Data
    public static class AccountEnquiry{
        @JsonProperty("LastUpdatedDate")
        public String lastUpdatedDate;
        @JsonProperty("FreshCashAdvanceLength")
        public String freshCashAdvanceLength;
        @JsonProperty("LegalAction")
        public String legalAction;
        @JsonProperty("ConsumerCommercial")
        public String consumerCommercial;
        @JsonProperty("ReportedDate")
        public String reportedDate;
        @JsonProperty("AccountHolderType")
        public String accountHolderType;
        @JsonProperty("OutStandingBalanceFieldLength")
        public String outStandingBalanceFieldLength;
        @JsonProperty("AccountHolderTypeLength")
        public String accountHolderTypeLength;
        @JsonProperty("InterestFees")
        public String interestFees;
        @JsonProperty("InterestFeesFieldLength")
        public String interestFeesFieldLength;
        @JsonProperty("AccountTypeLength")
        public String accountTypeLength;
        @JsonProperty("PastDueAmount")
        public String pastDueAmount;
        @JsonProperty("MemberShortName")
        public String memberShortName;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("LastUpdatedDateFieldLength")
        public String lastUpdatedDateFieldLength;
        @JsonProperty("AccountStatusLength")
        public String accountStatusLength;
        @JsonProperty("OpenedDate")
        public String openedDate;
        @JsonProperty("LegalActionLength")
        public String legalActionLength;
        @JsonProperty("CurrencyCode")
        public String currencyCode;
        @JsonProperty("AccountStatus")
        public String accountStatus;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("OpenedDateLength")
        public String openedDateLength;
        @JsonProperty("NoOfDaysPastDue")
        public String noOfDaysPastDue;
        @JsonProperty("PastDueAmountFieldLength")
        public String pastDueAmountFieldLength;
        @JsonProperty("UnBilledBalanceFieldLength")
        public String unBilledBalanceFieldLength;
        @JsonProperty("UnBilledBalance")
        public String unBilledBalance;
        @JsonProperty("ConsumerCommercialLength")
        public String consumerCommercialLength;
        @JsonProperty("MemberShortNameLength")
        public String memberShortNameLength;
        @JsonProperty("PartialPaymentLength")
        public String partialPaymentLength;
        @JsonProperty("FreshCashAdvance")
        public String freshCashAdvance;
        @JsonProperty("PaymentHistory1")
        public String paymentHistory1;
        @JsonProperty("CashAdvanceBalanceFieldLength")
        public String cashAdvanceBalanceFieldLength;
        @JsonProperty("AccountType")
        public String accountType;
        @JsonProperty("NoOfDaysPastDueFieldLength")
        public String noOfDaysPastDueFieldLength;
        @JsonProperty("CashAdvanceBalance")
        public String cashAdvanceBalance;
        @JsonProperty("OutStandingBalance")
        public String outStandingBalance;
        @JsonProperty("PaymentAmt")
        public String paymentAmt;
        @JsonProperty("PartialPayment")
        public String partialPayment;
        @JsonProperty("PaymentHistory1FieldLength")
        public String paymentHistory1FieldLength;
        @JsonProperty("PaymentAmtLength")
        public String paymentAmtLength;
        @JsonProperty("ReportedDateFieldLength")
        public String reportedDateFieldLength;
    }

    @lombok.Data
    public static class Applicant{
        @JsonProperty("ServiceTypeHistory")
        public ServiceTypeHistory serviceTypeHistory;
        @JsonProperty("Attributes")
        public Attributes attributes;
        @JsonProperty("DSBureauHardPullStatus")
        public DSBureauHardPullStatus dSBureauHardPullStatus;
        @JsonProperty("DSBureauHardPullData")
        public DSBureauHardPullData dSBureauHardPullData;
    }

    @lombok.Data
    public static class ApplicantsIO{
        @JsonProperty("Applicant")
        public ArrayList<Applicant> applicant;
    }

    @lombok.Data
    public static class Attributes{
        @JsonProperty("ServiceType")
        public String serviceType;
    }

    @lombok.Data
    public static class BCC{
        @JsonProperty("BCC0001")
        public String bCC0001;
        @JsonProperty("AT02S")
        public String aT02S;
        @JsonProperty("BCC0009")
        public String bCC0009;
        @JsonProperty("BCC0010")
        public String bCC0010;
        @JsonProperty("BCC0272")
        public String bCC0272;
        @JsonProperty("BCC0276")
        public String bCC0276;
        @JsonProperty("BCC0277")
        public String bCC0277;
        @JsonProperty("BCC0002")
        public String bCC0002;
        @JsonProperty("BCC0006")
        public String bCC0006;
        @JsonProperty("BCC0060")
        public String bCC0060;
        @JsonProperty("BCC0107")
        public String bCC0107;
        @JsonProperty("BCC0108")
        public String bCC0108;
        @JsonProperty("BCC0203")
        public String bCC0203;
        @JsonProperty("BCCIS01")
        public String bCCIS01;
        @JsonProperty("BC28S_N")
        public String bC28S_N;
        @JsonProperty("BCC0274")
        public String bCC0274;
        @JsonProperty("BCCSegment")
        public ArrayList<BCCSegment> bCCSegment;
    }

    @lombok.Data
    public static class BCCSegment{
        @JsonProperty("BCCValue")
        public String bCCValue;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("BCCValueLength")
        public String bCCValueLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
    }

    @lombok.Data
    public static class BCCTestingPurposes{
        @JsonProperty("ActiveAccountCount")
        public int activeAccountCount;
        @JsonProperty("BlockedAccountCount")
        public int blockedAccountCount;
        @JsonProperty("OldestOpenAccountDate")
        public String oldestOpenAccountDate;
        @JsonProperty("OpenAccountCount")
        public int openAccountCount;
        @JsonProperty("Utilization")
        public int utilization;
        @JsonProperty("WorstDelinquencyL12Month")
        public String worstDelinquencyL12Month;
        @JsonProperty("WriteOffAccountCount")
        public int writeOffAccountCount;
        @JsonProperty("BureauSegment")
        public int bureauSegment;
        @JsonProperty("MaxXDPDL12MonthsCount")
        public int maxXDPDL12MonthsCount;
        @JsonProperty("Max30DPDL12MonthsCount")
        public int max30DPDL12MonthsCount;
        @JsonProperty("Max60DPDL12MonthsCount")
        public int max60DPDL12MonthsCount;
        @JsonProperty("Max90DPDL12MonthsCount")
        public int max90DPDL12MonthsCount;
        @JsonProperty("NumberofClosedAccountsRestructured")
        public int numberofClosedAccountsRestructured;
        @JsonProperty("NumberofRevolverAccounts")
        public int numberofRevolverAccounts;
        @JsonProperty("WorstDelinquencyL12MonthN")
        public String worstDelinquencyL12MonthN;
    }

    @lombok.Data
    public static class ContactNumberSegment{
        @JsonProperty("ContactNumberFieldLength")
        public String contactNumberFieldLength;
        @JsonProperty("LastReportedDate")
        public String lastReportedDate;
        @JsonProperty("MultipleContributor")
        public String multipleContributor;
        @JsonProperty("CountryCodeFieldLength")
        public String countryCodeFieldLength;
        @JsonProperty("NumberTypeFieldLength")
        public String numberTypeFieldLength;
        @JsonProperty("FormatFieldLength")
        public String formatFieldLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("AreaCodeFieldLength")
        public String areaCodeFieldLength;
        @JsonProperty("FileSinceDate")
        public String fileSinceDate;
        @JsonProperty("NumberType")
        public String numberType;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("Format")
        public String format;
        @JsonProperty("ContactNumber")
        public String contactNumber;
        @JsonProperty("AreaCode")
        public String areaCode;
        @JsonProperty("CountryCode")
        public String countryCode;
        @JsonProperty("ReportedViaAcct")
        public String reportedViaAcct;
    }

    @lombok.Data
    public static class CreditExposureSegment{
        @JsonProperty("TotalAccountsLength")
        public String totalAccountsLength;
        @JsonProperty("TotalLoanAmt")
        public String totalLoanAmt;
        @JsonProperty("TotalLoanAmtLength")
        public String totalLoanAmtLength;
        @JsonProperty("TotalPastDueAmt1")
        public String totalPastDueAmt1;
        @JsonProperty("TotalCreditLimitLength")
        public String totalCreditLimitLength;
        @JsonProperty("ConsumerCommercial")
        public String consumerCommercial;
        @JsonProperty("TotalAccounts1")
        public String totalAccounts1;
        @JsonProperty("TotalCurrentBalance")
        public String totalCurrentBalance;
        @JsonProperty("TotalCreditLimit")
        public String totalCreditLimit;
        @JsonProperty("TotalAccounts1Length")
        public String totalAccounts1Length;
        @JsonProperty("TotalUsedCreditLimitLength")
        public String totalUsedCreditLimitLength;
        @JsonProperty("ConsumerCommercialLength")
        public String consumerCommercialLength;
        @JsonProperty("TotalCurrentBalanceLength")
        public String totalCurrentBalanceLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("TotalInstallmentAmtLength")
        public String totalInstallmentAmtLength;
        @JsonProperty("CurrencyCode")
        public String currencyCode;
        @JsonProperty("TotalPastDueAmt1Length")
        public String totalPastDueAmt1Length;
        @JsonProperty("TotalUsedCreditLimit")
        public String totalUsedCreditLimit;
        @JsonProperty("CurrencyCodeLength")
        public String currencyCodeLength;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("TotalInstallmentAmt")
        public String totalInstallmentAmt;
        @JsonProperty("TotalAccounts")
        public String totalAccounts;
        @JsonProperty("TotalPastDueAmt")
        public String totalPastDueAmt;
        @JsonProperty("TotalPastDueAmtLength")
        public String totalPastDueAmtLength;
    }

    @lombok.Data
    public static class CreditReport{
        @JsonProperty("AC")
        public AC aC;
        @JsonProperty("BCC")
        public BCC bCC;
        @JsonProperty("IQ")
        public IQ iQ;
        @JsonProperty("EM")
        public EM eM;
        @JsonProperty("SC")
        public SC sC;
        @JsonProperty("PA")
        public PA pA;
        @JsonProperty("EX")
        public EX eX;
        @JsonProperty("NA")
        public NA nA;
        @JsonProperty("Header")
        public Header header;
        @JsonProperty("PH")
        public PH pH;
        @JsonProperty("SM")
        public SM sM;
        @JsonProperty("ID")
        public ID iD;
        @JsonProperty("EA")
        public EA eA;
        @JsonProperty("ED")
        public ED eD;
    }

    @lombok.Data
    public static class Data{
        @JsonProperty("CreditReportHTML")
        public String creditReportHTML;
        @JsonProperty("RawResponse")
        public String rawResponse;
        @JsonProperty("CreditReport")
        public CreditReport creditReport;
    }

    @lombok.Data
    public static class DSBureauHardPullData{
        @JsonProperty("Response")
        public Response response;
    }

    @lombok.Data
    public static class DSBureauHardPullStatus{
        @JsonProperty("IsSuccess")
        public boolean isSuccess;
        @JsonProperty("Outcome")
        public String outcome;
    }

    @lombok.Data
    public static class EA{
        @JsonProperty("EmailAddressSegment")
        public ArrayList<EmailAddressSegment> emailAddressSegment;
    }

    @lombok.Data
    public static class ED{
        @JsonProperty("EducationSegment")
        public ArrayList<EducationSegment> educationSegment;
    }

    @lombok.Data
    public static class EducationSegment{
        @JsonProperty("FileSinceDate")
        public String fileSinceDate;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("LastReportedDate")
        public String lastReportedDate;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("FileSinceDateFieldLength")
        public String fileSinceDateFieldLength;
        @JsonProperty("EducationLevel")
        public String educationLevel;
        @JsonProperty("LastReportedDateFieldLength")
        public String lastReportedDateFieldLength;
        @JsonProperty("EducationLevelLength")
        public String educationLevelLength;
    }

    @lombok.Data
    public static class EM{
        @JsonProperty("EmploymentSegment")
        public ArrayList<EmploymentSegment> employmentSegment;
    }

    @lombok.Data
    public static class EmailAddressSegment{
        @JsonProperty("FileSinceDate")
        public String fileSinceDate;
        @JsonProperty("ReportedViaAcctFieldLength")
        public String reportedViaAcctFieldLength;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("LastReportedDate")
        public String lastReportedDate;
        @JsonProperty("EmailAddressLength")
        public String emailAddressLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("FileSinceDateFieldLength")
        public String fileSinceDateFieldLength;
        @JsonProperty("LastReportedDateFieldLength")
        public String lastReportedDateFieldLength;
        @JsonProperty("EmailAddress")
        public String emailAddress;
        @JsonProperty("ReportedViaAcct")
        public String reportedViaAcct;
    }

    @lombok.Data
    public static class EmploymentSegment{
        @JsonProperty("LastReportedDate")
        public String lastReportedDate;
        @JsonProperty("EmploymentTypeLength")
        public String employmentTypeLength;
        @JsonProperty("EmploymentMonthsLength")
        public String employmentMonthsLength;
        @JsonProperty("EmploymentMonths")
        public String employmentMonths;
        @JsonProperty("NatureOfBusiness")
        public String natureOfBusiness;
        @JsonProperty("EmploymentYearsLength")
        public String employmentYearsLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("FileSinceDateFieldLength")
        public String fileSinceDateFieldLength;
        @JsonProperty("EmploymentYears")
        public String employmentYears;
        @JsonProperty("EmploymentType")
        public String employmentType;
        @JsonProperty("CurrencyCode")
        public String currencyCode;
        @JsonProperty("FileSinceDate")
        public String fileSinceDate;
        @JsonProperty("Occupation")
        public String occupation;
        @JsonProperty("OccupationLength")
        public String occupationLength;
        @JsonProperty("CompanyName")
        public String companyName;
        @JsonProperty("CurrencyCodeLength")
        public String currencyCodeLength;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("ConsumerAnnualIncomeLength")
        public String consumerAnnualIncomeLength;
        @JsonProperty("NatureOfBusinessLength")
        public String natureOfBusinessLength;
        @JsonProperty("CompanyNameLength")
        public String companyNameLength;
        @JsonProperty("ConsumerAnnualIncome")
        public String consumerAnnualIncome;
    }

    @lombok.Data
    public static class EX{
        @JsonProperty("CreditExposureSegment")
        public CreditExposureSegment creditExposureSegment;
    }

    @lombok.Data
    public static class Fields{
        @JsonProperty("Applicants_IO")
        public ApplicantsIO applicants_IO;
    }

    @lombok.Data
    public static class Header{
        @JsonProperty("EnquiryControlNumber")
        public String enquiryControlNumber;
        @JsonProperty("UserId")
        public String userId;
        @JsonProperty("MemberReferenceNumber")
        public String memberReferenceNumber;
        @JsonProperty("TimeProcessed")
        public String timeProcessed;
        @JsonProperty("DateProcessed")
        public String dateProcessed;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("Version11")
        public String version11;
        @JsonProperty("SubjectReturnCode")
        public String subjectReturnCode;
    }

    @lombok.Data
    public static class ID{
        @JsonProperty("IDSegment")
        public ArrayList<IDSegment> iDSegment;
    }

    @lombok.Data
    public static class IDSegment{
        @JsonProperty("IDNumberLength")
        public String iDNumberLength;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("IDType")
        public String iDType;
        @JsonProperty("IDTypeLength")
        public String iDTypeLength;
        @JsonProperty("IDNumber")
        public String iDNumber;
    }

    @lombok.Data
    public static class InquirySegment{
        @JsonProperty("EnquiryPurpose")
        public String enquiryPurpose;
        @JsonProperty("EnquiryAmount")
        public String enquiryAmount;
        @JsonProperty("EnquiryAccountTypeLength")
        public String enquiryAccountTypeLength;
        @JsonProperty("MemberShortName")
        public String memberShortName;
        @JsonProperty("MemberShortNameLength")
        public String memberShortNameLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("EnquiryAccountType")
        public String enquiryAccountType;
        @JsonProperty("EnquiryPurposeLength")
        public String enquiryPurposeLength;
        @JsonProperty("CurrencyCode")
        public String currencyCode;
        @JsonProperty("InquiryDate")
        public String inquiryDate;
        @JsonProperty("CurrencyCodeLength")
        public String currencyCodeLength;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("EnquiryAmountLength")
        public String enquiryAmountLength;
        @JsonProperty("InquiryDateLength")
        public String inquiryDateLength;
    }

    @lombok.Data
    public static class IQ{
        @JsonProperty("InquirySegment")
        public ArrayList<InquirySegment> inquirySegment;
    }

    @lombok.Data
    public static class NA{
        @JsonProperty("NameSegment")
        public NameSegment nameSegment;
    }

    @lombok.Data
    public static class NameSegment{
        @JsonProperty("NumberOfDependants")
        public String numberOfDependants;
        @JsonProperty("CarOwnerShip")
        public String carOwnerShip;
        @JsonProperty("DOBLength")
        public String dOBLength;
        @JsonProperty("LastNameLength")
        public String lastNameLength;
        @JsonProperty("FirstName")
        public String firstName;
        @JsonProperty("CivilStatusLength")
        public String civilStatusLength;
        @JsonProperty("HomeOwnerShip")
        public String homeOwnerShip;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("Gender")
        public String gender;
        @JsonProperty("HomeOwnerShipLength")
        public String homeOwnerShipLength;
        @JsonProperty("Nationality")
        public String nationality;
        @JsonProperty("CarOwnerShipLength")
        public String carOwnerShipLength;
        @JsonProperty("CivilStatus")
        public String civilStatus;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("NationalityLength")
        public String nationalityLength;
        @JsonProperty("FirstNameLength")
        public String firstNameLength;
        @JsonProperty("DOB")
        public String dOB;
        @JsonProperty("NumberOfDependantsLength")
        public String numberOfDependantsLength;
        @JsonProperty("LastName")
        public String lastName;
        @JsonProperty("GenderLength")
        public String genderLength;
    }

    @lombok.Data
    public static class PA{
        @JsonProperty("PrimaryAddressSegment")
        public ArrayList<PrimaryAddressSegment> primaryAddressSegment;
    }

    @lombok.Data
    public static class PH{
        @JsonProperty("ContactNumberSegment")
        public ArrayList<ContactNumberSegment> contactNumberSegment;
    }

    @lombok.Data
    public static class PrimaryAddressSegment{
        @JsonProperty("OfficialAddressFieldLength")
        public String officialAddressFieldLength;
        @JsonProperty("LastReportedDate")
        public String lastReportedDate;
        @JsonProperty("ZipCode")
        public String zipCode;
        @JsonProperty("ReportedViaAct")
        public String reportedViaAct;
        @JsonProperty("AddressOfUnknownType")
        public String addressOfUnknownType;
        @JsonProperty("AddressLine2FieldLength")
        public String addressLine2FieldLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("BillingAddress")
        public String billingAddress;
        @JsonProperty("AddressLine3")
        public String addressLine3;
        @JsonProperty("FileSinceDate")
        public String fileSinceDate;
        @JsonProperty("AddressLine2")
        public String addressLine2;
        @JsonProperty("AddressLine1")
        public String addressLine1;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("AddressOfOtherType")
        public String addressOfOtherType;
        @JsonProperty("AddressLine3FieldLength")
        public String addressLine3FieldLength;
        @JsonProperty("ZipCodeFieldLength")
        public String zipCodeFieldLength;
        @JsonProperty("OfficialAddress")
        public String officialAddress;
        @JsonProperty("ResidentialAddress")
        public String residentialAddress;
        @JsonProperty("AddressLine1FieldLength")
        public String addressLine1FieldLength;
    }

    @lombok.Data
    public static class Response{
        @JsonProperty("Data")
        public Data data;
    }

    @lombok.Data
    public static class ResponseInfo{
        @JsonProperty("ApplicationId")
        public int applicationId;
        @JsonProperty("SolutionSetInstanceId")
        public String solutionSetInstanceId;
        @JsonProperty("CurrentQueue")
        public String currentQueue;
    }

    @lombok.Data
    public static class SC{
        @JsonProperty("ScoreSegment")
        public ScoreSegment scoreSegment;
    }

    @lombok.Data
    public static class ScoreSegment{
        @JsonProperty("PredictedProbability")
        public String predictedProbability;
        @JsonProperty("Score")
        public String score;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("PredictedProbabilityLength")
        public String predictedProbabilityLength;
        @JsonProperty("RiskGradeLength")
        public String riskGradeLength;
        @JsonProperty("SegmentLength")
        public String segmentLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("ScoreType")
        public String scoreType;
        @JsonProperty("Segment")
        public String segment;
        @JsonProperty("ScoreTypeLength")
        public String scoreTypeLength;
        @JsonProperty("RiskGrade")
        public String riskGrade;
        @JsonProperty("ScoreLength")
        public String scoreLength;
    }

    @lombok.Data
    public static class ServiceType{
        @JsonProperty("ServiceCalledDateTime")
        public Date serviceCalledDateTime;
        @JsonProperty("IsSuccess")
        public boolean isSuccess;
        @JsonProperty("Name")
        public String name;
    }

    @lombok.Data
    public static class ServiceTypeHistory{
        @JsonProperty("ServiceTypes")
        public ArrayList<ServiceType> serviceTypes;
    }

    @lombok.Data
    public static class SM{
        @JsonProperty("SummarySegment")
        public SummarySegment summarySegment;
    }

    @lombok.Data
    public static class SummarySegment{
        @JsonProperty("OpenAccountLength")
        public String openAccountLength;
        @JsonProperty("OpenAccount")
        public String openAccount;
        @JsonProperty("SegmentTagLength")
        public String segmentTagLength;
        @JsonProperty("EnquiryAlert")
        public String enquiryAlert;
        @JsonProperty("ClosedAccount")
        public String closedAccount;
        @JsonProperty("ClosedAccountLength")
        public String closedAccountLength;
        @JsonProperty("EnquiryAlertLength")
        public String enquiryAlertLength;
        @JsonProperty("AliasNameAlertLength")
        public String aliasNameAlertLength;
        @JsonProperty("SegmentTag")
        public String segmentTag;
        @JsonProperty("AliasNameAlert")
        public String aliasNameAlert;
    }

    @lombok.Data
        public static class TUCreditFullReport{
        @JsonProperty("Status")
        public String status;
        @JsonProperty("ResponseInfo")
        public ResponseInfo responseInfo;
        @JsonProperty("Fields")
        public Fields fields;
    }


}
