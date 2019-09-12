package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import com.commercetools.models.CartDiscount.CartDiscountValue;
import com.commercetools.models.CartDiscount.StackingMode;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFields;
import java.lang.Boolean;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.CartDiscount.CartDiscountDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountDraftBuilder {
   
   
   private java.lang.Boolean requiresDiscountCode;
   
   
   private java.lang.String cartPredicate;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private com.commercetools.models.CartDiscount.StackingMode stackingMode;
   
   
   private java.lang.String sortOrder;
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   @Nullable
   private java.lang.Boolean isActive;
   
   
   private com.commercetools.models.CartDiscount.CartDiscountValue value;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private com.commercetools.models.CartDiscount.CartDiscountTarget target;
   
   public CartDiscountDraftBuilder requiresDiscountCode( final java.lang.Boolean requiresDiscountCode) {
      this.requiresDiscountCode = requiresDiscountCode;
      return this;
   }
   
   public CartDiscountDraftBuilder cartPredicate( final java.lang.String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   public CartDiscountDraftBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CartDiscountDraftBuilder stackingMode(@Nullable final com.commercetools.models.CartDiscount.StackingMode stackingMode) {
      this.stackingMode = stackingMode;
      return this;
   }
   
   public CartDiscountDraftBuilder sortOrder( final java.lang.String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   public CartDiscountDraftBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CartDiscountDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public CartDiscountDraftBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public CartDiscountDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public CartDiscountDraftBuilder isActive(@Nullable final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public CartDiscountDraftBuilder value( final com.commercetools.models.CartDiscount.CartDiscountValue value) {
      this.value = value;
      return this;
   }
   
   public CartDiscountDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public CartDiscountDraftBuilder target(@Nullable final com.commercetools.models.CartDiscount.CartDiscountTarget target) {
      this.target = target;
      return this;
   }
   
   
   public java.lang.Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }
   
   
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
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
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   @Nullable
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public com.commercetools.models.CartDiscount.CartDiscountValue getValue(){
      return this.value;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.models.CartDiscount.CartDiscountTarget getTarget(){
      return this.target;
   }

   public CartDiscountDraft build() {
       return new CartDiscountDraftImpl(requiresDiscountCode, cartPredicate, custom, stackingMode, sortOrder, name, validUntil, description, validFrom, isActive, value, key, target);
   }
   
   public static CartDiscountDraftBuilder of() {
      return new CartDiscountDraftBuilder();
   }
   
   public static CartDiscountDraftBuilder of(final CartDiscountDraft template) {
      CartDiscountDraftBuilder builder = new CartDiscountDraftBuilder();
      builder.requiresDiscountCode = template.getRequiresDiscountCode();
      builder.cartPredicate = template.getCartPredicate();
      builder.custom = template.getCustom();
      builder.stackingMode = template.getStackingMode();
      builder.sortOrder = template.getSortOrder();
      builder.name = template.getName();
      builder.validUntil = template.getValidUntil();
      builder.description = template.getDescription();
      builder.validFrom = template.getValidFrom();
      builder.isActive = template.getIsActive();
      builder.value = template.getValue();
      builder.key = template.getKey();
      builder.target = template.getTarget();
      return builder;
   }
   
}