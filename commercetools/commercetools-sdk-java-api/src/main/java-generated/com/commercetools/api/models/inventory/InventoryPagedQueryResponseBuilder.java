
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryPagedQueryResponse inventoryPagedQueryResponse = InventoryPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryPagedQueryResponseBuilder implements Builder<InventoryPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.inventory.InventoryEntry> results;

    /**
     *  <p>Number of results requested.</p>
     */

    public InventoryPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public InventoryPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     */

    public InventoryPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     */

    public InventoryPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     */

    public InventoryPagedQueryResponseBuilder results(
            final com.commercetools.api.models.inventory.InventoryEntry... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     */

    public InventoryPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.inventory.InventoryEntry> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     */

    public InventoryPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.inventory.InventoryEntry... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     */

    public InventoryPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     */

    public InventoryPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build());
        return this;
    }

    public Long getLimit() {
        return this.limit;
    }

    public Long getOffset() {
        return this.offset;
    }

    public Long getCount() {
        return this.count;
    }

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    public java.util.List<com.commercetools.api.models.inventory.InventoryEntry> getResults() {
        return this.results;
    }

    public InventoryPagedQueryResponse build() {
        Objects.requireNonNull(limit, InventoryPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, InventoryPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, InventoryPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, InventoryPagedQueryResponse.class + ": results is missing");
        return new InventoryPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds InventoryPagedQueryResponse without checking for non null required values
     */
    public InventoryPagedQueryResponse buildUnchecked() {
        return new InventoryPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    public static InventoryPagedQueryResponseBuilder of() {
        return new InventoryPagedQueryResponseBuilder();
    }

    public static InventoryPagedQueryResponseBuilder of(final InventoryPagedQueryResponse template) {
        InventoryPagedQueryResponseBuilder builder = new InventoryPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
