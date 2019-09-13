package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.shipping_method.ShippingRateDraft;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetCustomShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomShippingMethodActionBuilder {
   
   
   private com.commercetools.models.shipping_method.ShippingRateDraft shippingRate;
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private java.lang.String shippingMethodName;
   
   @Nullable
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public StagedOrderSetCustomShippingMethodActionBuilder shippingRate( final com.commercetools.models.shipping_method.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public StagedOrderSetCustomShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetCustomShippingMethodActionBuilder shippingMethodName( final java.lang.String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public StagedOrderSetCustomShippingMethodActionBuilder taxCategory(@Nullable final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public com.commercetools.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public StagedOrderSetCustomShippingMethodAction build() {
       return new StagedOrderSetCustomShippingMethodActionImpl(shippingRate, externalTaxRate, shippingMethodName, taxCategory);
   }
   
   public static StagedOrderSetCustomShippingMethodActionBuilder of() {
      return new StagedOrderSetCustomShippingMethodActionBuilder();
   }
   
   public static StagedOrderSetCustomShippingMethodActionBuilder of(final StagedOrderSetCustomShippingMethodAction template) {
      StagedOrderSetCustomShippingMethodActionBuilder builder = new StagedOrderSetCustomShippingMethodActionBuilder();
      builder.shippingRate = template.getShippingRate();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingMethodName = template.getShippingMethodName();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}