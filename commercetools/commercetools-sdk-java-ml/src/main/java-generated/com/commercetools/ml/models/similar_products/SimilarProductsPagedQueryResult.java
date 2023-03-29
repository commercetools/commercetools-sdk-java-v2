
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductsPagedQueryResult
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductsPagedQueryResult similarProductsPagedQueryResult = SimilarProductsPagedQueryResult.builder()
 *             .count(0.3)
 *             .total(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .meta(metaBuilder -> metaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SimilarProductsPagedQueryResultImpl.class)
public interface SimilarProductsPagedQueryResult {

    /**
     *
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<SimilarProductPair> getResults();

    /**
     *
     * @return meta
     */
    @NotNull
    @Valid
    @JsonProperty("meta")
    public SimilarProductSearchRequestMeta getMeta();

    /**
     * set count
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     * set total
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     * set results
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final SimilarProductPair... results);

    /**
     * set results
     * @param results values to be set
     */

    public void setResults(final List<SimilarProductPair> results);

    /**
     * set meta
     * @param meta value to be set
     */

    public void setMeta(final SimilarProductSearchRequestMeta meta);

    /**
     * factory method
     * @return instance of SimilarProductsPagedQueryResult
     */
    public static SimilarProductsPagedQueryResult of() {
        return new SimilarProductsPagedQueryResultImpl();
    }

    /**
     * factory method to create a shallow copy SimilarProductsPagedQueryResult
     * @param template instance to be copied
     * @return copy instance
     */
    public static SimilarProductsPagedQueryResult of(final SimilarProductsPagedQueryResult template) {
        SimilarProductsPagedQueryResultImpl instance = new SimilarProductsPagedQueryResultImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        instance.setMeta(template.getMeta());
        return instance;
    }

    /**
     * factory method to create a deep copy of SimilarProductsPagedQueryResult
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SimilarProductsPagedQueryResult deepCopy(@Nullable final SimilarProductsPagedQueryResult template) {
        if (template == null) {
            return null;
        }
        SimilarProductsPagedQueryResultImpl instance = new SimilarProductsPagedQueryResultImpl();
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.ml.models.similar_products.SimilarProductPair::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setMeta(
            com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMeta.deepCopy(template.getMeta()));
        return instance;
    }

    /**
     * builder factory method for SimilarProductsPagedQueryResult
     * @return builder
     */
    public static SimilarProductsPagedQueryResultBuilder builder() {
        return SimilarProductsPagedQueryResultBuilder.of();
    }

    /**
     * create builder for SimilarProductsPagedQueryResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductsPagedQueryResultBuilder builder(final SimilarProductsPagedQueryResult template) {
        return SimilarProductsPagedQueryResultBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSimilarProductsPagedQueryResult(Function<SimilarProductsPagedQueryResult, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SimilarProductsPagedQueryResult> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SimilarProductsPagedQueryResult>() {
            @Override
            public String toString() {
                return "TypeReference<SimilarProductsPagedQueryResult>";
            }
        };
    }
}
