
package com.commercetools.ml.models.similar_products;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SimilarProductPairBuilder {

    private Double confidence;

    private java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> products;

    public SimilarProductPairBuilder confidence(final Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public SimilarProductPairBuilder products(
            final com.commercetools.ml.models.similar_products.SimilarProduct... products) {
        this.products = new ArrayList<>(Arrays.asList(products));
        return this;
    }

    public SimilarProductPairBuilder products(
            final java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> products) {
        this.products = products;
        return this;
    }

    public Double getConfidence() {
        return this.confidence;
    }

    public java.util.List<com.commercetools.ml.models.similar_products.SimilarProduct> getProducts() {
        return this.products;
    }

    public SimilarProductPair build() {
        return new SimilarProductPairImpl(confidence, products);
    }

    public static SimilarProductPairBuilder of() {
        return new SimilarProductPairBuilder();
    }

    public static SimilarProductPairBuilder of(final SimilarProductPair template) {
        SimilarProductPairBuilder builder = new SimilarProductPairBuilder();
        builder.confidence = template.getConfidence();
        builder.products = template.getProducts();
        return builder;
    }

}
