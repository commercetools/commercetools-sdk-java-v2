
package com.commercetools.history.models;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeHistoryPagedQueryResponseImpl.class)
public interface ChangeHistoryPagedQueryResponse {

    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    @NotNull
    @JsonProperty("total")
    public Integer getTotal();

    @NotNull
    @JsonProperty("offset")
    public Integer getOffset();

    @NotNull
    @Valid
    @JsonProperty("results")
    public List<Record> getResults();

    public void setLimit(final Integer limit);

    public void setCount(final Integer count);

    public void setTotal(final Integer total);

    public void setOffset(final Integer offset);

    @JsonIgnore
    public void setResults(final Record... results);

    public void setResults(final List<Record> results);

    public static ChangeHistoryPagedQueryResponse of() {
        return new ChangeHistoryPagedQueryResponseImpl();
    }

    public static ChangeHistoryPagedQueryResponse of(final ChangeHistoryPagedQueryResponse template) {
        ChangeHistoryPagedQueryResponseImpl instance = new ChangeHistoryPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ChangeHistoryPagedQueryResponseBuilder builder() {
        return ChangeHistoryPagedQueryResponseBuilder.of();
    }

    public static ChangeHistoryPagedQueryResponseBuilder builder(final ChangeHistoryPagedQueryResponse template) {
        return ChangeHistoryPagedQueryResponseBuilder.of(template);
    }

    default <T> T withChangeHistoryPagedQueryResponse(Function<ChangeHistoryPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
