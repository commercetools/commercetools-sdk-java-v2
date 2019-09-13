package com.commercetools.models.message;

import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.state.StateReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.message.ProductStateTransitionMessagePayloadImpl;

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
@JsonDeserialize(as = ProductStateTransitionMessagePayloadImpl.class)
public interface ProductStateTransitionMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   
   @NotNull
   @JsonProperty("force")
   public Boolean getForce();

   public void setState(final StateReference state);
   
   public void setForce(final Boolean force);
   
   public static ProductStateTransitionMessagePayloadImpl of(){
      return new ProductStateTransitionMessagePayloadImpl();
   }
   

   public static ProductStateTransitionMessagePayloadImpl of(final ProductStateTransitionMessagePayload template) {
      ProductStateTransitionMessagePayloadImpl instance = new ProductStateTransitionMessagePayloadImpl();
      instance.setForce(template.getForce());
      instance.setState(template.getState());
      return instance;
   }

}