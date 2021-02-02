
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingImagesMetaBuilder {

    private com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel;

    private com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel;

    private Long threshold;

    public MissingImagesMetaBuilder productLevel(
            final com.commercetools.ml.models.missing_data.MissingImagesProductLevel productLevel) {
        this.productLevel = productLevel;
        return this;
    }

    public MissingImagesMetaBuilder variantLevel(
            final com.commercetools.ml.models.missing_data.MissingImagesVariantLevel variantLevel) {
        this.variantLevel = variantLevel;
        return this;
    }

    public MissingImagesMetaBuilder threshold(final Long threshold) {
        this.threshold = threshold;
        return this;
    }

    public com.commercetools.ml.models.missing_data.MissingImagesProductLevel getProductLevel() {
        return this.productLevel;
    }

    public com.commercetools.ml.models.missing_data.MissingImagesVariantLevel getVariantLevel() {
        return this.variantLevel;
    }

    public Long getThreshold() {
        return this.threshold;
    }

    public MissingImagesMeta build() {
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
