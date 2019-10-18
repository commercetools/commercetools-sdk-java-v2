package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ShippingRateInputDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingRateInputAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetShippingRateInputActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput;
   
   public StagedOrderSetShippingRateInputActionBuilder shippingRateInput(@Nullable final com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }

   public StagedOrderSetShippingRateInputAction build() {
       return new StagedOrderSetShippingRateInputActionImpl(shippingRateInput);
   }
   
   public static StagedOrderSetShippingRateInputActionBuilder of() {
      return new StagedOrderSetShippingRateInputActionBuilder();
   }
   
   public static StagedOrderSetShippingRateInputActionBuilder of(final StagedOrderSetShippingRateInputAction template) {
      StagedOrderSetShippingRateInputActionBuilder builder = new StagedOrderSetShippingRateInputActionBuilder();
      builder.shippingRateInput = template.getShippingRateInput();
      return builder;
   }
   
}