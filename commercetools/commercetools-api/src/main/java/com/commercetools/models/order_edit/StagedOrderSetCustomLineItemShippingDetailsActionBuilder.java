package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetCustomLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomLineItemShippingDetailsActionBuilder {
   
   
   private String customLineItemId;
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   public StagedOrderSetCustomLineItemShippingDetailsActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderSetCustomLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }

   public StagedOrderSetCustomLineItemShippingDetailsAction build() {
       return new StagedOrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
   }
   
   public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder of() {
      return new StagedOrderSetCustomLineItemShippingDetailsActionBuilder();
   }
   
   public static StagedOrderSetCustomLineItemShippingDetailsActionBuilder of(final StagedOrderSetCustomLineItemShippingDetailsAction template) {
      StagedOrderSetCustomLineItemShippingDetailsActionBuilder builder = new StagedOrderSetCustomLineItemShippingDetailsActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.shippingDetails = template.getShippingDetails();
      return builder;
   }
   
}