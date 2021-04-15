
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomObjectPagedQueryResponseImpl.class)
public interface CustomObjectPagedQueryResponse
        extends com.commercetools.api.models.ResourcePagedQueryResponse<CustomObject> {

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
    public List<CustomObject> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final CustomObject... results);

    public void setResults(final List<CustomObject> results);

    public static CustomObjectPagedQueryResponse of() {
        return new CustomObjectPagedQueryResponseImpl();
    }

    public static CustomObjectPagedQueryResponse of(final CustomObjectPagedQueryResponse template) {
        CustomObjectPagedQueryResponseImpl instance = new CustomObjectPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static CustomObjectPagedQueryResponseBuilder builder() {
        return CustomObjectPagedQueryResponseBuilder.of();
    }

    public static CustomObjectPagedQueryResponseBuilder builder(final CustomObjectPagedQueryResponse template) {
        return CustomObjectPagedQueryResponseBuilder.of(template);
    }

    default <T> T withCustomObjectPagedQueryResponse(Function<CustomObjectPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
