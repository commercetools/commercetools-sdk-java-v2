
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShoppingListPagedQueryResponseBuilder {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingList> results;

    public ShoppingListPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public ShoppingListPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ShoppingListPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public ShoppingListPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ShoppingListPagedQueryResponseBuilder results(
            final com.commercetools.api.models.shopping_list.ShoppingList... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ShoppingListPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.shopping_list.ShoppingList> results) {
        this.results = results;
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingList> getResults() {
        return this.results;
    }

    public ShoppingListPagedQueryResponse build() {
        return new ShoppingListPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static ShoppingListPagedQueryResponseBuilder of() {
        return new ShoppingListPagedQueryResponseBuilder();
    }

    public static ShoppingListPagedQueryResponseBuilder of(final ShoppingListPagedQueryResponse template) {
        ShoppingListPagedQueryResponseBuilder builder = new ShoppingListPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
