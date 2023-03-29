
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetDimensions
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetDimensions assetDimensions = AssetDimensions.builder()
 *             .w(1)
 *             .h(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssetDimensionsImpl.class)
public interface AssetDimensions {

    /**
     *
     * @return w
     */
    @NotNull
    @JsonProperty("w")
    public Integer getW();

    /**
     *
     * @return h
     */
    @NotNull
    @JsonProperty("h")
    public Integer getH();

    /**
     * set w
     * @param w value to be set
     */

    public void setW(final Integer w);

    /**
     * set h
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
     * factory method to create a shallow copy AssetDimensions
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
     * factory method to create a deep copy of AssetDimensions
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssetDimensions deepCopy(@Nullable final AssetDimensions template) {
        if (template == null) {
            return null;
        }
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
