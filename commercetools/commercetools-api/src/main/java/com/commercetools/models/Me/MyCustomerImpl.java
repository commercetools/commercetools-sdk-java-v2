package com.commercetools.models.me;

import com.commercetools.models.common.Address;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.customer_group.CustomerGroupReference;
import com.commercetools.models.type.CustomFields;
import java.lang.Boolean;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerImpl implements MyCustomer {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private java.lang.String lastName;
   
   private java.util.List<com.commercetools.models.common.Address> addresses;
   
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private java.lang.String companyName;
   
   private java.lang.String vatId;
   
   private java.lang.String externalId;
   
   private java.time.LocalDate dateOfBirth;
   
   private java.lang.String locale;
   
   private java.util.List<java.lang.String> billingAddressIds;
   
   private java.lang.String defaultShippingAddressId;
   
   private java.lang.String title;
   
   private java.lang.String customerNumber;
   
   private java.lang.Boolean isEmailVerified;
   
   private java.lang.String defaultBillingAddressId;
   
   private java.util.List<java.lang.String> shippingAddressIds;
   
   private java.lang.String firstName;
   
   private java.lang.String password;
   
   private java.lang.String middleName;
   
   private java.lang.String salutation;
   
   private java.lang.String key;
   
   private java.lang.String email;

   @JsonCreator
   MyCustomerImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("lastName") final java.lang.String lastName, @JsonProperty("addresses") final java.util.List<com.commercetools.models.common.Address> addresses, @JsonProperty("customerGroup") final com.commercetools.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("companyName") final java.lang.String companyName, @JsonProperty("vatId") final java.lang.String vatId, @JsonProperty("externalId") final java.lang.String externalId, @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("billingAddressIds") final java.util.List<java.lang.String> billingAddressIds, @JsonProperty("defaultShippingAddressId") final java.lang.String defaultShippingAddressId, @JsonProperty("title") final java.lang.String title, @JsonProperty("customerNumber") final java.lang.String customerNumber, @JsonProperty("isEmailVerified") final java.lang.Boolean isEmailVerified, @JsonProperty("defaultBillingAddressId") final java.lang.String defaultBillingAddressId, @JsonProperty("shippingAddressIds") final java.util.List<java.lang.String> shippingAddressIds, @JsonProperty("firstName") final java.lang.String firstName, @JsonProperty("password") final java.lang.String password, @JsonProperty("middleName") final java.lang.String middleName, @JsonProperty("salutation") final java.lang.String salutation, @JsonProperty("key") final java.lang.String key, @JsonProperty("email") final java.lang.String email) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.lastName = lastName;
      this.addresses = addresses;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.companyName = companyName;
      this.vatId = vatId;
      this.externalId = externalId;
      this.dateOfBirth = dateOfBirth;
      this.locale = locale;
      this.billingAddressIds = billingAddressIds;
      this.defaultShippingAddressId = defaultShippingAddressId;
      this.title = title;
      this.customerNumber = customerNumber;
      this.isEmailVerified = isEmailVerified;
      this.defaultBillingAddressId = defaultBillingAddressId;
      this.shippingAddressIds = shippingAddressIds;
      this.firstName = firstName;
      this.password = password;
      this.middleName = middleName;
      this.salutation = salutation;
      this.key = key;
      this.email = email;
   }
   public MyCustomerImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.lang.String getLastName(){
      return this.lastName;
   }
   
   
   public java.util.List<com.commercetools.models.common.Address> getAddresses(){
      return this.addresses;
   }
   
   
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
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
   
   
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }
   
   
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   
   public java.util.List<java.lang.String> getBillingAddressIds(){
      return this.billingAddressIds;
   }
   
   
   public java.lang.String getDefaultShippingAddressId(){
      return this.defaultShippingAddressId;
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
   
   
   public java.lang.String getDefaultBillingAddressId(){
      return this.defaultBillingAddressId;
   }
   
   
   public java.util.List<java.lang.String> getShippingAddressIds(){
      return this.shippingAddressIds;
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
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setLastName(final java.lang.String lastName){
      this.lastName = lastName;
   }
   
   public void setAddresses(final java.util.List<com.commercetools.models.common.Address> addresses){
      this.addresses = addresses;
   }
   
   public void setCustomerGroup(final com.commercetools.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
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
   
   public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
      this.dateOfBirth = dateOfBirth;
   }
   
   public void setLocale(final java.lang.String locale){
      this.locale = locale;
   }
   
   public void setBillingAddressIds(final java.util.List<java.lang.String> billingAddressIds){
      this.billingAddressIds = billingAddressIds;
   }
   
   public void setDefaultShippingAddressId(final java.lang.String defaultShippingAddressId){
      this.defaultShippingAddressId = defaultShippingAddressId;
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
   
   public void setDefaultBillingAddressId(final java.lang.String defaultBillingAddressId){
      this.defaultBillingAddressId = defaultBillingAddressId;
   }
   
   public void setShippingAddressIds(final java.util.List<java.lang.String> shippingAddressIds){
      this.shippingAddressIds = shippingAddressIds;
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
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }
   
   public void setEmail(final java.lang.String email){
      this.email = email;
   }

}