
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StandalonePricePagedQueryResponseImpl.class)
public interface StandalonePricePagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<StandalonePrice> {

    /**
    *  <p>Number of requested results.</p>
    */
    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    /**
    *  <p>Offset supplied by the client or server default. It is the number of elements skipped, not a page number.</p>
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
    *  <p><a href="ctp:api:type:StandalonePrice">StandalonePrices</a> matching the query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<StandalonePrice> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final StandalonePrice... results);

    public void setResults(final List<StandalonePrice> results);

    public static StandalonePricePagedQueryResponse of() {
        return new StandalonePricePagedQueryResponseImpl();
    }

    public static StandalonePricePagedQueryResponse of(final StandalonePricePagedQueryResponse template) {
        StandalonePricePagedQueryResponseImpl instance = new StandalonePricePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static StandalonePricePagedQueryResponseBuilder builder() {
        return StandalonePricePagedQueryResponseBuilder.of();
    }

    public static StandalonePricePagedQueryResponseBuilder builder(final StandalonePricePagedQueryResponse template) {
        return StandalonePricePagedQueryResponseBuilder.of(template);
    }

    default <T> T withStandalonePricePagedQueryResponse(Function<StandalonePricePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePricePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePricePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePricePagedQueryResponse>";
            }
        };
    }
}
