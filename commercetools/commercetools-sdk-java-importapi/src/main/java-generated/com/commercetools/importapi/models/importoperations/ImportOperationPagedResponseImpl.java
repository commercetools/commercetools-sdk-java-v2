
package com.commercetools.importapi.models.importoperations;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>This type represents a paged import operation result.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ImportOperationPagedResponseImpl implements ImportOperationPagedResponse {

    private Integer limit;

    private Long offset;

    private Long count;

    private java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> results;

    @JsonCreator
    ImportOperationPagedResponseImpl(@JsonProperty("limit") final Integer limit,
            @JsonProperty("offset") final Long offset, @JsonProperty("count") final Long count,
            @JsonProperty("results") final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> results) {
        this.limit = limit;
        this.offset = offset;
        this.count = count;
        this.results = results;
    }

    public ImportOperationPagedResponseImpl() {
    }

    /**
    *  <p>The maximum number of import operations returned for a page.</p>
    */
    public Integer getLimit() {
        return this.limit;
    }

    /**
    *  <p>The offset supplied by the client or the server default. It is the number of elements skipped.</p>
    */
    public Long getOffset() {
        return this.offset;
    }

    /**
    *  <p>The actual number of results returned by this response.</p>
    */
    public Long getCount() {
        return this.count;
    }

    /**
    *  <p>The results for this paged response.</p>
    */
    public java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> getResults() {
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

    public void setResults(final com.commercetools.importapi.models.importoperations.ImportOperation... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(
            final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImportOperationPagedResponseImpl that = (ImportOperationPagedResponseImpl) o;

        return new EqualsBuilder().append(limit, that.limit).append(offset, that.offset).append(count,
            that.count).append(results, that.results).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(limit).append(offset).append(count).append(results).toHashCode();
    }

}
