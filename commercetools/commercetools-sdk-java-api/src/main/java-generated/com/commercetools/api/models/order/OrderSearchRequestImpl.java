
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSearchRequestImpl implements OrderSearchRequest, ModelBase {

    private com.commercetools.api.models.order.OrderSearchQuery query;

    private String sort;

    private Integer limit;

    private Integer offset;

    @JsonCreator
    OrderSearchRequestImpl(@JsonProperty("query") final com.commercetools.api.models.order.OrderSearchQuery query,
            @JsonProperty("sort") final String sort, @JsonProperty("limit") final Integer limit,
            @JsonProperty("offset") final Integer offset) {
        this.query = query;
        this.sort = sort;
        this.limit = limit;
        this.offset = offset;
    }

    public OrderSearchRequestImpl() {
    }

    /**
    *  <p>The Order search query.</p>
    */
    public com.commercetools.api.models.order.OrderSearchQuery getQuery() {
        return this.query;
    }

    /**
    *  <p>Controls how results to your query are sorted. If not provided, the results are sorted by relevance in descending order.</p>
    */
    public String getSort() {
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

    public void setQuery(final com.commercetools.api.models.order.OrderSearchQuery query) {
        this.query = query;
    }

    public void setSort(final String sort) {
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

        OrderSearchRequestImpl that = (OrderSearchRequestImpl) o;

        return new EqualsBuilder().append(query, that.query)
                .append(sort, that.sort)
                .append(limit, that.limit)
                .append(offset, that.offset)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(query).append(sort).append(limit).append(offset).toHashCode();
    }

}
