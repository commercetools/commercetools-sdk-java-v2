
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Dimensions of the Asset source specified by the number of pixels.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetDimensions assetDimensions = AssetDimensions.builder()
 *             .w(0.3)
 *             .h(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssetDimensionsImpl.class)
public interface AssetDimensions {

    /**
     *  <p>Width of the Asset source.</p>
     * @return w
     */
    @NotNull
    @JsonProperty("w")
    public Integer getW();

    /**
     *  <p>Height of the Asset source.</p>
     * @return h
     */
    @NotNull
    @JsonProperty("h")
    public Integer getH();

    /**
     *  <p>Width of the Asset source.</p>
     * @param w value to be set
     */

    public void setW(final Integer w);

    /**
     *  <p>Height of the Asset source.</p>
     * @param h value to be set
     */

    public void setH(final Integer h);

    /**
     * factory method
     * @return instance of AssetDimensions
     */
    public static AssetDimensions of() {
        return new AssetDimensionsImpl();
    }

    /**
     * factory method to copy an instance of AssetDimensions
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssetDimensions of(final AssetDimensions template) {
        AssetDimensionsImpl instance = new AssetDimensionsImpl();
        instance.setW(template.getW());
        instance.setH(template.getH());
        return instance;
    }

    /**
     * builder factory method for AssetDimensions
     * @return builder
     */
    public static AssetDimensionsBuilder builder() {
        return AssetDimensionsBuilder.of();
    }

    /**
     * create builder for AssetDimensions instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssetDimensionsBuilder builder(final AssetDimensions template) {
        return AssetDimensionsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssetDimensions(Function<AssetDimensions, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssetDimensions> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssetDimensions>() {
            @Override
            public String toString() {
                return "TypeReference<AssetDimensions>";
            }
        };
    }
}
