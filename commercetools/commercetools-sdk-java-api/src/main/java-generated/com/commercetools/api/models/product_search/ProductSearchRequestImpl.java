
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ProductSearchRequest
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchRequestImpl implements ProductSearchRequest, ModelBase {

    private com.commercetools.api.models.product_search.ProductSearchQuery query;

    private com.commercetools.api.models.product_search.ProductSearchQuery postFilter;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchSorting> sort;

    private Integer limit;

    private Integer offset;

    private Boolean markMatchingVariants;

    private com.commercetools.api.models.product_search.ProductSearchProjectionParams projection;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> facets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchRequestImpl(
            @JsonProperty("query") final com.commercetools.api.models.product_search.ProductSearchQuery query,
            @JsonProperty("postFilter") final com.commercetools.api.models.product_search.ProductSearchQuery postFilter,
            @JsonProperty("sort") final java.util.List<com.commercetools.api.models.product_search.ProductSearchSorting> sort,
            @JsonProperty("limit") final Integer limit, @JsonProperty("offset") final Integer offset,
            @JsonProperty("markMatchingVariants") final Boolean markMatchingVariants,
            @JsonProperty("projection") final com.commercetools.api.models.product_search.ProductSearchProjectionParams projection,
            @JsonProperty("facets") final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> facets) {
        this.query = query;
        this.postFilter = postFilter;
        this.sort = sort;
        this.limit = limit;
        this.offset = offset;
        this.markMatchingVariants = markMatchingVariants;
        this.projection = projection;
        this.facets = facets;
    }

    /**
     * create empty instance
     */
    public ProductSearchRequestImpl() {
    }

    /**
     *  <p>The Product search query.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchQuery getQuery() {
        return this.query;
    }

    /**
     *
     */

    public com.commercetools.api.models.product_search.ProductSearchQuery getPostFilter() {
        return this.postFilter;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchSorting> getSort() {
        return this.sort;
    }

    /**
     *  <p>The maximum number of search results to be returned.</p>
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>The number of search results to be skipped in the response for pagination.</p>
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>The search can return Products where not all Product Variants match the search criteria. If <code>true</code>, the response will include a field called <code>matchingVariants</code> that contains the <code>sku</code> of Product Variants that match the search query. If the query does not specify any variant-level criteria, <code>matchingVariants</code> will be null signifying that all Product Variants are a match.</p>
     */

    public Boolean getMarkMatchingVariants() {
        return this.markMatchingVariants;
    }

    /**
     *  <p>Contains Product Projection query parameters. Used to fetch matching Product Projection data of products matching the search query. If not included, Product Projection integration is not used.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchProjectionParams getProjection() {
        return this.projection;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> getFacets() {
        return this.facets;
    }

    public void setQuery(final com.commercetools.api.models.product_search.ProductSearchQuery query) {
        this.query = query;
    }

    public void setPostFilter(final com.commercetools.api.models.product_search.ProductSearchQuery postFilter) {
        this.postFilter = postFilter;
    }

    public void setSort(final com.commercetools.api.models.product_search.ProductSearchSorting... sort) {
        this.sort = new ArrayList<>(Arrays.asList(sort));
    }

    public void setSort(final java.util.List<com.commercetools.api.models.product_search.ProductSearchSorting> sort) {
        this.sort = sort;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setOffset(final Integer offset) {
        this.offset = offset;
    }

    public void setMarkMatchingVariants(final Boolean markMatchingVariants) {
        this.markMatchingVariants = markMatchingVariants;
    }

    public void setProjection(
            final com.commercetools.api.models.product_search.ProductSearchProjectionParams projection) {
        this.projection = projection;
    }

    public void setFacets(final com.commercetools.api.models.product_search.ProductSearchFacetExpression... facets) {
        this.facets = new ArrayList<>(Arrays.asList(facets));
    }

    public void setFacets(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> facets) {
        this.facets = facets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchRequestImpl that = (ProductSearchRequestImpl) o;

        return new EqualsBuilder().append(query, that.query)
                .append(postFilter, that.postFilter)
                .append(sort, that.sort)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(markMatchingVariants, that.markMatchingVariants)
                .append(projection, that.projection)
                .append(facets, that.facets)
                .append(query, that.query)
                .append(postFilter, that.postFilter)
                .append(sort, that.sort)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(markMatchingVariants, that.markMatchingVariants)
                .append(projection, that.projection)
                .append(facets, that.facets)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(query)
                .append(postFilter)
                .append(sort)
                .append(limit)
                .append(offset)
                .append(markMatchingVariants)
                .append(projection)
                .append(facets)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("query", query)
                .append("postFilter", postFilter)
                .append("sort", sort)
                .append("limit", limit)
                .append("offset", offset)
                .append("markMatchingVariants", markMatchingVariants)
                .append("projection", projection)
                .append("facets", facets)
                .build();
    }

}
