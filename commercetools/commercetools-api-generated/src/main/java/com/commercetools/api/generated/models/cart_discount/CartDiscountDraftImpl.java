package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.generated.models.cart_discount.StackingMode;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
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
   
   
   public Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }
   
   
   public String getCartPredicate(){
      return this.cartPredicate;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   /**
   	<p>Specifies whether the application of this discount causes the following discounts to be ignored.
   	Defaults to Stacking.</p>
   */
   public com.commercetools.api.generated.models.cart_discount.StackingMode getStackingMode(){
      return this.stackingMode;
   }
   
   
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
   
   
   public Boolean getIsActive(){
      return this.isActive;
   }
   
   
   public com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft getValue(){
      return this.value;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
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