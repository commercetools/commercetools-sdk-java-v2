
package com.commercetools.api.models.customer_search;

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
 * CustomerSearchRequest
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSearchRequestImpl implements CustomerSearchRequest, ModelBase {

    private com.commercetools.api.models.search.SearchQuery query;

    private java.util.List<com.commercetools.api.models.search.SearchSorting> sort;

    private Integer limit;

    private Integer offset;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerSearchRequestImpl(@JsonProperty("query") final com.commercetools.api.models.search.SearchQuery query,
            @JsonProperty("sort") final java.util.List<com.commercetools.api.models.search.SearchSorting> sort,
            @JsonProperty("limit") final Integer limit, @JsonProperty("offset") final Integer offset) {
        this.query = query;
        this.sort = sort;
        this.limit = limit;
        this.offset = offset;
    }

    /**
     * create empty instance
     */
    public CustomerSearchRequestImpl() {
    }

    /**
     *  <p>The Customer search query.</p>
     */

    public com.commercetools.api.models.search.SearchQuery getQuery() {
        return this.query;
    }

    /**
     *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
     */

    public java.util.List<com.commercetools.api.models.search.SearchSorting> getSort() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerSearchRequestImpl that = (CustomerSearchRequestImpl) o;

        return new EqualsBuilder().append(query, that.query)
                .append(sort, that.sort)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .append(query, that.query)
                .append(sort, that.sort)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(query).append(sort).append(limit).append(offset).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("query", query)
                .append("sort", sort)
                .append("limit", limit)
                .append("offset", offset)
                .build();
    }

    @Override
    public CustomerSearchRequest copyDeep() {
        return CustomerSearchRequest.deepCopy(this);
    }
}
