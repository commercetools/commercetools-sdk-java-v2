package com.commercetools.models.customer;

import com.commercetools.models.common.Address;
import com.commercetools.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDate;
import com.commercetools.models.customer.CustomerDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerDraftBuilder {
   
   @Nullable
   private java.lang.String anonymousId;
   
   @Nullable
   private java.lang.String lastName;
   
   @Nullable
   private java.util.List<com.commercetools.models.common.Address> addresses;
   
   @Nullable
   private java.lang.Long defaultShippingAddress;
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private java.lang.String companyName;
   
   @Nullable
   private java.lang.String vatId;
   
   @Nullable
   private java.lang.String externalId;
   
   @Nullable
   private java.util.List<java.lang.Integer> billingAddresses;
   
   @Nullable
   private java.time.LocalDate dateOfBirth;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private java.lang.String title;
   
   @Nullable
   private java.lang.String customerNumber;
   
   @Nullable
   private java.lang.Boolean isEmailVerified;
   
   @Nullable
   private java.lang.String firstName;
   
   
   private java.lang.String password;
   
   @Nullable
   private java.lang.String middleName;
   
   @Nullable
   private java.lang.String salutation;
   
   @Nullable
   private java.lang.String anonymousCartId;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private java.lang.Long defaultBillingAddress;
   
   
   private java.lang.String email;
   
   @Nullable
   private java.util.List<java.lang.Integer> shippingAddresses;
   
   public CustomerDraftBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   public CustomerDraftBuilder lastName(@Nullable final java.lang.String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   public CustomerDraftBuilder addresses(@Nullable final java.util.List<com.commercetools.models.common.Address> addresses) {
      this.addresses = addresses;
      return this;
   }
   
   public CustomerDraftBuilder defaultShippingAddress(@Nullable final java.lang.Long defaultShippingAddress) {
      this.defaultShippingAddress = defaultShippingAddress;
      return this;
   }
   
   public CustomerDraftBuilder customerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public CustomerDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public CustomerDraftBuilder companyName(@Nullable final java.lang.String companyName) {
      this.companyName = companyName;
      return this;
   }
   
   public CustomerDraftBuilder vatId(@Nullable final java.lang.String vatId) {
      this.vatId = vatId;
      return this;
   }
   
   public CustomerDraftBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   public CustomerDraftBuilder billingAddresses(@Nullable final java.util.List<java.lang.Integer> billingAddresses) {
      this.billingAddresses = billingAddresses;
      return this;
   }
   
   public CustomerDraftBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
   }
   
   public CustomerDraftBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public CustomerDraftBuilder title(@Nullable final java.lang.String title) {
      this.title = title;
      return this;
   }
   
   public CustomerDraftBuilder customerNumber(@Nullable final java.lang.String customerNumber) {
      this.customerNumber = customerNumber;
      return this;
   }
   
   public CustomerDraftBuilder isEmailVerified(@Nullable final java.lang.Boolean isEmailVerified) {
      this.isEmailVerified = isEmailVerified;
      return this;
   }
   
   public CustomerDraftBuilder firstName(@Nullable final java.lang.String firstName) {
      this.firstName = firstName;
      return this;
   }
   
   public CustomerDraftBuilder password( final java.lang.String password) {
      this.password = password;
      return this;
   }
   
   public CustomerDraftBuilder middleName(@Nullable final java.lang.String middleName) {
      this.middleName = middleName;
      return this;
   }
   
   public CustomerDraftBuilder salutation(@Nullable final java.lang.String salutation) {
      this.salutation = salutation;
      return this;
   }
   
   public CustomerDraftBuilder anonymousCartId(@Nullable final java.lang.String anonymousCartId) {
      this.anonymousCartId = anonymousCartId;
      return this;
   }
   
   public CustomerDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public CustomerDraftBuilder defaultBillingAddress(@Nullable final java.lang.Long defaultBillingAddress) {
      this.defaultBillingAddress = defaultBillingAddress;
      return this;
   }
   
   public CustomerDraftBuilder email( final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   public CustomerDraftBuilder shippingAddresses(@Nullable final java.util.List<java.lang.Integer> shippingAddresses) {
      this.shippingAddresses = shippingAddresses;
      return this;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   @Nullable
   public java.lang.String getLastName(){
      return this.lastName;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.common.Address> getAddresses(){
      return this.addresses;
   }
   
   @Nullable
   public java.lang.Long getDefaultShippingAddress(){
      return this.defaultShippingAddress;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
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
   public java.util.List<java.lang.Integer> getBillingAddresses(){
      return this.billingAddresses;
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
   public java.lang.String getTitle(){
      return this.title;
   }
   
   @Nullable
   public java.lang.String getCustomerNumber(){
      return this.customerNumber;
   }
   
   @Nullable
   public java.lang.Boolean getIsEmailVerified(){
      return this.isEmailVerified;
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
   public java.lang.String getAnonymousCartId(){
      return this.anonymousCartId;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   @Nullable
   public java.lang.Long getDefaultBillingAddress(){
      return this.defaultBillingAddress;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }
   
   @Nullable
   public java.util.List<java.lang.Integer> getShippingAddresses(){
      return this.shippingAddresses;
   }

   public CustomerDraft build() {
       return new CustomerDraftImpl(anonymousId, lastName, addresses, defaultShippingAddress, customerGroup, custom, companyName, vatId, externalId, billingAddresses, dateOfBirth, locale, title, customerNumber, isEmailVerified, firstName, password, middleName, salutation, anonymousCartId, key, defaultBillingAddress, email, shippingAddresses);
   }
   
   public static CustomerDraftBuilder of() {
      return new CustomerDraftBuilder();
   }
   
   public static CustomerDraftBuilder of(final CustomerDraft template) {
      CustomerDraftBuilder builder = new CustomerDraftBuilder();
      builder.anonymousId = template.getAnonymousId();
      builder.lastName = template.getLastName();
      builder.addresses = template.getAddresses();
      builder.defaultShippingAddress = template.getDefaultShippingAddress();
      builder.customerGroup = template.getCustomerGroup();
      builder.custom = template.getCustom();
      builder.companyName = template.getCompanyName();
      builder.vatId = template.getVatId();
      builder.externalId = template.getExternalId();
      builder.billingAddresses = template.getBillingAddresses();
      builder.dateOfBirth = template.getDateOfBirth();
      builder.locale = template.getLocale();
      builder.title = template.getTitle();
      builder.customerNumber = template.getCustomerNumber();
      builder.isEmailVerified = template.getIsEmailVerified();
      builder.firstName = template.getFirstName();
      builder.password = template.getPassword();
      builder.middleName = template.getMiddleName();
      builder.salutation = template.getSalutation();
      builder.anonymousCartId = template.getAnonymousCartId();
      builder.key = template.getKey();
      builder.defaultBillingAddress = template.getDefaultBillingAddress();
      builder.email = template.getEmail();
      builder.shippingAddresses = template.getShippingAddresses();
      return builder;
   }
   
}