
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingImagesCount
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingImagesCount missingImagesCount = MissingImagesCount.builder()
 *             .missingImages(0.3)
 *             .total(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingImagesCountImpl.class)
public interface MissingImagesCount {

    /**
     *
     */
    @NotNull
    @JsonProperty("missingImages")
    public Long getMissingImages();

    /**
     *  <p>Number of products scanned.</p>
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    public void setMissingImages(final Long missingImages);

    public void setTotal(final Long total);

    public static MissingImagesCount of() {
        return new MissingImagesCountImpl();
    }

    public static MissingImagesCount of(final MissingImagesCount template) {
        MissingImagesCountImpl instance = new MissingImagesCountImpl();
        instance.setMissingImages(template.getMissingImages());
        instance.setTotal(template.getTotal());
        return instance;
    }

    public static MissingImagesCountBuilder builder() {
        return MissingImagesCountBuilder.of();
    }

    public static MissingImagesCountBuilder builder(final MissingImagesCount template) {
        return MissingImagesCountBuilder.of(template);
    }

    default <T> T withMissingImagesCount(Function<MissingImagesCount, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingImagesCount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingImagesCount>() {
            @Override
            public String toString() {
                return "TypeReference<MissingImagesCount>";
            }
        };
    }
}
