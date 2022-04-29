
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/general-concepts#pagedqueryresult">PagedQueryResult</a> with <code>results</code> containing an array of <a href="ctp:api:type:State">State</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StatePagedQueryResponseImpl.class)
public interface StatePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<State> {

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
    *  This number is an estimation that is not <a href="/../api/general-concepts#strong-consistency">strongly consistent</a>.
    *  This field is returned by default.
    *  For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>.
    *  When the results are filtered with a <a href="/../api/predicates/query">Query Predicate</a>, <code>total</code> is subject to a <a href="/../api/limits#queries">limit</a>.</p>
    */

    @JsonProperty("total")
    public Long getTotal();

    /**
    *  <p><a href="ctp:api:type:State">States</a> matching the query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<State> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final State... results);

    public void setResults(final List<State> results);

    public static StatePagedQueryResponse of() {
        return new StatePagedQueryResponseImpl();
    }

    public static StatePagedQueryResponse of(final StatePagedQueryResponse template) {
        StatePagedQueryResponseImpl instance = new StatePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static StatePagedQueryResponseBuilder builder() {
        return StatePagedQueryResponseBuilder.of();
    }

    public static StatePagedQueryResponseBuilder builder(final StatePagedQueryResponse template) {
        return StatePagedQueryResponseBuilder.of(template);
    }

    default <T> T withStatePagedQueryResponse(Function<StatePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StatePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StatePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<StatePagedQueryResponse>";
            }
        };
    }
}
