package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.message.OrderStateTransitionMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = OrderStateTransitionMessagePayloadImpl.class)
public interface OrderStateTransitionMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   
   @NotNull
   @JsonProperty("force")
   public Boolean getForce();

   public void setState(final StateReference state);
   
   public void setForce(final Boolean force);
   
   public static OrderStateTransitionMessagePayloadImpl of(){
      return new OrderStateTransitionMessagePayloadImpl();
   }
   

   public static OrderStateTransitionMessagePayloadImpl of(final OrderStateTransitionMessagePayload template) {
      OrderStateTransitionMessagePayloadImpl instance = new OrderStateTransitionMessagePayloadImpl();
      instance.setForce(template.getForce());
      instance.setState(template.getState());
      return instance;
   }

}