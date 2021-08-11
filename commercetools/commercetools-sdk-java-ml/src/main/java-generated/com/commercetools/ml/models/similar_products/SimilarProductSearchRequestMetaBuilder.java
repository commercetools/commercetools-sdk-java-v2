
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SimilarProductSearchRequestMetaBuilder implements Builder<SimilarProductSearchRequestMeta> {

    private com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures;

    public SimilarProductSearchRequestMetaBuilder similarityMeasures(
            Function<com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder, com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder> builder) {
        this.similarityMeasures = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder.of())
                .build();
        return this;
    }

    public SimilarProductSearchRequestMetaBuilder similarityMeasures(
            final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
        return this;
    }

    public com.commercetools.ml.models.similar_products.SimilarityMeasures getSimilarityMeasures() {
        return this.similarityMeasures;
    }

    public SimilarProductSearchRequestMeta build() {
        Objects.requireNonNull(similarityMeasures,
            SimilarProductSearchRequestMeta.class + ": similarityMeasures is missing");
        return new SimilarProductSearchRequestMetaImpl(similarityMeasures);
    }

    /**
     * builds SimilarProductSearchRequestMeta without checking for non null required values
     */
    public SimilarProductSearchRequestMeta buildUnchecked() {
        return new SimilarProductSearchRequestMetaImpl(similarityMeasures);
    }

    public static SimilarProductSearchRequestMetaBuilder of() {
        return new SimilarProductSearchRequestMetaBuilder();
    }

    public static SimilarProductSearchRequestMetaBuilder of(final SimilarProductSearchRequestMeta template) {
        SimilarProductSearchRequestMetaBuilder builder = new SimilarProductSearchRequestMetaBuilder();
        builder.similarityMeasures = template.getSimilarityMeasures();
        return builder;
    }

}
