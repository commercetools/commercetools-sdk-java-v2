package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus;
import java.time.ZonedDateTime;
import com.commercetools.ml.models.image_search_config.ImageSearchConfigResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ImageSearchConfigResponseImpl.class)
public interface ImageSearchConfigResponse  {

    /**
    *  <p>The image search activation status.</p>
    */
    @NotNull
    @JsonProperty("status")
    public ImageSearchConfigStatus getStatus();
    
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    public void setStatus(final ImageSearchConfigStatus status);
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public static ImageSearchConfigResponseImpl of(){
        return new ImageSearchConfigResponseImpl();
    }
    

    public static ImageSearchConfigResponseImpl of(final ImageSearchConfigResponse template) {
        ImageSearchConfigResponseImpl instance = new ImageSearchConfigResponseImpl();
        instance.setStatus(template.getStatus());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

}
