package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDate;
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
public final class MyCustomerDraftImpl implements MyCustomerDraft {

   private java.lang.String lastName;
   
   private java.util.List<com.commercetools.models.Common.Address> addresses;
   
   private java.lang.Long defaultShippingAddress;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private java.lang.String companyName;
   
   private java.lang.String vatId;
   
   private java.time.LocalDate dateOfBirth;
   
   private java.lang.String locale;
   
   private java.lang.String title;
   
   private java.lang.String firstName;
   
   private java.lang.String password;
   
   private java.lang.String middleName;
   
   private java.lang.Long defaultBillingAddress;
   
   private java.lang.String email;

   @JsonCreator
   MyCustomerDraftImpl(@JsonProperty("lastName") final java.lang.String lastName, @JsonProperty("addresses") final java.util.List<com.commercetools.models.Common.Address> addresses, @JsonProperty("defaultShippingAddress") final java.lang.Long defaultShippingAddress, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("companyName") final java.lang.String companyName, @JsonProperty("vatId") final java.lang.String vatId, @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("title") final java.lang.String title, @JsonProperty("firstName") final java.lang.String firstName, @JsonProperty("password") final java.lang.String password, @JsonProperty("middleName") final java.lang.String middleName, @JsonProperty("defaultBillingAddress") final java.lang.Long defaultBillingAddress, @JsonProperty("email") final java.lang.String email) {
      this.lastName = lastName;
      this.addresses = addresses;
      this.defaultShippingAddress = defaultShippingAddress;
      this.custom = custom;
      this.companyName = companyName;
      this.vatId = vatId;
      this.dateOfBirth = dateOfBirth;
      this.locale = locale;
      this.title = title;
      this.firstName = firstName;
      this.password = password;
      this.middleName = middleName;
      this.defaultBillingAddress = defaultBillingAddress;
      this.email = email;
   }
   public MyCustomerDraftImpl() {
      
   }
   
   
   public java.lang.String getLastName(){
      return this.lastName;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Address> getAddresses(){
      return this.addresses;
   }
   
   
   public java.lang.Long getDefaultShippingAddress(){
      return this.defaultShippingAddress;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.lang.String getCompanyName(){
      return this.companyName;
   }
   
   
   public java.lang.String getVatId(){
      return this.vatId;
   }
   
   
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }
   
   
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   
   public java.lang.String getTitle(){
      return this.title;
   }
   
   
   public java.lang.String getFirstName(){
      return this.firstName;
   }
   
   
   public java.lang.String getPassword(){
      return this.password;
   }
   
   
   public java.lang.String getMiddleName(){
      return this.middleName;
   }
   
   
   public java.lang.Long getDefaultBillingAddress(){
      return this.defaultBillingAddress;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public void setLastName(final java.lang.String lastName){
      this.lastName = lastName;
   }
   
   public void setAddresses(final java.util.List<com.commercetools.models.Common.Address> addresses){
      this.addresses = addresses;
   }
   
   public void setDefaultShippingAddress(final java.lang.Long defaultShippingAddress){
      this.defaultShippingAddress = defaultShippingAddress;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setCompanyName(final java.lang.String companyName){
      this.companyName = companyName;
   }
   
   public void setVatId(final java.lang.String vatId){
      this.vatId = vatId;
   }
   
   public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
      this.dateOfBirth = dateOfBirth;
   }
   
   public void setLocale(final java.lang.String locale){
      this.locale = locale;
   }
   
   public void setTitle(final java.lang.String title){
      this.title = title;
   }
   
   public void setFirstName(final java.lang.String firstName){
      this.firstName = firstName;
   }
   
   public void setPassword(final java.lang.String password){
      this.password = password;
   }
   
   public void setMiddleName(final java.lang.String middleName){
      this.middleName = middleName;
   }
   
   public void setDefaultBillingAddress(final java.lang.Long defaultBillingAddress){
      this.defaultBillingAddress = defaultBillingAddress;
   }
   
   public void setEmail(final java.lang.String email){
      this.email = email;
   }

}