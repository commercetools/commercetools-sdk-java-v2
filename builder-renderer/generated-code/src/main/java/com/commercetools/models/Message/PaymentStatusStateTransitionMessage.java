package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.State.StateReference;
import java.lang.Boolean;
import com.commercetools.models.Message.PaymentStatusStateTransitionMessageImpl;

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
@JsonDeserialize(as = PaymentStatusStateTransitionMessageImpl.class)
public interface PaymentStatusStateTransitionMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   
   @NotNull
   @JsonProperty("force")
   public Boolean getForce();

   public void setState(final StateReference state);
   
   public void setForce(final Boolean force);
   
   public static PaymentStatusStateTransitionMessageImpl of(){
      return new PaymentStatusStateTransitionMessageImpl();
   }
   

   public static PaymentStatusStateTransitionMessageImpl of(final PaymentStatusStateTransitionMessage template) {
      PaymentStatusStateTransitionMessageImpl instance = new PaymentStatusStateTransitionMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setForce(template.getForce());
      instance.setState(template.getState());
      return instance;
   }

}