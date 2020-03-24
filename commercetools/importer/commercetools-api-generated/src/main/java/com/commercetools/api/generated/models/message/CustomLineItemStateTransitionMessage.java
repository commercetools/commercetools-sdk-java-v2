package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.state.StateReference;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.message.CustomLineItemStateTransitionMessageImpl;

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
@JsonDeserialize(as = CustomLineItemStateTransitionMessageImpl.class)
public interface CustomLineItemStateTransitionMessage extends Message {

   
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
   
   public static CustomLineItemStateTransitionMessageImpl of(){
      return new CustomLineItemStateTransitionMessageImpl();
   }
   

   public static CustomLineItemStateTransitionMessageImpl of(final CustomLineItemStateTransitionMessage template) {
      CustomLineItemStateTransitionMessageImpl instance = new CustomLineItemStateTransitionMessageImpl();
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
      instance.setToState(template.getToState());
      instance.setFromState(template.getFromState());
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setQuantity(template.getQuantity());
      instance.setTransitionDate(template.getTransitionDate());
      return instance;
   }

}