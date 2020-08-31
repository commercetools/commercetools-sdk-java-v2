package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionDestination;
import com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication;
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
public final class ExtensionHttpDestinationImpl implements ExtensionHttpDestination {

    private String type;
    
    private String url;
    
    private com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication authentication;

    @JsonCreator
    ExtensionHttpDestinationImpl(@JsonProperty("url") final String url, @JsonProperty("authentication") final com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication authentication) {
        this.url = url;
        this.authentication = authentication;
        this.type = "HTTP";
    }
    public ExtensionHttpDestinationImpl() {
       
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getUrl(){
        return this.url;
    }
    
    
    public com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication getAuthentication(){
        return this.authentication;
    }

    public void setUrl(final String url){
        this.url = url;
    }
    
    public void setAuthentication(final com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication authentication){
        this.authentication = authentication;
    }

}
