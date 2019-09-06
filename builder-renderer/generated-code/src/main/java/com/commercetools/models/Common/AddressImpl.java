package com.commercetools.models.Common;

import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AddressImpl implements Address {

   private java.lang.String country;
   
   private java.lang.String lastName;
   
   private java.lang.String pOBox;
   
   private java.lang.String city;
   
   private java.lang.String streetNumber;
   
   private java.lang.String postalCode;
   
   private java.lang.String mobile;
   
   private java.lang.String externalId;
   
   private java.lang.String additionalAddressInfo;
   
   private java.lang.String title;
   
   private java.lang.String building;
   
   private java.lang.String firstName;
   
   private java.lang.String streetName;
   
   private java.lang.String phone;
   
   private java.lang.String additionalStreetInfo;
   
   private java.lang.String company;
   
   private java.lang.String state;
   
   private java.lang.String salutation;
   
   private java.lang.String id;
   
   private java.lang.String fax;
   
   private java.lang.String department;
   
   private java.lang.String region;
   
   private java.lang.String email;
   
   private java.lang.String apartment;
   
   private java.lang.String key;

   @JsonCreator
   AddressImpl(@JsonProperty("country") final java.lang.String country, @JsonProperty("lastName") final java.lang.String lastName, @JsonProperty("pOBox") final java.lang.String pOBox, @JsonProperty("city") final java.lang.String city, @JsonProperty("streetNumber") final java.lang.String streetNumber, @JsonProperty("postalCode") final java.lang.String postalCode, @JsonProperty("mobile") final java.lang.String mobile, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("additionalAddressInfo") final java.lang.String additionalAddressInfo, @JsonProperty("title") final java.lang.String title, @JsonProperty("building") final java.lang.String building, @JsonProperty("firstName") final java.lang.String firstName, @JsonProperty("streetName") final java.lang.String streetName, @JsonProperty("phone") final java.lang.String phone, @JsonProperty("additionalStreetInfo") final java.lang.String additionalStreetInfo, @JsonProperty("company") final java.lang.String company, @JsonProperty("state") final java.lang.String state, @JsonProperty("salutation") final java.lang.String salutation, @JsonProperty("id") final java.lang.String id, @JsonProperty("fax") final java.lang.String fax, @JsonProperty("department") final java.lang.String department, @JsonProperty("region") final java.lang.String region, @JsonProperty("email") final java.lang.String email, @JsonProperty("apartment") final java.lang.String apartment, @JsonProperty("key") final java.lang.String key) {
      this.country = country;
      this.lastName = lastName;
      this.pOBox = pOBox;
      this.city = city;
      this.streetNumber = streetNumber;
      this.postalCode = postalCode;
      this.mobile = mobile;
      this.externalId = externalId;
      this.additionalAddressInfo = additionalAddressInfo;
      this.title = title;
      this.building = building;
      this.firstName = firstName;
      this.streetName = streetName;
      this.phone = phone;
      this.additionalStreetInfo = additionalStreetInfo;
      this.company = company;
      this.state = state;
      this.salutation = salutation;
      this.id = id;
      this.fax = fax;
      this.department = department;
      this.region = region;
      this.email = email;
      this.apartment = apartment;
      this.key = key;
   }
   public AddressImpl() {
      
   }
   
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.lang.String getLastName(){
      return this.lastName;
   }
   
   
   public java.lang.String getPOBox(){
      return this.pOBox;
   }
   
   
   public java.lang.String getCity(){
      return this.city;
   }
   
   
   public java.lang.String getStreetNumber(){
      return this.streetNumber;
   }
   
   
   public java.lang.String getPostalCode(){
      return this.postalCode;
   }
   
   
   public java.lang.String getMobile(){
      return this.mobile;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public java.lang.String getAdditionalAddressInfo(){
      return this.additionalAddressInfo;
   }
   
   
   public java.lang.String getTitle(){
      return this.title;
   }
   
   
   public java.lang.String getBuilding(){
      return this.building;
   }
   
   
   public java.lang.String getFirstName(){
      return this.firstName;
   }
   
   
   public java.lang.String getStreetName(){
      return this.streetName;
   }
   
   
   public java.lang.String getPhone(){
      return this.phone;
   }
   
   
   public java.lang.String getAdditionalStreetInfo(){
      return this.additionalStreetInfo;
   }
   
   
   public java.lang.String getCompany(){
      return this.company;
   }
   
   
   public java.lang.String getState(){
      return this.state;
   }
   
   
   public java.lang.String getSalutation(){
      return this.salutation;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.String getFax(){
      return this.fax;
   }
   
   
   public java.lang.String getDepartment(){
      return this.department;
   }
   
   
   public java.lang.String getRegion(){
      return this.region;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }
   
   
   public java.lang.String getApartment(){
      return this.apartment;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setLastName(final java.lang.String lastName){
      this.lastName = lastName;
   }
   
   public void setPOBox(final java.lang.String pOBox){
      this.pOBox = pOBox;
   }
   
   public void setCity(final java.lang.String city){
      this.city = city;
   }
   
   public void setStreetNumber(final java.lang.String streetNumber){
      this.streetNumber = streetNumber;
   }
   
   public void setPostalCode(final java.lang.String postalCode){
      this.postalCode = postalCode;
   }
   
   public void setMobile(final java.lang.String mobile){
      this.mobile = mobile;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setAdditionalAddressInfo(final java.lang.String additionalAddressInfo){
      this.additionalAddressInfo = additionalAddressInfo;
   }
   
   public void setTitle(final java.lang.String title){
      this.title = title;
   }
   
   public void setBuilding(final java.lang.String building){
      this.building = building;
   }
   
   public void setFirstName(final java.lang.String firstName){
      this.firstName = firstName;
   }
   
   public void setStreetName(final java.lang.String streetName){
      this.streetName = streetName;
   }
   
   public void setPhone(final java.lang.String phone){
      this.phone = phone;
   }
   
   public void setAdditionalStreetInfo(final java.lang.String additionalStreetInfo){
      this.additionalStreetInfo = additionalStreetInfo;
   }
   
   public void setCompany(final java.lang.String company){
      this.company = company;
   }
   
   public void setState(final java.lang.String state){
      this.state = state;
   }
   
   public void setSalutation(final java.lang.String salutation){
      this.salutation = salutation;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setFax(final java.lang.String fax){
      this.fax = fax;
   }
   
   public void setDepartment(final java.lang.String department){
      this.department = department;
   }
   
   public void setRegion(final java.lang.String region){
      this.region = region;
   }
   
   public void setEmail(final java.lang.String email){
      this.email = email;
   }
   
   public void setApartment(final java.lang.String apartment){
      this.apartment = apartment;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}