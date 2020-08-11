package com.commercetools.api.models.common;


import com.commercetools.api.models.common.Address;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AddressBuilder {


   private String country;

   @Nullable
   private String lastName;

   @Nullable
   private String pOBox;

   @Nullable
   private String city;

   @Nullable
   private String streetNumber;

   @Nullable
   private String postalCode;

   @Nullable
   private String mobile;

   @Nullable
   private String externalId;

   @Nullable
   private String additionalAddressInfo;

   @Nullable
   private String title;

   @Nullable
   private String building;

   @Nullable
   private String firstName;

   @Nullable
   private String streetName;

   @Nullable
   private String phone;

   @Nullable
   private String additionalStreetInfo;

   @Nullable
   private String company;

   @Nullable
   private String state;

   @Nullable
   private String salutation;

   @Nullable
   private String id;

   @Nullable
   private String fax;

   @Nullable
   private String department;

   @Nullable
   private String region;

   @Nullable
   private String email;

   @Nullable
   private String apartment;

   @Nullable
   private String key;

   public AddressBuilder country( final String country) {
      this.country = country;
      return this;
   }

   public AddressBuilder lastName(@Nullable final String lastName) {
      this.lastName = lastName;
      return this;
   }

   public AddressBuilder pOBox(@Nullable final String pOBox) {
      this.pOBox = pOBox;
      return this;
   }

   public AddressBuilder city(@Nullable final String city) {
      this.city = city;
      return this;
   }

   public AddressBuilder streetNumber(@Nullable final String streetNumber) {
      this.streetNumber = streetNumber;
      return this;
   }

   public AddressBuilder postalCode(@Nullable final String postalCode) {
      this.postalCode = postalCode;
      return this;
   }

   public AddressBuilder mobile(@Nullable final String mobile) {
      this.mobile = mobile;
      return this;
   }

   public AddressBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }

   public AddressBuilder additionalAddressInfo(@Nullable final String additionalAddressInfo) {
      this.additionalAddressInfo = additionalAddressInfo;
      return this;
   }

   public AddressBuilder title(@Nullable final String title) {
      this.title = title;
      return this;
   }

   public AddressBuilder building(@Nullable final String building) {
      this.building = building;
      return this;
   }

   public AddressBuilder firstName(@Nullable final String firstName) {
      this.firstName = firstName;
      return this;
   }

   public AddressBuilder streetName(@Nullable final String streetName) {
      this.streetName = streetName;
      return this;
   }

   public AddressBuilder phone(@Nullable final String phone) {
      this.phone = phone;
      return this;
   }

   public AddressBuilder additionalStreetInfo(@Nullable final String additionalStreetInfo) {
      this.additionalStreetInfo = additionalStreetInfo;
      return this;
   }

   public AddressBuilder company(@Nullable final String company) {
      this.company = company;
      return this;
   }

   public AddressBuilder state(@Nullable final String state) {
      this.state = state;
      return this;
   }

   public AddressBuilder salutation(@Nullable final String salutation) {
      this.salutation = salutation;
      return this;
   }

   public AddressBuilder id(@Nullable final String id) {
      this.id = id;
      return this;
   }

   public AddressBuilder fax(@Nullable final String fax) {
      this.fax = fax;
      return this;
   }

   public AddressBuilder department(@Nullable final String department) {
      this.department = department;
      return this;
   }

   public AddressBuilder region(@Nullable final String region) {
      this.region = region;
      return this;
   }

   public AddressBuilder email(@Nullable final String email) {
      this.email = email;
      return this;
   }

   public AddressBuilder apartment(@Nullable final String apartment) {
      this.apartment = apartment;
      return this;
   }

   public AddressBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }


   public String getCountry(){
      return this.country;
   }

   @Nullable
   public String getLastName(){
      return this.lastName;
   }

   @Nullable
   public String getPOBox(){
      return this.pOBox;
   }

   @Nullable
   public String getCity(){
      return this.city;
   }

   @Nullable
   public String getStreetNumber(){
      return this.streetNumber;
   }

   @Nullable
   public String getPostalCode(){
      return this.postalCode;
   }

   @Nullable
   public String getMobile(){
      return this.mobile;
   }

   @Nullable
   public String getExternalId(){
      return this.externalId;
   }

   @Nullable
   public String getAdditionalAddressInfo(){
      return this.additionalAddressInfo;
   }

   @Nullable
   public String getTitle(){
      return this.title;
   }

   @Nullable
   public String getBuilding(){
      return this.building;
   }

   @Nullable
   public String getFirstName(){
      return this.firstName;
   }

   @Nullable
   public String getStreetName(){
      return this.streetName;
   }

   @Nullable
   public String getPhone(){
      return this.phone;
   }

   @Nullable
   public String getAdditionalStreetInfo(){
      return this.additionalStreetInfo;
   }

   @Nullable
   public String getCompany(){
      return this.company;
   }

   @Nullable
   public String getState(){
      return this.state;
   }

   @Nullable
   public String getSalutation(){
      return this.salutation;
   }

   @Nullable
   public String getId(){
      return this.id;
   }

   @Nullable
   public String getFax(){
      return this.fax;
   }

   @Nullable
   public String getDepartment(){
      return this.department;
   }

   @Nullable
   public String getRegion(){
      return this.region;
   }

   @Nullable
   public String getEmail(){
      return this.email;
   }

   @Nullable
   public String getApartment(){
      return this.apartment;
   }

   @Nullable
   public String getKey(){
      return this.key;
   }

   public Address build() {
       return new AddressImpl(country, lastName, pOBox, city, streetNumber, postalCode, mobile, externalId, additionalAddressInfo, title, building, firstName, streetName, phone, additionalStreetInfo, company, state, salutation, id, fax, department, region, email, apartment, key);
   }

   public static AddressBuilder of() {
      return new AddressBuilder();
   }

   public static AddressBuilder of(final Address template) {
      AddressBuilder builder = new AddressBuilder();
      builder.country = template.getCountry();
      builder.lastName = template.getLastName();
      builder.pOBox = template.getPOBox();
      builder.city = template.getCity();
      builder.streetNumber = template.getStreetNumber();
      builder.postalCode = template.getPostalCode();
      builder.mobile = template.getMobile();
      builder.externalId = template.getExternalId();
      builder.additionalAddressInfo = template.getAdditionalAddressInfo();
      builder.title = template.getTitle();
      builder.building = template.getBuilding();
      builder.firstName = template.getFirstName();
      builder.streetName = template.getStreetName();
      builder.phone = template.getPhone();
      builder.additionalStreetInfo = template.getAdditionalStreetInfo();
      builder.company = template.getCompany();
      builder.state = template.getState();
      builder.salutation = template.getSalutation();
      builder.id = template.getId();
      builder.fax = template.getFax();
      builder.department = template.getDepartment();
      builder.region = template.getRegion();
      builder.email = template.getEmail();
      builder.apartment = template.getApartment();
      builder.key = template.getKey();
      return builder;
   }

}
