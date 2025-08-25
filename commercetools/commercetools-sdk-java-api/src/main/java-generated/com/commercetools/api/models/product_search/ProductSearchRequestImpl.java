
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

    private com.commercetools.api.models.search.SearchQuery query;

    private java.util.List<com.commercetools.api.models.search.SearchSorting> sort;

    private Integer limit;

    private Integer offset;

    private Boolean markMatchingVariants;

    private com.commercetools.api.models.product_search.ProductSearchProjectionParams productProjectionParameters;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> facets;

    private com.commercetools.api.models.search.SearchQuery postFilter;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchRequestImpl(@JsonProperty("query") final com.commercetools.api.models.search.SearchQuery query,
            @JsonProperty("sort") final java.util.List<com.commercetools.api.models.search.SearchSorting> sort,
            @JsonProperty("limit") final Integer limit, @JsonProperty("offset") final Integer offset,
            @JsonProperty("markMatchingVariants") final Boolean markMatchingVariants,
            @JsonProperty("productProjectionParameters") final com.commercetools.api.models.product_search.ProductSearchProjectionParams productProjectionParameters,
            @JsonProperty("facets") final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> facets,
            @JsonProperty("postFilter") final com.commercetools.api.models.search.SearchQuery postFilter) {
        this.query = query;
        this.sort = sort;
        this.limit = limit;
        this.offset = offset;
        this.markMatchingVariants = markMatchingVariants;
        this.productProjectionParameters = productProjectionParameters;
        this.facets = facets;
        this.postFilter = postFilter;
    }

    /**
     * create empty instance
     */
    public ProductSearchRequestImpl() {
    }

    /**
     *  <p>The search query against <span>searchable Product fields</span>.</p>
     */

    public com.commercetools.api.models.search.SearchQuery getQuery() {
        return this.query;
    }

    /**
     *  <p>Controls how results to your query are <span>sorted</span>. If not provided, the results are sorted by relevance score in descending order.</p>
     */

    public java.util.List<com.commercetools.api.models.search.SearchSorting> getSort() {
        return this.sort;
    }

    /**
     *  <p>The maximum number of search results to be returned in one <span>page</span>.</p>
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>The number of search results to be skipped in the response for <span>pagination</span>.</p>
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>If <code>query</code> specifies an expression for a Product Variant field, set this to <code>true</code> to get additional information for each returned Product about which Product Variants match the search query. For details, see <span>matching variants</span>.</p>
     */

    public Boolean getMarkMatchingVariants() {
        return this.markMatchingVariants;
    }

    /**
     *  <p>Controls data integration <span>with Product Projection parameters</span>. If not set, the result does not include the Product Projection.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchProjectionParams getProductProjectionParameters() {
        return this.productProjectionParameters;
    }

    /**
     *  <p>Set this field to request <span>facets</span>.</p>
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> getFacets() {
        return this.facets;
    }

    /**
     *  <p>Specify an additional filter on the result of the <code>query</code> after the API calculated <code>facets</code>. This feature assists you in implementing faceted search.</p>
     */

    public com.commercetools.api.models.search.SearchQuery getPostFilter() {
        return this.postFilter;
    }

    public void setQuery(final com.commercetools.api.models.search.SearchQuery query) {
        this.query = query;
    }

    public void setSort(final com.commercetools.api.models.search.SearchSorting... sort) {
        this.sort = new ArrayList<>(Arrays.asList(sort));
    }

    public void setSort(final java.util.List<com.commercetools.api.models.search.SearchSorting> sort) {
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

    public void setProductProjectionParameters(
            final com.commercetools.api.models.product_search.ProductSearchProjectionParams productProjectionParameters) {
        this.productProjectionParameters = productProjectionParameters;
    }

    public void setFacets(final com.commercetools.api.models.product_search.ProductSearchFacetExpression... facets) {
        this.facets = new ArrayList<>(Arrays.asList(facets));
    }

    public void setFacets(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetExpression> facets) {
        this.facets = facets;
    }

    public void setPostFilter(final com.commercetools.api.models.search.SearchQuery postFilter) {
        this.postFilter = postFilter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchRequestImpl that = (ProductSearchRequestImpl) o;

        return new EqualsBuilder().append(query, that.query)
                .append(sort, that.sort)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(markMatchingVariants, that.markMatchingVariants)
                .append(productProjectionParameters, that.productProjectionParameters)
                .append(facets, that.facets)
                .append(postFilter, that.postFilter)
                .append(query, that.query)
                .append(sort, that.sort)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(markMatchingVariants, that.markMatchingVariants)
                .append(productProjectionParameters, that.productProjectionParameters)
                .append(facets, that.facets)
                .append(postFilter, that.postFilter)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(query)
                .append(sort)
                .append(limit)
                .append(offset)
                .append(markMatchingVariants)
                .append(productProjectionParameters)
                .append(facets)
                .append(postFilter)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("query", query)
                .append("sort", sort)
                .append("limit", limit)
                .append("offset", offset)
                .append("markMatchingVariants", markMatchingVariants)
                .append("productProjectionParameters", productProjectionParameters)
                .append("facets", facets)
                .append("postFilter", postFilter)
                .build();
    }

    @Override
    public ProductSearchRequest copyDeep() {
        return ProductSearchRequest.deepCopy(this);
    }
}
