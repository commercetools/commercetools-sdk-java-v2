package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.OrderEdit.OrderEditApplied;
import com.commercetools.models.OrderEdit.OrderEditReference;
import java.lang.String;
import com.commercetools.models.Message.OrderEditAppliedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditAppliedMessagePayloadBuilder {
   
   
   private com.commercetools.models.OrderEdit.OrderEditApplied result;
   
   
   private com.commercetools.models.OrderEdit.OrderEditReference edit;
   
   public OrderEditAppliedMessagePayloadBuilder result( final com.commercetools.models.OrderEdit.OrderEditApplied result) {
      this.result = result;
      return this;
   }
   
   public OrderEditAppliedMessagePayloadBuilder edit( final com.commercetools.models.OrderEdit.OrderEditReference edit) {
      this.edit = edit;
      return this;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderEditApplied getResult(){
      return this.result;
   }
   
   
   public com.commercetools.models.OrderEdit.OrderEditReference getEdit(){
      return this.edit;
   }

   public OrderEditAppliedMessagePayload build() {
       return new OrderEditAppliedMessagePayloadImpl(result, edit);
   }
   
   public static OrderEditAppliedMessagePayloadBuilder of() {
      return new OrderEditAppliedMessagePayloadBuilder();
   }
   
   public static OrderEditAppliedMessagePayloadBuilder of(final OrderEditAppliedMessagePayload template) {
      OrderEditAppliedMessagePayloadBuilder builder = new OrderEditAppliedMessagePayloadBuilder();
      builder.result = template.getResult();
      builder.edit = template.getEdit();
      return builder;
   }
   
}