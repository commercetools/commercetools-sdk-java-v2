package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
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
public final class PaymentStatusStateTransitionMessagePayloadImpl implements PaymentStatusStateTransitionMessagePayload {

    private String type;
    
    private com.commercetools.api.models.state.StateReference state;
    
    private Boolean force;

    @JsonCreator
    PaymentStatusStateTransitionMessagePayloadImpl(@JsonProperty("state") final com.commercetools.api.models.state.StateReference state, @JsonProperty("force") final Boolean force) {
        this.state = state;
        this.force = force;
        this.type = "PaymentStatusStateTransition";
    }
    public PaymentStatusStateTransitionMessagePayloadImpl() {
        this.type = "PaymentStatusStateTransition";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }
    
    
    public Boolean getForce(){
        return this.force;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state){
        this.state = state;
    }
    
    public void setForce(final Boolean force){
        this.force = force;
    }

}
