package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus;
import java.time.ZonedDateTime;
import com.commercetools.ml.models.image_search_config.ImageSearchConfigResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * ImageSearchConfigResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageSearchConfigResponse imageSearchConfigResponse = ImageSearchConfigResponse.builder()
 *             .status(ImageSearchConfigStatus.ON)
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ImageSearchConfigResponseImpl.class)
public interface ImageSearchConfigResponse  {


    /**
     *  <p>The image search activation status.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ImageSearchConfigStatus getStatus();
    /**
     *
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>The image search activation status.</p>
     * @param status value to be set
     */
    
    public void setStatus(final ImageSearchConfigStatus status);
    
    
    /**
     * set lastModifiedAt
     * @param lastModifiedAt value to be set
     */
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    

    /**
     * factory method
     * @return instance of ImageSearchConfigResponse
     */
    public static ImageSearchConfigResponse of(){
        return new ImageSearchConfigResponseImpl();
    }
    

    /**
     * factory method to create a shallow copy ImageSearchConfigResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImageSearchConfigResponse of(final ImageSearchConfigResponse template) {
        ImageSearchConfigResponseImpl instance = new ImageSearchConfigResponseImpl();
        instance.setStatus(template.getStatus());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    /**
     * factory method to create a deep copy of ImageSearchConfigResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImageSearchConfigResponse deepCopy(@Nullable final ImageSearchConfigResponse template) {
        if (template == null) {
            return null;
        }
        ImageSearchConfigResponseImpl instance = new ImageSearchConfigResponseImpl();
        instance.setStatus(template.getStatus());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        return instance;
    }

    /**
     * builder factory method for ImageSearchConfigResponse
     * @return builder
     */
    public static ImageSearchConfigResponseBuilder builder() {
        return ImageSearchConfigResponseBuilder.of();
    }
    
    /**
     * create builder for ImageSearchConfigResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageSearchConfigResponseBuilder builder(final ImageSearchConfigResponse template) {
        return ImageSearchConfigResponseBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImageSearchConfigResponse(Function<ImageSearchConfigResponse, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImageSearchConfigResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImageSearchConfigResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ImageSearchConfigResponse>";
            }
        };
    }
}
