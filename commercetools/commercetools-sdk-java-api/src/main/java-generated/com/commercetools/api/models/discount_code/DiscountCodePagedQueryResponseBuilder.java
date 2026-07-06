
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodePagedQueryResponse discountCodePagedQueryResponse = DiscountCodePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodePagedQueryResponseBuilder implements Builder<DiscountCodePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.discount_code.DiscountCode> results;

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder results(
            final com.commercetools.api.models.discount_code.DiscountCode... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.discount_code.DiscountCode> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.discount_code.DiscountCode... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCodeBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCodeBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCode> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public DiscountCodePagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCode> builder) {
        return results(builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of()));
    }

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @return limit
     */

    public Long getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCodes</a> matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.discount_code.DiscountCode> getResults() {
        return this.results;
    }

    /**
     * builds DiscountCodePagedQueryResponse with checking for non-null required values
     * @return DiscountCodePagedQueryResponse
     */
    public DiscountCodePagedQueryResponse build() {
        Objects.requireNonNull(limit, DiscountCodePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, DiscountCodePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, DiscountCodePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, DiscountCodePagedQueryResponse.class + ": results is missing");
        return new DiscountCodePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds DiscountCodePagedQueryResponse without checking for non-null required values
     * @return DiscountCodePagedQueryResponse
     */
    public DiscountCodePagedQueryResponse buildUnchecked() {
        return new DiscountCodePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of DiscountCodePagedQueryResponseBuilder
     * @return builder
     */
    public static DiscountCodePagedQueryResponseBuilder of() {
        return new DiscountCodePagedQueryResponseBuilder();
    }

    /**
     * create builder for DiscountCodePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodePagedQueryResponseBuilder of(final DiscountCodePagedQueryResponse template) {
        DiscountCodePagedQueryResponseBuilder builder = new DiscountCodePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
