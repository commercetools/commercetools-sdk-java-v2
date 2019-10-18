package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder {
   
   
   private com.commercetools.api.generated.models.shipping_method.ShippingRateDraft shippingRate;
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private com.commercetools.api.generated.models.common.Address address;
   
   
   private String shippingMethodName;
   
   @Nullable
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingRate( final com.commercetools.api.generated.models.shipping_method.ShippingRateDraft shippingRate) {
      this.shippingRate = shippingRate;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder address( final com.commercetools.api.generated.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingMethodName( final String shippingMethodName) {
      this.shippingMethodName = shippingMethodName;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder taxCategory(@Nullable final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
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