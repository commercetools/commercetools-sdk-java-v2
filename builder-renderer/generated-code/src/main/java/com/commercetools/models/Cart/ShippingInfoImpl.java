package com.commercetools.models.Cart;

import com.commercetools.models.Cart.DiscountedLineItemPrice;
import com.commercetools.models.Cart.ShippingMethodState;
import com.commercetools.models.Cart.TaxedItemPrice;
import com.commercetools.models.Common.TypedMoney;
import com.commercetools.models.Order.Delivery;
import com.commercetools.models.ShippingMethod.ShippingMethodReference;
import com.commercetools.models.ShippingMethod.ShippingRate;
import com.commercetools.models.TaxCategory.TaxCategoryReference;
import com.commercetools.models.TaxCategory.TaxRate;
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
public final class ShippingInfoImpl implements ShippingInfo {

   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   private com.commercetools.models.ShippingMethod.ShippingRate shippingRate;
   
   private com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice;
   
   private com.commercetools.models.Cart.ShippingMethodState shippingMethodState;
   
   private com.commercetools.models.Cart.TaxedItemPrice taxedPrice;
   
   private com.commercetools.models.Common.TypedMoney price;
   
   private com.commercetools.models.ShippingMethod.ShippingMethodReference shippingMethod;
   
   private java.lang.String shippingMethodName;
   
   private java.util.List<com.commercetools.models.Order.Delivery> deliveries;
   
   private com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory;

   @JsonCreator
   ShippingInfoImpl(@JsonProperty("taxRate") final com.commercetools.models.TaxCategory.TaxRate taxRate, @JsonProperty("shippingRate") final com.commercetools.models.ShippingMethod.ShippingRate shippingRate, @JsonProperty("discountedPrice") final com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice, @JsonProperty("shippingMethodState") final com.commercetools.models.Cart.ShippingMethodState shippingMethodState, @JsonProperty("taxedPrice") final com.commercetools.models.Cart.TaxedItemPrice taxedPrice, @JsonProperty("price") final com.commercetools.models.Common.TypedMoney price, @JsonProperty("shippingMethod") final com.commercetools.models.ShippingMethod.ShippingMethodReference shippingMethod, @JsonProperty("shippingMethodName") final java.lang.String shippingMethodName, @JsonProperty("deliveries") final java.util.List<com.commercetools.models.Order.Delivery> deliveries, @JsonProperty("taxCategory") final com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory) {
      this.taxRate = taxRate;
      this.shippingRate = shippingRate;
      this.discountedPrice = discountedPrice;
      this.shippingMethodState = shippingMethodState;
      this.taxedPrice = taxedPrice;
      this.price = price;
      this.shippingMethod = shippingMethod;
      this.shippingMethodName = shippingMethodName;
      this.deliveries = deliveries;
      this.taxCategory = taxCategory;
   }
   public ShippingInfoImpl() {
      
   }
   
   
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRate getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.models.Cart.DiscountedLineItemPrice getDiscountedPrice(){
      return this.discountedPrice;
   }
   
   
   public com.commercetools.models.Cart.ShippingMethodState getShippingMethodState(){
      return this.shippingMethodState;
   }
   
   
   public com.commercetools.models.Cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingMethodReference getShippingMethod(){
      return this.shippingMethod;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   
   public java.util.List<com.commercetools.models.Order.Delivery> getDeliveries(){
      return this.deliveries;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public void setTaxRate(final com.commercetools.models.TaxCategory.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setShippingRate(final com.commercetools.models.ShippingMethod.ShippingRate shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setDiscountedPrice(final com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice){
      this.discountedPrice = discountedPrice;
   }
   
   public void setShippingMethodState(final com.commercetools.models.Cart.ShippingMethodState shippingMethodState){
      this.shippingMethodState = shippingMethodState;
   }
   
   public void setTaxedPrice(final com.commercetools.models.Cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setPrice(final com.commercetools.models.Common.TypedMoney price){
      this.price = price;
   }
   
   public void setShippingMethod(final com.commercetools.models.ShippingMethod.ShippingMethodReference shippingMethod){
      this.shippingMethod = shippingMethod;
   }
   
   public void setShippingMethodName(final java.lang.String shippingMethodName){
      this.shippingMethodName = shippingMethodName;
   }
   
   public void setDeliveries(final java.util.List<com.commercetools.models.Order.Delivery> deliveries){
      this.deliveries = deliveries;
   }
   
   public void setTaxCategory(final com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }

}