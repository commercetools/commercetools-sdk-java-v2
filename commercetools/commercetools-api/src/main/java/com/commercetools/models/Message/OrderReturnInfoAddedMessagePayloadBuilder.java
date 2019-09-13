package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order.ReturnInfo;
import java.lang.String;
import com.commercetools.models.message.OrderReturnInfoAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderReturnInfoAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.order.ReturnInfo returnInfo;
   
   public OrderReturnInfoAddedMessagePayloadBuilder returnInfo( final com.commercetools.models.order.ReturnInfo returnInfo) {
      this.returnInfo = returnInfo;
      return this;
   }
   
   
   public com.commercetools.models.order.ReturnInfo getReturnInfo(){
      return this.returnInfo;
   }

   public OrderReturnInfoAddedMessagePayload build() {
       return new OrderReturnInfoAddedMessagePayloadImpl(returnInfo);
   }
   
   public static OrderReturnInfoAddedMessagePayloadBuilder of() {
      return new OrderReturnInfoAddedMessagePayloadBuilder();
   }
   
   public static OrderReturnInfoAddedMessagePayloadBuilder of(final OrderReturnInfoAddedMessagePayload template) {
      OrderReturnInfoAddedMessagePayloadBuilder builder = new OrderReturnInfoAddedMessagePayloadBuilder();
      builder.returnInfo = template.getReturnInfo();
      return builder;
   }
   
}