package com.commercetools.api.models.order;

import com.commercetools.api.models.cart.ShippingMethodState;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.Delivery;
import com.commercetools.api.models.order.DiscountedLineItemPriceDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.order.ShippingInfoImportDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingInfoImportDraftBuilder {

   @Nullable
   private com.commercetools.api.models.tax_category.TaxRate taxRate;


   private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

   @Nullable
   private com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice;

   @Nullable
   private com.commercetools.api.models.cart.ShippingMethodState shippingMethodState;


   private com.commercetools.api.models.common.Money price;

   @Nullable
   private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;


   private String shippingMethodName;

   @Nullable
   private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;

   @Nullable
   private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

   public ShippingInfoImportDraftBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
      this.taxRate = taxRate;
      return this;
   }

   public ShippingInfoImportDraftBuilder shippingRate( final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }

   public ShippingInfoImportDraftBuilder discountedPrice(@Nullable final com.commercetools.api.models.order.DiscountedLineItemPriceDraft discountedPrice) {
      this.discountedPrice = discountedPrice;
      return this;
   }

   public ShippingInfoImportDraftBuilder shippingMethodState(@Nullable final com.commercetools.api.models.cart.ShippingMethodState shippingMethodState) {
      this.shippingMethodState = shippingMethodState;
      return this;
   }

   public ShippingInfoImportDraftBuilder price( final com.commercetools.api.models.common.Money price) {
      this.price = price;
      return this;
   }

   public ShippingInfoImportDraftBuilder shippingMethod(@Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }

   public ShippingInfoImportDraftBuilder shippingMethodName( final String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }

   public ShippingInfoImportDraftBuilder deliveries(@Nullable final java.util.List<com.commercetools.api.models.order.Delivery> deliveries) {
      this.deliveries = deliveries;
      return this;
   }

   public ShippingInfoImportDraftBuilder taxCategory(@Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.tax_category.TaxRate getTaxRate(){
      return this.taxRate;
   }


   public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }

   @Nullable
   public com.commercetools.api.models.order.DiscountedLineItemPriceDraft getDiscountedPrice(){
      return this.discountedPrice;
   }

   @Nullable
   public com.commercetools.api.models.cart.ShippingMethodState getShippingMethodState(){
      return this.shippingMethodState;
   }


   public com.commercetools.api.models.common.Money getPrice(){
      return this.price;
   }

   @Nullable
   public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }


   public String getShippingMethodName(){
      return this.shippingMethodName;
   }

   @Nullable
   public java.util.List<com.commercetools.api.models.order.Delivery> getDeliveries(){
      return this.deliveries;
   }

   @Nullable
   public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
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
