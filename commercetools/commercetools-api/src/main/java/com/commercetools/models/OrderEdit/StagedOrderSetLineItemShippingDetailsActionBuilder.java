package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLineItemShippingDetailsActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private java.lang.String lineItemId;
   
   public StagedOrderSetLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public StagedOrderSetLineItemShippingDetailsActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public java.lang.String getLineItemId(){
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