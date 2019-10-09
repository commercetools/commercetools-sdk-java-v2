package com.commercetools.models.cart;

import com.commercetools.models.cart.DiscountedLineItemPrice;
import com.commercetools.models.cart.ShippingMethodState;
import com.commercetools.models.cart.TaxedItemPrice;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.order.Delivery;
import com.commercetools.models.shipping_method.ShippingMethodReference;
import com.commercetools.models.shipping_method.ShippingRate;
import com.commercetools.models.tax_category.TaxCategoryReference;
import com.commercetools.models.tax_category.TaxRate;
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
public final class ShippingInfoImpl implements ShippingInfo {

   private com.commercetools.models.tax_category.TaxRate taxRate;
   
   private com.commercetools.models.shipping_method.ShippingRate shippingRate;
   
   private com.commercetools.models.cart.DiscountedLineItemPrice discountedPrice;
   
   private com.commercetools.models.cart.ShippingMethodState shippingMethodState;
   
   private com.commercetools.models.cart.TaxedItemPrice taxedPrice;
   
   private com.commercetools.models.common.TypedMoney price;
   
   private com.commercetools.models.shipping_method.ShippingMethodReference shippingMethod;
   
   private String shippingMethodName;
   
   private java.util.List<com.commercetools.models.order.Delivery> deliveries;
   
   private com.commercetools.models.tax_category.TaxCategoryReference taxCategory;

   @JsonCreator
   ShippingInfoImpl(@JsonProperty("taxRate") final com.commercetools.models.tax_category.TaxRate taxRate, @JsonProperty("shippingRate") final com.commercetools.models.shipping_method.ShippingRate shippingRate, @JsonProperty("discountedPrice") final com.commercetools.models.cart.DiscountedLineItemPrice discountedPrice, @JsonProperty("shippingMethodState") final com.commercetools.models.cart.ShippingMethodState shippingMethodState, @JsonProperty("taxedPrice") final com.commercetools.models.cart.TaxedItemPrice taxedPrice, @JsonProperty("price") final com.commercetools.models.common.TypedMoney price, @JsonProperty("shippingMethod") final com.commercetools.models.shipping_method.ShippingMethodReference shippingMethod, @JsonProperty("shippingMethodName") final String shippingMethodName, @JsonProperty("deliveries") final java.util.List<com.commercetools.models.order.Delivery> deliveries, @JsonProperty("taxCategory") final com.commercetools.models.tax_category.TaxCategoryReference taxCategory) {
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
   
   
   public com.commercetools.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.models.shipping_method.ShippingRate getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.models.cart.DiscountedLineItemPrice getDiscountedPrice(){
      return this.discountedPrice;
   }
   
   
   public com.commercetools.models.cart.ShippingMethodState getShippingMethodState(){
      return this.shippingMethodState;
   }
   
   
   public com.commercetools.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.common.TypedMoney getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.models.shipping_method.ShippingMethodReference getShippingMethod(){
      return this.shippingMethod;
   }
   
   
   public String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   
   public java.util.List<com.commercetools.models.order.Delivery> getDeliveries(){
      return this.deliveries;
   }
   
   
   public com.commercetools.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public void setTaxRate(final com.commercetools.models.tax_category.TaxRate taxRate){
      this.taxRate = taxRate;
   }
   
   public void setShippingRate(final com.commercetools.models.shipping_method.ShippingRate shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setDiscountedPrice(final com.commercetools.models.cart.DiscountedLineItemPrice discountedPrice){
      this.discountedPrice = discountedPrice;
   }
   
   public void setShippingMethodState(final com.commercetools.models.cart.ShippingMethodState shippingMethodState){
      this.shippingMethodState = shippingMethodState;
   }
   
   public void setTaxedPrice(final com.commercetools.models.cart.TaxedItemPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setPrice(final com.commercetools.models.common.TypedMoney price){
      this.price = price;
   }
   
   public void setShippingMethod(final com.commercetools.models.shipping_method.ShippingMethodReference shippingMethod){
      this.shippingMethod = shippingMethod;
   }
   
   public void setShippingMethodName(final String shippingMethodName){
      this.shippingMethodName = shippingMethodName;
   }
   
   public void setDeliveries(final java.util.List<com.commercetools.models.order.Delivery> deliveries){
      this.deliveries = deliveries;
   }
   
   public void setTaxCategory(final com.commercetools.models.tax_category.TaxCategoryReference taxCategory){
      this.taxCategory = taxCategory;
   }

}