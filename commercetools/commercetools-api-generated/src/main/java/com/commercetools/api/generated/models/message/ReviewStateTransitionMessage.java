package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.message.ReviewStateTransitionMessageImpl;

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
@JsonDeserialize(as = ReviewStateTransitionMessageImpl.class)
public interface ReviewStateTransitionMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("oldState")
   public StateReference getOldState();
   
   @NotNull
   @Valid
   @JsonProperty("newState")
   public StateReference getNewState();
   
   @NotNull
   @JsonProperty("oldIncludedInStatistics")
   public Boolean getOldIncludedInStatistics();
   
   @NotNull
   @JsonProperty("newIncludedInStatistics")
   public Boolean getNewIncludedInStatistics();
   
   @NotNull
   @Valid
   @JsonProperty("target")
   public Reference getTarget();
   
   @NotNull
   @JsonProperty("force")
   public Boolean getForce();

   public void setOldState(final StateReference oldState);
   
   public void setNewState(final StateReference newState);
   
   public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics);
   
   public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics);
   
   public void setTarget(final Reference target);
   
   public void setForce(final Boolean force);
   
   public static ReviewStateTransitionMessageImpl of(){
      return new ReviewStateTransitionMessageImpl();
   }
   

   public static ReviewStateTransitionMessageImpl of(final ReviewStateTransitionMessage template) {
      ReviewStateTransitionMessageImpl instance = new ReviewStateTransitionMessageImpl();
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
      instance.setNewIncludedInStatistics(template.getNewIncludedInStatistics());
      instance.setOldState(template.getOldState());
      instance.setForce(template.getForce());
      instance.setOldIncludedInStatistics(template.getOldIncludedInStatistics());
      instance.setNewState(template.getNewState());
      instance.setTarget(template.getTarget());
      return instance;
   }

}