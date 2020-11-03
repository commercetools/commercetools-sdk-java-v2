package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionDestination;
import com.commercetools.api.models.extension.ExtensionUpdateAction;
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
public final class ExtensionChangeDestinationActionImpl implements ExtensionChangeDestinationAction {

    private String action;
    
    private com.commercetools.api.models.extension.ExtensionDestination destination;

    @JsonCreator
    ExtensionChangeDestinationActionImpl(@JsonProperty("destination") final com.commercetools.api.models.extension.ExtensionDestination destination) {
        this.destination = destination;
        this.action = "changeDestination";
    }
    public ExtensionChangeDestinationActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.extension.ExtensionDestination getDestination(){
        return this.destination;
    }

    public void setDestination(final com.commercetools.api.models.extension.ExtensionDestination destination){
        this.destination = destination;
    }

}
