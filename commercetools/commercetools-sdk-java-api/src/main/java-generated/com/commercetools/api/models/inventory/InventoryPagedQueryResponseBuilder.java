
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class InventoryPagedQueryResponseBuilder implements Builder<InventoryPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.inventory.InventoryEntry> results;

    public InventoryPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    public InventoryPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public InventoryPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    public InventoryPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public InventoryPagedQueryResponseBuilder results(
            final com.commercetools.api.models.inventory.InventoryEntry... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public InventoryPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.inventory.InventoryEntry> results) {
        this.results = results;
        return this;
    }

    public InventoryPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.inventory.InventoryEntry... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public InventoryPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build());
        return this;
    }

    public InventoryPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build());
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

    public java.util.List<com.commercetools.api.models.inventory.InventoryEntry> getResults() {
        return this.results;
    }

    public InventoryPagedQueryResponse build() {
        Objects.requireNonNull(limit, InventoryPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, InventoryPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, InventoryPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, InventoryPagedQueryResponse.class + ": results is missing");
        return new InventoryPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds InventoryPagedQueryResponse without checking for non null required values
     */
    public InventoryPagedQueryResponse buildUnchecked() {
        return new InventoryPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    public static InventoryPagedQueryResponseBuilder of() {
        return new InventoryPagedQueryResponseBuilder();
    }

    public static InventoryPagedQueryResponseBuilder of(final InventoryPagedQueryResponse template) {
        InventoryPagedQueryResponseBuilder builder = new InventoryPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
