package com.commercetools.models.Cart;

import com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity;
import com.commercetools.models.Cart.ItemShippingDetails;
import com.commercetools.models.Cart.TaxedItemPrice;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Order.ItemState;
import com.commercetools.models.TaxCategory.TaxCategoryReference;
import com.commercetools.models.TaxCategory.TaxRate;
import com.commercetools.models.Type.CustomFields;
import java.lang.Integer;
import java.lang.String;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomLineItemImpl implements CustomLineItem {

   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   private java.lang.Integer quantity;
   
   private com.commercetools.models.Cart.ItemShippingDetails shippingDetails;
   
   private com.commercetools.models.Common.TypedMoney money;
   
   private com.commercetools.models.Common.TypedMoney totalPrice;
   
   private com.commercetools.models.Cart.TaxedItemPrice taxedPrice;
   
   private com.commercetools.models.Type.CustomFields custom;
   
   private com.commercetools.models.Common.LocalizedString name;
   
   private java.util.List<com.commercetools.models.Order.ItemState> state;
   
   private java.lang.String id;
   
   private java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity;
   
   private java.lang.String slug;
   
   private com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory;

   @JsonCreator
   CustomLineItemImpl(@JsonProperty("taxRate") final com.commercetools.models.TaxCategory.TaxRate taxRate, @JsonProperty("quantity") final java.lang.Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.models.Cart.ItemShippingDetails shippingDetails, @JsonProperty("money") final com.commercetools.models.Common.TypedMoney money, @JsonProperty("totalPrice") final com.commercetools.models.Common.TypedMoney totalPrice, @JsonProperty("taxedPrice") final com.commercetools.models.Cart.TaxedItemPrice taxedPrice, @JsonProperty("custom") final com.commercetools.models.Type.CustomFields custom, @JsonProperty("name") final com.commercetools.models.Common.LocalizedString name, @JsonProperty("state") final java.util.List<com.commercetools.models.Order.ItemState> state, @JsonProperty("id") final java.lang.String id, @JsonProperty("discountedPricePerQuantity") final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity, @JsonProperty("slug") final java.lang.String slug, @JsonProperty("taxCategory") final com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory) {
      this.taxRate = taxRate;
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.money = money;
      this.totalPrice = totalPrice;
      this.taxedPrice = taxedPrice;
      this.custom = custom;
      this.name = name;
      this.state = state;
      this.id = id;
      this.discountedPricePerQuantity = discountedPricePerQuantity;
      this.slug = slug;
      this.taxCategory = taxCategory;
   }
   public CustomLineItemImpl() {
      
   }
   
   
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.lang.Integer getQuantity(){
      return this.quantity;
   }
   
   
   public com.commercetools.models.Cart.ItemShippingDetails getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getMoney(){
      return this.money;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.Cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.models.Order.ItemState> getState(){
      return this.state;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> getDiscountedPricePerQuantity(){
      return this.discountedPricePerQuantity;
   }
   
   
   public java.lang.String getSlug(){
      return this.slug;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public void setTaxRate(final com.commercetools.models.TaxCategory.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setQuantity(final java.lang.Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.models.Cart.ItemShippingDetails shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setMoney(final com.commercetools.models.Common.TypedMoney money){
      this.money = money;
   }
   
   public void setTotalPrice(final com.commercetools.models.Common.TypedMoney totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setTaxedPrice(final com.commercetools.models.Cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setCustom(final com.commercetools.models.Type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setName(final com.commercetools.models.Common.LocalizedString name){
      this.name = name;
   }
   
   public void setState(final java.util.List<com.commercetools.models.Order.ItemState> state){
      this.state = state;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setDiscountedPricePerQuantity(final java.util.List<com.commercetools.models.Cart.DiscountedLineItemPriceForQuantity> discountedPricePerQuantity){
      this.discountedPricePerQuantity = discountedPricePerQuantity;
   }
   
   public void setSlug(final java.lang.String slug){
      this.slug = slug;
   }
   
   public void setTaxCategory(final com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }

}