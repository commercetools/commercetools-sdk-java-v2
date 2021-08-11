
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantPatchBuilder implements Builder<ProductVariantPatch> {

    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;

    @Nullable
    private com.commercetools.importapi.models.productvariants.Attributes attributes;

    @Nullable
    private Boolean staged;

    public ProductVariantPatchBuilder productVariant(
            Function<com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder> builder) {
        this.productVariant = builder
                .apply(com.commercetools.importapi.models.common.ProductVariantKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public ProductVariantPatchBuilder productVariant(
            final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
        return this;
    }

    public ProductVariantPatchBuilder attributes(
            Function<com.commercetools.importapi.models.productvariants.AttributesBuilder, com.commercetools.importapi.models.productvariants.AttributesBuilder> builder) {
        this.attributes = builder.apply(com.commercetools.importapi.models.productvariants.AttributesBuilder.of())
                .build();
        return this;
    }

    public ProductVariantPatchBuilder attributes(
            @Nullable final com.commercetools.importapi.models.productvariants.Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProductVariantPatchBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    @Nullable
    public com.commercetools.importapi.models.productvariants.Attributes getAttributes() {
        return this.attributes;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductVariantPatch build() {
        Objects.requireNonNull(productVariant, ProductVariantPatch.class + ": productVariant is missing");
        return new ProductVariantPatchImpl(productVariant, attributes, staged);
    }

    /**
     * builds ProductVariantPatch without checking for non null required values
     */
    public ProductVariantPatch buildUnchecked() {
        return new ProductVariantPatchImpl(productVariant, attributes, staged);
    }

    public static ProductVariantPatchBuilder of() {
        return new ProductVariantPatchBuilder();
    }

    public static ProductVariantPatchBuilder of(final ProductVariantPatch template) {
        ProductVariantPatchBuilder builder = new ProductVariantPatchBuilder();
        builder.productVariant = template.getProductVariant();
        builder.attributes = template.getAttributes();
        builder.staged = template.getStaged();
        return builder;
    }

}
