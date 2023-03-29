
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Image
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Image image = Image.builder()
 *             .url("{url}")
 *             .dimensions(dimensionsBuilder -> dimensionsBuilder)
 *             .label("{label}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImageImpl.class)
public interface Image {

    /**
     *
     * @return url
     */
    @NotNull
    @JsonProperty("url")
    public String getUrl();

    /**
     *
     * @return dimensions
     */
    @NotNull
    @Valid
    @JsonProperty("dimensions")
    public ImageDimensions getDimensions();

    /**
     *
     * @return label
     */
    @NotNull
    @JsonProperty("label")
    public String getLabel();

    /**
     * set url
     * @param url value to be set
     */

    public void setUrl(final String url);

    /**
     * set dimensions
     * @param dimensions value to be set
     */

    public void setDimensions(final ImageDimensions dimensions);

    /**
     * set label
     * @param label value to be set
     */

    public void setLabel(final String label);

    /**
     * factory method
     * @return instance of Image
     */
    public static Image of() {
        return new ImageImpl();
    }

    /**
     * factory method to create a shallow copy Image
     * @param template instance to be copied
     * @return copy instance
     */
    public static Image of(final Image template) {
        ImageImpl instance = new ImageImpl();
        instance.setUrl(template.getUrl());
        instance.setDimensions(template.getDimensions());
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * factory method to create a deep copy of Image
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Image deepCopy(@Nullable final Image template) {
        if (template == null) {
            return null;
        }
        ImageImpl instance = new ImageImpl();
        instance.setUrl(template.getUrl());
        instance.setDimensions(Optional.ofNullable(template.getDimensions())
                .map(com.commercetools.history.models.common.ImageDimensions::deepCopy)
                .orElse(null));
        instance.setLabel(template.getLabel());
        return instance;
    }

    /**
     * builder factory method for Image
     * @return builder
     */
    public static ImageBuilder builder() {
        return ImageBuilder.of();
    }

    /**
     * create builder for Image instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageBuilder builder(final Image template) {
        return ImageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImage(Function<Image, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Image> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Image>() {
            @Override
            public String toString() {
                return "TypeReference<Image>";
            }
        };
    }
}
