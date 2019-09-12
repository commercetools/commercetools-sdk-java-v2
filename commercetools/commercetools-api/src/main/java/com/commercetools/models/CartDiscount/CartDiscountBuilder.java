package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import com.commercetools.models.CartDiscount.CartDiscountValue;
import com.commercetools.models.CartDiscount.StackingMode;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.Reference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Boolean;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.CartDiscount.CartDiscount;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private java.lang.Boolean requiresDiscountCode;
   
   
   private java.util.List<com.commercetools.models.Common.Reference> references;
   
   
   private java.lang.String cartPredicate;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private java.lang.Boolean isActive;
   
   @Nullable
   private com.commercetools.models.CartDiscount.CartDiscountTarget target;
   
   
   private com.commercetools.models.CartDiscount.StackingMode stackingMode;
   
   
   private java.lang.String sortOrder;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   
   private com.commercetools.models.CartDiscount.CartDiscountValue value;
   
   @Nullable
   private java.lang.String key;
   
   public CartDiscountBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CartDiscountBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CartDiscountBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CartDiscountBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CartDiscountBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CartDiscountBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CartDiscountBuilder requiresDiscountCode( final java.lang.Boolean requiresDiscountCode) {
      this.requiresDiscountCode = requiresDiscountCode;
      return this;
   }
   
   public CartDiscountBuilder references( final java.util.List<com.commercetools.models.Common.Reference> references) {
      this.references = references;
      return this;
   }
   
   public CartDiscountBuilder cartPredicate( final java.lang.String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   public CartDiscountBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CartDiscountBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public CartDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public CartDiscountBuilder isActive( final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public CartDiscountBuilder target(@Nullable final com.commercetools.models.CartDiscount.CartDiscountTarget target) {
      this.target = target;
      return this;
   }
   
   public CartDiscountBuilder stackingMode( final com.commercetools.models.CartDiscount.StackingMode stackingMode) {
      this.stackingMode = stackingMode;
      return this;
   }
   
   public CartDiscountBuilder sortOrder( final java.lang.String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   public CartDiscountBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CartDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public CartDiscountBuilder value( final com.commercetools.models.CartDiscount.CartDiscountValue value) {
      this.value = value;
      return this;
   }
   
   public CartDiscountBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
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
   
   
   public java.lang.Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Reference> getReferences(){
      return this.references;
   }
   
   
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   @Nullable
   public com.commercetools.models.CartDiscount.CartDiscountTarget getTarget(){
      return this.target;
   }
   
   
   public com.commercetools.models.CartDiscount.StackingMode getStackingMode(){
      return this.stackingMode;
   }
   
   
   public java.lang.String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public com.commercetools.models.CartDiscount.CartDiscountValue getValue(){
      return this.value;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public CartDiscount build() {
       return new CartDiscountImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, requiresDiscountCode, references, cartPredicate, custom, description, validFrom, isActive, target, stackingMode, sortOrder, name, validUntil, value, key);
   }
   
   public static CartDiscountBuilder of() {
      return new CartDiscountBuilder();
   }
   
   public static CartDiscountBuilder of(final CartDiscount template) {
      CartDiscountBuilder builder = new CartDiscountBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.requiresDiscountCode = template.getRequiresDiscountCode();
      builder.references = template.getReferences();
      builder.cartPredicate = template.getCartPredicate();
      builder.custom = template.getCustom();
      builder.description = template.getDescription();
      builder.validFrom = template.getValidFrom();
      builder.isActive = template.getIsActive();
      builder.target = template.getTarget();
      builder.stackingMode = template.getStackingMode();
      builder.sortOrder = template.getSortOrder();
      builder.name = template.getName();
      builder.validUntil = template.getValidUntil();
      builder.value = template.getValue();
      builder.key = template.getKey();
      return builder;
   }
   
}