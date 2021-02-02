
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryPagedQueryResponseImpl.class)
public interface CategoryPagedQueryResponse extends com.commercetools.api.models.ResourcePagedQueryResponse<Category> {

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
    public List<Category> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final Category... results);

    public void setResults(final List<Category> results);

    public static CategoryPagedQueryResponse of() {
        return new CategoryPagedQueryResponseImpl();
    }

    public static CategoryPagedQueryResponse of(final CategoryPagedQueryResponse template) {
        CategoryPagedQueryResponseImpl instance = new CategoryPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static CategoryPagedQueryResponseBuilder builder() {
        return CategoryPagedQueryResponseBuilder.of();
    }

    public static CategoryPagedQueryResponseBuilder builder(final CategoryPagedQueryResponse template) {
        return CategoryPagedQueryResponseBuilder.of(template);
    }

    default <T> T withCategoryPagedQueryResponse(Function<CategoryPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
