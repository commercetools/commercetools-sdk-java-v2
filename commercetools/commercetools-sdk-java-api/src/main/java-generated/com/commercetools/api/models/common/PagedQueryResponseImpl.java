
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * PagedQueryResponse
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PagedQueryResponseImpl implements PagedQueryResponse, ModelBase {

    private Long limit;

    private Long offset;

    private Long count;

    private Long total;

    private java.util.List<com.commercetools.api.models.common.BaseResource> results;

    private java.lang.Object meta;

    @JsonCreator
    PagedQueryResponseImpl(@JsonProperty("limit") final Long limit, @JsonProperty("offset") final Long offset,
            @JsonProperty("count") final Long count, @JsonProperty("total") final Long total,
            @JsonProperty("results") final java.util.List<com.commercetools.api.models.common.BaseResource> results,
            @JsonProperty("meta") final java.lang.Object meta) {
        this.limit = limit;
        this.offset = offset;
        this.count = count;
        this.total = total;
        this.results = results;
        this.meta = meta;
    }

    public PagedQueryResponseImpl() {
    }

    /**
     <*  <p>Number of results requested.</p>>
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     <*  <p>Number of elements skipped.</p>>
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     <*  <p>Actual number of results returned.</p>>
     */

    public Long getCount() {
        return this.count;
    }

    /**
     <*  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>>
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     <>
     */

    public java.util.List<com.commercetools.api.models.common.BaseResource> getResults() {
        return this.results;
    }

    /**
     <>
     */

    public java.lang.Object getMeta() {
        return this.meta;
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

    public void setResults(final com.commercetools.api.models.common.BaseResource... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(final java.util.List<com.commercetools.api.models.common.BaseResource> results) {
        this.results = results;
    }

    public void setMeta(final java.lang.Object meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PagedQueryResponseImpl that = (PagedQueryResponseImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(offset, that.offset)
                .append(count, that.count)
                .append(total, that.total)
                .append(results, that.results)
                .append(meta, that.meta)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit)
                .append(offset)
                .append(count)
                .append(total)
                .append(results)
                .append(meta)
                .toHashCode();
    }

}
