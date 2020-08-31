package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.MessagePayload;
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
public final class ReviewRatingSetMessagePayloadImpl implements ReviewRatingSetMessagePayload {

    private String type;
    
    private Double oldRating;
    
    private Double newRating;
    
    private Boolean includedInStatistics;
    
    private com.commercetools.api.models.common.Reference target;

    @JsonCreator
    ReviewRatingSetMessagePayloadImpl(@JsonProperty("oldRating") final Double oldRating, @JsonProperty("newRating") final Double newRating, @JsonProperty("includedInStatistics") final Boolean includedInStatistics, @JsonProperty("target") final com.commercetools.api.models.common.Reference target) {
        this.oldRating = oldRating;
        this.newRating = newRating;
        this.includedInStatistics = includedInStatistics;
        this.target = target;
        this.type = "ReviewRatingSet";
    }
    public ReviewRatingSetMessagePayloadImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public Double getOldRating(){
        return this.oldRating;
    }
    
    
    public Double getNewRating(){
        return this.newRating;
    }
    
    
    public Boolean getIncludedInStatistics(){
        return this.includedInStatistics;
    }
    
    
    public com.commercetools.api.models.common.Reference getTarget(){
        return this.target;
    }

    public void setOldRating(final Double oldRating){
        this.oldRating = oldRating;
    }
    
    public void setNewRating(final Double newRating){
        this.newRating = newRating;
    }
    
    public void setIncludedInStatistics(final Boolean includedInStatistics){
        this.includedInStatistics = includedInStatistics;
    }
    
    public void setTarget(final com.commercetools.api.models.common.Reference target){
        this.target = target;
    }

}
