package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.message.MessagePayload;
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
public final class ReviewRatingSetMessagePayloadImpl implements ReviewRatingSetMessagePayload {

   private String type;
   
   private Integer oldRating;
   
   private Boolean includedInStatistics;
   
   private Integer newRating;
   
   private com.commercetools.api.generated.models.common.Reference target;

   @JsonCreator
   ReviewRatingSetMessagePayloadImpl(@JsonProperty("oldRating") final Integer oldRating, @JsonProperty("includedInStatistics") final Boolean includedInStatistics, @JsonProperty("newRating") final Integer newRating, @JsonProperty("target") final com.commercetools.api.generated.models.common.Reference target) {
      this.oldRating = oldRating;
      this.includedInStatistics = includedInStatistics;
      this.newRating = newRating;
      this.target = target;
      this.type = "ReviewRatingSet";
   }
   public ReviewRatingSetMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public Integer getOldRating(){
      return this.oldRating;
   }
   
   
   public Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   
   public Integer getNewRating(){
      return this.newRating;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getTarget(){
      return this.target;
   }

   public void setOldRating(final Integer oldRating){
      this.oldRating = oldRating;
   }
   
   public void setIncludedInStatistics(final Boolean includedInStatistics){
      this.includedInStatistics = includedInStatistics;
   }
   
   public void setNewRating(final Integer newRating){
      this.newRating = newRating;
   }
   
   public void setTarget(final com.commercetools.api.generated.models.common.Reference target){
      this.target = target;
   }

}