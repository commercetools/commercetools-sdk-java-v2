package com.commercetools.models.Message;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Message.MessagePayload;
import java.lang.Boolean;
import java.lang.Integer;
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
public final class ReviewRatingSetMessagePayloadImpl implements ReviewRatingSetMessagePayload {

   private java.lang.String type;
   
   private java.lang.Integer oldRating;
   
   private java.lang.Boolean includedInStatistics;
   
   private java.lang.Integer newRating;
   
   private com.commercetools.models.Common.Reference target;

   @JsonCreator
   ReviewRatingSetMessagePayloadImpl(@JsonProperty("oldRating") final java.lang.Integer oldRating, @JsonProperty("includedInStatistics") final java.lang.Boolean includedInStatistics, @JsonProperty("newRating") final java.lang.Integer newRating, @JsonProperty("target") final com.commercetools.models.Common.Reference target) {
      this.oldRating = oldRating;
      this.includedInStatistics = includedInStatistics;
      this.newRating = newRating;
      this.target = target;
      this.type = "ReviewRatingSet";
   }
   public ReviewRatingSetMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public java.lang.Integer getOldRating(){
      return this.oldRating;
   }
   
   
   public java.lang.Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   
   public java.lang.Integer getNewRating(){
      return this.newRating;
   }
   
   
   public com.commercetools.models.Common.Reference getTarget(){
      return this.target;
   }

   public void setOldRating(final java.lang.Integer oldRating){
      this.oldRating = oldRating;
   }
   
   public void setIncludedInStatistics(final java.lang.Boolean includedInStatistics){
      this.includedInStatistics = includedInStatistics;
   }
   
   public void setNewRating(final java.lang.Integer newRating){
      this.newRating = newRating;
   }
   
   public void setTarget(final com.commercetools.models.Common.Reference target){
      this.target = target;
   }

}