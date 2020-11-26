package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionAction;
import com.commercetools.api.models.extension.ExtensionResourceTypeId;
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
public final class ExtensionTriggerImpl implements ExtensionTrigger {

    private com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId;
    
    private java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions;

    @JsonCreator
    ExtensionTriggerImpl(@JsonProperty("resourceTypeId") final com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId, @JsonProperty("actions") final java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions) {
        this.resourceTypeId = resourceTypeId;
        this.actions = actions;
    }
    public ExtensionTriggerImpl() {
    }

    
    public com.commercetools.api.models.extension.ExtensionResourceTypeId getResourceTypeId(){
        return this.resourceTypeId;
    }
    
    
    public java.util.List<com.commercetools.api.models.extension.ExtensionAction> getActions(){
        return this.actions;
    }

    public void setResourceTypeId(final com.commercetools.api.models.extension.ExtensionResourceTypeId resourceTypeId){
        this.resourceTypeId = resourceTypeId;
    }
    
    public void setActions(final com.commercetools.api.models.extension.ExtensionAction ...actions){
       this.actions = new ArrayList<>(Arrays.asList(actions));
    }
    
    public void setActions(final java.util.List<com.commercetools.api.models.extension.ExtensionAction> actions){
       this.actions = actions;
    }

}
