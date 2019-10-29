package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.LocalDate;
import com.commercetools.api.generated.models.me.MyCustomerDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerDraftBuilder {
   
   @Nullable
   private String lastName;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.common.Address> addresses;
   
   @Nullable
   private Long defaultShippingAddress;
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.store.StoreResourceIdentifier> stores;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   @Nullable
   private String companyName;
   
   @Nullable
   private String vatId;
   
   @Nullable
   private java.time.LocalDate dateOfBirth;
   
   @Nullable
   private String locale;
   
   @Nullable
   private String title;
   
   @Nullable
   private String firstName;
   
   
   private String password;
   
   @Nullable
   private String middleName;
   
   @Nullable
   private Long defaultBillingAddress;
   
   
   private String email;
   
   public MyCustomerDraftBuilder lastName(@Nullable final String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   public MyCustomerDraftBuilder addresses(@Nullable final java.util.List<com.commercetools.api.generated.models.common.Address> addresses) {
      this.addresses = addresses;
      return this;
   }
   
   public MyCustomerDraftBuilder defaultShippingAddress(@Nullable final Long defaultShippingAddress) {
      this.defaultShippingAddress = defaultShippingAddress;
      return this;
   }
   
   public MyCustomerDraftBuilder stores(@Nullable final java.util.List<com.commercetools.api.generated.models.store.StoreResourceIdentifier> stores) {
      this.stores = stores;
      return this;
   }
   
   public MyCustomerDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public MyCustomerDraftBuilder companyName(@Nullable final String companyName) {
      this.companyName = companyName;
      return this;
   }
   
   public MyCustomerDraftBuilder vatId(@Nullable final String vatId) {
      this.vatId = vatId;
      return this;
   }
   
   public MyCustomerDraftBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
   }
   
   public MyCustomerDraftBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   public MyCustomerDraftBuilder title(@Nullable final String title) {
      this.title = title;
      return this;
   }
   
   public MyCustomerDraftBuilder firstName(@Nullable final String firstName) {
      this.firstName = firstName;
      return this;
   }
   
   public MyCustomerDraftBuilder password( final String password) {
      this.password = password;
      return this;
   }
   
   public MyCustomerDraftBuilder middleName(@Nullable final String middleName) {
      this.middleName = middleName;
      return this;
   }
   
   public MyCustomerDraftBuilder defaultBillingAddress(@Nullable final Long defaultBillingAddress) {
      this.defaultBillingAddress = defaultBillingAddress;
      return this;
   }
   
   public MyCustomerDraftBuilder email( final String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public String getLastName(){
      return this.lastName;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.common.Address> getAddresses(){
      return this.addresses;
   }
   
   @Nullable
   public Long getDefaultShippingAddress(){
      return this.defaultShippingAddress;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.store.StoreResourceIdentifier> getStores(){
      return this.stores;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
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
   public Long getDefaultBillingAddress(){
      return this.defaultBillingAddress;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public MyCustomerDraft build() {
       return new MyCustomerDraftImpl(lastName, addresses, defaultShippingAddress, stores, custom, companyName, vatId, dateOfBirth, locale, title, firstName, password, middleName, defaultBillingAddress, email);
   }
   
   public static MyCustomerDraftBuilder of() {
      return new MyCustomerDraftBuilder();
   }
   
   public static MyCustomerDraftBuilder of(final MyCustomerDraft template) {
      MyCustomerDraftBuilder builder = new MyCustomerDraftBuilder();
      builder.lastName = template.getLastName();
      builder.addresses = template.getAddresses();
      builder.defaultShippingAddress = template.getDefaultShippingAddress();
      builder.stores = template.getStores();
      builder.custom = template.getCustom();
      builder.companyName = template.getCompanyName();
      builder.vatId = template.getVatId();
      builder.dateOfBirth = template.getDateOfBirth();
      builder.locale = template.getLocale();
      builder.title = template.getTitle();
      builder.firstName = template.getFirstName();
      builder.password = template.getPassword();
      builder.middleName = template.getMiddleName();
      builder.defaultBillingAddress = template.getDefaultBillingAddress();
      builder.email = template.getEmail();
      return builder;
   }
   
}