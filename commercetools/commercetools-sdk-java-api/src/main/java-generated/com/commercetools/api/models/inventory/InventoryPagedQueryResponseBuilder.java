
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
     * @param limit value to be set
     * @return Builder
     */

    public InventoryPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public InventoryPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public InventoryPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public InventoryPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public InventoryPagedQueryResponseBuilder results(
            final com.commercetools.api.models.inventory.InventoryEntry... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public InventoryPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.inventory.InventoryEntry> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     * @param results value to be set
     * @return Builder
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
     * @param builder function to build the results value
     * @return Builder
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
     * @param builder function to build the results value
     * @return Builder
     */

    public InventoryPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public InventoryPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntry> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()));
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public InventoryPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntry> builder) {
        return results(builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()));
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Inventory entries matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.inventory.InventoryEntry> getResults() {
        return this.results;
    }

    /**
     * builds InventoryPagedQueryResponse with checking for non-null required values
     * @return InventoryPagedQueryResponse
     */
    public InventoryPagedQueryResponse build() {
        Objects.requireNonNull(limit, InventoryPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, InventoryPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, InventoryPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, InventoryPagedQueryResponse.class + ": results is missing");
        return new InventoryPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds InventoryPagedQueryResponse without checking for non-null required values
     * @return InventoryPagedQueryResponse
     */
    public InventoryPagedQueryResponse buildUnchecked() {
        return new InventoryPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of InventoryPagedQueryResponseBuilder
     * @return builder
     */
    public static InventoryPagedQueryResponseBuilder of() {
        return new InventoryPagedQueryResponseBuilder();
    }

    /**
     * create builder for InventoryPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
