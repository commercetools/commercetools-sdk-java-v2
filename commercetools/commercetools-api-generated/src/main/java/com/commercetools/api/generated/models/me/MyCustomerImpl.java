package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.store.StoreKeyReference;
import com.commercetools.api.generated.models.type.CustomFields;
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
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private String lastName;
   
   private java.util.List<com.commercetools.api.generated.models.common.Address> addresses;
   
   private java.util.List<com.commercetools.api.generated.models.store.StoreKeyReference> stores;
   
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private String companyName;
   
   private String vatId;
   
   private String externalId;
   
   private java.time.LocalDate dateOfBirth;
   
   private String locale;
   
   private java.util.List<String> billingAddressIds;
   
   private String defaultShippingAddressId;
   
   private String title;
   
   private String customerNumber;
   
   private Boolean isEmailVerified;
   
   private String defaultBillingAddressId;
   
   private java.util.List<String> shippingAddressIds;
   
   private String firstName;
   
   private String password;
   
   private String middleName;
   
   private String salutation;
   
   private String key;
   
   private String email;

   @JsonCreator
   MyCustomerImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("lastName") final String lastName, @JsonProperty("addresses") final java.util.List<com.commercetools.api.generated.models.common.Address> addresses, @JsonProperty("stores") final java.util.List<com.commercetools.api.generated.models.store.StoreKeyReference> stores, @JsonProperty("customerGroup") final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId, @JsonProperty("externalId") final String externalId, @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth, @JsonProperty("locale") final String locale, @JsonProperty("billingAddressIds") final java.util.List<String> billingAddressIds, @JsonProperty("defaultShippingAddressId") final String defaultShippingAddressId, @JsonProperty("title") final String title, @JsonProperty("customerNumber") final String customerNumber, @JsonProperty("isEmailVerified") final Boolean isEmailVerified, @JsonProperty("defaultBillingAddressId") final String defaultBillingAddressId, @JsonProperty("shippingAddressIds") final java.util.List<String> shippingAddressIds, @JsonProperty("firstName") final String firstName, @JsonProperty("password") final String password, @JsonProperty("middleName") final String middleName, @JsonProperty("salutation") final String salutation, @JsonProperty("key") final String key, @JsonProperty("email") final String email) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.lastName = lastName;
      this.addresses = addresses;
      this.stores = stores;
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
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public String getLastName(){
      return this.lastName;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.Address> getAddresses(){
      return this.addresses;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.store.StoreKeyReference> getStores(){
      return this.stores;
   }
   
   
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public String getCompanyName(){
      return this.companyName;
   }
   
   
   public String getVatId(){
      return this.vatId;
   }
   
   
   public String getExternalId(){
      return this.externalId;
   }
   
   
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }
   
   
   public String getLocale(){
      return this.locale;
   }
   
   
   public java.util.List<String> getBillingAddressIds(){
      return this.billingAddressIds;
   }
   
   
   public String getDefaultShippingAddressId(){
      return this.defaultShippingAddressId;
   }
   
   
   public String getTitle(){
      return this.title;
   }
   
   
   public String getCustomerNumber(){
      return this.customerNumber;
   }
   
   
   public Boolean getIsEmailVerified(){
      return this.isEmailVerified;
   }
   
   
   public String getDefaultBillingAddressId(){
      return this.defaultBillingAddressId;
   }
   
   
   public java.util.List<String> getShippingAddressIds(){
      return this.shippingAddressIds;
   }
   
   
   public String getFirstName(){
      return this.firstName;
   }
   
   
   public String getPassword(){
      return this.password;
   }
   
   
   public String getMiddleName(){
      return this.middleName;
   }
   
   
   public String getSalutation(){
      return this.salutation;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setLastName(final String lastName){
      this.lastName = lastName;
   }
   
   public void setAddresses(final java.util.List<com.commercetools.api.generated.models.common.Address> addresses){
      this.addresses = addresses;
   }
   
   public void setStores(final java.util.List<com.commercetools.api.generated.models.store.StoreKeyReference> stores){
      this.stores = stores;
   }
   
   public void setCustomerGroup(final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setCompanyName(final String companyName){
      this.companyName = companyName;
   }
   
   public void setVatId(final String vatId){
      this.vatId = vatId;
   }
   
   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }
   
   public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
      this.dateOfBirth = dateOfBirth;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setBillingAddressIds(final java.util.List<String> billingAddressIds){
      this.billingAddressIds = billingAddressIds;
   }
   
   public void setDefaultShippingAddressId(final String defaultShippingAddressId){
      this.defaultShippingAddressId = defaultShippingAddressId;
   }
   
   public void setTitle(final String title){
      this.title = title;
   }
   
   public void setCustomerNumber(final String customerNumber){
      this.customerNumber = customerNumber;
   }
   
   public void setIsEmailVerified(final Boolean isEmailVerified){
      this.isEmailVerified = isEmailVerified;
   }
   
   public void setDefaultBillingAddressId(final String defaultBillingAddressId){
      this.defaultBillingAddressId = defaultBillingAddressId;
   }
   
   public void setShippingAddressIds(final java.util.List<String> shippingAddressIds){
      this.shippingAddressIds = shippingAddressIds;
   }
   
   public void setFirstName(final String firstName){
      this.firstName = firstName;
   }
   
   public void setPassword(final String password){
      this.password = password;
   }
   
   public void setMiddleName(final String middleName){
      this.middleName = middleName;
   }
   
   public void setSalutation(final String salutation){
      this.salutation = salutation;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setEmail(final String email){
      this.email = email;
   }

}