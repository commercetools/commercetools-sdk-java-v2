package com.commercetools.models.order;

import com.commercetools.models.cart.ItemShippingDetailsDraft;
import com.commercetools.models.order.OrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order.OrderSetCustomLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderSetCustomLineItemShippingDetailsActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   @Nullable
   private com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   public OrderSetCustomLineItemShippingDetailsActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public OrderSetCustomLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }

   public OrderSetCustomLineItemShippingDetailsAction build() {
       return new OrderSetCustomLineItemShippingDetailsActionImpl(customLineItemId, shippingDetails);
   }
   
   public static OrderSetCustomLineItemShippingDetailsActionBuilder of() {
      return new OrderSetCustomLineItemShippingDetailsActionBuilder();
   }
   
   public static OrderSetCustomLineItemShippingDetailsActionBuilder of(final OrderSetCustomLineItemShippingDetailsAction template) {
      OrderSetCustomLineItemShippingDetailsActionBuilder builder = new OrderSetCustomLineItemShippingDetailsActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.shippingDetails = template.getShippingDetails();
      return builder;
   }
   
}