package com.commercetools.api.generated.models.common;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AddressImpl implements Address {

   private String country;
   
   private String lastName;
   
   private String pOBox;
   
   private String city;
   
   private String streetNumber;
   
   private String postalCode;
   
   private String mobile;
   
   private String externalId;
   
   private String additionalAddressInfo;
   
   private String title;
   
   private String building;
   
   private String firstName;
   
   private String streetName;
   
   private String phone;
   
   private String additionalStreetInfo;
   
   private String company;
   
   private String state;
   
   private String salutation;
   
   private String id;
   
   private String fax;
   
   private String department;
   
   private String region;
   
   private String email;
   
   private String apartment;
   
   private String key;

   @JsonCreator
   AddressImpl(@JsonProperty("country") final String country, @JsonProperty("lastName") final String lastName, @JsonProperty("pOBox") final String pOBox, @JsonProperty("city") final String city, @JsonProperty("streetNumber") final String streetNumber, @JsonProperty("postalCode") final String postalCode, @JsonProperty("mobile") final String mobile, @JsonProperty("externalId") final String externalId, @JsonProperty("additionalAddressInfo") final String additionalAddressInfo, @JsonProperty("title") final String title, @JsonProperty("building") final String building, @JsonProperty("firstName") final String firstName, @JsonProperty("streetName") final String streetName, @JsonProperty("phone") final String phone, @JsonProperty("additionalStreetInfo") final String additionalStreetInfo, @JsonProperty("company") final String company, @JsonProperty("state") final String state, @JsonProperty("salutation") final String salutation, @JsonProperty("id") final String id, @JsonProperty("fax") final String fax, @JsonProperty("department") final String department, @JsonProperty("region") final String region, @JsonProperty("email") final String email, @JsonProperty("apartment") final String apartment, @JsonProperty("key") final String key) {
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
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   public String getCountry(){
      return this.country;
   }
   
   
   public String getLastName(){
      return this.lastName;
   }
   
   
   public String getPOBox(){
      return this.pOBox;
   }
   
   
   public String getCity(){
      return this.city;
   }
   
   
   public String getStreetNumber(){
      return this.streetNumber;
   }
   
   
   public String getPostalCode(){
      return this.postalCode;
   }
   
   
   public String getMobile(){
      return this.mobile;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public String getAdditionalAddressInfo(){
      return this.additionalAddressInfo;
   }
   
   
   public String getTitle(){
      return this.title;
   }
   
   
   public String getBuilding(){
      return this.building;
   }
   
   
   public String getFirstName(){
      return this.firstName;
   }
   
   
   public String getStreetName(){
      return this.streetName;
   }
   
   
   public String getPhone(){
      return this.phone;
   }
   
   
   public String getAdditionalStreetInfo(){
      return this.additionalStreetInfo;
   }
   
   
   public String getCompany(){
      return this.company;
   }
   
   
   public String getState(){
      return this.state;
   }
   
   
   public String getSalutation(){
      return this.salutation;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public String getFax(){
      return this.fax;
   }
   
   
   public String getDepartment(){
      return this.department;
   }
   
   
   public String getRegion(){
      return this.region;
   }
   
   
   public String getEmail(){
      return this.email;
   }
   
   
   public String getApartment(){
      return this.apartment;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setLastName(final String lastName){
      this.lastName = lastName;
   }
   
   public void setPOBox(final String pOBox){
      this.pOBox = pOBox;
   }
   
   public void setCity(final String city){
      this.city = city;
   }
   
   public void setStreetNumber(final String streetNumber){
      this.streetNumber = streetNumber;
   }
   
   public void setPostalCode(final String postalCode){
      this.postalCode = postalCode;
   }
   
   public void setMobile(final String mobile){
      this.mobile = mobile;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setAdditionalAddressInfo(final String additionalAddressInfo){
      this.additionalAddressInfo = additionalAddressInfo;
   }
   
   public void setTitle(final String title){
      this.title = title;
   }
   
   public void setBuilding(final String building){
      this.building = building;
   }
   
   public void setFirstName(final String firstName){
      this.firstName = firstName;
   }
   
   public void setStreetName(final String streetName){
      this.streetName = streetName;
   }
   
   public void setPhone(final String phone){
      this.phone = phone;
   }
   
   public void setAdditionalStreetInfo(final String additionalStreetInfo){
      this.additionalStreetInfo = additionalStreetInfo;
   }
   
   public void setCompany(final String company){
      this.company = company;
   }
   
   public void setState(final String state){
      this.state = state;
   }
   
   public void setSalutation(final String salutation){
      this.salutation = salutation;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setFax(final String fax){
      this.fax = fax;
   }
   
   public void setDepartment(final String department){
      this.department = department;
   }
   
   public void setRegion(final String region){
      this.region = region;
   }
   
   public void setEmail(final String email){
      this.email = email;
   }
   
   public void setApartment(final String apartment){
      this.apartment = apartment;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}