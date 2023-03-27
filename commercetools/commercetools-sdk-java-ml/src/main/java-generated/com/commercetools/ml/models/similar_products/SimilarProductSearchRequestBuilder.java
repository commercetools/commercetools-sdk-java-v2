
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductSearchRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductSearchRequest similarProductSearchRequest = SimilarProductSearchRequest.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SimilarProductSearchRequestBuilder implements Builder<SimilarProductSearchRequest> {

    @Nullable
    private Long limit;

    @Nullable
    private Long offset;

    @Nullable
    private String language;

    @Nullable
    private String currencyCode;

    @Nullable
    private com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures;

    @Nullable
    private java.util.List<com.commercetools.ml.models.similar_products.ProductSetSelector> productSetSelectors;

    @Nullable
    private Double confidenceMin;

    @Nullable
    private Double confidenceMax;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder limit(@Nullable final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder offset(@Nullable final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>language tag used to prioritize language for text comparisons.</p>
     * @param language value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    /**
     *  <p>The three-digit currency code to compare prices in. When a product has multiple prices, all prices for the product are converted to the currency provided by the currency attribute and the median price is calculated for comparison. Currencies are converted using the ECB currency exchange rates at the time the request is made. Of the currency codes, only currencies with currency exchange rates provided by the ECB are supported.</p>
     * @param currencyCode value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder currencyCode(@Nullable final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     *  <p><code>similarityMeasures</code> defines the attributes taken into account to measure product similarity.</p>
     * @param builder function to build the similarityMeasures value
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder similarityMeasures(
            Function<com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder, com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder> builder) {
        this.similarityMeasures = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><code>similarityMeasures</code> defines the attributes taken into account to measure product similarity.</p>
     * @param similarityMeasures value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder similarityMeasures(
            @Nullable final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
        return this;
    }

    /**
     *  <p>Array of length 2 of ProductSetSelector</p>
     * @param productSetSelectors value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder productSetSelectors(
            @Nullable final com.commercetools.ml.models.similar_products.ProductSetSelector... productSetSelectors) {
        this.productSetSelectors = new ArrayList<>(Arrays.asList(productSetSelectors));
        return this;
    }

    /**
     *  <p>Array of length 2 of ProductSetSelector</p>
     * @param productSetSelectors value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder productSetSelectors(
            @Nullable final java.util.List<com.commercetools.ml.models.similar_products.ProductSetSelector> productSetSelectors) {
        this.productSetSelectors = productSetSelectors;
        return this;
    }

    /**
     *  <p>Array of length 2 of ProductSetSelector</p>
     * @param productSetSelectors value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder plusProductSetSelectors(
            @Nullable final com.commercetools.ml.models.similar_products.ProductSetSelector... productSetSelectors) {
        if (this.productSetSelectors == null) {
            this.productSetSelectors = new ArrayList<>();
        }
        this.productSetSelectors.addAll(Arrays.asList(productSetSelectors));
        return this;
    }

    /**
     *  <p>Array of length 2 of ProductSetSelector</p>
     * @param builder function to build the productSetSelectors value
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder plusProductSetSelectors(
            Function<com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder, com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder> builder) {
        if (this.productSetSelectors == null) {
            this.productSetSelectors = new ArrayList<>();
        }
        this.productSetSelectors.add(
            builder.apply(com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Array of length 2 of ProductSetSelector</p>
     * @param builder function to build the productSetSelectors value
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder withProductSetSelectors(
            Function<com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder, com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder> builder) {
        this.productSetSelectors = new ArrayList<>();
        this.productSetSelectors.add(
            builder.apply(com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the confidenceMin
     * @param confidenceMin value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder confidenceMin(@Nullable final Double confidenceMin) {
        this.confidenceMin = confidenceMin;
        return this;
    }

    /**
     * set the value to the confidenceMax
     * @param confidenceMax value to be set
     * @return Builder
     */

    public SimilarProductSearchRequestBuilder confidenceMax(@Nullable final Double confidenceMax) {
        this.confidenceMax = confidenceMax;
        return this;
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    @Nullable
    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    @Nullable
    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>language tag used to prioritize language for text comparisons.</p>
     * @return language
     */

    @Nullable
    public String getLanguage() {
        return this.language;
    }

    /**
     *  <p>The three-digit currency code to compare prices in. When a product has multiple prices, all prices for the product are converted to the currency provided by the currency attribute and the median price is calculated for comparison. Currencies are converted using the ECB currency exchange rates at the time the request is made. Of the currency codes, only currencies with currency exchange rates provided by the ECB are supported.</p>
     * @return currencyCode
     */

    @Nullable
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     *  <p><code>similarityMeasures</code> defines the attributes taken into account to measure product similarity.</p>
     * @return similarityMeasures
     */

    @Nullable
    public com.commercetools.ml.models.similar_products.SimilarityMeasures getSimilarityMeasures() {
        return this.similarityMeasures;
    }

    /**
     *  <p>Array of length 2 of ProductSetSelector</p>
     * @return productSetSelectors
     */

    @Nullable
    public java.util.List<com.commercetools.ml.models.similar_products.ProductSetSelector> getProductSetSelectors() {
        return this.productSetSelectors;
    }

    /**
     * value of confidenceMin}
     * @return confidenceMin
     */

    @Nullable
    public Double getConfidenceMin() {
        return this.confidenceMin;
    }

    /**
     * value of confidenceMax}
     * @return confidenceMax
     */

    @Nullable
    public Double getConfidenceMax() {
        return this.confidenceMax;
    }

    /**
     * builds SimilarProductSearchRequest with checking for non-null required values
     * @return SimilarProductSearchRequest
     */
    public SimilarProductSearchRequest build() {
        return new SimilarProductSearchRequestImpl(limit, offset, language, currencyCode, similarityMeasures,
            productSetSelectors, confidenceMin, confidenceMax);
    }

    /**
     * builds SimilarProductSearchRequest without checking for non-null required values
     * @return SimilarProductSearchRequest
     */
    public SimilarProductSearchRequest buildUnchecked() {
        return new SimilarProductSearchRequestImpl(limit, offset, language, currencyCode, similarityMeasures,
            productSetSelectors, confidenceMin, confidenceMax);
    }

    /**
     * factory method for an instance of SimilarProductSearchRequestBuilder
     * @return builder
     */
    public static SimilarProductSearchRequestBuilder of() {
        return new SimilarProductSearchRequestBuilder();
    }

    /**
     * create builder for SimilarProductSearchRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductSearchRequestBuilder of(final SimilarProductSearchRequest template) {
        SimilarProductSearchRequestBuilder builder = new SimilarProductSearchRequestBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.language = template.getLanguage();
        builder.currencyCode = template.getCurrencyCode();
        builder.similarityMeasures = template.getSimilarityMeasures();
        builder.productSetSelectors = template.getProductSetSelectors();
        builder.confidenceMin = template.getConfidenceMin();
        builder.confidenceMax = template.getConfidenceMax();
        return builder;
    }

}
