package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDate;
import com.commercetools.models.Me.MyCustomerDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCustomerDraftBuilder {
   
   @Nullable
   private java.lang.String lastName;
   
   @Nullable
   private java.util.List<com.commercetools.models.Common.Address> addresses;
   
   @Nullable
   private java.lang.Long defaultShippingAddress;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private java.lang.String companyName;
   
   @Nullable
   private java.lang.String vatId;
   
   @Nullable
   private java.time.LocalDate dateOfBirth;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private java.lang.String title;
   
   @Nullable
   private java.lang.String firstName;
   
   
   private java.lang.String password;
   
   @Nullable
   private java.lang.String middleName;
   
   @Nullable
   private java.lang.Long defaultBillingAddress;
   
   
   private java.lang.String email;
   
   public MyCustomerDraftBuilder lastName(@Nullable final java.lang.String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   public MyCustomerDraftBuilder addresses(@Nullable final java.util.List<com.commercetools.models.Common.Address> addresses) {
      this.addresses = addresses;
      return this;
   }
   
   public MyCustomerDraftBuilder defaultShippingAddress(@Nullable final java.lang.Long defaultShippingAddress) {
      this.defaultShippingAddress = defaultShippingAddress;
      return this;
   }
   
   public MyCustomerDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public MyCustomerDraftBuilder companyName(@Nullable final java.lang.String companyName) {
      this.companyName = companyName;
      return this;
   }
   
   public MyCustomerDraftBuilder vatId(@Nullable final java.lang.String vatId) {
      this.vatId = vatId;
      return this;
   }
   
   public MyCustomerDraftBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
      return this;
   }
   
   public MyCustomerDraftBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public MyCustomerDraftBuilder title(@Nullable final java.lang.String title) {
      this.title = title;
      return this;
   }
   
   public MyCustomerDraftBuilder firstName(@Nullable final java.lang.String firstName) {
      this.firstName = firstName;
      return this;
   }
   
   public MyCustomerDraftBuilder password( final java.lang.String password) {
      this.password = password;
      return this;
   }
   
   public MyCustomerDraftBuilder middleName(@Nullable final java.lang.String middleName) {
      this.middleName = middleName;
      return this;
   }
   
   public MyCustomerDraftBuilder defaultBillingAddress(@Nullable final java.lang.Long defaultBillingAddress) {
      this.defaultBillingAddress = defaultBillingAddress;
      return this;
   }
   
   public MyCustomerDraftBuilder email( final java.lang.String email) {
      this.email = email;
      return this;
   }
   
   @Nullable
   public java.lang.String getLastName(){
      return this.lastName;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Common.Address> getAddresses(){
      return this.addresses;
   }
   
   @Nullable
   public java.lang.Long getDefaultShippingAddress(){
      return this.defaultShippingAddress;
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
   public java.lang.Long getDefaultBillingAddress(){
      return this.defaultBillingAddress;
   }
   
   
   public java.lang.String getEmail(){
      return this.email;
   }

   public MyCustomerDraft build() {
       return new MyCustomerDraftImpl(lastName, addresses, defaultShippingAddress, custom, companyName, vatId, dateOfBirth, locale, title, firstName, password, middleName, defaultBillingAddress, email);
   }
   
   public static MyCustomerDraftBuilder of() {
      return new MyCustomerDraftBuilder();
   }
   
   public static MyCustomerDraftBuilder of(final MyCustomerDraft template) {
      MyCustomerDraftBuilder builder = new MyCustomerDraftBuilder();
      builder.lastName = template.getLastName();
      builder.addresses = template.getAddresses();
      builder.defaultShippingAddress = template.getDefaultShippingAddress();
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