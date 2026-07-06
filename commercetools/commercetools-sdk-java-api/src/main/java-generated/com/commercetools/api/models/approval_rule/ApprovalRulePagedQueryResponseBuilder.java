
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRulePagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRulePagedQueryResponse approvalRulePagedQueryResponse = ApprovalRulePagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRulePagedQueryResponseBuilder implements Builder<ApprovalRulePagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> results;

    /**
     *  <p>Number of <span>results requested</span>.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of <span>elements skipped</span>.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not <span>strongly consistent</span>. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a <span>Query Predicate</span>, <code>total</code> is subject to a <span>limit</span>.</p>
     * @param total value to be set
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Approval Rules matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder results(
            final com.commercetools.api.models.approval_rule.ApprovalRule... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Approval Rules matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Approval Rules matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.approval_rule.ApprovalRule... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Approval Rules matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRuleBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Approval Rules matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRuleBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Approval Rules matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRule> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of()));
    }

    /**
     *  <p>Approval Rules matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ApprovalRulePagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.approval_rule.ApprovalRuleBuilder, com.commercetools.api.models.approval_rule.ApprovalRule> builder) {
        return results(builder.apply(com.commercetools.api.models.approval_rule.ApprovalRuleBuilder.of()));
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
     *  <p>Approval Rules matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApprovalRule> getResults() {
        return this.results;
    }

    /**
     * builds ApprovalRulePagedQueryResponse with checking for non-null required values
     * @return ApprovalRulePagedQueryResponse
     */
    public ApprovalRulePagedQueryResponse build() {
        Objects.requireNonNull(limit, ApprovalRulePagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ApprovalRulePagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ApprovalRulePagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ApprovalRulePagedQueryResponse.class + ": results is missing");
        return new ApprovalRulePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ApprovalRulePagedQueryResponse without checking for non-null required values
     * @return ApprovalRulePagedQueryResponse
     */
    public ApprovalRulePagedQueryResponse buildUnchecked() {
        return new ApprovalRulePagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ApprovalRulePagedQueryResponseBuilder
     * @return builder
     */
    public static ApprovalRulePagedQueryResponseBuilder of() {
        return new ApprovalRulePagedQueryResponseBuilder();
    }

    /**
     * create builder for ApprovalRulePagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRulePagedQueryResponseBuilder of(final ApprovalRulePagedQueryResponse template) {
        ApprovalRulePagedQueryResponseBuilder builder = new ApprovalRulePagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
