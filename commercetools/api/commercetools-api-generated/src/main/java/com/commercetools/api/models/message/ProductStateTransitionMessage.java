package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.ProductStateTransitionMessageImpl;

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
@JsonDeserialize(as = ProductStateTransitionMessageImpl.class)
public interface ProductStateTransitionMessage extends Message {


   @NotNull
   @Valid
   @JsonProperty("state")
   public StateReference getState();

   @NotNull
   @JsonProperty("force")
   public Boolean getForce();

   public void setState(final StateReference state);

   public void setForce(final Boolean force);

   public static ProductStateTransitionMessageImpl of(){
      return new ProductStateTransitionMessageImpl();
   }


   public static ProductStateTransitionMessageImpl of(final ProductStateTransitionMessage template) {
      ProductStateTransitionMessageImpl instance = new ProductStateTransitionMessageImpl();
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
