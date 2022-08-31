
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageDimensions
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageDimensions imageDimensions = ImageDimensions.builder()
 *             .w(0.3)
 *             .h(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImageDimensionsImpl.class)
public interface ImageDimensions {

    /**
     *  <p>Width of the image.</p>
     */
    @NotNull
    @JsonProperty("w")
    public Integer getW();

    /**
     *  <p>Height of the image.</p>
     */
    @NotNull
    @JsonProperty("h")
    public Integer getH();

    public void setW(final Integer w);

    public void setH(final Integer h);

    public static ImageDimensions of() {
        return new ImageDimensionsImpl();
    }

    public static ImageDimensions of(final ImageDimensions template) {
        ImageDimensionsImpl instance = new ImageDimensionsImpl();
        instance.setW(template.getW());
        instance.setH(template.getH());
        return instance;
    }

    public static ImageDimensionsBuilder builder() {
        return ImageDimensionsBuilder.of();
    }

    public static ImageDimensionsBuilder builder(final ImageDimensions template) {
        return ImageDimensionsBuilder.of(template);
    }

    default <T> T withImageDimensions(Function<ImageDimensions, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImageDimensions> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImageDimensions>() {
            @Override
            public String toString() {
                return "TypeReference<ImageDimensions>";
            }
        };
    }
}
