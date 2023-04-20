
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListPagedQueryResponse shoppingListPagedQueryResponse = ShoppingListPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListPagedQueryResponseBuilder implements Builder<ShoppingListPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.shopping_list.ShoppingList> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>ShoppingLists matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder results(
            final com.commercetools.api.models.shopping_list.ShoppingList... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ShoppingLists matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.shopping_list.ShoppingList> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>ShoppingLists matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.shopping_list.ShoppingList... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>ShoppingLists matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.shopping_list.ShoppingListBuilder, com.commercetools.api.models.shopping_list.ShoppingListBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.shopping_list.ShoppingListBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ShoppingLists matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.shopping_list.ShoppingListBuilder, com.commercetools.api.models.shopping_list.ShoppingListBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.shopping_list.ShoppingListBuilder.of()).build());
        return this;
    }

    /**
     *  <p>ShoppingLists matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.shopping_list.ShoppingListBuilder, com.commercetools.api.models.shopping_list.ShoppingList> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.shopping_list.ShoppingListBuilder.of()));
    }

    /**
     *  <p>ShoppingLists matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ShoppingListPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.shopping_list.ShoppingListBuilder, com.commercetools.api.models.shopping_list.ShoppingList> builder) {
        return results(builder.apply(com.commercetools.api.models.shopping_list.ShoppingListBuilder.of()));
    }

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
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
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p>ShoppingLists matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.shopping_list.ShoppingList> getResults() {
        return this.results;
    }

    /**
     * builds ShoppingListPagedQueryResponse with checking for non-null required values
     * @return ShoppingListPagedQueryResponse
     */
    public ShoppingListPagedQueryResponse build() {
        Objects.requireNonNull(limit, ShoppingListPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ShoppingListPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ShoppingListPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ShoppingListPagedQueryResponse.class + ": results is missing");
        return new ShoppingListPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ShoppingListPagedQueryResponse without checking for non-null required values
     * @return ShoppingListPagedQueryResponse
     */
    public ShoppingListPagedQueryResponse buildUnchecked() {
        return new ShoppingListPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * factory method for an instance of ShoppingListPagedQueryResponseBuilder
     * @return builder
     */
    public static ShoppingListPagedQueryResponseBuilder of() {
        return new ShoppingListPagedQueryResponseBuilder();
    }

    /**
     * create builder for ShoppingListPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
