package com.commercetools.models.order_edit;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order_edit.OrderEditResult;
import com.commercetools.models.order_edit.StagedOrder;
import com.commercetools.models.order_edit.OrderEditPreviewSuccess;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditPreviewSuccessBuilder {
   
   
   private com.commercetools.models.order_edit.StagedOrder preview;
   
   
   private java.util.List<com.commercetools.models.message.MessagePayload> messagePayloads;
   
   public OrderEditPreviewSuccessBuilder preview( final com.commercetools.models.order_edit.StagedOrder preview) {
      this.preview = preview;
      return this;
   }
   
   public OrderEditPreviewSuccessBuilder messagePayloads( final java.util.List<com.commercetools.models.message.MessagePayload> messagePayloads) {
      this.messagePayloads = messagePayloads;
      return this;
   }
   
   
   public com.commercetools.models.order_edit.StagedOrder getPreview(){
      return this.preview;
   }
   
   
   public java.util.List<com.commercetools.models.message.MessagePayload> getMessagePayloads(){
      return this.messagePayloads;
   }

   public OrderEditPreviewSuccess build() {
       return new OrderEditPreviewSuccessImpl(preview, messagePayloads);
   }
   
   public static OrderEditPreviewSuccessBuilder of() {
      return new OrderEditPreviewSuccessBuilder();
   }
   
   public static OrderEditPreviewSuccessBuilder of(final OrderEditPreviewSuccess template) {
      OrderEditPreviewSuccessBuilder builder = new OrderEditPreviewSuccessBuilder();
      builder.preview = template.getPreview();
      builder.messagePayloads = template.getMessagePayloads();
      return builder;
   }
   
}