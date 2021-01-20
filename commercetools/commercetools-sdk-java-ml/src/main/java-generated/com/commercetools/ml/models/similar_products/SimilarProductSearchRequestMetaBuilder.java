
package com.commercetools.ml.models.similar_products;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta;
import com.commercetools.ml.models.similar_products.SimilarityMeasures;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SimilarProductSearchRequestMetaBuilder {

    private com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures;

    public SimilarProductSearchRequestMetaBuilder similarityMeasures(
            final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
        return this;
    }

    public com.commercetools.ml.models.similar_products.SimilarityMeasures getSimilarityMeasures() {
        return this.similarityMeasures;
    }

    public SimilarProductSearchRequestMeta build() {
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
