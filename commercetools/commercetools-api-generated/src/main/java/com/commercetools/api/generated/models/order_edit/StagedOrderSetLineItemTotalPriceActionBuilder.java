package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTotalPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLineItemTotalPriceActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private String lineItemId;
   
   public StagedOrderSetLineItemTotalPriceActionBuilder externalTotalPrice(@Nullable final com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public StagedOrderSetLineItemTotalPriceActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public StagedOrderSetLineItemTotalPriceAction build() {
       return new StagedOrderSetLineItemTotalPriceActionImpl(externalTotalPrice, lineItemId);
   }
   
   public static StagedOrderSetLineItemTotalPriceActionBuilder of() {
      return new StagedOrderSetLineItemTotalPriceActionBuilder();
   }
   
   public static StagedOrderSetLineItemTotalPriceActionBuilder of(final StagedOrderSetLineItemTotalPriceAction template) {
      StagedOrderSetLineItemTotalPriceActionBuilder builder = new StagedOrderSetLineItemTotalPriceActionBuilder();
      builder.externalTotalPrice = template.getExternalTotalPrice();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}