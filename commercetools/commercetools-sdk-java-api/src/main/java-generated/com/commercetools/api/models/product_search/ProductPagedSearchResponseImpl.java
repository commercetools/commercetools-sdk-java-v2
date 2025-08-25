
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
 * ProductPagedSearchResponse
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPagedSearchResponseImpl implements ProductPagedSearchResponse, ModelBase {

    private Long total;

    private Integer offset;

    private Integer limit;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResult> facets;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchResult> results;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPagedSearchResponseImpl(@JsonProperty("total") final Long total,
            @JsonProperty("offset") final Integer offset, @JsonProperty("limit") final Integer limit,
            @JsonProperty("facets") final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResult> facets,
            @JsonProperty("results") final java.util.List<com.commercetools.api.models.product_search.ProductSearchResult> results) {
        this.total = total;
        this.offset = offset;
        this.limit = limit;
        this.facets = facets;
        this.results = results;
    }

    /**
     * create empty instance
     */
    public ProductPagedSearchResponseImpl() {
    }

    /**
     *  <p>Total number of results matching the query.</p>
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     */

    public Integer getOffset() {
        return this.offset;
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Results for <span>facets</span> when requested.</p>
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResult> getFacets() {
        return this.facets;
    }

    /**
     *  <p>Search result containing the Products matching the search query.</p>
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchResult> getResults() {
        return this.results;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    public void setOffset(final Integer offset) {
        this.offset = offset;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setFacets(final com.commercetools.api.models.product_search.ProductSearchFacetResult... facets) {
        this.facets = new ArrayList<>(Arrays.asList(facets));
    }

    public void setFacets(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResult> facets) {
        this.facets = facets;
    }

    public void setResults(final com.commercetools.api.models.product_search.ProductSearchResult... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPagedSearchResponseImpl that = (ProductPagedSearchResponseImpl) o;

        return new EqualsBuilder().append(total, that.total)
                .append(offset, that.offset)
                .append(limit, that.limit)
                .append(facets, that.facets)
                .append(results, that.results)
                .append(total, that.total)
                .append(offset, that.offset)
                .append(limit, that.limit)
                .append(facets, that.facets)
                .append(results, that.results)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(total)
                .append(offset)
                .append(limit)
                .append(facets)
                .append(results)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("total", total)
                .append("offset", offset)
                .append("limit", limit)
                .append("facets", facets)
                .append("results", results)
                .build();
    }

    @Override
    public ProductPagedSearchResponse copyDeep() {
        return ProductPagedSearchResponse.deepCopy(this);
    }
}
