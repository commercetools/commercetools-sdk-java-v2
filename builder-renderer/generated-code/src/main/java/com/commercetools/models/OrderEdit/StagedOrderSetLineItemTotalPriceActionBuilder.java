package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ExternalLineItemTotalPrice;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemTotalPriceAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLineItemTotalPriceActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice;
   
   
   private java.lang.String lineItemId;
   
   public StagedOrderSetLineItemTotalPriceActionBuilder externalTotalPrice(@Nullable final com.commercetools.models.Cart.ExternalLineItemTotalPrice externalTotalPrice) {
      this.externalTotalPrice = externalTotalPrice;
      return this;
   }
   
   public StagedOrderSetLineItemTotalPriceActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalLineItemTotalPrice getExternalTotalPrice(){
      return this.externalTotalPrice;
   }
   
   
   public java.lang.String getLineItemId(){
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