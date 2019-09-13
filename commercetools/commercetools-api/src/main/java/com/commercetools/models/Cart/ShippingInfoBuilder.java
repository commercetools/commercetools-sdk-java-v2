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
import java.lang.String;
import com.commercetools.models.cart.ShippingInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingInfoBuilder {
   
   @Nullable
   private com.commercetools.models.tax_category.TaxRate taxRate;
   
   
   private com.commercetools.models.shipping_method.ShippingRate shippingRate;
   
   @Nullable
   private com.commercetools.models.cart.DiscountedLineItemPrice discountedPrice;
   
   
   private com.commercetools.models.cart.ShippingMethodState shippingMethodState;
   
   @Nullable
   private com.commercetools.models.cart.TaxedItemPrice taxedPrice;
   
   
   private com.commercetools.models.common.TypedMoney price;
   
   @Nullable
   private com.commercetools.models.shipping_method.ShippingMethodReference shippingMethod;
   
   
   private java.lang.String shippingMethodName;
   
   @Nullable
   private java.util.List<com.commercetools.models.order.Delivery> deliveries;
   
   @Nullable
   private com.commercetools.models.tax_category.TaxCategoryReference taxCategory;
   
   public ShippingInfoBuilder taxRate(@Nullable final com.commercetools.models.tax_category.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public ShippingInfoBuilder shippingRate( final com.commercetools.models.shipping_method.ShippingRate shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public ShippingInfoBuilder discountedPrice(@Nullable final com.commercetools.models.cart.DiscountedLineItemPrice discountedPrice) {
      this.discountedPrice = discountedPrice;
      return this;
   }
   
   public ShippingInfoBuilder shippingMethodState( final com.commercetools.models.cart.ShippingMethodState shippingMethodState) {
      this.shippingMethodState = shippingMethodState;
      return this;
   }
   
   public ShippingInfoBuilder taxedPrice(@Nullable final com.commercetools.models.cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public ShippingInfoBuilder price( final com.commercetools.models.common.TypedMoney price) {
      this.price = price;
      return this;
   }
   
   public ShippingInfoBuilder shippingMethod(@Nullable final com.commercetools.models.shipping_method.ShippingMethodReference shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   public ShippingInfoBuilder shippingMethodName( final java.lang.String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public ShippingInfoBuilder deliveries(@Nullable final java.util.List<com.commercetools.models.order.Delivery> deliveries) {
      this.deliveries = deliveries;
      return this;
   }
   
   public ShippingInfoBuilder taxCategory(@Nullable final com.commercetools.models.tax_category.TaxCategoryReference taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.models.shipping_method.ShippingRate getShippingRate(){
      return this.shippingRate;
   }
   
   @Nullable
   public com.commercetools.models.cart.DiscountedLineItemPrice getDiscountedPrice(){
      return this.discountedPrice;
   }
   
   
   public com.commercetools.models.cart.ShippingMethodState getShippingMethodState(){
      return this.shippingMethodState;
   }
   
   @Nullable
   public com.commercetools.models.cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.common.TypedMoney getPrice(){
      return this.price;
   }
   
   @Nullable
   public com.commercetools.models.shipping_method.ShippingMethodReference getShippingMethod(){
      return this.shippingMethod;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.order.Delivery> getDeliveries(){
      return this.deliveries;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxCategoryReference getTaxCategory(){
      return this.taxCategory;
   }

   public ShippingInfo build() {
       return new ShippingInfoImpl(taxRate, shippingRate, discountedPrice, shippingMethodState, taxedPrice, price, shippingMethod, shippingMethodName, deliveries, taxCategory);
   }
   
   public static ShippingInfoBuilder of() {
      return new ShippingInfoBuilder();
   }
   
   public static ShippingInfoBuilder of(final ShippingInfo template) {
      ShippingInfoBuilder builder = new ShippingInfoBuilder();
      builder.taxRate = template.getTaxRate();
      builder.shippingRate = template.getShippingRate();
      builder.discountedPrice = template.getDiscountedPrice();
      builder.shippingMethodState = template.getShippingMethodState();
      builder.taxedPrice = template.getTaxedPrice();
      builder.price = template.getPrice();
      builder.shippingMethod = template.getShippingMethod();
      builder.shippingMethodName = template.getShippingMethodName();
      builder.deliveries = template.getDeliveries();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}