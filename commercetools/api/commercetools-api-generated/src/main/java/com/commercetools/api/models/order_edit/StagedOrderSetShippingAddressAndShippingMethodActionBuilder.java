package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetShippingAddressAndShippingMethodActionBuilder {

   @Nullable
   private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;


   private com.commercetools.api.models.common.Address address;

   @Nullable
   private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

   public StagedOrderSetShippingAddressAndShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }

   public StagedOrderSetShippingAddressAndShippingMethodActionBuilder address( final com.commercetools.api.models.common.Address address) {
      this.address = address;
      return this;
   }

   public StagedOrderSetShippingAddressAndShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }

   @Nullable
   public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }


   public com.commercetools.api.models.common.Address getAddress(){
      return this.address;
   }

   @Nullable
   public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
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
