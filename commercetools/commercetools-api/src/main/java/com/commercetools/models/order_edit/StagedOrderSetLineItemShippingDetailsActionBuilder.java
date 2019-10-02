package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLineItemShippingDetailsActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private String lineItemId;
   
   public StagedOrderSetLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public StagedOrderSetLineItemShippingDetailsActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public StagedOrderSetLineItemShippingDetailsAction build() {
       return new StagedOrderSetLineItemShippingDetailsActionImpl(shippingDetails, lineItemId);
   }
   
   public static StagedOrderSetLineItemShippingDetailsActionBuilder of() {
      return new StagedOrderSetLineItemShippingDetailsActionBuilder();
   }
   
   public static StagedOrderSetLineItemShippingDetailsActionBuilder of(final StagedOrderSetLineItemShippingDetailsAction template) {
      StagedOrderSetLineItemShippingDetailsActionBuilder builder = new StagedOrderSetLineItemShippingDetailsActionBuilder();
      builder.shippingDetails = template.getShippingDetails();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}