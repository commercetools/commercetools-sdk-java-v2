package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateTypeEnum;
import com.commercetools.api.models.state.StateUpdateAction;
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
public final class StateChangeTypeActionImpl implements StateChangeTypeAction {

    private String action;
    
    private com.commercetools.api.models.state.StateTypeEnum type;

    @JsonCreator
    StateChangeTypeActionImpl(@JsonProperty("type") final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        this.action = "changeType";
    }
    public StateChangeTypeActionImpl() {
        this.action = "changeType";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.state.StateTypeEnum getType(){
        return this.type;
    }

    public void setType(final com.commercetools.api.models.state.StateTypeEnum type){
        this.type = type;
    }

}
