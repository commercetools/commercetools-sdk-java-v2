package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.message.PaymentStatusStateTransitionMessagePayloadImpl;

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
@JsonDeserialize(as = PaymentStatusStateTransitionMessagePayloadImpl.class)
public interface PaymentStatusStateTransitionMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   
   @NotNull
   @JsonProperty("force")
   public Boolean getForce();

   public void setState(final StateReference state);
   
   public void setForce(final Boolean force);
   
   public static PaymentStatusStateTransitionMessagePayloadImpl of(){
      return new PaymentStatusStateTransitionMessagePayloadImpl();
   }
   

   public static PaymentStatusStateTransitionMessagePayloadImpl of(final PaymentStatusStateTransitionMessagePayload template) {
      PaymentStatusStateTransitionMessagePayloadImpl instance = new PaymentStatusStateTransitionMessagePayloadImpl();
      instance.setForce(template.getForce());
      instance.setState(template.getState());
      return instance;
   }

}