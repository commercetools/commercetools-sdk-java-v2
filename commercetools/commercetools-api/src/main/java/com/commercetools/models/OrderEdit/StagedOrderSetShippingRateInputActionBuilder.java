package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ShippingRateInputDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetShippingRateInputAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetShippingRateInputActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ShippingRateInputDraft shippingRateInput;
   
   public StagedOrderSetShippingRateInputActionBuilder shippingRateInput(@Nullable final com.commercetools.models.Cart.ShippingRateInputDraft shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingRateInputDraft getShippingRateInput(){
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