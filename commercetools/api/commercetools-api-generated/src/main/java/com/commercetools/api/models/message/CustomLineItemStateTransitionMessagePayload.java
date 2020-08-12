package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
import java.time.ZonedDateTime;
import com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadImpl;

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
@JsonDeserialize(as = CustomLineItemStateTransitionMessagePayloadImpl.class)
public interface CustomLineItemStateTransitionMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
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

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setTransitionDate(final ZonedDateTime transitionDate);
   
   public void setQuantity(final Long quantity);
   
   public void setFromState(final StateReference fromState);
   
   public void setToState(final StateReference toState);
   
   public static CustomLineItemStateTransitionMessagePayloadImpl of(){
      return new CustomLineItemStateTransitionMessagePayloadImpl();
   }
   

   public static CustomLineItemStateTransitionMessagePayloadImpl of(final CustomLineItemStateTransitionMessagePayload template) {
      CustomLineItemStateTransitionMessagePayloadImpl instance = new CustomLineItemStateTransitionMessagePayloadImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setTransitionDate(template.getTransitionDate());
      instance.setQuantity(template.getQuantity());
      instance.setFromState(template.getFromState());
      instance.setToState(template.getToState());
      return instance;
   }

}
