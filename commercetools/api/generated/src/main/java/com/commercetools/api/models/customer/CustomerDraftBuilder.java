package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.LocalDate;
import com.commercetools.api.models.customer.CustomerDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerDraftBuilder {

   @Nullable
   private String anonymousId;

   @Nullable
   private String lastName;

   @Nullable
   private java.util.List<com.commercetools.api.models.common.Address> addresses;

   @Nullable
   private Long defaultShippingAddress;

   @Nullable
   private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

   @Nullable
   private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

   @Nullable
   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   @Nullable
   private String companyName;

   @Nullable
   private String vatId;

   @Nullable
   private String externalId;

   @Nullable
   private java.util.List<Integer> billingAddresses;

   @Nullable
   private java.time.LocalDate dateOfBirth;

   @Nullable
   private String locale;

   @Nullable
   private String title;

   @Nullable
   private String customerNumber;

   @Nullable
   private Boolean isEmailVerified;

   @Nullable
   private String firstName;


   private String password;

   @Nullable
   private String middleName;

   @Nullable
   private String salutation;

   @Nullable
   private String anonymousCartId;

   @Nullable
   private String key;

   @Nullable
   private Long defaultBillingAddress;


   private String email;

   @Nullable
   private java.util.List<Integer> shippingAddresses;

   public CustomerDraftBuilder anonymousId(@Nullable final String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }

   public CustomerDraftBuilder lastName(@Nullable final String lastName) {
      this.lastName = lastName;
      return this;
   }

   public CustomerDraftBuilder addresses(@Nullable final java.util.List<com.commercetools.api.models.common.Address> addresses) {
      this.addresses = addresses;
      return this;
   }

   public CustomerDraftBuilder defaultShippingAddress(@Nullable final Long defaultShippingAddress) {
      this.defaultShippingAddress = defaultShippingAddress;
      return this;
   }

   public CustomerDraftBuilder stores(@Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
      this.stores = stores;
      return this;
   }

   public CustomerDraftBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }

   public CustomerDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }

   public CustomerDraftBuilder companyName(@Nullable final String companyName) {
      this.companyName = companyName;
      return this;
   }

   public CustomerDraftBuilder vatId(@Nullable final String vatId) {
      this.vatId = vatId;
      return this;
   }

   public CustomerDraftBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }

   public CustomerDraftBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
      this.billingAddresses = billingAddresses;
      return this;
   }

   public CustomerDraftBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
   }

   public CustomerDraftBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }

   public CustomerDraftBuilder title(@Nullable final String title) {
      this.title = title;
      return this;
   }

   public CustomerDraftBuilder customerNumber(@Nullable final String customerNumber) {
      this.customerNumber = customerNumber;
      return this;
   }

   public CustomerDraftBuilder isEmailVerified(@Nullable final Boolean isEmailVerified) {
      this.isEmailVerified = isEmailVerified;
      return this;
   }

   public CustomerDraftBuilder firstName(@Nullable final String firstName) {
      this.firstName = firstName;
      return this;
   }

   public CustomerDraftBuilder password( final String password) {
      this.password = password;
      return this;
   }

   public CustomerDraftBuilder middleName(@Nullable final String middleName) {
      this.middleName = middleName;
      return this;
   }

   public CustomerDraftBuilder salutation(@Nullable final String salutation) {
      this.salutation = salutation;
      return this;
   }

   public CustomerDraftBuilder anonymousCartId(@Nullable final String anonymousCartId) {
      this.anonymousCartId = anonymousCartId;
      return this;
   }

   public CustomerDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }

   public CustomerDraftBuilder defaultBillingAddress(@Nullable final Long defaultBillingAddress) {
      this.defaultBillingAddress = defaultBillingAddress;
      return this;
   }

   public CustomerDraftBuilder email( final String email) {
      this.email = email;
      return this;
   }

   public CustomerDraftBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
      this.shippingAddresses = shippingAddresses;
      return this;
   }

   @Nullable
   public String getAnonymousId(){
      return this.anonymousId;
   }

   @Nullable
   public String getLastName(){
      return this.lastName;
   }

   @Nullable
   public java.util.List<com.commercetools.api.models.common.Address> getAddresses(){
      return this.addresses;
   }

   @Nullable
   public Long getDefaultShippingAddress(){
      return this.defaultShippingAddress;
   }

   @Nullable
   public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores(){
      return this.stores;
   }

   @Nullable
   public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }

   @Nullable
   public String getCompanyName(){
      return this.companyName;
   }

   @Nullable
   public String getVatId(){
      return this.vatId;
   }

   @Nullable
   public String getExternalId(){
      return this.externalId;
   }

   @Nullable
   public java.util.List<Integer> getBillingAddresses(){
      return this.billingAddresses;
   }

   @Nullable
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }

   @Nullable
   public String getLocale(){
      return this.locale;
   }

   @Nullable
   public String getTitle(){
      return this.title;
   }

   @Nullable
   public String getCustomerNumber(){
      return this.customerNumber;
   }

   @Nullable
   public Boolean getIsEmailVerified(){
      return this.isEmailVerified;
   }

   @Nullable
   public String getFirstName(){
      return this.firstName;
   }


   public String getPassword(){
      return this.password;
   }

   @Nullable
   public String getMiddleName(){
      return this.middleName;
   }

   @Nullable
   public String getSalutation(){
      return this.salutation;
   }

   @Nullable
   public String getAnonymousCartId(){
      return this.anonymousCartId;
   }

   @Nullable
   public String getKey(){
      return this.key;
   }

   @Nullable
   public Long getDefaultBillingAddress(){
      return this.defaultBillingAddress;
   }


   public String getEmail(){
      return this.email;
   }

   @Nullable
   public java.util.List<Integer> getShippingAddresses(){
      return this.shippingAddresses;
   }

   public CustomerDraft build() {
       return new CustomerDraftImpl(anonymousId, lastName, addresses, defaultShippingAddress, stores, customerGroup, custom, companyName, vatId, externalId, billingAddresses, dateOfBirth, locale, title, customerNumber, isEmailVerified, firstName, password, middleName, salutation, anonymousCartId, key, defaultBillingAddress, email, shippingAddresses);
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
      builder.stores = template.getStores();
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
