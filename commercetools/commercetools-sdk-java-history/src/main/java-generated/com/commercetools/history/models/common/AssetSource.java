package com.commercetools.history.models.common;

import com.commercetools.history.models.common.AssetDimensions;
import com.commercetools.history.models.common.AssetSourceImpl;

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
 * AssetSource
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetSource assetSource = AssetSource.builder()
 *             .uri("{uri}")
 *             .key("{key}")
 *             .dimensions(dimensionsBuilder -> dimensionsBuilder)
 *             .contentType("{contentType}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AssetSourceImpl.class)
public interface AssetSource  {


    /**
     *
     * @return uri
     */
    @NotNull
    @JsonProperty("uri")
    public String getUri();
    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();
    /**
     *
     * @return dimensions
     */
    @NotNull
    @Valid
    @JsonProperty("dimensions")
    public AssetDimensions getDimensions();
    /**
     *
     * @return contentType
     */
    @NotNull
    @JsonProperty("contentType")
    public String getContentType();

    /**
     * set uri
     * @param uri value to be set
     */
    
    public void setUri(final String uri);
    
    
    /**
     * set key
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     * set dimensions
     * @param dimensions value to be set
     */
    
    public void setDimensions(final AssetDimensions dimensions);
    
    
    /**
     * set contentType
     * @param contentType value to be set
     */
    
    public void setContentType(final String contentType);
    

    /**
     * factory method
     * @return instance of AssetSource
     */
    public static AssetSource of(){
        return new AssetSourceImpl();
    }
    

    /**
     * factory method to create a shallow copy AssetSource
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssetSource of(final AssetSource template) {
        AssetSourceImpl instance = new AssetSourceImpl();
        instance.setUri(template.getUri());
        instance.setKey(template.getKey());
        instance.setDimensions(template.getDimensions());
        instance.setContentType(template.getContentType());
        return instance;
    }

    /**
     * factory method to create a deep copy of AssetSource
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssetSource deepCopy(@Nullable final AssetSource template) {
        if (template == null) {
            return null;
        }
        AssetSourceImpl instance = new AssetSourceImpl();
        instance.setUri(template.getUri());
        instance.setKey(template.getKey());
        instance.setDimensions(com.commercetools.history.models.common.AssetDimensions.deepCopy(template.getDimensions()));
        instance.setContentType(template.getContentType());
        return instance;
    }

    /**
     * builder factory method for AssetSource
     * @return builder
     */
    public static AssetSourceBuilder builder() {
        return AssetSourceBuilder.of();
    }
    
    /**
     * create builder for AssetSource instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssetSourceBuilder builder(final AssetSource template) {
        return AssetSourceBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssetSource(Function<AssetSource, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssetSource> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssetSource>() {
            @Override
            public String toString() {
                return "TypeReference<AssetSource>";
            }
        };
    }
}
