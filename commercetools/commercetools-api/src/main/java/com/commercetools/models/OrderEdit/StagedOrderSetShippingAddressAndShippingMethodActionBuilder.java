package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingAddressAndShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetShippingAddressAndShippingMethodActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private com.commercetools.models.Common.Address address;
   
   @Nullable
   private com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod;
   
   public StagedOrderSetShippingAddressAndShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndShippingMethodActionBuilder address( final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   public StagedOrderSetShippingAddressAndShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }
   
   @Nullable
   public com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier getShippingMethod(){
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