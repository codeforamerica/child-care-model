package org.formflowstartertemplate.app.inputs;

import formflow.library.data.annotations.Money;
import java.util.ArrayList;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Ubi {

  // Needs to be declared since Spring Security inserts _csrf as a hidden field to all forms
  private String _csrf;

  private MultipartFile ubiFiles;

  // Language Preferences Screen
  private String languageRead;
  private String languageSpoken;
  private String needInterpreter;

  // Personal Info Screen
  @NotBlank(message = "{personal-info.provide-first-name}")
  private String firstName;
  @NotBlank(message = "{personal-info.provide-last-name}")
  private String lastName;
  @Min(value = 1, message = "{personal-info.provide-birth-day-min}")
  @Max(value = 31, message = "{personal-info.provide-birth-day-max}")
  private String birthDay;
  @Min(value = 1, message = "{personal-info.provide-birth-month-min}")
  @Max(value = 12, message = "{personal-info.provide-birth-month-max}")
  private String birthMonth;
  @Min(value = 1850, message = "{personal-info.provide-birth-year-min}")
  @Max(value = 2100, message = "{personal-info.provide-birth-year-max}")
  private String birthYear;
  private String genderIdentity;
  private String movedToUSA;
  private String movedToUSADay;
  private String movedToUSAMonth;
  // TODO: figure out how to only have day & month for a date fragment
  private String movedToUSAYear;
  private String movedFromCountry;

  // Home Address Screen
  @NotBlank
  private String streetAddress;
  private String apartment;
  @NotBlank
  private String city;
  @NotBlank
  private String state;
  @NotBlank
  private String zip;

  // Housemates Screen
  private String hasHousehold;

  // Housemate Info Screen
  @NotBlank
  private String householdMemberFirstName;
  @NotBlank
  private String householdMemberLastName;
  private String householdMemberRelationship;
  private String householdMemberRecentlyMovedToUS;
  private String householdAddressFile;  // file id

  // Household Member Income Screen
  @NotBlank(message = "{household-member-income.failed-to-make-selection}")
  private String householdMember;

  // Income Types Screen
  @NotEmpty(message = "{income-types.error}")
  private ArrayList<String> incomeTypes;

  // Income Amounts Screen
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeJobAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeSelfAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeUnemploymentAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeSocialSecurityAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeRetirementAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeChildOrSpousalSupportAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomePensionAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeInvestmentAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeCapitalGainsAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeRentalOrRoyaltyAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeFarmOrFishAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeAlimonyAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeTaxableScholarshipAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeCancelledDebtAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeCourtAwardsAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeGamblingAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeJuryDutyPayAmount;
  @NotBlank(message = "{income-amounts.must-select-one}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String incomeOtherAmount;

  // Reported Household Annual Income Screen
  @NotBlank(message = "{household-reported-annual-pre-tax-income.please-enter-a-value}")
  @Money(message = "{income-amounts.must-be-dollars-cents}")
  private String reportedTotalAnnualHouseholdIncome;
}
