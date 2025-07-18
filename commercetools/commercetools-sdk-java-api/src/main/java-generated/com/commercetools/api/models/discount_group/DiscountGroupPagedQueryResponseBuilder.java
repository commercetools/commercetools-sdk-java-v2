
package com.commercetools.api.models.discount_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupPagedQueryResponse discountGroupPagedQueryResponse = DiscountGroupPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupPagedQueryResponseBuilder implements Builder<DiscountGroupPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.discount_group.DiscountGroup> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>DiscountGroups matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder results(
            final com.commercetools.api.models.discount_group.DiscountGroup... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>DiscountGroups matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.discount_group.DiscountGroup> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>DiscountGroups matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.discount_group.DiscountGroup... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>DiscountGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.discount_group.DiscountGroupBuilder, com.commercetools.api.models.discount_group.DiscountGroupBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.discount_group.DiscountGroupBuilder.of()).build());
        return this;
    }

    /**
     *  <p>DiscountGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.discount_group.DiscountGroupBuilder, com.commercetools.api.models.discount_group.DiscountGroupBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.discount_group.DiscountGroupBuilder.of()).build());
        return this;
    }

    /**
     *  <p>DiscountGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.discount_group.DiscountGroupBuilder, com.commercetools.api.models.discount_group.DiscountGroup> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.discount_group.DiscountGroupBuilder.of()));
    }

    /**
     *  <p>DiscountGroups matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public DiscountGroupPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.discount_group.DiscountGroupBuilder, com.commercetools.api.models.discount_group.DiscountGroup> builder) {
        return results(builder.apply(com.commercetools.api.models.discount_group.DiscountGroupBuilder.of()));
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
     *  <p>DiscountGroups matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.discount_group.DiscountGroup> getResults() {
        return this.results;
    }

    /**
     * builds DiscountGroupPagedQueryResponse with checking for non-null required values
     * @return DiscountGroupPagedQueryResponse
     */
    public DiscountGroupPagedQueryResponse build() {
        Objects.requireNonNull(limit, DiscountGroupPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, DiscountGroupPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, DiscountGroupPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, DiscountGroupPagedQueryResponse.class + ": results is missing");
        return new DiscountGroupPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds DiscountGroupPagedQueryResponse without checking for non-null required values
     * @return DiscountGroupPagedQueryResponse
     */
    public DiscountGroupPagedQueryResponse buildUnchecked() {
        return new DiscountGroupPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of DiscountGroupPagedQueryResponseBuilder
     * @return builder
     */
    public static DiscountGroupPagedQueryResponseBuilder of() {
        return new DiscountGroupPagedQueryResponseBuilder();
    }

    /**
     * create builder for DiscountGroupPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupPagedQueryResponseBuilder of(final DiscountGroupPagedQueryResponse template) {
        DiscountGroupPagedQueryResponseBuilder builder = new DiscountGroupPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
