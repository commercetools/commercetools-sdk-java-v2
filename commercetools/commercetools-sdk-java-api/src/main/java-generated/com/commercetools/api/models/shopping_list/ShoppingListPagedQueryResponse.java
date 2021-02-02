
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListPagedQueryResponseImpl.class)
public interface ShoppingListPagedQueryResponse {

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
    public List<ShoppingList> getResults();

    public void setLimit(final Long limit);

    public void setCount(final Long count);

    public void setTotal(final Long total);

    public void setOffset(final Long offset);

    @JsonIgnore
    public void setResults(final ShoppingList... results);

    public void setResults(final List<ShoppingList> results);

    public static ShoppingListPagedQueryResponse of() {
        return new ShoppingListPagedQueryResponseImpl();
    }

    public static ShoppingListPagedQueryResponse of(final ShoppingListPagedQueryResponse template) {
        ShoppingListPagedQueryResponseImpl instance = new ShoppingListPagedQueryResponseImpl();
        instance.setLimit(template.getLimit());
        instance.setCount(template.getCount());
        instance.setTotal(template.getTotal());
        instance.setOffset(template.getOffset());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ShoppingListPagedQueryResponseBuilder builder() {
        return ShoppingListPagedQueryResponseBuilder.of();
    }

    public static ShoppingListPagedQueryResponseBuilder builder(final ShoppingListPagedQueryResponse template) {
        return ShoppingListPagedQueryResponseBuilder.of(template);
    }

    default <T> T withShoppingListPagedQueryResponse(Function<ShoppingListPagedQueryResponse, T> helper) {
        return helper.apply(this);
    }
}
