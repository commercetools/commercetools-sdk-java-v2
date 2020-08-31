package com.commercetools.api.models.common;

import com.commercetools.api.models.common.AssetDimensions;
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
public final class AssetSourceImpl implements AssetSource {

    private String uri;
    
    private String key;
    
    private com.commercetools.api.models.common.AssetDimensions dimensions;
    
    private String contentType;

    @JsonCreator
    AssetSourceImpl(@JsonProperty("uri") final String uri, @JsonProperty("key") final String key, @JsonProperty("dimensions") final com.commercetools.api.models.common.AssetDimensions dimensions, @JsonProperty("contentType") final String contentType) {
        this.uri = uri;
        this.key = key;
        this.dimensions = dimensions;
        this.contentType = contentType;
    }
    public AssetSourceImpl() {
       
    }

    
    public String getUri(){
        return this.uri;
    }
    
    
    public String getKey(){
        return this.key;
    }
    
    
    public com.commercetools.api.models.common.AssetDimensions getDimensions(){
        return this.dimensions;
    }
    
    
    public String getContentType(){
        return this.contentType;
    }

    public void setUri(final String uri){
        this.uri = uri;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setDimensions(final com.commercetools.api.models.common.AssetDimensions dimensions){
        this.dimensions = dimensions;
    }
    
    public void setContentType(final String contentType){
        this.contentType = contentType;
    }

}
