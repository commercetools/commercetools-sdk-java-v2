
package com.commercetools.api.models.product;

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
 *  <p>The response returned to a Product Projection Search request. The object contains the query results with Product Projections where at least one ProductVariant matches the search query, as well as the facet results, if requested.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductProjectionPagedSearchResponseImpl implements ProductProjectionPagedSearchResponse, ModelBase {

    private Long limit;

    private Long offset;

    private Long count;

    private Long total;

    private java.util.List<com.commercetools.api.models.product.ProductProjection> results;

    private com.commercetools.api.models.product.FacetResults facets;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductProjectionPagedSearchResponseImpl(@JsonProperty("limit") final Long limit,
            @JsonProperty("offset") final Long offset, @JsonProperty("count") final Long count,
            @JsonProperty("total") final Long total,
            @JsonProperty("results") final java.util.List<com.commercetools.api.models.product.ProductProjection> results,
            @JsonProperty("facets") final com.commercetools.api.models.product.FacetResults facets) {
        this.limit = limit;
        this.offset = offset;
        this.count = count;
        this.total = total;
        this.results = results;
        this.facets = facets;
    }

    /**
     * create empty instance
     */
    public ProductProjectionPagedSearchResponseImpl() {
    }

    /**
     *  <p>The maximum number of results returned on a page.</p>
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>The starting point for the retrieved paginated result.</p>
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query.</p>
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>ProductProjections where at least one ProductVariant matches the search query, provided with the <code>text.{language}</code> and/or <code>filter.query</code> or <code>filter</code> query parameter. If the query parameter <code>markMatchingVariants=true</code> was provided with the request, the matching variants are marked as such.</p>
     */

    public java.util.List<com.commercetools.api.models.product.ProductProjection> getResults() {
        return this.results;
    }

    /**
     *  <p>Facet results for each facet expression specified in the search request.</p>
     *  <p>Only present if at least one <code>facet</code> parameter was provided with the search request.</p>
     */

    public com.commercetools.api.models.product.FacetResults getFacets() {
        return this.facets;
    }

    public void setLimit(final Long limit) {
        this.limit = limit;
    }

    public void setOffset(final Long offset) {
        this.offset = offset;
    }

    public void setCount(final Long count) {
        this.count = count;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    public void setResults(final com.commercetools.api.models.product.ProductProjection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(final java.util.List<com.commercetools.api.models.product.ProductProjection> results) {
        this.results = results;
    }

    public void setFacets(final com.commercetools.api.models.product.FacetResults facets) {
        this.facets = facets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductProjectionPagedSearchResponseImpl that = (ProductProjectionPagedSearchResponseImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(offset, that.offset)
                .append(count, that.count)
                .append(total, that.total)
                .append(results, that.results)
                .append(facets, that.facets)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(count, that.count)
                .append(total, that.total)
                .append(results, that.results)
                .append(facets, that.facets)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit)
                .append(offset)
                .append(count)
                .append(total)
                .append(results)
                .append(facets)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("limit", limit)
                .append("offset", offset)
                .append("count", count)
                .append("total", total)
                .append("results", results)
                .append("facets", facets)
                .build();
    }

}
