package com.commercetools.api.models.common;


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
public final class UpdateActionImpl implements UpdateAction {

    private String action;

    @JsonCreator
    UpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    public UpdateActionImpl() {
    }

    
    public String getAction(){
        return this.action;
    }

    public void setAction(final String action){
        this.action = action;
    }

}
