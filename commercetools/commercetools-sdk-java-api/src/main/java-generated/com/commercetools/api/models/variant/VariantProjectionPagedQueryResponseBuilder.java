
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantProjectionPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantProjectionPagedQueryResponse variantProjectionPagedQueryResponse = VariantProjectionPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantProjectionPagedQueryResponseBuilder implements Builder<VariantProjectionPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.variant.VariantProjection> results;

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder results(
            final com.commercetools.api.models.variant.VariantProjection... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.variant.VariantProjection> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.variant.VariantProjection... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.variant.VariantProjectionBuilder, com.commercetools.api.models.variant.VariantProjectionBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.variant.VariantProjectionBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.variant.VariantProjectionBuilder, com.commercetools.api.models.variant.VariantProjectionBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.variant.VariantProjectionBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.variant.VariantProjectionBuilder, com.commercetools.api.models.variant.VariantProjection> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.variant.VariantProjectionBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantProjectionPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.variant.VariantProjectionBuilder, com.commercetools.api.models.variant.VariantProjection> builder) {
        return results(builder.apply(com.commercetools.api.models.variant.VariantProjectionBuilder.of()));
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:VariantProjection" rel="nofollow">VariantProjections</a> matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.variant.VariantProjection> getResults() {
        return this.results;
    }

    /**
     * builds VariantProjectionPagedQueryResponse with checking for non-null required values
     * @return VariantProjectionPagedQueryResponse
     */
    public VariantProjectionPagedQueryResponse build() {
        Objects.requireNonNull(limit, VariantProjectionPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, VariantProjectionPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, VariantProjectionPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, VariantProjectionPagedQueryResponse.class + ": results is missing");
        return new VariantProjectionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds VariantProjectionPagedQueryResponse without checking for non-null required values
     * @return VariantProjectionPagedQueryResponse
     */
    public VariantProjectionPagedQueryResponse buildUnchecked() {
        return new VariantProjectionPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * factory method for an instance of VariantProjectionPagedQueryResponseBuilder
     * @return builder
     */
    public static VariantProjectionPagedQueryResponseBuilder of() {
        return new VariantProjectionPagedQueryResponseBuilder();
    }

    /**
     * create builder for VariantProjectionPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantProjectionPagedQueryResponseBuilder of(final VariantProjectionPagedQueryResponse template) {
        VariantProjectionPagedQueryResponseBuilder builder = new VariantProjectionPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
