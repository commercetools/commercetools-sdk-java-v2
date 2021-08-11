
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingPricesMetaBuilder implements Builder<MissingPricesMeta> {

    private com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel;

    private com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel;

    public MissingPricesMetaBuilder productLevel(
            Function<com.commercetools.ml.models.missing_data.MissingPricesProductLevelBuilder, com.commercetools.ml.models.missing_data.MissingPricesProductLevelBuilder> builder) {
        this.productLevel = builder
                .apply(com.commercetools.ml.models.missing_data.MissingPricesProductLevelBuilder.of())
                .build();
        return this;
    }

    public MissingPricesMetaBuilder productLevel(
            final com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel) {
        this.productLevel = productLevel;
        return this;
    }

    public MissingPricesMetaBuilder variantLevel(
            Function<com.commercetools.ml.models.missing_data.MissingPricesVariantLevelBuilder, com.commercetools.ml.models.missing_data.MissingPricesVariantLevelBuilder> builder) {
        this.variantLevel = builder
                .apply(com.commercetools.ml.models.missing_data.MissingPricesVariantLevelBuilder.of())
                .build();
        return this;
    }

    public MissingPricesMetaBuilder variantLevel(
            final com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel) {
        this.variantLevel = variantLevel;
        return this;
    }

    public com.commercetools.ml.models.missing_data.MissingPricesProductLevel getProductLevel() {
        return this.productLevel;
    }

    public com.commercetools.ml.models.missing_data.MissingPricesVariantLevel getVariantLevel() {
        return this.variantLevel;
    }

    public MissingPricesMeta build() {
        Objects.requireNonNull(productLevel, MissingPricesMeta.class + ": productLevel is missing");
        Objects.requireNonNull(variantLevel, MissingPricesMeta.class + ": variantLevel is missing");
        return new MissingPricesMetaImpl(productLevel, variantLevel);
    }

    /**
     * builds MissingPricesMeta without checking for non null required values
     */
    public MissingPricesMeta buildUnchecked() {
        return new MissingPricesMetaImpl(productLevel, variantLevel);
    }

    public static MissingPricesMetaBuilder of() {
        return new MissingPricesMetaBuilder();
    }

    public static MissingPricesMetaBuilder of(final MissingPricesMeta template) {
        MissingPricesMetaBuilder builder = new MissingPricesMetaBuilder();
        builder.productLevel = template.getProductLevel();
        builder.variantLevel = template.getVariantLevel();
        return builder;
    }

}
