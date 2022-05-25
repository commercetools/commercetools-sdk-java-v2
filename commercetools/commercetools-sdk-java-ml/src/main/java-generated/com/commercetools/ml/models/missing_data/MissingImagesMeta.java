
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingImagesMeta
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingImagesMeta missingImagesMeta = MissingImagesMeta.builder()
 *             .productLevel(productLevelBuilder -> productLevelBuilder)
 *             .variantLevel(variantLevelBuilder -> variantLevelBuilder)
 *             .threshold(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingImagesMetaImpl.class)
public interface MissingImagesMeta {

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("productLevel")
    public MissingImagesProductLevel getProductLevel();

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("variantLevel")
    public MissingImagesVariantLevel getVariantLevel();

    /**
     *  <p>The minimum number of images a product variant must have. Anything below this value is considered a product variant with missing images.</p>
     */
    @NotNull
    @JsonProperty("threshold")
    public Long getThreshold();

    public void setProductLevel(final MissingImagesProductLevel productLevel);

    public void setVariantLevel(final MissingImagesVariantLevel variantLevel);

    public void setThreshold(final Long threshold);

    public static MissingImagesMeta of() {
        return new MissingImagesMetaImpl();
    }

    public static MissingImagesMeta of(final MissingImagesMeta template) {
        MissingImagesMetaImpl instance = new MissingImagesMetaImpl();
        instance.setProductLevel(template.getProductLevel());
        instance.setVariantLevel(template.getVariantLevel());
        instance.setThreshold(template.getThreshold());
        return instance;
    }

    public static MissingImagesMetaBuilder builder() {
        return MissingImagesMetaBuilder.of();
    }

    public static MissingImagesMetaBuilder builder(final MissingImagesMeta template) {
        return MissingImagesMetaBuilder.of(template);
    }

    default <T> T withMissingImagesMeta(Function<MissingImagesMeta, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingImagesMeta> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingImagesMeta>() {
            @Override
            public String toString() {
                return "TypeReference<MissingImagesMeta>";
            }
        };
    }
}
