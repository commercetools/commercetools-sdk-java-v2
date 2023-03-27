
package com.commercetools.api.models.review;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewPagedQueryResponse reviewPagedQueryResponse = ReviewPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .count(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewPagedQueryResponseBuilder implements Builder<ReviewPagedQueryResponse> {

    private Long limit;

    private Long count;

    @Nullable
    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.api.models.review.Review> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ReviewPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ReviewPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public ReviewPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ReviewPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Reviews matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ReviewPagedQueryResponseBuilder results(final com.commercetools.api.models.review.Review... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Reviews matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ReviewPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.review.Review> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Reviews matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ReviewPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.review.Review... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Reviews matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ReviewPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.review.ReviewBuilder, com.commercetools.api.models.review.ReviewBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.review.ReviewBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Reviews matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ReviewPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.review.ReviewBuilder, com.commercetools.api.models.review.ReviewBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.review.ReviewBuilder.of()).build());
        return this;
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
     *  <p>Reviews matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.review.Review> getResults() {
        return this.results;
    }

    /**
     * builds ReviewPagedQueryResponse with checking for non-null required values
     * @return ReviewPagedQueryResponse
     */
    public ReviewPagedQueryResponse build() {
        Objects.requireNonNull(limit, ReviewPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(count, ReviewPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ReviewPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ReviewPagedQueryResponse.class + ": results is missing");
        return new ReviewPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * builds ReviewPagedQueryResponse without checking for non-null required values
     * @return ReviewPagedQueryResponse
     */
    public ReviewPagedQueryResponse buildUnchecked() {
        return new ReviewPagedQueryResponseImpl(limit, count, total, offset, results);
    }

    /**
     * factory method for an instance of ReviewPagedQueryResponseBuilder
     * @return builder
     */
    public static ReviewPagedQueryResponseBuilder of() {
        return new ReviewPagedQueryResponseBuilder();
    }

    /**
     * create builder for ReviewPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewPagedQueryResponseBuilder of(final ReviewPagedQueryResponse template) {
        ReviewPagedQueryResponseBuilder builder = new ReviewPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
