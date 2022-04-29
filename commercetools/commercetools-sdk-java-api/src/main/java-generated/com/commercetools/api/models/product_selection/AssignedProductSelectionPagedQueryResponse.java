
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/general-concepts#pagedqueryresult">PagedQueryResult</a> containing an array of <a href="ctp:api:type:AssignedProductSelection">AssignedProductSelection</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AssignedProductSelectionPagedQueryResponseImpl.class)
public interface AssignedProductSelectionPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<AssignedProductSelection> {

    /**
    *  <p>Number of results requested in the query request.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
    *  <p>Offset supplied by the client or the server default.
    *  It is the number of elements skipped, not a page number.</p>
    */
    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    /**
    *  <p>Actual number of results returned.</p>
    */
    @NotNull
    @JsonProperty("count")
    public Long getCount();

    /**
    *  <p>Total number of results matching the query.
    *  This number is an estimation that is not <a href="/general-concepts#strong-consistency">strongly consistent</a>.
    *  Unlike other endpoints, the Product Selection endpoint does not return this field by default.
    *  To get <code>total</code>, pass the query parameter <code>withTotal</code> set to <code>true</code>.
    *  When the results are filtered with a <a href="/predicates/query">Query Predicate</a>, <code>total</code> is subject to a <a href="/limits#queries">limit</a>.</p>
    */

    @JsonProperty("total")
    public Long getTotal();

    /**
    *  <p>References to Product Selection that are assigned to the Product.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<AssignedProductSelection> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final AssignedProductSelection... results);

    public void setResults(final List<AssignedProductSelection> results);

    public static AssignedProductSelectionPagedQueryResponse of() {
        return new AssignedProductSelectionPagedQueryResponseImpl();
    }

    public static AssignedProductSelectionPagedQueryResponse of(
            final AssignedProductSelectionPagedQueryResponse template) {
        AssignedProductSelectionPagedQueryResponseImpl instance = new AssignedProductSelectionPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static AssignedProductSelectionPagedQueryResponseBuilder builder() {
        return AssignedProductSelectionPagedQueryResponseBuilder.of();
    }

    public static AssignedProductSelectionPagedQueryResponseBuilder builder(
            final AssignedProductSelectionPagedQueryResponse template) {
        return AssignedProductSelectionPagedQueryResponseBuilder.of(template);
    }

    default <T> T withAssignedProductSelectionPagedQueryResponse(
            Function<AssignedProductSelectionPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AssignedProductSelectionPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssignedProductSelectionPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<AssignedProductSelectionPagedQueryResponse>";
            }
        };
    }
}
