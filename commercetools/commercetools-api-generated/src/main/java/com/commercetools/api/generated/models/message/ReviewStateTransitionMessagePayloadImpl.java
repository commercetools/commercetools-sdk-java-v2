package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.state.StateReference;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewStateTransitionMessagePayloadImpl implements ReviewStateTransitionMessagePayload {

   private String type;
   
   private Boolean newIncludedInStatistics;
   
   private com.commercetools.api.generated.models.state.StateReference oldState;
   
   private Boolean force;
   
   private Boolean oldIncludedInStatistics;
   
   private com.commercetools.api.generated.models.state.StateReference newState;
   
   private com.commercetools.api.generated.models.common.Reference target;

   @JsonCreator
   ReviewStateTransitionMessagePayloadImpl(@JsonProperty("newIncludedInStatistics") final Boolean newIncludedInStatistics, @JsonProperty("oldState") final com.commercetools.api.generated.models.state.StateReference oldState, @JsonProperty("force") final Boolean force, @JsonProperty("oldIncludedInStatistics") final Boolean oldIncludedInStatistics, @JsonProperty("newState") final com.commercetools.api.generated.models.state.StateReference newState, @JsonProperty("target") final com.commercetools.api.generated.models.common.Reference target) {
      this.newIncludedInStatistics = newIncludedInStatistics;
      this.oldState = oldState;
      this.force = force;
      this.oldIncludedInStatistics = oldIncludedInStatistics;
      this.newState = newState;
      this.target = target;
      this.type = "ReviewStateTransition";
   }
   public ReviewStateTransitionMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public Boolean getNewIncludedInStatistics(){
      return this.newIncludedInStatistics;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getOldState(){
      return this.oldState;
   }
   
   
   public Boolean getForce(){
      return this.force;
   }
   
   
   public Boolean getOldIncludedInStatistics(){
      return this.oldIncludedInStatistics;
   }
   
   
   public com.commercetools.api.generated.models.state.StateReference getNewState(){
      return this.newState;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getTarget(){
      return this.target;
   }

   public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics){
      this.newIncludedInStatistics = newIncludedInStatistics;
   }
   
   public void setOldState(final com.commercetools.api.generated.models.state.StateReference oldState){
      this.oldState = oldState;
   }
   
   public void setForce(final Boolean force){
      this.force = force;
   }
   
   public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics){
      this.oldIncludedInStatistics = oldIncludedInStatistics;
   }
   
   public void setNewState(final com.commercetools.api.generated.models.state.StateReference newState){
      this.newState = newState;
   }
   
   public void setTarget(final com.commercetools.api.generated.models.common.Reference target){
      this.target = target;
   }

}