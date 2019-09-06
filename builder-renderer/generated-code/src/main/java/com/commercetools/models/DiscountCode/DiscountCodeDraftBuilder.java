package com.commercetools.models.DiscountCode;

import com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.DiscountCode.DiscountCodeDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeDraftBuilder {
   
   
   private java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts;
   
   
   private java.lang.String code;
   
   @Nullable
   private java.lang.String cartPredicate;
   
   @Nullable
   private com.commercetools.models.Type.CustomFieldsDraft custom;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private java.util.List<java.lang.String> groups;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   @Nullable
   private java.lang.Long maxApplicationsPerCustomer;
   
   @Nullable
   private java.lang.Boolean isActive;
   
   @Nullable
   private java.lang.Long maxApplications;
   
   public DiscountCodeDraftBuilder cartDiscounts( final java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> cartDiscounts) {
      this.cartDiscounts = cartDiscounts;
      return this;
   }
   
   public DiscountCodeDraftBuilder code( final java.lang.String code) {
      this.code = code;
      return this;
   }
   
   public DiscountCodeDraftBuilder cartPredicate(@Nullable final java.lang.String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   public DiscountCodeDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public DiscountCodeDraftBuilder name(@Nullable final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public DiscountCodeDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public DiscountCodeDraftBuilder groups(@Nullable final java.util.List<java.lang.String> groups) {
      this.groups = groups;
      return this;
   }
   
   public DiscountCodeDraftBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public DiscountCodeDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public DiscountCodeDraftBuilder maxApplicationsPerCustomer(@Nullable final java.lang.Long maxApplicationsPerCustomer) {
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
      return this;
   }
   
   public DiscountCodeDraftBuilder isActive(@Nullable final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public DiscountCodeDraftBuilder maxApplications(@Nullable final java.lang.Long maxApplications) {
      this.maxApplications = maxApplications;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.CartDiscount.CartDiscountResourceIdentifier> getCartDiscounts(){
      return this.cartDiscounts;
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   @Nullable
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public java.util.List<java.lang.String> getGroups(){
      return this.groups;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   @Nullable
   public java.lang.Long getMaxApplicationsPerCustomer(){
      return this.maxApplicationsPerCustomer;
   }
   
   @Nullable
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   @Nullable
   public java.lang.Long getMaxApplications(){
      return this.maxApplications;
   }

   public DiscountCodeDraft build() {
       return new DiscountCodeDraftImpl(cartDiscounts, code, cartPredicate, custom, name, validUntil, groups, description, validFrom, maxApplicationsPerCustomer, isActive, maxApplications);
   }
   
   public static DiscountCodeDraftBuilder of() {
      return new DiscountCodeDraftBuilder();
   }
   
   public static DiscountCodeDraftBuilder of(final DiscountCodeDraft template) {
      DiscountCodeDraftBuilder builder = new DiscountCodeDraftBuilder();
      builder.cartDiscounts = template.getCartDiscounts();
      builder.code = template.getCode();
      builder.cartPredicate = template.getCartPredicate();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.validUntil = template.getValidUntil();
      builder.groups = template.getGroups();
      builder.description = template.getDescription();
      builder.validFrom = template.getValidFrom();
      builder.maxApplicationsPerCustomer = template.getMaxApplicationsPerCustomer();
      builder.isActive = template.getIsActive();
      builder.maxApplications = template.getMaxApplications();
      return builder;
   }
   
}