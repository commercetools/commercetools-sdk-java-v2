package com.commercetools.models.Message;

import com.commercetools.models.Cart.LineItem;
import com.commercetools.models.Message.MessagePayload;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Message.OrderLineItemAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderLineItemAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Cart.LineItem lineItem;
   
   
   private java.lang.Long addedQuantity;
   
   public OrderLineItemAddedMessagePayloadBuilder lineItem( final com.commercetools.models.Cart.LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
   }
   
   public OrderLineItemAddedMessagePayloadBuilder addedQuantity( final java.lang.Long addedQuantity) {
      this.addedQuantity = addedQuantity;
      return this;
   }
   
   
   public com.commercetools.models.Cart.LineItem getLineItem(){
      return this.lineItem;
   }
   
   
   public java.lang.Long getAddedQuantity(){
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