
package com.commercetools.api.models.state;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StatePagedQueryResponseImpl.class)
public interface StatePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<State> {

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
    public List<State> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final State... results);

    public void setResults(final List<State> results);

    public static StatePagedQueryResponse of() {
        return new StatePagedQueryResponseImpl();
    }

    public static StatePagedQueryResponse of(final StatePagedQueryResponse template) {
        StatePagedQueryResponseImpl instance = new StatePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
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
}
