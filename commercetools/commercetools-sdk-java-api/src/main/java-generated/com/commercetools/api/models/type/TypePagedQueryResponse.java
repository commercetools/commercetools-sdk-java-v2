
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypePagedQueryResponseImpl.class)
public interface TypePagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Type> {

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
    public List<Type> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Type... results);

    public void setResults(final List<Type> results);

    public static TypePagedQueryResponse of() {
        return new TypePagedQueryResponseImpl();
    }

    public static TypePagedQueryResponse of(final TypePagedQueryResponse template) {
        TypePagedQueryResponseImpl instance = new TypePagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static TypePagedQueryResponseBuilder builder() {
        return TypePagedQueryResponseBuilder.of();
    }

    public static TypePagedQueryResponseBuilder builder(final TypePagedQueryResponse template) {
        return TypePagedQueryResponseBuilder.of(template);
    }

    default <T> T withTypePagedQueryResponse(Function<TypePagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
