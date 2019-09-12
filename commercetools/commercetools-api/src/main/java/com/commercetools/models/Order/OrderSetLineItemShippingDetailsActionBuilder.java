package com.commercetools.models.Order;

import com.commercetools.models.Cart.ItemShippingDetailsDraft;
import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.Order.OrderSetLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetLineItemShippingDetailsActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private java.lang.String lineItemId;
   
   public OrderSetLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.models.Cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public OrderSetLineItemShippingDetailsActionBuilder lineItemId( final java.lang.String lineItemId) {
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

   public OrderSetLineItemShippingDetailsAction build() {
       return new OrderSetLineItemShippingDetailsActionImpl(shippingDetails, lineItemId);
   }
   
   public static OrderSetLineItemShippingDetailsActionBuilder of() {
      return new OrderSetLineItemShippingDetailsActionBuilder();
   }
   
   public static OrderSetLineItemShippingDetailsActionBuilder of(final OrderSetLineItemShippingDetailsAction template) {
      OrderSetLineItemShippingDetailsActionBuilder builder = new OrderSetLineItemShippingDetailsActionBuilder();
      builder.shippingDetails = template.getShippingDetails();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}