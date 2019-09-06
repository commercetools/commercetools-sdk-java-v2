package com.commercetools.models.Customer;

import com.commercetools.models.Common.Address;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Boolean;
import java.lang.Integer;
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
public final class CustomerDraftImpl implements CustomerDraft {

   private java.lang.String anonymousId;
   
   private java.lang.String lastName;
   
   private java.util.List<com.commercetools.models.Common.Address> addresses;
   
   private java.lang.Long defaultShippingAddress;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;
   
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   private java.lang.String companyName;
   
   private java.lang.String vatId;
   
   private java.lang.String externalId;
   
   private java.util.List<java.lang.Integer> billingAddresses;
   
   private java.time.LocalDate dateOfBirth;
   
   private java.lang.String locale;
   
   private java.lang.String title;
   
   private java.lang.String customerNumber;
   
   private java.lang.Boolean isEmailVerified;
   
   private java.lang.String firstName;
   
   private java.lang.String password;
   
   private java.lang.String middleName;
   
   private java.lang.String salutation;
   
   private java.lang.String anonymousCartId;
   
   private java.lang.String key;
   
   private java.lang.Long defaultBillingAddress;
   
   private java.lang.String email;
   
   private java.util.List<java.lang.Integer> shippingAddresses;

   @JsonCreator
   CustomerDraftImpl(@JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("lastName") final java.lang.String lastName, @JsonProperty("addresses") final java.util.List<com.commercetools.models.Common.Address> addresses, @JsonProperty("defaultShippingAddress") final java.lang.Long defaultShippingAddress, @JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("custom") final com.commercetools.models.Type.CustomFieldsDraft custom, @JsonProperty("companyName") final java.lang.String companyName, @JsonProperty("vatId") final java.lang.String vatId, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("billingAddresses") final java.util.List<java.lang.Integer> billingAddresses, @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("title") final java.lang.String title, @JsonProperty("customerNumber") final java.lang.String customerNumber, @JsonProperty("isEmailVerified") final java.lang.Boolean isEmailVerified, @JsonProperty("firstName") final java.lang.String firstName, @JsonProperty("password") final java.lang.String password, @JsonProperty("middleName") final java.lang.String middleName, @JsonProperty("salutation") final java.lang.String salutation, @JsonProperty("anonymousCartId") final java.lang.String anonymousCartId, @JsonProperty("key") final java.lang.String key, @JsonProperty("defaultBillingAddress") final java.lang.Long defaultBillingAddress, @JsonProperty("email") final java.lang.String email, @JsonProperty("shippingAddresses") final java.util.List<java.lang.Integer> shippingAddresses) {
      this.anonymousId = anonymousId;
      this.lastName = lastName;
      this.addresses = addresses;
      this.defaultShippingAddress = defaultShippingAddress;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.companyName = companyName;
      this.vatId = vatId;
      this.externalId = externalId;
      this.billingAddresses = billingAddresses;
      this.dateOfBirth = dateOfBirth;
      this.locale = locale;
      this.title = title;
      this.customerNumber = customerNumber;
      this.isEmailVerified = isEmailVerified;
      this.firstName = firstName;
      this.password = password;
      this.middleName = middleName;
      this.salutation = salutation;
      this.anonymousCartId = anonymousCartId;
      this.key = key;
      this.defaultBillingAddress = defaultBillingAddress;
      this.email = email;
      this.shippingAddresses = shippingAddresses;
   }
   public CustomerDraftImpl() {
      
   }
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
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
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   
   public java.lang.String getCompanyName(){
      return this.companyName;
   }
   
   
   public java.lang.String getVatId(){
      return this.vatId;
   }
   
   
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   
   public java.util.List<java.lang.Integer> getBillingAddresses(){
      return this.billingAddresses;
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
   
   
   public java.lang.String getCustomerNumber(){
      return this.customerNumber;
   }
   
   
   public java.lang.Boolean getIsEmailVerified(){
      return this.isEmailVerified;
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
   
   
   public java.lang.String getSalutation(){
      return this.salutation;
   }
   
   
   public java.lang.String getAnonymousCartId(){
      return this.anonymousCartId;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public java.lang.Long getDefaultBillingAddress(){
      return this.defaultBillingAddress;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }
   
   
   public java.util.List<java.lang.Integer> getShippingAddresses(){
      return this.shippingAddresses;
   }

   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
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
   
   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setCompanyName(final java.lang.String companyName){
      this.companyName = companyName;
   }
   
   public void setVatId(final java.lang.String vatId){
      this.vatId = vatId;
   }
   
   public void setExternalId(final java.lang.String externalId){
      this.externalId = externalId;
   }
   
   public void setBillingAddresses(final java.util.List<java.lang.Integer> billingAddresses){
      this.billingAddresses = billingAddresses;
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
   
   public void setCustomerNumber(final java.lang.String customerNumber){
      this.customerNumber = customerNumber;
   }
   
   public void setIsEmailVerified(final java.lang.Boolean isEmailVerified){
      this.isEmailVerified = isEmailVerified;
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
   
   public void setSalutation(final java.lang.String salutation){
      this.salutation = salutation;
   }
   
   public void setAnonymousCartId(final java.lang.String anonymousCartId){
      this.anonymousCartId = anonymousCartId;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setDefaultBillingAddress(final java.lang.Long defaultBillingAddress){
      this.defaultBillingAddress = defaultBillingAddress;
   }
   
   public void setEmail(final java.lang.String email){
      this.email = email;
   }
   
   public void setShippingAddresses(final java.util.List<java.lang.Integer> shippingAddresses){
      this.shippingAddresses = shippingAddresses;
   }

}