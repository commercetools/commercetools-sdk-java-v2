
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
public class OrderPagedSearchResponseImpl implements OrderPagedSearchResponse, ModelBase {

    private Long total;

    private Long offset;

    private Long limit;

    private java.util.List<com.commercetools.api.models.order.Hit> hits;

    @JsonCreator
    OrderPagedSearchResponseImpl(@JsonProperty("total") final Long total, @JsonProperty("offset") final Long offset,
            @JsonProperty("limit") final Long limit,
            @JsonProperty("hits") final java.util.List<com.commercetools.api.models.order.Hit> hits) {
        this.total = total;
        this.offset = offset;
        this.limit = limit;
        this.hits = hits;
    }

    public OrderPagedSearchResponseImpl() {
    }

    /**
    *  <p>Total number of results matching the query.</p>
    */
    public Long getTotal() {
        return this.total;
    }

    /**
    *  <p>Number of results skipped, used for pagination.</p>
    */
    public Long getOffset() {
        return this.offset;
    }

    /**
    *  <p>Number of results the response should contain at maximum, used for pagination.</p>
    */
    public Long getLimit() {
        return this.limit;
    }

    /**
    *  <p>Actual results.</p>
    */
    public java.util.List<com.commercetools.api.models.order.Hit> getHits() {
        return this.hits;
    }

    public void setTotal(final Long total) {
        this.total = total;
    }

    public void setOffset(final Long offset) {
        this.offset = offset;
    }

    public void setLimit(final Long limit) {
        this.limit = limit;
    }

    public void setHits(final com.commercetools.api.models.order.Hit... hits) {
        this.hits = new ArrayList<>(Arrays.asList(hits));
    }

    public void setHits(final java.util.List<com.commercetools.api.models.order.Hit> hits) {
        this.hits = hits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderPagedSearchResponseImpl that = (OrderPagedSearchResponseImpl) o;

        return new EqualsBuilder().append(total, that.total)
                .append(offset, that.offset)
                .append(limit, that.limit)
                .append(hits, that.hits)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(total).append(offset).append(limit).append(hits).toHashCode();
    }

}
