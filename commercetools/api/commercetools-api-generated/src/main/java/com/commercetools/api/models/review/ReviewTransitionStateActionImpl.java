package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
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
public final class ReviewTransitionStateActionImpl implements ReviewTransitionStateAction {

    private String action;
    
    private com.commercetools.api.models.state.StateResourceIdentifier state;
    
    private Boolean force;

    @JsonCreator
    ReviewTransitionStateActionImpl(@JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state, @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.action = "transitionState";
    }
    public ReviewTransitionStateActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.state.StateResourceIdentifier getState(){
        return this.state;
    }
    
    
    public Boolean getForce(){
        return this.force;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state){
        this.state = state;
    }
    
    public void setForce(final Boolean force){
        this.force = force;
    }

}
