package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.common.Address;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetShippingAddressAndShippingMethodActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private com.commercetools.models.common.Address address;
   
   @Nullable
   private com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   public StagedOrderSetShippingAddressAndShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndShippingMethodActionBuilder address( final com.commercetools.models.common.Address address) {
      this.address = address;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }
   
   @Nullable
   public com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }

   public StagedOrderSetShippingAddressAndShippingMethodAction build() {
       return new StagedOrderSetShippingAddressAndShippingMethodActionImpl(externalTaxRate, address, shippingMethod);
   }
   
   public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder of() {
      return new StagedOrderSetShippingAddressAndShippingMethodActionBuilder();
   }
   
   public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder of(final StagedOrderSetShippingAddressAndShippingMethodAction template) {
      StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder = new StagedOrderSetShippingAddressAndShippingMethodActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.address = template.getAddress();
      builder.shippingMethod = template.getShippingMethod();
      return builder;
   }
   
}