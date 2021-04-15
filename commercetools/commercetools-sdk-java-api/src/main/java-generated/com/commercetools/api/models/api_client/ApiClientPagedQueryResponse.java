
package com.commercetools.api.models.api_client;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ApiClientPagedQueryResponseImpl.class)
public interface ApiClientPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<ApiClient> {

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
    public List<ApiClient> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final ApiClient... results);

    public void setResults(final List<ApiClient> results);

    public static ApiClientPagedQueryResponse of() {
        return new ApiClientPagedQueryResponseImpl();
    }

    public static ApiClientPagedQueryResponse of(final ApiClientPagedQueryResponse template) {
        ApiClientPagedQueryResponseImpl instance = new ApiClientPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
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
}
