
package com.commercetools.ml.models.image_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ResultItemBuilder implements Builder<ResultItem> {

    private String imageUrl;

    private java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants;

    public ResultItemBuilder imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public ResultItemBuilder productVariants(
            final com.commercetools.ml.models.common.ProductVariant... productVariants) {
        this.productVariants = new ArrayList<>(Arrays.asList(productVariants));
        return this;
    }

    public ResultItemBuilder productVariants(
            final java.util.List<com.commercetools.ml.models.common.ProductVariant> productVariants) {
        this.productVariants = productVariants;
        return this;
    }

    public ResultItemBuilder plusProductVariants(
            final com.commercetools.ml.models.common.ProductVariant... productVariants) {
        if (this.productVariants == null) {
            this.productVariants = new ArrayList<>();
        }
        this.productVariants.addAll(Arrays.asList(productVariants));
        return this;
    }

    public ResultItemBuilder plusProductVariants(
            Function<com.commercetools.ml.models.common.ProductVariantBuilder, com.commercetools.ml.models.common.ProductVariantBuilder> builder) {
        if (this.productVariants == null) {
            this.productVariants = new ArrayList<>();
        }
        this.productVariants.add(builder.apply(com.commercetools.ml.models.common.ProductVariantBuilder.of()).build());
        return this;
    }

    public ResultItemBuilder withProductVariants(
            Function<com.commercetools.ml.models.common.ProductVariantBuilder, com.commercetools.ml.models.common.ProductVariantBuilder> builder) {
        this.productVariants = new ArrayList<>();
        this.productVariants.add(builder.apply(com.commercetools.ml.models.common.ProductVariantBuilder.of()).build());
        return this;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public java.util.List<com.commercetools.ml.models.common.ProductVariant> getProductVariants() {
        return this.productVariants;
    }

    public ResultItem build() {
        Objects.requireNonNull(imageUrl, ResultItem.class + ": imageUrl is missing");
        Objects.requireNonNull(productVariants, ResultItem.class + ": productVariants is missing");
        return new ResultItemImpl(imageUrl, productVariants);
    }

    /**
     * builds ResultItem without checking for non null required values
     */
    public ResultItem buildUnchecked() {
        return new ResultItemImpl(imageUrl, productVariants);
    }

    public static ResultItemBuilder of() {
        return new ResultItemBuilder();
    }

    public static ResultItemBuilder of(final ResultItem template) {
        ResultItemBuilder builder = new ResultItemBuilder();
        builder.imageUrl = template.getImageUrl();
        builder.productVariants = template.getProductVariants();
        return builder;
    }

}
