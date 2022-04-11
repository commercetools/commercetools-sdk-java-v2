
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public SimilarProductSearchRequestBuilder limit(@Nullable final Long limit) {
        this.limit = limit;
        return this;
    }

    public SimilarProductSearchRequestBuilder offset(@Nullable final Long offset) {
        this.offset = offset;
        return this;
    }

    public SimilarProductSearchRequestBuilder language(@Nullable final String language) {
        this.language = language;
        return this;
    }

    public SimilarProductSearchRequestBuilder currencyCode(@Nullable final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public SimilarProductSearchRequestBuilder similarityMeasures(
            Function<com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder, com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder> builder) {
        this.similarityMeasures = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarityMeasuresBuilder.of())
                .build();
        return this;
    }

    public SimilarProductSearchRequestBuilder similarityMeasures(
            @Nullable final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
        return this;
    }

    public SimilarProductSearchRequestBuilder productSetSelectors(
            @Nullable final com.commercetools.ml.models.similar_products.ProductSetSelector... productSetSelectors) {
        this.productSetSelectors = new ArrayList<>(Arrays.asList(productSetSelectors));
        return this;
    }

    public SimilarProductSearchRequestBuilder productSetSelectors(
            @Nullable final java.util.List<com.commercetools.ml.models.similar_products.ProductSetSelector> productSetSelectors) {
        this.productSetSelectors = productSetSelectors;
        return this;
    }

    public SimilarProductSearchRequestBuilder plusProductSetSelectors(
            @Nullable final com.commercetools.ml.models.similar_products.ProductSetSelector... productSetSelectors) {
        if (this.productSetSelectors == null) {
            this.productSetSelectors = new ArrayList<>();
        }
        this.productSetSelectors.addAll(Arrays.asList(productSetSelectors));
        return this;
    }

    public SimilarProductSearchRequestBuilder plusProductSetSelectors(
            Function<com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder, com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder> builder) {
        if (this.productSetSelectors == null) {
            this.productSetSelectors = new ArrayList<>();
        }
        this.productSetSelectors.add(
            builder.apply(com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder.of()).build());
        return this;
    }

    public SimilarProductSearchRequestBuilder withProductSetSelectors(
            Function<com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder, com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder> builder) {
        this.productSetSelectors = new ArrayList<>();
        this.productSetSelectors.add(
            builder.apply(com.commercetools.ml.models.similar_products.ProductSetSelectorBuilder.of()).build());
        return this;
    }

    public SimilarProductSearchRequestBuilder confidenceMin(@Nullable final Double confidenceMin) {
        this.confidenceMin = confidenceMin;
        return this;
    }

    public SimilarProductSearchRequestBuilder confidenceMax(@Nullable final Double confidenceMax) {
        this.confidenceMax = confidenceMax;
        return this;
    }

    @Nullable
    public Long getLimit() {
        return this.limit;
    }

    @Nullable
    public Long getOffset() {
        return this.offset;
    }

    @Nullable
    public String getLanguage() {
        return this.language;
    }

    @Nullable
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public com.commercetools.ml.models.similar_products.SimilarityMeasures getSimilarityMeasures() {
        return this.similarityMeasures;
    }

    @Nullable
    public java.util.List<com.commercetools.ml.models.similar_products.ProductSetSelector> getProductSetSelectors() {
        return this.productSetSelectors;
    }

    @Nullable
    public Double getConfidenceMin() {
        return this.confidenceMin;
    }

    @Nullable
    public Double getConfidenceMax() {
        return this.confidenceMax;
    }

    public SimilarProductSearchRequest build() {
        return new SimilarProductSearchRequestImpl(limit, offset, language, currencyCode, similarityMeasures,
            productSetSelectors, confidenceMin, confidenceMax);
    }

    /**
     * builds SimilarProductSearchRequest without checking for non null required values
     */
    public SimilarProductSearchRequest buildUnchecked() {
        return new SimilarProductSearchRequestImpl(limit, offset, language, currencyCode, similarityMeasures,
            productSetSelectors, confidenceMin, confidenceMax);
    }

    public static SimilarProductSearchRequestBuilder of() {
        return new SimilarProductSearchRequestBuilder();
    }

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
