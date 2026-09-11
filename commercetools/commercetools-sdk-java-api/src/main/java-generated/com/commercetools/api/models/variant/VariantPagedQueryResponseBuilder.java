
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantPagedQueryResponse variantPagedQueryResponse = VariantPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantPagedQueryResponseBuilder implements Builder<VariantPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.variant.Variant> results;

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. Unless absolutely necessary, use the query parameter <code>withTotal=false</code> to improve performance by deactivating the calculation of this field. When the results are filtered with a <a href="https://docs.commercetools.com/apis/ctp:api:type:QueryPredicate" rel="nofollow">Query Predicate</a>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder results(final com.commercetools.api.models.variant.Variant... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.variant.Variant> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder plusResults(final com.commercetools.api.models.variant.Variant... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.variant.VariantBuilder, com.commercetools.api.models.variant.VariantBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.variant.VariantBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.variant.VariantBuilder, com.commercetools.api.models.variant.VariantBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.variant.VariantBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.variant.VariantBuilder, com.commercetools.api.models.variant.Variant> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.variant.VariantBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public VariantPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.variant.VariantBuilder, com.commercetools.api.models.variant.Variant> builder) {
        return results(builder.apply(com.commercetools.api.models.variant.VariantBuilder.of()));
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
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. Unless absolutely necessary, use the query parameter <code>withTotal=false</code> to improve performance by deactivating the calculation of this field. When the results are filtered with a <a href="https://docs.commercetools.com/apis/ctp:api:type:QueryPredicate" rel="nofollow">Query Predicate</a>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @return total
     */

    @Nullable
    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Variant" rel="nofollow">Variants</a> matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.variant.Variant> getResults() {
        return this.results;
    }

    /**
     * builds VariantPagedQueryResponse with checking for non-null required values
     * @return VariantPagedQueryResponse
     */
    public VariantPagedQueryResponse build() {
        Objects.requireNonNull(limit, VariantPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, VariantPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, VariantPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, VariantPagedQueryResponse.class + ": results is missing");
        return new VariantPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds VariantPagedQueryResponse without checking for non-null required values
     * @return VariantPagedQueryResponse
     */
    public VariantPagedQueryResponse buildUnchecked() {
        return new VariantPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of VariantPagedQueryResponseBuilder
     * @return builder
     */
    public static VariantPagedQueryResponseBuilder of() {
        return new VariantPagedQueryResponseBuilder();
    }

    /**
     * create builder for VariantPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantPagedQueryResponseBuilder of(final VariantPagedQueryResponse template) {
        VariantPagedQueryResponseBuilder builder = new VariantPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
