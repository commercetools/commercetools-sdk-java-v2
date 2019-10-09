package com.commercetools.models.order_edit;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.order_edit.OrderEditResult;
import com.commercetools.models.order_edit.StagedOrder;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditPreviewSuccessImpl implements OrderEditPreviewSuccess {

   private String type;
   
   private com.commercetools.models.order_edit.StagedOrder preview;
   
   private java.util.List<com.commercetools.models.message.MessagePayload> messagePayloads;

   @JsonCreator
   OrderEditPreviewSuccessImpl(@JsonProperty("preview") final com.commercetools.models.order_edit.StagedOrder preview, @JsonProperty("messagePayloads") final java.util.List<com.commercetools.models.message.MessagePayload> messagePayloads) {
      this.preview = preview;
      this.messagePayloads = messagePayloads;
      this.type = "PreviewSuccess";
   }
   public OrderEditPreviewSuccessImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.order_edit.StagedOrder getPreview(){
      return this.preview;
   }
   
   
   public java.util.List<com.commercetools.models.message.MessagePayload> getMessagePayloads(){
      return this.messagePayloads;
   }

   public void setPreview(final com.commercetools.models.order_edit.StagedOrder preview){
      this.preview = preview;
   }
   
   public void setMessagePayloads(final java.util.List<com.commercetools.models.message.MessagePayload> messagePayloads){
      this.messagePayloads = messagePayloads;
   }

}