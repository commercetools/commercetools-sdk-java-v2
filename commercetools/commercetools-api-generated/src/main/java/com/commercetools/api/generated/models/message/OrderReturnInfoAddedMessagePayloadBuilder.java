package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.ReturnInfo;
import com.commercetools.api.generated.models.message.OrderReturnInfoAddedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderReturnInfoAddedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.order.ReturnInfo returnInfo;
   
   public OrderReturnInfoAddedMessagePayloadBuilder returnInfo( final com.commercetools.api.generated.models.order.ReturnInfo returnInfo) {
      this.returnInfo = returnInfo;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnInfo getReturnInfo(){
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