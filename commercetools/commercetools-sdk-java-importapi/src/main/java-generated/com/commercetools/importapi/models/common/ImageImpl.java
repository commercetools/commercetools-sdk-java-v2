package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.AssetDimensions;
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
public final class ImageImpl implements Image {

    private String url;
    
    private com.commercetools.importapi.models.common.AssetDimensions dimensions;
    
    private String label;

    @JsonCreator
    ImageImpl(@JsonProperty("url") final String url, @JsonProperty("dimensions") final com.commercetools.importapi.models.common.AssetDimensions dimensions, @JsonProperty("label") final String label) {
        this.url = url;
        this.dimensions = dimensions;
        this.label = label;
    }
    public ImageImpl() {
    }

    
    public String getUrl(){
        return this.url;
    }
    
    
    public com.commercetools.importapi.models.common.AssetDimensions getDimensions(){
        return this.dimensions;
    }
    
    
    public String getLabel(){
        return this.label;
    }

    public void setUrl(final String url){
        this.url = url;
    }
    
    public void setDimensions(final com.commercetools.importapi.models.common.AssetDimensions dimensions){
        this.dimensions = dimensions;
    }
    
    public void setLabel(final String label){
        this.label = label;
    }

}
