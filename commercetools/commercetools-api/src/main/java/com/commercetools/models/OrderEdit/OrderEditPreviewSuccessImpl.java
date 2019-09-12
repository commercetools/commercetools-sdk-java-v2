package com.commercetools.models.OrderEdit;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.OrderEdit.OrderEditResult;
import com.commercetools.models.OrderEdit.StagedOrder;
import java.lang.String;
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

   private java.lang.String type;
   
   private com.commercetools.models.OrderEdit.StagedOrder preview;
   
   private java.util.List<com.commercetools.models.Message.MessagePayload> messagePayloads;

   @JsonCreator
   OrderEditPreviewSuccessImpl(@JsonProperty("preview") final com.commercetools.models.OrderEdit.StagedOrder preview, @JsonProperty("messagePayloads") final java.util.List<com.commercetools.models.Message.MessagePayload> messagePayloads) {
      this.preview = preview;
      this.messagePayloads = messagePayloads;
      this.type = "PreviewSuccess";
   }
   public OrderEditPreviewSuccessImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.OrderEdit.StagedOrder getPreview(){
      return this.preview;
   }
   
   
   public java.util.List<com.commercetools.models.Message.MessagePayload> getMessagePayloads(){
      return this.messagePayloads;
   }

   public void setPreview(final com.commercetools.models.OrderEdit.StagedOrder preview){
      this.preview = preview;
   }
   
   public void setMessagePayloads(final java.util.List<com.commercetools.models.Message.MessagePayload> messagePayloads){
      this.messagePayloads = messagePayloads;
   }

}