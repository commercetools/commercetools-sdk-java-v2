
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.search.SearchQuery;
import com.commercetools.api.models.search.SearchSorting;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
     *  <p>The search query against searchable Product fields.</p>
     * @return query
     */
    @Valid
    @JsonProperty("query")
    public SearchQuery getQuery();

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @return sort
     */
    @Valid
    @JsonProperty("sort")
    public List<SearchSorting> getSort();

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @return limit
     */

    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @return offset
     */

    @JsonProperty("offset")
    public Integer getOffset();

    /**
     *  <p>The search can return Products where not all Product Variants match the search criteria. If <code>true</code>, the response will include a field called <code>matchingVariants</code> that contains the <code>sku</code> of Product Variants that match the search query. If the query does not specify any variant-level criteria, <code>matchingVariants</code> will be null signifying that all Product Variants are a match.</p>
     * @return markMatchingVariants
     */

    @JsonProperty("markMatchingVariants")
    public Boolean getMarkMatchingVariants();

    /**
     *  <p>Set this field to <code>{}</code> to get the ProductProjection included in the ProductSearchResult. Include query parameters for controlling Reference Expansion or projections according to your needs. If not set, the result does not include the Product Projection.</p>
     * @return productProjectionParameters
     */
    @Valid
    @JsonProperty("productProjectionParameters")
    public ProductSearchProjectionParams getProductProjectionParameters();

    /**
     *  <p>Set this field to request facets.</p>
     * @return facets
     */
    @Valid
    @JsonProperty("facets")
    public List<ProductSearchFacetExpression> getFacets();

    /**
     *  <p>The search query against searchable Product fields.</p>
     * @param query value to be set
     */

    public void setQuery(final SearchQuery query);

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort values to be set
     */

    @JsonIgnore
    public void setSort(final SearchSorting... sort);

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     * @param sort values to be set
     */

    public void setSort(final List<SearchSorting> sort);

    /**
     *  <p>The maximum number of search results to be returned.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     * @param offset value to be set
     */

    public void setOffset(final Integer offset);

    /**
     *  <p>The search can return Products where not all Product Variants match the search criteria. If <code>true</code>, the response will include a field called <code>matchingVariants</code> that contains the <code>sku</code> of Product Variants that match the search query. If the query does not specify any variant-level criteria, <code>matchingVariants</code> will be null signifying that all Product Variants are a match.</p>
     * @param markMatchingVariants value to be set
     */

    public void setMarkMatchingVariants(final Boolean markMatchingVariants);

    /**
     *  <p>Set this field to <code>{}</code> to get the ProductProjection included in the ProductSearchResult. Include query parameters for controlling Reference Expansion or projections according to your needs. If not set, the result does not include the Product Projection.</p>
     * @param productProjectionParameters value to be set
     */

    public void setProductProjectionParameters(final ProductSearchProjectionParams productProjectionParameters);

    /**
     *  <p>Set this field to request facets.</p>
     * @param facets values to be set
     */

    @JsonIgnore
    public void setFacets(final ProductSearchFacetExpression... facets);

    /**
     *  <p>Set this field to request facets.</p>
     * @param facets values to be set
     */

    public void setFacets(final List<ProductSearchFacetExpression> facets);

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
        return instance;
    }

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
