package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.commercetools.api.models.cart_discount.StackingMode;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.cart_discount.CartDiscount;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountBuilder {


   private java.time.ZonedDateTime createdAt;


   private java.time.ZonedDateTime lastModifiedAt;


   private String id;


   private Long version;

   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;

   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;


   private Boolean requiresDiscountCode;


   private java.util.List<com.commercetools.api.models.common.Reference> references;


   private String cartPredicate;

   @Nullable
   private com.commercetools.api.models.type.CustomFields custom;

   @Nullable
   private com.commercetools.api.models.common.LocalizedString description;

   @Nullable
   private java.time.ZonedDateTime validFrom;


   private Boolean isActive;

   @Nullable
   private com.commercetools.api.models.cart_discount.CartDiscountTarget target;


   private com.commercetools.api.models.cart_discount.StackingMode stackingMode;


   private String sortOrder;


   private com.commercetools.api.models.common.LocalizedString name;

   @Nullable
   private java.time.ZonedDateTime validUntil;


   private com.commercetools.api.models.cart_discount.CartDiscountValue value;

   @Nullable
   private String key;

   public CartDiscountBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }

   public CartDiscountBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }

   public CartDiscountBuilder id( final String id) {
      this.id = id;
      return this;
   }

   public CartDiscountBuilder version( final Long version) {
      this.version = version;
      return this;
   }

   public CartDiscountBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }

   public CartDiscountBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }

   public CartDiscountBuilder requiresDiscountCode( final Boolean requiresDiscountCode) {
      this.requiresDiscountCode = requiresDiscountCode;
      return this;
   }

   public CartDiscountBuilder references( final java.util.List<com.commercetools.api.models.common.Reference> references) {
      this.references = references;
      return this;
   }

   public CartDiscountBuilder cartPredicate( final String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }

   public CartDiscountBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }

   public CartDiscountBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }

   public CartDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }

   public CartDiscountBuilder isActive( final Boolean isActive) {
      this.isActive = isActive;
      return this;
   }

   public CartDiscountBuilder target(@Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
      this.target = target;
      return this;
   }

   public CartDiscountBuilder stackingMode( final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
      this.stackingMode = stackingMode;
      return this;
   }

   public CartDiscountBuilder sortOrder( final String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }

   public CartDiscountBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }

   public CartDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }

   public CartDiscountBuilder value( final com.commercetools.api.models.cart_discount.CartDiscountValue value) {
      this.value = value;
      return this;
   }

   public CartDiscountBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
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

   @Nullable
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }

   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }


   public Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }


   public java.util.List<com.commercetools.api.models.common.Reference> getReferences(){
      return this.references;
   }


   public String getCartPredicate(){
      return this.cartPredicate;
   }

   @Nullable
   public com.commercetools.api.models.type.CustomFields getCustom(){
      return this.custom;
   }

   @Nullable
   public com.commercetools.api.models.common.LocalizedString getDescription(){
      return this.description;
   }

   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }


   public Boolean getIsActive(){
      return this.isActive;
   }

   @Nullable
   public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget(){
      return this.target;
   }


   public com.commercetools.api.models.cart_discount.StackingMode getStackingMode(){
      return this.stackingMode;
   }


   public String getSortOrder(){
      return this.sortOrder;
   }


   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }

   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }


   public com.commercetools.api.models.cart_discount.CartDiscountValue getValue(){
      return this.value;
   }

   @Nullable
   public String getKey(){
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
