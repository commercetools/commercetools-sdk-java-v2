package com.commercetools.models.Order;

import com.commercetools.models.Cart.ShippingMethodState;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.Delivery;
import com.commercetools.models.Order.DiscountedLineItemPriceDraft;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import com.commercetools.models.ShippingMethod.ShippingRateDraft;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import com.commercetools.models.TaxCategory.TaxRate;
import java.lang.String;
import com.commercetools.models.Order.ShippingInfoImportDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShippingInfoImportDraftBuilder {
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxRate taxRate;
   
   
   private com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate;
   
   @Nullable
   private com.commercetools.models.Order.DiscountedLineItemPriceDraft discountedPrice;
   
   @Nullable
   private com.commercetools.models.Cart.ShippingMethodState shippingMethodState;
   
   
   private com.commercetools.models.Common.Money price;
   
   @Nullable
   private com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod;
   
   
   private java.lang.String shippingMethodName;
   
   @Nullable
   private java.util.List<com.commercetools.models.Order.Delivery> deliveries;
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;
   
   public ShippingInfoImportDraftBuilder taxRate(@Nullable final com.commercetools.models.TaxCategory.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public ShippingInfoImportDraftBuilder shippingRate( final com.commercetools.models.ShippingMethod.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public ShippingInfoImportDraftBuilder discountedPrice(@Nullable final com.commercetools.models.Order.DiscountedLineItemPriceDraft discountedPrice) {
      this.discountedPrice = discountedPrice;
      return this;
   }
   
   public ShippingInfoImportDraftBuilder shippingMethodState(@Nullable final com.commercetools.models.Cart.ShippingMethodState shippingMethodState) {
      this.shippingMethodState = shippingMethodState;
      return this;
   }
   
   public ShippingInfoImportDraftBuilder price( final com.commercetools.models.Common.Money price) {
      this.price = price;
      return this;
   }
   
   public ShippingInfoImportDraftBuilder shippingMethod(@Nullable final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   public ShippingInfoImportDraftBuilder shippingMethodName( final java.lang.String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public ShippingInfoImportDraftBuilder deliveries(@Nullable final java.util.List<com.commercetools.models.Order.Delivery> deliveries) {
      this.deliveries = deliveries;
      return this;
   }
   
   public ShippingInfoImportDraftBuilder taxCategory(@Nullable final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxRate getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   @Nullable
   public com.commercetools.models.Order.DiscountedLineItemPriceDraft getDiscountedPrice(){
      return this.discountedPrice;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingMethodState getShippingMethodState(){
      return this.shippingMethodState;
   }
   
   
   public com.commercetools.models.Common.Money getPrice(){
      return this.price;
   }
   
   @Nullable
   public com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier getShippingMethod(){
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
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public ShippingInfoImportDraft build() {
       return new ShippingInfoImportDraftImpl(taxRate, shippingRate, discountedPrice, shippingMethodState, price, shippingMethod, shippingMethodName, deliveries, taxCategory);
   }
   
   public static ShippingInfoImportDraftBuilder of() {
      return new ShippingInfoImportDraftBuilder();
   }
   
   public static ShippingInfoImportDraftBuilder of(final ShippingInfoImportDraft template) {
      ShippingInfoImportDraftBuilder builder = new ShippingInfoImportDraftBuilder();
      builder.taxRate = template.getTaxRate();
      builder.shippingRate = template.getShippingRate();
      builder.discountedPrice = template.getDiscountedPrice();
      builder.shippingMethodState = template.getShippingMethodState();
      builder.price = template.getPrice();
      builder.shippingMethod = template.getShippingMethod();
      builder.shippingMethodName = template.getShippingMethodName();
      builder.deliveries = template.getDeliveries();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}