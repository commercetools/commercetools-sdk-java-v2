package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.common.Address;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.shipping_method.ShippingRateDraft;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder {
   
   
   private com.commercetools.models.shipping_method.ShippingRateDraft shippingRate;
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private com.commercetools.models.common.Address address;
   
   
   private java.lang.String shippingMethodName;
   
   @Nullable
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingRate( final com.commercetools.models.shipping_method.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingMethodName( final java.lang.String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder taxCategory(@Nullable final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
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
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public StagedOrderSetShippingAddressAndCustomShippingMethodAction build() {
       return new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl(shippingRate, externalTaxRate, address, shippingMethodName, taxCategory);
   }
   
   public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder of() {
      return new StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder();
   }
   
   public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder of(final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
      StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder = new StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder();
      builder.shippingRate = template.getShippingRate();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.address = template.getAddress();
      builder.shippingMethodName = template.getShippingMethodName();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}