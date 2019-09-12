package com.commercetools.models.Common;

import java.lang.String;
import com.commercetools.models.Common.Address;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AddressBuilder {
   
   
   private java.lang.String country;
   
   @Nullable
   private java.lang.String lastName;
   
   @Nullable
   private java.lang.String pOBox;
   
   @Nullable
   private java.lang.String city;
   
   @Nullable
   private java.lang.String streetNumber;
   
   @Nullable
   private java.lang.String postalCode;
   
   @Nullable
   private java.lang.String mobile;
   
   @Nullable
   private java.lang.String externalId;
   
   @Nullable
   private java.lang.String additionalAddressInfo;
   
   @Nullable
   private java.lang.String title;
   
   @Nullable
   private java.lang.String building;
   
   @Nullable
   private java.lang.String firstName;
   
   @Nullable
   private java.lang.String streetName;
   
   @Nullable
   private java.lang.String phone;
   
   @Nullable
   private java.lang.String additionalStreetInfo;
   
   @Nullable
   private java.lang.String company;
   
   @Nullable
   private java.lang.String state;
   
   @Nullable
   private java.lang.String salutation;
   
   @Nullable
   private java.lang.String id;
   
   @Nullable
   private java.lang.String fax;
   
   @Nullable
   private java.lang.String department;
   
   @Nullable
   private java.lang.String region;
   
   @Nullable
   private java.lang.String email;
   
   @Nullable
   private java.lang.String apartment;
   
   @Nullable
   private java.lang.String key;
   
   public AddressBuilder country( final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   public AddressBuilder lastName(@Nullable final java.lang.String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   public AddressBuilder pOBox(@Nullable final java.lang.String pOBox) {
      this.pOBox = pOBox;
      return this;
   }
   
   public AddressBuilder city(@Nullable final java.lang.String city) {
      this.city = city;
      return this;
   }
   
   public AddressBuilder streetNumber(@Nullable final java.lang.String streetNumber) {
      this.streetNumber = streetNumber;
      return this;
   }
   
   public AddressBuilder postalCode(@Nullable final java.lang.String postalCode) {
      this.postalCode = postalCode;
      return this;
   }
   
   public AddressBuilder mobile(@Nullable final java.lang.String mobile) {
      this.mobile = mobile;
      return this;
   }
   
   public AddressBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public AddressBuilder additionalAddressInfo(@Nullable final java.lang.String additionalAddressInfo) {
      this.additionalAddressInfo = additionalAddressInfo;
      return this;
   }
   
   public AddressBuilder title(@Nullable final java.lang.String title) {
      this.title = title;
      return this;
   }
   
   public AddressBuilder building(@Nullable final java.lang.String building) {
      this.building = building;
      return this;
   }
   
   public AddressBuilder firstName(@Nullable final java.lang.String firstName) {
      this.firstName = firstName;
      return this;
   }
   
   public AddressBuilder streetName(@Nullable final java.lang.String streetName) {
      this.streetName = streetName;
      return this;
   }
   
   public AddressBuilder phone(@Nullable final java.lang.String phone) {
      this.phone = phone;
      return this;
   }
   
   public AddressBuilder additionalStreetInfo(@Nullable final java.lang.String additionalStreetInfo) {
      this.additionalStreetInfo = additionalStreetInfo;
      return this;
   }
   
   public AddressBuilder company(@Nullable final java.lang.String company) {
      this.company = company;
      return this;
   }
   
   public AddressBuilder state(@Nullable final java.lang.String state) {
      this.state = state;
      return this;
   }
   
   public AddressBuilder salutation(@Nullable final java.lang.String salutation) {
      this.salutation = salutation;
      return this;
   }
   
   public AddressBuilder id(@Nullable final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public AddressBuilder fax(@Nullable final java.lang.String fax) {
      this.fax = fax;
      return this;
   }
   
   public AddressBuilder department(@Nullable final java.lang.String department) {
      this.department = department;
      return this;
   }
   
   public AddressBuilder region(@Nullable final java.lang.String region) {
      this.region = region;
      return this;
   }
   
   public AddressBuilder email(@Nullable final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   public AddressBuilder apartment(@Nullable final java.lang.String apartment) {
      this.apartment = apartment;
      return this;
   }
   
   public AddressBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   @Nullable
   public java.lang.String getLastName(){
      return this.lastName;
   }
   
   @Nullable
   public java.lang.String getPOBox(){
      return this.pOBox;
   }
   
   @Nullable
   public java.lang.String getCity(){
      return this.city;
   }
   
   @Nullable
   public java.lang.String getStreetNumber(){
      return this.streetNumber;
   }
   
   @Nullable
   public java.lang.String getPostalCode(){
      return this.postalCode;
   }
   
   @Nullable
   public java.lang.String getMobile(){
      return this.mobile;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public java.lang.String getAdditionalAddressInfo(){
      return this.additionalAddressInfo;
   }
   
   @Nullable
   public java.lang.String getTitle(){
      return this.title;
   }
   
   @Nullable
   public java.lang.String getBuilding(){
      return this.building;
   }
   
   @Nullable
   public java.lang.String getFirstName(){
      return this.firstName;
   }
   
   @Nullable
   public java.lang.String getStreetName(){
      return this.streetName;
   }
   
   @Nullable
   public java.lang.String getPhone(){
      return this.phone;
   }
   
   @Nullable
   public java.lang.String getAdditionalStreetInfo(){
      return this.additionalStreetInfo;
   }
   
   @Nullable
   public java.lang.String getCompany(){
      return this.company;
   }
   
   @Nullable
   public java.lang.String getState(){
      return this.state;
   }
   
   @Nullable
   public java.lang.String getSalutation(){
      return this.salutation;
   }
   
   @Nullable
   public java.lang.String getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getFax(){
      return this.fax;
   }
   
   @Nullable
   public java.lang.String getDepartment(){
      return this.department;
   }
   
   @Nullable
   public java.lang.String getRegion(){
      return this.region;
   }
   
   @Nullable
   public java.lang.String getEmail(){
      return this.email;
   }
   
   @Nullable
   public java.lang.String getApartment(){
      return this.apartment;
   }
   
   @Nullable
   public java.lang.String getKey(){
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