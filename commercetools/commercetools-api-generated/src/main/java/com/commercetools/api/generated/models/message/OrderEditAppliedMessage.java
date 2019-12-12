package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.order_edit.OrderEditApplied;
import com.commercetools.api.generated.models.order_edit.OrderEditReference;
import com.commercetools.api.generated.models.message.OrderEditAppliedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderEditAppliedMessageImpl.class)
public interface OrderEditAppliedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("edit")
   public OrderEditReference getEdit();
   
   @NotNull
   @Valid
   @JsonProperty("result")
   public OrderEditApplied getResult();

   public void setEdit(final OrderEditReference edit);
   
   public void setResult(final OrderEditApplied result);
   
   public static OrderEditAppliedMessageImpl of(){
      return new OrderEditAppliedMessageImpl();
   }
   

   public static OrderEditAppliedMessageImpl of(final OrderEditAppliedMessage template) {
      OrderEditAppliedMessageImpl instance = new OrderEditAppliedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setResult(template.getResult());
      instance.setEdit(template.getEdit());
      return instance;
   }

}