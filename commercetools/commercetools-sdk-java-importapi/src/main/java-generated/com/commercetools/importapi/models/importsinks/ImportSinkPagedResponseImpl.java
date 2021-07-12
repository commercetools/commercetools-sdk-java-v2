
package com.commercetools.importapi.models.importsinks;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p><a href="/../api/general-concepts#pagedqueryresult">PagedQueryResult</a> for <a href="#importsink">ImportSinks</a>.
*  Used as a response to a query request for <a href="#importsink">ImportSinks</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportSinkPagedResponseImpl implements ImportSinkPagedResponse {

    private Integer limit;

    private Long offset;

    private Long count;

    private Long total;

    private java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> results;

    @JsonCreator
    ImportSinkPagedResponseImpl(@JsonProperty("limit") final Integer limit, @JsonProperty("offset") final Long offset,
            @JsonProperty("count") final Long count, @JsonProperty("total") final Long total,
            @JsonProperty("results") final java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> results) {
        this.limit = limit;
        this.offset = offset;
        this.count = count;
        this.total = total;
        this.results = results;
    }

    public ImportSinkPagedResponseImpl() {
    }

    /**
    *  <p>The number of results requested in the query request.</p>
    */
    public Integer getLimit() {
        return this.limit;
    }

    /**
    *  <p>The number of elements skipped, not a page number.
    *  Supplied by the client or the server default.</p>
    */
    public Long getOffset() {
        return this.offset;
    }

    /**
    *  <p>The actual number of results returned.</p>
    */
    public Long getCount() {
        return this.count;
    }

    /**
    *  <p>The total number of results matching the query.</p>
    */
    public Long getTotal() {
        return this.total;
    }

    /**
    *  <p>The array of Import Sinks matching the query.</p>
    */
    public java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> getResults() {
        return this.results;
    }

    public void setLimit(final Integer limit) {
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

    public void setResults(final com.commercetools.importapi.models.importsinks.ImportSink... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(final java.util.List<com.commercetools.importapi.models.importsinks.ImportSink> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportSinkPagedResponseImpl that = (ImportSinkPagedResponseImpl) o;

        return new EqualsBuilder().append(limit, that.limit)
                .append(offset, that.offset)
                .append(count, that.count)
                .append(total, that.total)
                .append(results, that.results)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit)
                .append(offset)
                .append(count)
                .append(total)
                .append(results)
                .toHashCode();
    }

}
