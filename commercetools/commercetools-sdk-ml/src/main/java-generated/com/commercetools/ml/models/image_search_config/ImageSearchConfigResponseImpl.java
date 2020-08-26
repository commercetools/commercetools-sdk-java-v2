package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus;
import java.time.ZonedDateTime;
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
public final class ImageSearchConfigResponseImpl implements ImageSearchConfigResponse {

    private com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status;
    
    private java.time.ZonedDateTime lastModifiedAt;

    @JsonCreator
    ImageSearchConfigResponseImpl(@JsonProperty("status") final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt) {
        this.status = status;
        this.lastModifiedAt = lastModifiedAt;
    }
    public ImageSearchConfigResponseImpl() {
       
    }

    /**
    *  <p>The image search activation status.</p>
    */
    public com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus getStatus(){
        return this.status;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }

    public void setStatus(final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status){
        this.status = status;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }

}
