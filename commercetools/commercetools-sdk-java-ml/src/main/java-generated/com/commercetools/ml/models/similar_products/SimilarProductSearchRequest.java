
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SimilarProductSearchRequestImpl.class)
public interface SimilarProductSearchRequest {

    @JsonProperty("limit")
    public Long getLimit();

    @JsonProperty("offset")
    public Long getOffset();

    /**
    *  <p>language tag used to prioritize language for text comparisons.</p>
    */

    @JsonProperty("language")
    public String getLanguage();

    /**
    *  <p>The three-digit  currency code to compare prices in. When a product has multiple prices, all prices for the product are converted to the currency provided by the currency attribute and the median price is calculated for comparison. Currencies are converted using the ECB currency exchange rates at the time the request is made. Of the currency codes, only currencies with currency exchange rates provided by the ECB are supported.</p>
    */

    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    /**
    *  <p><code>similarityMeasures</code> defines the attributes taken into account to measure product similarity.</p>
    */
    @Valid
    @JsonProperty("similarityMeasures")
    public SimilarityMeasures getSimilarityMeasures();

    /**
    *  <p>Array of length 2 of ProductSetSelector</p>
    */
    @Valid
    @JsonProperty("productSetSelectors")
    public List<ProductSetSelector> getProductSetSelectors();

    @JsonProperty("confidenceMin")
    public Double getConfidenceMin();

    @JsonProperty("confidenceMax")
    public Double getConfidenceMax();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setLanguage(final String language);

    public void setCurrencyCode(final String currencyCode);

    public void setSimilarityMeasures(final SimilarityMeasures similarityMeasures);

    @JsonIgnore
    public void setProductSetSelectors(final ProductSetSelector... productSetSelectors);

    public void setProductSetSelectors(final List<ProductSetSelector> productSetSelectors);

    public void setConfidenceMin(final Double confidenceMin);

    public void setConfidenceMax(final Double confidenceMax);

    public static SimilarProductSearchRequest of() {
        return new SimilarProductSearchRequestImpl();
    }

    public static SimilarProductSearchRequest of(final SimilarProductSearchRequest template) {
        SimilarProductSearchRequestImpl instance = new SimilarProductSearchRequestImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setLanguage(template.getLanguage());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setSimilarityMeasures(template.getSimilarityMeasures());
        instance.setProductSetSelectors(template.getProductSetSelectors());
        instance.setConfidenceMin(template.getConfidenceMin());
        instance.setConfidenceMax(template.getConfidenceMax());
        return instance;
    }

    public static SimilarProductSearchRequestBuilder builder() {
        return SimilarProductSearchRequestBuilder.of();
    }

    public static SimilarProductSearchRequestBuilder builder(final SimilarProductSearchRequest template) {
        return SimilarProductSearchRequestBuilder.of(template);
    }

    default <T> T withSimilarProductSearchRequest(Function<SimilarProductSearchRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProductSearchRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProductSearchRequest>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProductSearchRequest>";
            }
        };
    }
}
