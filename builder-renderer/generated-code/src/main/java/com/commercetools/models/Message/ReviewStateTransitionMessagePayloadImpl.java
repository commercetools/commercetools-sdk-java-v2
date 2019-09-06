package com.commercetools.models.Message;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.State.StateReference;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewStateTransitionMessagePayloadImpl implements ReviewStateTransitionMessagePayload {

   private java.lang.String type;
   
   private java.lang.Boolean newIncludedInStatistics;
   
   private com.commercetools.models.State.StateReference oldState;
   
   private java.lang.Boolean force;
   
   private java.lang.Boolean oldIncludedInStatistics;
   
   private com.commercetools.models.State.StateReference newState;
   
   private com.commercetools.models.Common.Reference target;

   @JsonCreator
   ReviewStateTransitionMessagePayloadImpl(@JsonProperty("newIncludedInStatistics") final java.lang.Boolean newIncludedInStatistics, @JsonProperty("oldState") final com.commercetools.models.State.StateReference oldState, @JsonProperty("force") final java.lang.Boolean force, @JsonProperty("oldIncludedInStatistics") final java.lang.Boolean oldIncludedInStatistics, @JsonProperty("newState") final com.commercetools.models.State.StateReference newState, @JsonProperty("target") final com.commercetools.models.Common.Reference target) {
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
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.Boolean getNewIncludedInStatistics(){
      return this.newIncludedInStatistics;
   }
   
   
   public com.commercetools.models.State.StateReference getOldState(){
      return this.oldState;
   }
   
   
   public java.lang.Boolean getForce(){
      return this.force;
   }
   
   
   public java.lang.Boolean getOldIncludedInStatistics(){
      return this.oldIncludedInStatistics;
   }
   
   
   public com.commercetools.models.State.StateReference getNewState(){
      return this.newState;
   }
   
   
   public com.commercetools.models.Common.Reference getTarget(){
      return this.target;
   }

   public void setNewIncludedInStatistics(final java.lang.Boolean newIncludedInStatistics){
      this.newIncludedInStatistics = newIncludedInStatistics;
   }
   
   public void setOldState(final com.commercetools.models.State.StateReference oldState){
      this.oldState = oldState;
   }
   
   public void setForce(final java.lang.Boolean force){
      this.force = force;
   }
   
   public void setOldIncludedInStatistics(final java.lang.Boolean oldIncludedInStatistics){
      this.oldIncludedInStatistics = oldIncludedInStatistics;
   }
   
   public void setNewState(final com.commercetools.models.State.StateReference newState){
      this.newState = newState;
   }
   
   public void setTarget(final com.commercetools.models.Common.Reference target){
      this.target = target;
   }

}