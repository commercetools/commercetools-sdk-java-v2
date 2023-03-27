
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductSearchRequestMetaBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductSearchRequestMeta similarProductSearchRequestMeta = SimilarProductSearchRequestMeta.builder()
 *             .similarityMeasures(similarityMeasuresBuilder -> similarityMeasuresBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SimilarProductSearchRequestMetaBuilder implements Builder<SimilarProductSearchRequestMeta> {

    private com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures;

    /**
     *  <p>The SimilarityMeasures used in this search.</p>
     * @param builder function to build the similarityMeasures value
     * @return Builder
     */

    public SimilarProductSearchRequestMetaBuilder similarityMeasures(
            Function<com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder, com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder> builder) {
        this.similarityMeasures = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The SimilarityMeasures used in this search.</p>
     * @param similarityMeasures value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestMetaBuilder similarityMeasures(
            final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
        return this;
    }

    /**
     *  <p>The SimilarityMeasures used in this search.</p>
     * @return similarityMeasures
     */

    public com.commercetools.ml.models.similar_products.SimilarityMeasures getSimilarityMeasures() {
        return this.similarityMeasures;
    }

    /**
     * builds SimilarProductSearchRequestMeta with checking for non-null required values
     * @return SimilarProductSearchRequestMeta
     */
    public SimilarProductSearchRequestMeta build() {
        Objects.requireNonNull(similarityMeasures,
            SimilarProductSearchRequestMeta.class + ": similarityMeasures is missing");
        return new SimilarProductSearchRequestMetaImpl(similarityMeasures);
    }

    /**
     * builds SimilarProductSearchRequestMeta without checking for non-null required values
     * @return SimilarProductSearchRequestMeta
     */
    public SimilarProductSearchRequestMeta buildUnchecked() {
        return new SimilarProductSearchRequestMetaImpl(similarityMeasures);
    }

    /**
     * factory method for an instance of SimilarProductSearchRequestMetaBuilder
     * @return builder
     */
    public static SimilarProductSearchRequestMetaBuilder of() {
        return new SimilarProductSearchRequestMetaBuilder();
    }

    /**
     * create builder for SimilarProductSearchRequestMeta instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductSearchRequestMetaBuilder of(final SimilarProductSearchRequestMeta template) {
        SimilarProductSearchRequestMetaBuilder builder = new SimilarProductSearchRequestMetaBuilder();
        builder.similarityMeasures = template.getSimilarityMeasures();
        return builder;
    }

}
