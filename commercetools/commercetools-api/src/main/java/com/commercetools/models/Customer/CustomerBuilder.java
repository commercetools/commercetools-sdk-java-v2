package com.commercetools.models.Customer;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import com.commercetools.models.Customer.Customer;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private java.lang.String lastName;
   
   
   private java.util.List<com.commercetools.models.Common.Address> addresses;
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private java.lang.String companyName;
   
   @Nullable
   private java.lang.String vatId;
   
   @Nullable
   private java.lang.String externalId;
   
   @Nullable
   private java.time.LocalDate dateOfBirth;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private java.util.List<java.lang.String> billingAddressIds;
   
   @Nullable
   private java.lang.String defaultShippingAddressId;
   
   @Nullable
   private java.lang.String title;
   
   @Nullable
   private java.lang.String customerNumber;
   
   
   private java.lang.Boolean isEmailVerified;
   
   @Nullable
   private java.lang.String defaultBillingAddressId;
   
   @Nullable
   private java.util.List<java.lang.String> shippingAddressIds;
   
   @Nullable
   private java.lang.String firstName;
   
   
   private java.lang.String password;
   
   @Nullable
   private java.lang.String middleName;
   
   @Nullable
   private java.lang.String salutation;
   
   @Nullable
   private java.lang.String key;
   
   
   private java.lang.String email;
   
   public CustomerBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomerBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomerBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CustomerBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CustomerBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CustomerBuilder lastName(@Nullable final java.lang.String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   public CustomerBuilder addresses( final java.util.List<com.commercetools.models.Common.Address> addresses) {
      this.addresses = addresses;
      return this;
   }
   
   public CustomerBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public CustomerBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CustomerBuilder companyName(@Nullable final java.lang.String companyName) {
      this.companyName = companyName;
      return this;
   }
   
   public CustomerBuilder vatId(@Nullable final java.lang.String vatId) {
      this.vatId = vatId;
      return this;
   }
   
   public CustomerBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public CustomerBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
   }
   
   public CustomerBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public CustomerBuilder billingAddressIds(@Nullable final java.util.List<java.lang.String> billingAddressIds) {
      this.billingAddressIds = billingAddressIds;
      return this;
   }
   
   public CustomerBuilder defaultShippingAddressId(@Nullable final java.lang.String defaultShippingAddressId) {
      this.defaultShippingAddressId = defaultShippingAddressId;
      return this;
   }
   
   public CustomerBuilder title(@Nullable final java.lang.String title) {
      this.title = title;
      return this;
   }
   
   public CustomerBuilder customerNumber(@Nullable final java.lang.String customerNumber) {
      this.customerNumber = customerNumber;
      return this;
   }
   
   public CustomerBuilder isEmailVerified( final java.lang.Boolean isEmailVerified) {
      this.isEmailVerified = isEmailVerified;
      return this;
   }
   
   public CustomerBuilder defaultBillingAddressId(@Nullable final java.lang.String defaultBillingAddressId) {
      this.defaultBillingAddressId = defaultBillingAddressId;
      return this;
   }
   
   public CustomerBuilder shippingAddressIds(@Nullable final java.util.List<java.lang.String> shippingAddressIds) {
      this.shippingAddressIds = shippingAddressIds;
      return this;
   }
   
   public CustomerBuilder firstName(@Nullable final java.lang.String firstName) {
      this.firstName = firstName;
      return this;
   }
   
   public CustomerBuilder password( final java.lang.String password) {
      this.password = password;
      return this;
   }
   
   public CustomerBuilder middleName(@Nullable final java.lang.String middleName) {
      this.middleName = middleName;
      return this;
   }
   
   public CustomerBuilder salutation(@Nullable final java.lang.String salutation) {
      this.salutation = salutation;
      return this;
   }
   
   public CustomerBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public CustomerBuilder email( final java.lang.String email) {
      this.email = email;
      return this;
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
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public java.lang.String getLastName(){
      return this.lastName;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Address> getAddresses(){
      return this.addresses;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public java.lang.String getCompanyName(){
      return this.companyName;
   }
   
   @Nullable
   public java.lang.String getVatId(){
      return this.vatId;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
      return this.externalId;
   }
   
   @Nullable
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public java.util.List<java.lang.String> getBillingAddressIds(){
      return this.billingAddressIds;
   }
   
   @Nullable
   public java.lang.String getDefaultShippingAddressId(){
      return this.defaultShippingAddressId;
   }
   
   @Nullable
   public java.lang.String getTitle(){
      return this.title;
   }
   
   @Nullable
   public java.lang.String getCustomerNumber(){
      return this.customerNumber;
   }
   
   
   public java.lang.Boolean getIsEmailVerified(){
      return this.isEmailVerified;
   }
   
   @Nullable
   public java.lang.String getDefaultBillingAddressId(){
      return this.defaultBillingAddressId;
   }
   
   @Nullable
   public java.util.List<java.lang.String> getShippingAddressIds(){
      return this.shippingAddressIds;
   }
   
   @Nullable
   public java.lang.String getFirstName(){
      return this.firstName;
   }
   
   
   public java.lang.String getPassword(){
      return this.password;
   }
   
   @Nullable
   public java.lang.String getMiddleName(){
      return this.middleName;
   }
   
   @Nullable
   public java.lang.String getSalutation(){
      return this.salutation;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public Customer build() {
       return new CustomerImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, lastName, addresses, customerGroup, custom, companyName, vatId, externalId, dateOfBirth, locale, billingAddressIds, defaultShippingAddressId, title, customerNumber, isEmailVerified, defaultBillingAddressId, shippingAddressIds, firstName, password, middleName, salutation, key, email);
   }
   
   public static CustomerBuilder of() {
      return new CustomerBuilder();
   }
   
   public static CustomerBuilder of(final Customer template) {
      CustomerBuilder builder = new CustomerBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.lastName = template.getLastName();
      builder.addresses = template.getAddresses();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.companyName = template.getCompanyName();
      builder.vatId = template.getVatId();
      builder.externalId = template.getExternalId();
      builder.dateOfBirth = template.getDateOfBirth();
      builder.locale = template.getLocale();
      builder.billingAddressIds = template.getBillingAddressIds();
      builder.defaultShippingAddressId = template.getDefaultShippingAddressId();
      builder.title = template.getTitle();
      builder.customerNumber = template.getCustomerNumber();
      builder.isEmailVerified = template.getIsEmailVerified();
      builder.defaultBillingAddressId = template.getDefaultBillingAddressId();
      builder.shippingAddressIds = template.getShippingAddressIds();
      builder.firstName = template.getFirstName();
      builder.password = template.getPassword();
      builder.middleName = template.getMiddleName();
      builder.salutation = template.getSalutation();
      builder.key = template.getKey();
      builder.email = template.getEmail();
      return builder;
   }
   
}