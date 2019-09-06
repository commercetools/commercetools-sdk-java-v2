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
import com.commercetools.models.Cart.ShippingInfo;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingInfoBuilder {
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   
   private com.commercetools.models.ShippingMethod.ShippingRate shippingRate;
   
   @Nullable
   private com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice;
   
   
   private com.commercetools.models.Cart.ShippingMethodState shippingMethodState;
   
   @Nullable
   private com.commercetools.models.Cart.TaxedItemPrice taxedPrice;
   
   
   private com.commercetools.models.Common.TypedMoney price;
   
   @Nullable
   private com.commercetools.models.ShippingMethod.ShippingMethodReference shippingMethod;
   
   
   private java.lang.String shippingMethodName;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.Delivery> deliveries;
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory;
   
   public ShippingInfoBuilder taxRate(@Nullable final com.commercetools.models.TaxCategory.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public ShippingInfoBuilder shippingRate( final com.commercetools.models.ShippingMethod.ShippingRate shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public ShippingInfoBuilder discountedPrice(@Nullable final com.commercetools.models.Cart.DiscountedLineItemPrice discountedPrice) {
      this.discountedPrice = discountedPrice;
      return this;
   }
   
   public ShippingInfoBuilder shippingMethodState( final com.commercetools.models.Cart.ShippingMethodState shippingMethodState) {
      this.shippingMethodState = shippingMethodState;
      return this;
   }
   
   public ShippingInfoBuilder taxedPrice(@Nullable final com.commercetools.models.Cart.TaxedItemPrice taxedPrice) {
      this.taxedPrice = taxedPrice;
      return this;
   }
   
   public ShippingInfoBuilder price( final com.commercetools.models.Common.TypedMoney price) {
      this.price = price;
      return this;
   }
   
   public ShippingInfoBuilder shippingMethod(@Nullable final com.commercetools.models.ShippingMethod.ShippingMethodReference shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   public ShippingInfoBuilder shippingMethodName( final java.lang.String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public ShippingInfoBuilder deliveries(@Nullable final java.util.List<com.commercetools.models.Order.Delivery> deliveries) {
      this.deliveries = deliveries;
      return this;
   }
   
   public ShippingInfoBuilder taxCategory(@Nullable final com.commercetools.models.TaxCategory.TaxCategoryReference taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRate getShippingRate(){
      return this.shippingRate;
   }
   
   @Nullable
   public com.commercetools.models.Cart.DiscountedLineItemPrice getDiscountedPrice(){
      return this.discountedPrice;
   }
   
   
   public com.commercetools.models.Cart.ShippingMethodState getShippingMethodState(){
      return this.shippingMethodState;
   }
   
   @Nullable
   public com.commercetools.models.Cart.TaxedItemPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.Common.TypedMoney getPrice(){
      return this.price;
   }
   
   @Nullable
   public com.commercetools.models.ShippingMethod.ShippingMethodReference getShippingMethod(){
      return this.shippingMethod;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Order.Delivery> getDeliveries(){
      return this.deliveries;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxCategoryReference getTaxCategory(){
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