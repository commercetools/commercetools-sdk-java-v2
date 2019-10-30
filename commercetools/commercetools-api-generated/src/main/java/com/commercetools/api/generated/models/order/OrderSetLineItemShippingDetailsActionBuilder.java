package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderSetLineItemShippingDetailsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderSetLineItemShippingDetailsActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   
   private String lineItemId;
   
   public OrderSetLineItemShippingDetailsActionBuilder shippingDetails(@Nullable final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails) {
      this.shippingDetails = shippingDetails;
      return this;
   }
   
   public OrderSetLineItemShippingDetailsActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public String getLineItemId(){
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