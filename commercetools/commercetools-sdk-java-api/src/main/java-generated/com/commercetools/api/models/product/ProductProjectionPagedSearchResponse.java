
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The response returned to a <span>Product Projection Search</span> request. The object contains the <span>query results</span> with Product Projections where at least one ProductVariant matches the search query, as well as the <span>facet results</span>, if requested.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductProjectionPagedSearchResponse productProjectionPagedSearchResponse = ProductProjectionPagedSearchResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductProjectionPagedSearchResponseImpl.class)
public interface ProductProjectionPagedSearchResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ProductProjection> {

    /**
     *  <p>The maximum number of results returned on a <span>page</span>.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
     *  <p>The starting point for the retrieved <span>paginated</span> result.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
     *  <p>Total number of results matching the query.</p>
     * @return total
     */

    @JsonProperty("total")
    public Long getTotal();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjections</a> where at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the <span>matching variants</span> are marked as such.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ProductProjection> getResults();

    /**
     *  <p>Facet results for each <span>facet expression</span> specified in the search request.</p>
     *  <p>Only present if at least one <code>facet</code> parameter was provided with the search request.</p>
     * @return facets
     */
    @Valid
    @JsonProperty("facets")
    public FacetResults getFacets();

    /**
     *  <p>The maximum number of results returned on a <span>page</span>.</p>
     * @param limit value to be set
     */

    public void setLimit(final Long limit);

    /**
     *  <p>The starting point for the retrieved <span>paginated</span> result.</p>
     * @param offset value to be set
     */

    public void setOffset(final Long offset);

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     */

    public void setCount(final Long count);

    /**
     *  <p>Total number of results matching the query.</p>
     * @param total value to be set
     */

    public void setTotal(final Long total);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjections</a> where at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the <span>matching variants</span> are marked as such.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ProductProjection... results);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">ProductProjections</a> where at least one <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the <span>matching variants</span> are marked as such.</p>
     * @param results values to be set
     */

    public void setResults(final List<ProductProjection> results);

    /**
     *  <p>Facet results for each <span>facet expression</span> specified in the search request.</p>
     *  <p>Only present if at least one <code>facet</code> parameter was provided with the search request.</p>
     * @param facets value to be set
     */

    public void setFacets(final FacetResults facets);

    /**
     * factory method
     * @return instance of ProductProjectionPagedSearchResponse
     */
    public static ProductProjectionPagedSearchResponse of() {
        return new ProductProjectionPagedSearchResponseImpl();
    }

    /**
     * factory method to create a shallow copy ProductProjectionPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductProjectionPagedSearchResponse of(final ProductProjectionPagedSearchResponse template) {
        ProductProjectionPagedSearchResponseImpl instance = new ProductProjectionPagedSearchResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        instance.setFacets(template.getFacets());
        return instance;
    }

    public ProductProjectionPagedSearchResponse copyDeep();

    /**
     * factory method to create a deep copy of ProductProjectionPagedSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductProjectionPagedSearchResponse deepCopy(
            @Nullable final ProductProjectionPagedSearchResponse template) {
        if (template == null) {
            return null;
        }
        ProductProjectionPagedSearchResponseImpl instance = new ProductProjectionPagedSearchResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.ProductProjection::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setFacets(com.commercetools.api.models.product.FacetResults.deepCopy(template.getFacets()));
        return instance;
    }

    /**
     * builder factory method for ProductProjectionPagedSearchResponse
     * @return builder
     */
    public static ProductProjectionPagedSearchResponseBuilder builder() {
        return ProductProjectionPagedSearchResponseBuilder.of();
    }

    /**
     * create builder for ProductProjectionPagedSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductProjectionPagedSearchResponseBuilder builder(
            final ProductProjectionPagedSearchResponse template) {
        return ProductProjectionPagedSearchResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductProjectionPagedSearchResponse(Function<ProductProjectionPagedSearchResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedSearchResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductProjectionPagedSearchResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ProductProjectionPagedSearchResponse>";
            }
        };
    }
}
