
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingImagesMetaBuilder
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
@Deprecated
public class MissingImagesMetaBuilder implements Builder<MissingImagesMeta> {

    @Deprecated

    private com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel;

    @Deprecated

    private com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel;

    private Long threshold;

    /**
     *
     */
    @Deprecated
    public MissingImagesMetaBuilder productLevel(
            Function<com.commercetools.ml.models.missing_data.MissingImagesProductLevelBuilder, com.commercetools.ml.models.missing_data.MissingImagesProductLevelBuilder> builder) {
        this.productLevel = builder
                .apply(com.commercetools.ml.models.missing_data.MissingImagesProductLevelBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */
    @Deprecated
    public MissingImagesMetaBuilder productLevel(
            final com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel) {
        this.productLevel = productLevel;
        return this;
    }

    /**
     *
     */
    @Deprecated
    public MissingImagesMetaBuilder variantLevel(
            Function<com.commercetools.ml.models.missing_data.MissingImagesVariantLevelBuilder, com.commercetools.ml.models.missing_data.MissingImagesVariantLevelBuilder> builder) {
        this.variantLevel = builder
                .apply(com.commercetools.ml.models.missing_data.MissingImagesVariantLevelBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */
    @Deprecated
    public MissingImagesMetaBuilder variantLevel(
            final com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel) {
        this.variantLevel = variantLevel;
        return this;
    }

    /**
     *  <p>The minimum number of images a product variant must have. Anything below this value is considered a product variant with missing images.</p>
     */

    public MissingImagesMetaBuilder threshold(final Long threshold) {
        this.threshold = threshold;
        return this;
    }

    @Deprecated

    public com.commercetools.ml.models.missing_data.MissingImagesProductLevel getProductLevel() {
        return this.productLevel;
    }

    @Deprecated

    public com.commercetools.ml.models.missing_data.MissingImagesVariantLevel getVariantLevel() {
        return this.variantLevel;
    }

    public Long getThreshold() {
        return this.threshold;
    }

    public MissingImagesMeta build() {
        Objects.requireNonNull(productLevel, MissingImagesMeta.class + ": productLevel is missing");
        Objects.requireNonNull(variantLevel, MissingImagesMeta.class + ": variantLevel is missing");
        Objects.requireNonNull(threshold, MissingImagesMeta.class + ": threshold is missing");
        return new MissingImagesMetaImpl(productLevel, variantLevel, threshold);
    }

    /**
     * builds MissingImagesMeta without checking for non null required values
     */
    public MissingImagesMeta buildUnchecked() {
        return new MissingImagesMetaImpl(productLevel, variantLevel, threshold);
    }

    public static MissingImagesMetaBuilder of() {
        return new MissingImagesMetaBuilder();
    }

    public static MissingImagesMetaBuilder of(final MissingImagesMeta template) {
        MissingImagesMetaBuilder builder = new MissingImagesMetaBuilder();
        builder.productLevel = template.getProductLevel();
        builder.variantLevel = template.getVariantLevel();
        builder.threshold = template.getThreshold();
        return builder;
    }

}
