
package com.commercetools.api.models.product_search;

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
 * ProductPagedSearchResponse
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPagedSearchResponse productPagedSearchResponse = ProductPagedSearchResponse.builder()
 *             .total(0.3)
 *             .offset(0.3)
 *             .limit(0.3)
 *             .plusFacets(facetsBuilder -> facetsBuilder)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPagedSearchResponseImpl.class)
public interface ProductPagedSearchResponse {

    /**
     *  <p>Total number of results matching the query.</p>
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
    public Integer getOffset();

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Results for facets when requested.</p>
     * @return facets
     */
    @NotNull
    @Valid
    @JsonProperty("facets")
    public List<ProductSearchFacetResult> getFacets();

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductSearchResult> getResults();

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Results for facets when requested.</p>
     * @param facets values to be set
     */

    @JsonIgnore
    public void setFacets(final ProductSearchFacetResult... facets);

    /**
     *  <p>Results for facets when requested.</p>
     * @param facets values to be set
     */

    public void setFacets(final List<ProductSearchFacetResult> facets);

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ProductSearchResult... results);

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     * @param results values to be set
     */

    public void setResults(final List<ProductSearchResult> results);

    /**
     * factory method
     * @return instance of ProductPagedSearchResponse
     */
    public static ProductPagedSearchResponse of() {
        return new ProductPagedSearchResponseImpl();
    }

    /**
     * factory method to create a shallow copy ProductPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPagedSearchResponse of(final ProductPagedSearchResponse template) {
        ProductPagedSearchResponseImpl instance = new ProductPagedSearchResponseImpl();
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setLimit(template.getLimit());
        instance.setFacets(template.getFacets());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPagedSearchResponse deepCopy(@Nullable final ProductPagedSearchResponse template) {
        if (template == null) {
            return null;
        }
        ProductPagedSearchResponseImpl instance = new ProductPagedSearchResponseImpl();
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setLimit(template.getLimit());
        instance.setFacets(Optional.ofNullable(template.getFacets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchFacetResult::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchResult::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductPagedSearchResponse
     * @return builder
     */
    public static ProductPagedSearchResponseBuilder builder() {
        return ProductPagedSearchResponseBuilder.of();
    }

    /**
     * create builder for ProductPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPagedSearchResponseBuilder builder(final ProductPagedSearchResponse template) {
        return ProductPagedSearchResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPagedSearchResponse(Function<ProductPagedSearchResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPagedSearchResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPagedSearchResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPagedSearchResponse>";
            }
        };
    }
}
