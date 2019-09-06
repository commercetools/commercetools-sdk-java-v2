package com.commercetools.models.OrderEdit;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.OrderEdit.OrderEditResult;
import com.commercetools.models.OrderEdit.StagedOrder;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditPreviewSuccessImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditPreviewSuccessImpl.class)
public interface OrderEditPreviewSuccess extends OrderEditResult {

   
   @NotNull
   @Valid
   @JsonProperty("preview")
   public StagedOrder getPreview();
   
   @NotNull
   @Valid
   @JsonProperty("messagePayloads")
   public List<MessagePayload> getMessagePayloads();

   public void setPreview(final StagedOrder preview);
   
   public void setMessagePayloads(final List<MessagePayload> messagePayloads);
   
   public static OrderEditPreviewSuccessImpl of(){
      return new OrderEditPreviewSuccessImpl();
   }
   

   public static OrderEditPreviewSuccessImpl of(final OrderEditPreviewSuccess template) {
      OrderEditPreviewSuccessImpl instance = new OrderEditPreviewSuccessImpl();
      instance.setPreview(template.getPreview());
      instance.setMessagePayloads(template.getMessagePayloads());
      return instance;
   }

}