package com.commercetools.models.message;

import com.commercetools.models.message.Message;
import com.commercetools.models.state.StateReference;
import com.commercetools.models.message.OrderStateTransitionMessageImpl;

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
@JsonDeserialize(as = OrderStateTransitionMessageImpl.class)
public interface OrderStateTransitionMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   
   @NotNull
   @JsonProperty("force")
   public Boolean getForce();

   public void setState(final StateReference state);
   
   public void setForce(final Boolean force);
   
   public static OrderStateTransitionMessageImpl of(){
      return new OrderStateTransitionMessageImpl();
   }
   

   public static OrderStateTransitionMessageImpl of(final OrderStateTransitionMessage template) {
      OrderStateTransitionMessageImpl instance = new OrderStateTransitionMessageImpl();
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
      instance.setForce(template.getForce());
      instance.setState(template.getState());
      return instance;
   }

}