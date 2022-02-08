
package com.commercetools.api.models.product_selection;

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
*  <p><a href="/general-concepts#pagedqueryresult">PagedQueryResult</a> containing an array of <a href="ctp:api:type:AssignedProductSelection">AssignedProductSelection</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AssignedProductSelectionPagedQueryResponseImpl
        implements AssignedProductSelectionPagedQueryResponse, ModelBase {

    private Long limit;

    private Long offset;

    private Long count;

    private Long total;

    private java.util.List<com.commercetools.api.models.product_selection.AssignedProductSelection> results;

    @JsonCreator
    AssignedProductSelectionPagedQueryResponseImpl(@JsonProperty("limit") final Long limit,
            @JsonProperty("offset") final Long offset, @JsonProperty("count") final Long count,
            @JsonProperty("total") final Long total,
            @JsonProperty("results") final java.util.List<com.commercetools.api.models.product_selection.AssignedProductSelection> results) {
        this.limit = limit;
        this.offset = offset;
        this.count = count;
        this.total = total;
        this.results = results;
    }

    public AssignedProductSelectionPagedQueryResponseImpl() {
    }

    /**
    *  <p>Number of results requested in the query request.</p>
    */
    public Long getLimit() {
        return this.limit;
    }

    /**
    *  <p>Offset supplied by the client or the server default.
    *  It is the number of elements skipped, not a page number.</p>
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
    *  <p>Total number of results matching the query.
    *  This number is an estimation that is not <a href="/general-concepts#strong-consistency">strongly consistent</a>.
    *  Unlike other endpoints, the Product Selection endpoint does not return this field by default.
    *  To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>.
    *  When the results are filtered with a <a href="/predicates/query">Query Predicate</a>, <code>total</code> is subject to a <a href="/limits#queries">limit</a>.</p>
    */
    public Long getTotal() {
        return this.total;
    }

    /**
    *  <p>References to Product Selection that are assigned to the Product.</p>
    */
    public java.util.List<com.commercetools.api.models.product_selection.AssignedProductSelection> getResults() {
        return this.results;
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

    public void setResults(final com.commercetools.api.models.product_selection.AssignedProductSelection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(
            final java.util.List<com.commercetools.api.models.product_selection.AssignedProductSelection> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssignedProductSelectionPagedQueryResponseImpl that = (AssignedProductSelectionPagedQueryResponseImpl) o;

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
