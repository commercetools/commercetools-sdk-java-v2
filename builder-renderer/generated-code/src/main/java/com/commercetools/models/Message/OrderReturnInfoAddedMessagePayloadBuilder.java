package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.ReturnInfo;
import java.lang.String;
import com.commercetools.models.Message.OrderReturnInfoAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderReturnInfoAddedMessagePayloadBuilder {
   
   
   private com.commercetools.models.Order.ReturnInfo returnInfo;
   
   public OrderReturnInfoAddedMessagePayloadBuilder returnInfo( final com.commercetools.models.Order.ReturnInfo returnInfo) {
      this.returnInfo = returnInfo;
      return this;
   }
   
   
   public com.commercetools.models.Order.ReturnInfo getReturnInfo(){
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