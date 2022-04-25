
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StorePagedQueryResponseImpl.class)
public interface StorePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Store> {

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
    public List<Store> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Store... results);

    public void setResults(final List<Store> results);

    public static StorePagedQueryResponse of() {
        return new StorePagedQueryResponseImpl();
    }

    public static StorePagedQueryResponse of(final StorePagedQueryResponse template) {
        StorePagedQueryResponseImpl instance = new StorePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static StorePagedQueryResponseBuilder builder() {
        return StorePagedQueryResponseBuilder.of();
    }

    public static StorePagedQueryResponseBuilder builder(final StorePagedQueryResponse template) {
        return StorePagedQueryResponseBuilder.of(template);
    }

    default <T> T withStorePagedQueryResponse(Function<StorePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StorePagedQueryResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StorePagedQueryResponse>() {
            @Override
            public String toString() {
                return "TypeReference<StorePagedQueryResponse>";
            }
        };
    }
}
