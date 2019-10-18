package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.generated.models.cart_discount.StackingMode;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.cart_discount.CartDiscountDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountDraftBuilder {
   
   
   private Boolean requiresDiscountCode;
   
   
   private String cartPredicate;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   @Nullable
   private com.commercetools.api.generated.models.cart_discount.StackingMode stackingMode;
   
   
   private String sortOrder;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   @Nullable
   private Boolean isActive;
   
   
   private com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft value;
   
   @Nullable
   private String key;
   
   @Nullable
   private com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target;
   
   public CartDiscountDraftBuilder requiresDiscountCode( final Boolean requiresDiscountCode) {
      this.requiresDiscountCode = requiresDiscountCode;
      return this;
   }
   
   public CartDiscountDraftBuilder cartPredicate( final String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   public CartDiscountDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CartDiscountDraftBuilder stackingMode(@Nullable final com.commercetools.api.generated.models.cart_discount.StackingMode stackingMode) {
      this.stackingMode = stackingMode;
      return this;
   }
   
   public CartDiscountDraftBuilder sortOrder( final String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   public CartDiscountDraftBuilder name( final com.commercetools.api.generated.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CartDiscountDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public CartDiscountDraftBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public CartDiscountDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public CartDiscountDraftBuilder isActive(@Nullable final Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public CartDiscountDraftBuilder value( final com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft value) {
      this.value = value;
      return this;
   }
   
   public CartDiscountDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public CartDiscountDraftBuilder target(@Nullable final com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target) {
      this.target = target;
      return this;
   }
   
   
   public Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }
   
   
   public String getCartPredicate(){
      return this.cartPredicate;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart_discount.StackingMode getStackingMode(){
      return this.stackingMode;
   }
   
   
   public String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   @Nullable
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft getValue(){
      return this.value;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart_discount.CartDiscountTarget getTarget(){
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