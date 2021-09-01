
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingPricesBuilder implements Builder<MissingPrices> {

    private com.commercetools.ml.models.common.ProductReference product;

    private Long variantId;

    public MissingPricesBuilder product(
            Function<com.commercetools.ml.models.common.ProductReferenceBuilder, com.commercetools.ml.models.common.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.ml.models.common.ProductReferenceBuilder.of()).build();
        return this;
    }

    public MissingPricesBuilder product(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
        return this;
    }

    public MissingPricesBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public MissingPrices build() {
        Objects.requireNonNull(product, MissingPrices.class + ": product is missing");
        Objects.requireNonNull(variantId, MissingPrices.class + ": variantId is missing");
        return new MissingPricesImpl(product, variantId);
    }

    /**
     * builds MissingPrices without checking for non null required values
     */
    public MissingPrices buildUnchecked() {
        return new MissingPricesImpl(product, variantId);
    }

    public static MissingPricesBuilder of() {
        return new MissingPricesBuilder();
    }

    public static MissingPricesBuilder of(final MissingPrices template) {
        MissingPricesBuilder builder = new MissingPricesBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
