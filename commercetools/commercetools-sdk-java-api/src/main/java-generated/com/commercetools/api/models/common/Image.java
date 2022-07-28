
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImageImpl.class)
public interface Image {

    /**
     *  <p>URL of the image in its original size that must be unique within a single ProductVariant.</p>
     */
    @NotNull
    @JsonProperty("url")
    public String getUrl();

    /**
     *  <p>Dimensions of the original image.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("dimensions")
    public ImageDimensions getDimensions();

    /**
     *  <p>Custom label for the image.</p>
     */

    @JsonProperty("label")
    public String getLabel();

    public void setUrl(final String url);

    public void setDimensions(final ImageDimensions dimensions);

    public void setLabel(final String label);

    public static Image of() {
        return new ImageImpl();
    }

    public static Image of(final Image template) {
        ImageImpl instance = new ImageImpl();
        instance.setUrl(template.getUrl());
        instance.setDimensions(template.getDimensions());
        instance.setLabel(template.getLabel());
        return instance;
    }

    public static ImageBuilder builder() {
        return ImageBuilder.of();
    }

    public static ImageBuilder builder(final Image template) {
        return ImageBuilder.of(template);
    }

    default <T> T withImage(Function<Image, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Image> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Image>() {
            @Override
            public String toString() {
                return "TypeReference<Image>";
            }
        };
    }
}
