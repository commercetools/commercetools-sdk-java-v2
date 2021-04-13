
package com.commercetools.history.models;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Response to a query request for <a href="#record">Record</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RecordPagedQueryResponseImpl implements RecordPagedQueryResponse {

    private Integer limit;

    private Integer count;

    private Integer total;

    private Integer offset;

    private java.util.List<com.commercetools.history.models.Record> results;

    @JsonCreator
    RecordPagedQueryResponseImpl(@JsonProperty("limit") final Integer limit, @JsonProperty("count") final Integer count,
            @JsonProperty("total") final Integer total, @JsonProperty("offset") final Integer offset,
            @JsonProperty("results") final java.util.List<com.commercetools.history.models.Record> results) {
        this.limit = limit;
        this.count = count;
        this.total = total;
        this.offset = offset;
        this.results = results;
    }

    public RecordPagedQueryResponseImpl() {
    }

    /**
    *  <p>Maximum number of results requested in the query request.</p>
    */
    public Integer getLimit() {
        return this.limit;
    }

    /**
    *  <p>Actual number of results returned.</p>
    */
    public Integer getCount() {
        return this.count;
    }

    /**
    *  <p>Total number of results matching the query.
    *  This number is an estimation and not <a href="/general-concepts#strong-consistency">strongly consistent</a>.</p>
    */
    public Integer getTotal() {
        return this.total;
    }

    /**
    *  <p>The number of elements skipped, not a page number. Supplied by the client or the server default.</p>
    */
    public Integer getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.history.models.Record> getResults() {
        return this.results;
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public void setTotal(final Integer total) {
        this.total = total;
    }

    public void setOffset(final Integer offset) {
        this.offset = offset;
    }

    public void setResults(final com.commercetools.history.models.Record... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(final java.util.List<com.commercetools.history.models.Record> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RecordPagedQueryResponseImpl that = (RecordPagedQueryResponseImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(count, that.count)
                .append(total, that.total)
                .append(offset, that.offset)
                .append(results, that.results)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit)
                .append(count)
                .append(total)
                .append(offset)
                .append(results)
                .toHashCode();
    }

}
