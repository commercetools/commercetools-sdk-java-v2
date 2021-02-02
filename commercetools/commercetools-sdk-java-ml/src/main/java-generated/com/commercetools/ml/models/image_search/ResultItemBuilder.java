
package com.commercetools.ml.models.image_search;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResultItemBuilder {

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

    public String getImageUrl() {
        return this.imageUrl;
    }

    public java.util.List<com.commercetools.ml.models.common.ProductVariant> getProductVariants() {
        return this.productVariants;
    }

    public ResultItem build() {
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
