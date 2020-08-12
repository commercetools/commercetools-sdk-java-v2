package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
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
   
   private com.commercetools.api.models.state.StateReference oldState;
   
   private com.commercetools.api.models.state.StateReference newState;
   
   private Boolean oldIncludedInStatistics;
   
   private Boolean newIncludedInStatistics;
   
   private com.commercetools.api.models.common.Reference target;
   
   private Boolean force;

   @JsonCreator
   ReviewStateTransitionMessagePayloadImpl(@JsonProperty("oldState") final com.commercetools.api.models.state.StateReference oldState, @JsonProperty("newState") final com.commercetools.api.models.state.StateReference newState, @JsonProperty("oldIncludedInStatistics") final Boolean oldIncludedInStatistics, @JsonProperty("newIncludedInStatistics") final Boolean newIncludedInStatistics, @JsonProperty("target") final com.commercetools.api.models.common.Reference target, @JsonProperty("force") final Boolean force) {
      this.oldState = oldState;
      this.newState = newState;
      this.oldIncludedInStatistics = oldIncludedInStatistics;
      this.newIncludedInStatistics = newIncludedInStatistics;
      this.target = target;
      this.force = force;
      this.type = "ReviewStateTransition";
   }
   public ReviewStateTransitionMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.models.state.StateReference getOldState(){
      return this.oldState;
   }
   
   
   public com.commercetools.api.models.state.StateReference getNewState(){
      return this.newState;
   }
   
   
   public Boolean getOldIncludedInStatistics(){
      return this.oldIncludedInStatistics;
   }
   
   
   public Boolean getNewIncludedInStatistics(){
      return this.newIncludedInStatistics;
   }
   
   
   public com.commercetools.api.models.common.Reference getTarget(){
      return this.target;
   }
   
   
   public Boolean getForce(){
      return this.force;
   }

   public void setOldState(final com.commercetools.api.models.state.StateReference oldState){
      this.oldState = oldState;
   }
   
   public void setNewState(final com.commercetools.api.models.state.StateReference newState){
      this.newState = newState;
   }
   
   public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics){
      this.oldIncludedInStatistics = oldIncludedInStatistics;
   }
   
   public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics){
      this.newIncludedInStatistics = newIncludedInStatistics;
   }
   
   public void setTarget(final com.commercetools.api.models.common.Reference target){
      this.target = target;
   }
   
   public void setForce(final Boolean force){
      this.force = force;
   }

}
