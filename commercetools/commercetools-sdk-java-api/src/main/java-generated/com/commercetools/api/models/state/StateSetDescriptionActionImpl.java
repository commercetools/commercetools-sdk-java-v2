package com.commercetools.api.models.state;

import com.commercetools.api.models.common.LocalizedString;
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
public final class StateSetDescriptionActionImpl implements StateSetDescriptionAction {

    private String action;
    
    private com.commercetools.api.models.common.LocalizedString description;

    @JsonCreator
    StateSetDescriptionActionImpl(@JsonProperty("description") final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        this.action = "setDescription";
    }
    public StateSetDescriptionActionImpl() {
        this.action = "setDescription";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }

    public void setDescription(final com.commercetools.api.models.common.LocalizedString description){
        this.description = description;
    }

}
