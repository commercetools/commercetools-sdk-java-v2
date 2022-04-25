
package com.commercetools.api.models.api_client;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/general-concepts#pagedqueryresult">PagedQueryResult</a> with <code>results</code> containing an array of <a href="ctp:api:type:ApiClient">APIClient</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ApiClientPagedQueryResponseImpl.class)
public interface ApiClientPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ApiClient> {

    /**
    *  <p>Number of results requested in the query request.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
    *  <p>Offset supplied by the client or server default.
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
    *  <p>API Clients matching the query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ApiClient> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final ApiClient... results);

    public void setResults(final List<ApiClient> results);

    public static ApiClientPagedQueryResponse of() {
        return new ApiClientPagedQueryResponseImpl();
    }

    public static ApiClientPagedQueryResponse of(final ApiClientPagedQueryResponse template) {
        ApiClientPagedQueryResponseImpl instance = new ApiClientPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ApiClientPagedQueryResponseBuilder builder() {
        return ApiClientPagedQueryResponseBuilder.of();
    }

    public static ApiClientPagedQueryResponseBuilder builder(final ApiClientPagedQueryResponse template) {
        return ApiClientPagedQueryResponseBuilder.of(template);
    }

    default <T> T withApiClientPagedQueryResponse(Function<ApiClientPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ApiClientPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApiClientPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ApiClientPagedQueryResponse>";
            }
        };
    }
}
