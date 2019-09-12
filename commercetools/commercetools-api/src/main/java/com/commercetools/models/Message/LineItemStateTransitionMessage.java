package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.State.StateReference;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Message.LineItemStateTransitionMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = LineItemStateTransitionMessageImpl.class)
public interface LineItemStateTransitionMessage extends Message {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @JsonProperty("transitionDate")
   public ZonedDateTime getTransitionDate();
   
   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("fromState")
   public StateReference getFromState();
   
   @NotNull
   @Valid
   @JsonProperty("toState")
   public StateReference getToState();

   public void setLineItemId(final String lineItemId);
   
   public void setTransitionDate(final ZonedDateTime transitionDate);
   
   public void setQuantity(final Long quantity);
   
   public void setFromState(final StateReference fromState);
   
   public void setToState(final StateReference toState);
   
   public static LineItemStateTransitionMessageImpl of(){
      return new LineItemStateTransitionMessageImpl();
   }
   

   public static LineItemStateTransitionMessageImpl of(final LineItemStateTransitionMessage template) {
      LineItemStateTransitionMessageImpl instance = new LineItemStateTransitionMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setToState(template.getToState());
      instance.setFromState(template.getFromState());
      instance.setQuantity(template.getQuantity());
      instance.setLineItemId(template.getLineItemId());
      instance.setTransitionDate(template.getTransitionDate());
      return instance;
   }

}