package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.generated.models.cart_discount.StackingMode;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartDiscountDraftImpl implements CartDiscountDraft {

   private Boolean requiresDiscountCode;
   
   private String cartPredicate;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private com.commercetools.api.generated.models.cart_discount.StackingMode stackingMode;
   
   private String sortOrder;
   
   private com.commercetools.api.generated.models.common.LocalizedString name;
   
   private java.time.ZonedDateTime validUntil;
   
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   private java.time.ZonedDateTime validFrom;
   
   private Boolean isActive;
   
   private com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft value;
   
   private String key;
   
   private com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target;

   @JsonCreator
   CartDiscountDraftImpl(@JsonProperty("requiresDiscountCode") final Boolean requiresDiscountCode, @JsonProperty("cartPredicate") final String cartPredicate, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("stackingMode") final com.commercetools.api.generated.models.cart_discount.StackingMode stackingMode, @JsonProperty("sortOrder") final String sortOrder, @JsonProperty("name") final com.commercetools.api.generated.models.common.LocalizedString name, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("description") final com.commercetools.api.generated.models.common.LocalizedString description, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("isActive") final Boolean isActive, @JsonProperty("value") final com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft value, @JsonProperty("key") final String key, @JsonProperty("target") final com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target) {
      this.requiresDiscountCode = requiresDiscountCode;
      this.cartPredicate = cartPredicate;
      this.custom = custom;
      this.stackingMode = stackingMode;
      this.sortOrder = sortOrder;
      this.name = name;
      this.validUntil = validUntil;
      this.description = description;
      this.validFrom = validFrom;
      this.isActive = isActive;
      this.value = value;
      this.key = key;
      this.target = target;
   }
   public CartDiscountDraftImpl() {
      
   }
   
   /**
   *  <p>States whether the discount can only be used in a connection with a DiscountCode.
   *  Defaults to <code>false</code>.</p>
   */
   public Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }
   
   /**
   *  <p>A valid Cart predicate.</p>
   */
   public String getCartPredicate(){
      return this.cartPredicate;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.
   *  Defaults to Stacking.</p>
   */
   public com.commercetools.api.generated.models.cart_discount.StackingMode getStackingMode(){
      return this.stackingMode;
   }
   
   /**
   *  <p>The string must contain a number between 0 and 1.
   *  A discount with greater sort order is prioritized higher than a discount with lower sort order.
   *  The sort order must be unambiguous among all cart discounts.</p>
   */
   public String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   /**
   *  <p>Only active discount can be applied to the cart.
   *  Defaults to <code>true</code>.</p>
   */
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft getValue(){
      return this.value;
   }
   
   /**
   *  <p>User-specific unique identifier for a cart discount.
   *  Must be unique across a project.
   *  The field can be reset using the Set Key UpdateAction.</p>
   */
   public String getKey(){
      return this.key;
   }
   
   /**
   *  <p>Must not be set when the <code>value</code> has type <code>giftLineItem</code>, otherwise a CartDiscountTarget must be set.</p>
   */
   public com.commercetools.api.generated.models.cart_discount.CartDiscountTarget getTarget(){
      return this.target;
   }

   public void setRequiresDiscountCode(final Boolean requiresDiscountCode){
      this.requiresDiscountCode = requiresDiscountCode;
   }
   
   public void setCartPredicate(final String cartPredicate){
      this.cartPredicate = cartPredicate;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setStackingMode(final com.commercetools.api.generated.models.cart_discount.StackingMode stackingMode){
      this.stackingMode = stackingMode;
   }
   
   public void setSortOrder(final String sortOrder){
      this.sortOrder = sortOrder;
   }
   
   public void setName(final com.commercetools.api.generated.models.common.LocalizedString name){
      this.name = name;
   }
   
   public void setValidUntil(final java.time.ZonedDateTime validUntil){
      this.validUntil = validUntil;
   }
   
   public void setDescription(final com.commercetools.api.generated.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setValidFrom(final java.time.ZonedDateTime validFrom){
      this.validFrom = validFrom;
   }
   
   public void setIsActive(final Boolean isActive){
      this.isActive = isActive;
   }
   
   public void setValue(final com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft value){
      this.value = value;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setTarget(final com.commercetools.api.generated.models.cart_discount.CartDiscountTarget target){
      this.target = target;
   }

}