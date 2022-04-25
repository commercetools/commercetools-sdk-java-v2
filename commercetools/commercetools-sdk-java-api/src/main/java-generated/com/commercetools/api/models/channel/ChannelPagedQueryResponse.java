
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/general-concepts#pagedqueryresult">PagedQueryResult</a> with results containing an array of <a href="ctp:api:type:Channel">Channel</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelPagedQueryResponseImpl.class)
public interface ChannelPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Channel> {

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
    *  <p><a href="ctp:api:type:Channel">Channels</a> matching the query.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Channel> getResults();

    public void setLimit(final Long limit);

    public void setOffset(final Long offset);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    @JsonIgnore
    public void setResults(final Channel... results);

    public void setResults(final List<Channel> results);

    public static ChannelPagedQueryResponse of() {
        return new ChannelPagedQueryResponseImpl();
    }

    public static ChannelPagedQueryResponse of(final ChannelPagedQueryResponse template) {
        ChannelPagedQueryResponseImpl instance = new ChannelPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setOffset(template.getOffset());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ChannelPagedQueryResponseBuilder builder() {
        return ChannelPagedQueryResponseBuilder.of();
    }

    public static ChannelPagedQueryResponseBuilder builder(final ChannelPagedQueryResponse template) {
        return ChannelPagedQueryResponseBuilder.of(template);
    }

    default <T> T withChannelPagedQueryResponse(Function<ChannelPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelPagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelPagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelPagedQueryResponse>";
            }
        };
    }
}
