package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.state.StateResourceIdentifier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderTransitionStateActionImpl implements StagedOrderTransitionStateAction {

    private String action;
    
    private com.commercetools.api.models.state.StateResourceIdentifier state;
    
    private Boolean force;

    @JsonCreator
    StagedOrderTransitionStateActionImpl(@JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state, @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.action = "transitionState";
    }
    public StagedOrderTransitionStateActionImpl() {
        this.action = "transitionState";
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
