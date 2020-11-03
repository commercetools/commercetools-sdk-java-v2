package com.commercetools.api.models.subscription;


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
public final class MessageSubscriptionImpl implements MessageSubscription {

    private String resourceTypeId;
    
    private java.util.List<String> types;

    @JsonCreator
    MessageSubscriptionImpl(@JsonProperty("resourceTypeId") final String resourceTypeId, @JsonProperty("types") final java.util.List<String> types) {
        this.resourceTypeId = resourceTypeId;
        this.types = types;
    }
    public MessageSubscriptionImpl() {
       
    }

    
    public String getResourceTypeId(){
        return this.resourceTypeId;
    }
    
    
    public java.util.List<String> getTypes(){
        return this.types;
    }

    public void setResourceTypeId(final String resourceTypeId){
        this.resourceTypeId = resourceTypeId;
    }
    
    public void setTypes(final String ...types){
       this.types = new ArrayList<>(Arrays.asList(types));
    }
    
    public void setTypes(final java.util.List<String> types){
       this.types = types;
    }

}
