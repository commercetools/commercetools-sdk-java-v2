
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SimilarProductSearchRequestImpl implements SimilarProductSearchRequest, ModelBase {

    private Long limit;

    private Long offset;

    private String language;

    private String currencyCode;

    private com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures;

    private java.util.List<com.commercetools.ml.models.similar_products.ProductSetSelector> productSetSelectors;

    private Double confidenceMin;

    private Double confidenceMax;

    @JsonCreator
    SimilarProductSearchRequestImpl(@JsonProperty("limit") final Long limit, @JsonProperty("offset") final Long offset,
            @JsonProperty("language") final String language, @JsonProperty("currencyCode") final String currencyCode,
            @JsonProperty("similarityMeasures") final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures,
            @JsonProperty("productSetSelectors") final java.util.List<com.commercetools.ml.models.similar_products.ProductSetSelector> productSetSelectors,
            @JsonProperty("confidenceMin") final Double confidenceMin,
            @JsonProperty("confidenceMax") final Double confidenceMax) {
        this.limit = limit;
        this.offset = offset;
        this.language = language;
        this.currencyCode = currencyCode;
        this.similarityMeasures = similarityMeasures;
        this.productSetSelectors = productSetSelectors;
        this.confidenceMin = confidenceMin;
        this.confidenceMax = confidenceMax;
    }

    public SimilarProductSearchRequestImpl() {
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    /**
    *  <p>language tag used to prioritize language for text comparisons.</p>
    */
    public String getLanguage() {
        return this.language;
    }

    /**
    *  <p>The three-digit  currency code to compare prices in. When a product has multiple prices, all prices for the product are converted to the currency provided by the currency attribute and the median price is calculated for comparison. Currencies are converted using the ECB currency exchange rates at the time the request is made. Of the currency codes, only currencies with currency exchange rates provided by the ECB are supported.</p>
    */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
    *  <p><code>similarityMeasures</code> defines the attributes taken into account to measure product similarity.</p>
    */
    public com.commercetools.ml.models.similar_products.SimilarityMeasures getSimilarityMeasures() {
        return this.similarityMeasures;
    }

    /**
    *  <p>Array of length 2 of ProductSetSelector</p>
    */
    public java.util.List<com.commercetools.ml.models.similar_products.ProductSetSelector> getProductSetSelectors() {
        return this.productSetSelectors;
    }

    public Double getConfidenceMin() {
        return this.confidenceMin;
    }

    public Double getConfidenceMax() {
        return this.confidenceMax;
    }

    public void setLimit(final Long limit) {
        this.limit = limit;
    }

    public void setOffset(final Long offset) {
        this.offset = offset;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setSimilarityMeasures(
            final com.commercetools.ml.models.similar_products.SimilarityMeasures similarityMeasures) {
        this.similarityMeasures = similarityMeasures;
    }

    public void setProductSetSelectors(
            final com.commercetools.ml.models.similar_products.ProductSetSelector... productSetSelectors) {
        this.productSetSelectors = new ArrayList<>(Arrays.asList(productSetSelectors));
    }

    public void setProductSetSelectors(
            final java.util.List<com.commercetools.ml.models.similar_products.ProductSetSelector> productSetSelectors) {
        this.productSetSelectors = productSetSelectors;
    }

    public void setConfidenceMin(final Double confidenceMin) {
        this.confidenceMin = confidenceMin;
    }

    public void setConfidenceMax(final Double confidenceMax) {
        this.confidenceMax = confidenceMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SimilarProductSearchRequestImpl that = (SimilarProductSearchRequestImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(offset, that.offset)
                .append(language, that.language)
                .append(currencyCode, that.currencyCode)
                .append(similarityMeasures, that.similarityMeasures)
                .append(productSetSelectors, that.productSetSelectors)
                .append(confidenceMin, that.confidenceMin)
                .append(confidenceMax, that.confidenceMax)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit)
                .append(offset)
                .append(language)
                .append(currencyCode)
                .append(similarityMeasures)
                .append(productSetSelectors)
                .append(confidenceMin)
                .append(confidenceMax)
                .toHashCode();
    }

}
