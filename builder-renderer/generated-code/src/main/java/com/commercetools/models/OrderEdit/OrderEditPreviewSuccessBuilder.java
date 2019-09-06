package com.commercetools.models.OrderEdit;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.OrderEdit.OrderEditResult;
import com.commercetools.models.OrderEdit.StagedOrder;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditPreviewSuccess;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderEditPreviewSuccessBuilder {
   
   
   private com.commercetools.models.OrderEdit.StagedOrder preview;
   
   
   private java.util.List<com.commercetools.models.Message.MessagePayload> messagePayloads;
   
   public OrderEditPreviewSuccessBuilder preview( final com.commercetools.models.OrderEdit.StagedOrder preview) {
      this.preview = preview;
      return this;
   }
   
   public OrderEditPreviewSuccessBuilder messagePayloads( final java.util.List<com.commercetools.models.Message.MessagePayload> messagePayloads) {
      this.messagePayloads = messagePayloads;
      return this;
   }
   
   
   public com.commercetools.models.OrderEdit.StagedOrder getPreview(){
      return this.preview;
   }
   
   
   public java.util.List<com.commercetools.models.Message.MessagePayload> getMessagePayloads(){
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