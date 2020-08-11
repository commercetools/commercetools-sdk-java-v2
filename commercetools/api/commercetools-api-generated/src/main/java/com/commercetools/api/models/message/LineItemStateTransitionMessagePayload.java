package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
import java.time.ZonedDateTime;
import com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadImpl;

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
@JsonDeserialize(as = LineItemStateTransitionMessagePayloadImpl.class)
public interface LineItemStateTransitionMessagePayload extends MessagePayload {


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

   public static LineItemStateTransitionMessagePayloadImpl of(){
      return new LineItemStateTransitionMessagePayloadImpl();
   }


   public static LineItemStateTransitionMessagePayloadImpl of(final LineItemStateTransitionMessagePayload template) {
      LineItemStateTransitionMessagePayloadImpl instance = new LineItemStateTransitionMessagePayloadImpl();
      instance.setToState(template.getToState());
      instance.setFromState(template.getFromState());
      instance.setQuantity(template.getQuantity());
      instance.setLineItemId(template.getLineItemId());
      instance.setTransitionDate(template.getTransitionDate());
      return instance;
   }

}
