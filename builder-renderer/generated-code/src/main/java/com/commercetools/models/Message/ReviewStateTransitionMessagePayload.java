package com.commercetools.models.Message;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Message.ReviewStateTransitionMessagePayloadImpl;

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
@JsonDeserialize(as = ReviewStateTransitionMessagePayloadImpl.class)
public interface ReviewStateTransitionMessagePayload extends MessagePayload {

   
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
   
   public static ReviewStateTransitionMessagePayloadImpl of(){
      return new ReviewStateTransitionMessagePayloadImpl();
   }
   

   public static ReviewStateTransitionMessagePayloadImpl of(final ReviewStateTransitionMessagePayload template) {
      ReviewStateTransitionMessagePayloadImpl instance = new ReviewStateTransitionMessagePayloadImpl();
      instance.setNewIncludedInStatistics(template.getNewIncludedInStatistics());
      instance.setOldState(template.getOldState());
      instance.setForce(template.getForce());
      instance.setOldIncludedInStatistics(template.getOldIncludedInStatistics());
      instance.setNewState(template.getNewState());
      instance.setTarget(template.getTarget());
      return instance;
   }

}