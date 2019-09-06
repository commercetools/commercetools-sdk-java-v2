package com.commercetools.models.DiscountCode;

import com.commercetools.models.CartDiscount.CartDiscountReference;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.DiscountCode.DiscountCode;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountCodeBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> cartDiscounts;
   
   
   private java.lang.String code;
   
   
   private java.util.List<com.commercetools.models.Common.Reference> references;
   
   @Nullable
   private java.lang.String cartPredicate;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   
   private java.util.List<java.lang.String> groups;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   @Nullable
   private java.lang.Long maxApplicationsPerCustomer;
   
   
   private java.lang.Boolean isActive;
   
   @Nullable
   private java.lang.Long maxApplications;
   
   public DiscountCodeBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public DiscountCodeBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public DiscountCodeBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public DiscountCodeBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public DiscountCodeBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public DiscountCodeBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public DiscountCodeBuilder cartDiscounts( final java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> cartDiscounts) {
      this.cartDiscounts = cartDiscounts;
      return this;
   }
   
   public DiscountCodeBuilder code( final java.lang.String code) {
      this.code = code;
      return this;
   }
   
   public DiscountCodeBuilder references( final java.util.List<com.commercetools.models.Common.Reference> references) {
      this.references = references;
      return this;
   }
   
   public DiscountCodeBuilder cartPredicate(@Nullable final java.lang.String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   public DiscountCodeBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public DiscountCodeBuilder name(@Nullable final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public DiscountCodeBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public DiscountCodeBuilder groups( final java.util.List<java.lang.String> groups) {
      this.groups = groups;
      return this;
   }
   
   public DiscountCodeBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public DiscountCodeBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public DiscountCodeBuilder maxApplicationsPerCustomer(@Nullable final java.lang.Long maxApplicationsPerCustomer) {
      this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
      return this;
   }
   
   public DiscountCodeBuilder isActive( final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public DiscountCodeBuilder maxApplications(@Nullable final java.lang.Long maxApplications) {
      this.maxApplications = maxApplications;
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
   
   
   public java.util.List<com.commercetools.models.CartDiscount.CartDiscountReference> getCartDiscounts(){
      return this.cartDiscounts;
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Reference> getReferences(){
      return this.references;
   }
   
   @Nullable
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
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
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   @Nullable
   public java.lang.Long getMaxApplications(){
      return this.maxApplications;
   }

   public DiscountCode build() {
       return new DiscountCodeImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, cartDiscounts, code, references, cartPredicate, custom, name, validUntil, groups, description, validFrom, maxApplicationsPerCustomer, isActive, maxApplications);
   }
   
   public static DiscountCodeBuilder of() {
      return new DiscountCodeBuilder();
   }
   
   public static DiscountCodeBuilder of(final DiscountCode template) {
      DiscountCodeBuilder builder = new DiscountCodeBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.cartDiscounts = template.getCartDiscounts();
      builder.code = template.getCode();
      builder.references = template.getReferences();
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