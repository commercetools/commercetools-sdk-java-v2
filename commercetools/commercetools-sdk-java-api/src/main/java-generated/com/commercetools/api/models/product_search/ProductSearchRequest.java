
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.search.SearchQuery;
import com.commercetools.api.models.search.SearchSorting;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * ProductSearchRequest
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSearchRequest productSearchRequest = ProductSearchRequest.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSearchRequestImpl.class)
public interface ProductSearchRequest {

    /**
     *  <p>The search query against <span>searchable Product fields</span>.</p>
     * @return query
     */
    @Valid
    @JsonProperty("query")
    public SearchQuery getQuery();

    /**
     *  <p>Controls how results to your query are <span>sorted</span>. If not provided, the results are sorted by relevance score in descending order.</p>
     * @return sort
     */
    @Valid
    @JsonProperty("sort")
    public List<SearchSorting> getSort();

    /**
     *  <p>The maximum number of search results to be returned in one <span>page</span>.</p>
     * @return limit
     */

    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>The number of search results to be skipped in the response for <span>pagination</span>.</p>
     * @return offset
     */

    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *  <p>If <code>query</code> specifies an expression for a Product Variant field, set this to <code>true</code> to get additional information for each returned Product about which Product Variants match the search query. For details, see <span>matching variants</span>.</p>
     * @return markMatchingVariants
     */

    @JsonProperty("markMatchingVariants")
    public Boolean getMarkMatchingVariants();

    /**
     *  <p>Controls deprecated data integration <span>with Product Projection parameters</span>. If not set, the result does not include the Product Projection.</p>
     * @return productProjectionParameters
     */
    @Valid
    @Deprecated
    @JsonProperty("productProjectionParameters")
    public ProductSearchProjectionParams getProductProjectionParameters();

    /**
     *  <p>Set this field to request <span>facets</span>.</p>
     * @return facets
     */
    @Valid
    @JsonProperty("facets")
    public List<ProductSearchFacetExpression> getFacets();

    /**
     *  <p>Specify an additional filter on the result of the <code>query</code> after the API calculated <code>facets</code>. This feature assists you in implementing faceted search.</p>
     * @return postFilter
     */
    @Valid
    @JsonProperty("postFilter")
    public SearchQuery getPostFilter();

    /**
     *  <p>The search query against <span>searchable Product fields</span>.</p>
     * @param query value to be set
     */

    public void setQuery(final SearchQuery query);

    /**
     *  <p>Controls how results to your query are <span>sorted</span>. If not provided, the results are sorted by relevance score in descending order.</p>
     * @param sort values to be set
     */

    @JsonIgnore
    public void setSort(final SearchSorting... sort);

    /**
     *  <p>Controls how results to your query are <span>sorted</span>. If not provided, the results are sorted by relevance score in descending order.</p>
     * @param sort values to be set
     */

    public void setSort(final List<SearchSorting> sort);

    /**
     *  <p>The maximum number of search results to be returned in one <span>page</span>.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>The number of search results to be skipped in the response for <span>pagination</span>.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     *  <p>If <code>query</code> specifies an expression for a Product Variant field, set this to <code>true</code> to get additional information for each returned Product about which Product Variants match the search query. For details, see <span>matching variants</span>.</p>
     * @param markMatchingVariants value to be set
     */

    public void setMarkMatchingVariants(final Boolean markMatchingVariants);

    /**
     *  <p>Controls deprecated data integration <span>with Product Projection parameters</span>. If not set, the result does not include the Product Projection.</p>
     * @param productProjectionParameters value to be set
     */
    @Deprecated
    public void setProductProjectionParameters(final ProductSearchProjectionParams productProjectionParameters);

    /**
     *  <p>Set this field to request <span>facets</span>.</p>
     * @param facets values to be set
     */

    @JsonIgnore
    public void setFacets(final ProductSearchFacetExpression... facets);

    /**
     *  <p>Set this field to request <span>facets</span>.</p>
     * @param facets values to be set
     */

    public void setFacets(final List<ProductSearchFacetExpression> facets);

    /**
     *  <p>Specify an additional filter on the result of the <code>query</code> after the API calculated <code>facets</code>. This feature assists you in implementing faceted search.</p>
     * @param postFilter value to be set
     */

    public void setPostFilter(final SearchQuery postFilter);

    /**
     * factory method
     * @return instance of ProductSearchRequest
     */
    public static ProductSearchRequest of() {
        return new ProductSearchRequestImpl();
    }

    /**
     * factory method to create a shallow copy ProductSearchRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSearchRequest of(final ProductSearchRequest template) {
        ProductSearchRequestImpl instance = new ProductSearchRequestImpl();
        instance.setQuery(template.getQuery());
        instance.setSort(template.getSort());
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setMarkMatchingVariants(template.getMarkMatchingVariants());
        instance.setProductProjectionParameters(template.getProductProjectionParameters());
        instance.setFacets(template.getFacets());
        instance.setPostFilter(template.getPostFilter());
        return instance;
    }

    public ProductSearchRequest copyDeep();

    /**
     * factory method to create a deep copy of ProductSearchRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSearchRequest deepCopy(@Nullable final ProductSearchRequest template) {
        if (template == null) {
            return null;
        }
        ProductSearchRequestImpl instance = new ProductSearchRequestImpl();
        instance.setQuery(com.commercetools.api.models.search.SearchQuery.deepCopy(template.getQuery()));
        instance.setSort(Optional.ofNullable(template.getSort())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.search.SearchSorting::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setMarkMatchingVariants(template.getMarkMatchingVariants());
        instance.setProductProjectionParameters(
            com.commercetools.api.models.product_search.ProductSearchProjectionParams
                    .deepCopy(template.getProductProjectionParameters()));
        instance.setFacets(Optional.ofNullable(template.getFacets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product_search.ProductSearchFacetExpression::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPostFilter(com.commercetools.api.models.search.SearchQuery.deepCopy(template.getPostFilter()));
        return instance;
    }

    /**
     * builder factory method for ProductSearchRequest
     * @return builder
     */
    public static ProductSearchRequestBuilder builder() {
        return ProductSearchRequestBuilder.of();
    }

    /**
     * create builder for ProductSearchRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSearchRequestBuilder builder(final ProductSearchRequest template) {
        return ProductSearchRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSearchRequest(Function<ProductSearchRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSearchRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSearchRequest>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSearchRequest>";
            }
        };
    }
}
