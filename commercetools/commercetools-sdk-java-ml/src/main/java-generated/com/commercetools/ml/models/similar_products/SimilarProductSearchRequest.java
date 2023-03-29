
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductSearchRequest
 *
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
@JsonDeserialize(as = SimilarProductSearchRequestImpl.class)
public interface SimilarProductSearchRequest {

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>language tag used to prioritize language for text comparisons.</p>
     * @return language
     */

    @JsonProperty("language")
    public String getLanguage();

    /**
     *  <p>The three-digit currency code to compare prices in. When a product has multiple prices, all prices for the product are converted to the currency provided by the currency attribute and the median price is calculated for comparison. Currencies are converted using the ECB currency exchange rates at the time the request is made. Of the currency codes, only currencies with currency exchange rates provided by the ECB are supported.</p>
     * @return currencyCode
     */

    @JsonProperty("currencyCode")
    public String getCurrencyCode();

    /**
     *  <p><code>similarityMeasures</code> defines the attributes taken into account to measure product similarity.</p>
     * @return similarityMeasures
     */
    @Valid
    @JsonProperty("similarityMeasures")
    public SimilarityMeasures getSimilarityMeasures();

    /**
     *  <p>Array of length 2 of ProductSetSelector</p>
     * @return productSetSelectors
     */
    @Valid
    @JsonProperty("productSetSelectors")
    public List<ProductSetSelector> getProductSetSelectors();

    /**
     *
     * @return confidenceMin
     */

    @JsonProperty("confidenceMin")
    public Double getConfidenceMin();

    /**
     *
     * @return confidenceMax
     */

    @JsonProperty("confidenceMax")
    public Double getConfidenceMax();

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>language tag used to prioritize language for text comparisons.</p>
     * @param language value to be set
     */

    public void setLanguage(final String language);

    /**
     *  <p>The three-digit currency code to compare prices in. When a product has multiple prices, all prices for the product are converted to the currency provided by the currency attribute and the median price is calculated for comparison. Currencies are converted using the ECB currency exchange rates at the time the request is made. Of the currency codes, only currencies with currency exchange rates provided by the ECB are supported.</p>
     * @param currencyCode value to be set
     */

    public void setCurrencyCode(final String currencyCode);

    /**
     *  <p><code>similarityMeasures</code> defines the attributes taken into account to measure product similarity.</p>
     * @param similarityMeasures value to be set
     */

    public void setSimilarityMeasures(final SimilarityMeasures similarityMeasures);

    /**
     *  <p>Array of length 2 of ProductSetSelector</p>
     * @param productSetSelectors values to be set
     */

    @JsonIgnore
    public void setProductSetSelectors(final ProductSetSelector... productSetSelectors);

    /**
     *  <p>Array of length 2 of ProductSetSelector</p>
     * @param productSetSelectors values to be set
     */

    public void setProductSetSelectors(final List<ProductSetSelector> productSetSelectors);

    /**
     * set confidenceMin
     * @param confidenceMin value to be set
     */

    public void setConfidenceMin(final Double confidenceMin);

    /**
     * set confidenceMax
     * @param confidenceMax value to be set
     */

    public void setConfidenceMax(final Double confidenceMax);

    /**
     * factory method
     * @return instance of SimilarProductSearchRequest
     */
    public static SimilarProductSearchRequest of() {
        return new SimilarProductSearchRequestImpl();
    }

    /**
     * factory method to create a shallow copy SimilarProductSearchRequest
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of SimilarProductSearchRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SimilarProductSearchRequest deepCopy(@Nullable final SimilarProductSearchRequest template) {
        if (template == null) {
            return null;
        }
        SimilarProductSearchRequestImpl instance = new SimilarProductSearchRequestImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setLanguage(template.getLanguage());
        instance.setCurrencyCode(template.getCurrencyCode());
        instance.setSimilarityMeasures(Optional.ofNullable(template.getSimilarityMeasures())
                .map(com.commercetools.ml.models.similar_products.SimilarityMeasures::deepCopy)
                .orElse(null));
        instance.setProductSetSelectors(Optional.ofNullable(template.getProductSetSelectors())
                .map(t -> t.stream()
                        .map(com.commercetools.ml.models.similar_products.ProductSetSelector::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setConfidenceMin(template.getConfidenceMin());
        instance.setConfidenceMax(template.getConfidenceMax());
        return instance;
    }

    /**
     * builder factory method for SimilarProductSearchRequest
     * @return builder
     */
    public static SimilarProductSearchRequestBuilder builder() {
        return SimilarProductSearchRequestBuilder.of();
    }

    /**
     * create builder for SimilarProductSearchRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductSearchRequestBuilder builder(final SimilarProductSearchRequest template) {
        return SimilarProductSearchRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSimilarProductSearchRequest(Function<SimilarProductSearchRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProductSearchRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProductSearchRequest>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProductSearchRequest>";
            }
        };
    }
}
