package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.LineItem;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.OrderLineItemAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderLineItemAddedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.cart.LineItem lineItem;
   
   
   private Long addedQuantity;
   
   public OrderLineItemAddedMessagePayloadBuilder lineItem( final com.commercetools.api.generated.models.cart.LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
   }
   
   public OrderLineItemAddedMessagePayloadBuilder addedQuantity( final Long addedQuantity) {
      this.addedQuantity = addedQuantity;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.cart.LineItem getLineItem(){
      return this.lineItem;
   }
   
   
   public Long getAddedQuantity(){
      return this.addedQuantity;
   }

   public OrderLineItemAddedMessagePayload build() {
       return new OrderLineItemAddedMessagePayloadImpl(lineItem, addedQuantity);
   }
   
   public static OrderLineItemAddedMessagePayloadBuilder of() {
      return new OrderLineItemAddedMessagePayloadBuilder();
   }
   
   public static OrderLineItemAddedMessagePayloadBuilder of(final OrderLineItemAddedMessagePayload template) {
      OrderLineItemAddedMessagePayloadBuilder builder = new OrderLineItemAddedMessagePayloadBuilder();
      builder.lineItem = template.getLineItem();
      builder.addedQuantity = template.getAddedQuantity();
      return builder;
   }
   
}