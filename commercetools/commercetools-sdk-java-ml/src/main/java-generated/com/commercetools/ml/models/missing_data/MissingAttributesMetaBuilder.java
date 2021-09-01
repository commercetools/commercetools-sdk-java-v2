
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingAttributesMetaBuilder implements Builder<MissingAttributesMeta> {

    private com.commercetools.ml.models.missing_data.MissingAttributesDetails productLevel;

    private com.commercetools.ml.models.missing_data.MissingAttributesDetails variantLevel;

    @Nullable
    private java.util.List<String> productTypeIds;

    public MissingAttributesMetaBuilder productLevel(
            Function<com.commercetools.ml.models.missing_data.MissingAttributesDetailsBuilder, com.commercetools.ml.models.missing_data.MissingAttributesDetailsBuilder> builder) {
        this.productLevel = builder.apply(com.commercetools.ml.models.missing_data.MissingAttributesDetailsBuilder.of())
                .build();
        return this;
    }

    public MissingAttributesMetaBuilder productLevel(
            final com.commercetools.ml.models.missing_data.MissingAttributesDetails productLevel) {
        this.productLevel = productLevel;
        return this;
    }

    public MissingAttributesMetaBuilder variantLevel(
            Function<com.commercetools.ml.models.missing_data.MissingAttributesDetailsBuilder, com.commercetools.ml.models.missing_data.MissingAttributesDetailsBuilder> builder) {
        this.variantLevel = builder.apply(com.commercetools.ml.models.missing_data.MissingAttributesDetailsBuilder.of())
                .build();
        return this;
    }

    public MissingAttributesMetaBuilder variantLevel(
            final com.commercetools.ml.models.missing_data.MissingAttributesDetails variantLevel) {
        this.variantLevel = variantLevel;
        return this;
    }

    public MissingAttributesMetaBuilder productTypeIds(@Nullable final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
        return this;
    }

    public MissingAttributesMetaBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
        return this;
    }

    public com.commercetools.ml.models.missing_data.MissingAttributesDetails getProductLevel() {
        return this.productLevel;
    }

    public com.commercetools.ml.models.missing_data.MissingAttributesDetails getVariantLevel() {
        return this.variantLevel;
    }

    @Nullable
    public java.util.List<String> getProductTypeIds() {
        return this.productTypeIds;
    }

    public MissingAttributesMeta build() {
        Objects.requireNonNull(productLevel, MissingAttributesMeta.class + ": productLevel is missing");
        Objects.requireNonNull(variantLevel, MissingAttributesMeta.class + ": variantLevel is missing");
        return new MissingAttributesMetaImpl(productLevel, variantLevel, productTypeIds);
    }

    /**
     * builds MissingAttributesMeta without checking for non null required values
     */
    public MissingAttributesMeta buildUnchecked() {
        return new MissingAttributesMetaImpl(productLevel, variantLevel, productTypeIds);
    }

    public static MissingAttributesMetaBuilder of() {
        return new MissingAttributesMetaBuilder();
    }

    public static MissingAttributesMetaBuilder of(final MissingAttributesMeta template) {
        MissingAttributesMetaBuilder builder = new MissingAttributesMetaBuilder();
        builder.productLevel = template.getProductLevel();
        builder.variantLevel = template.getVariantLevel();
        builder.productTypeIds = template.getProductTypeIds();
        return builder;
    }

}
