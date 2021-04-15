
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelPagedQueryResponseImpl.class)
public interface ChannelPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Channel> {

    @NotNull
    @JsonProperty("limit")
    public Long getLimit();

    @NotNull
    @JsonProperty("count")
    public Long getCount();

    @JsonProperty("total")
    public Long getTotal();

    @NotNull
    @JsonProperty("offset")
    public Long getOffset();

    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Channel> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Channel... results);

    public void setResults(final List<Channel> results);

    public static ChannelPagedQueryResponse of() {
        return new ChannelPagedQueryResponseImpl();
    }

    public static ChannelPagedQueryResponse of(final ChannelPagedQueryResponse template) {
        ChannelPagedQueryResponseImpl instance = new ChannelPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
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
}
