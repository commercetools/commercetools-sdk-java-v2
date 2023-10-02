
package com.commercetools.api.models.approval_flow;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowPagedQueryResponse approvalFlowPagedQueryResponse = ApprovalFlowPagedQueryResponse.builder()
 *             .limit(0.3)
 *             .offset(0.3)
 *             .count(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowPagedQueryResponseBuilder implements Builder<ApprovalFlowPagedQueryResponse> {

    private Long limit;

    private Long offset;

    private Long count;

    @Nullable
    private Long total;

    private java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlow> results;

    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder limit(final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>Actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Total number of results matching the query. This number is an estimation that is not strongly consistent. This field is returned by default. For improved performance, calculating this field can be deactivated by using the query parameter <code>withTotal=false</code>. When the results are filtered with a Query Predicate, <code>total</code> is subject to a limit.</p>
     * @param total value to be set
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder total(@Nullable final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Approval Flows matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder results(
            final com.commercetools.api.models.approval_flow.ApprovalFlow... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Approval Flows matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlow> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>Approval Flows matching the query.</p>
     * @param results value to be set
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder plusResults(
            final com.commercetools.api.models.approval_flow.ApprovalFlow... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>Approval Flows matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowBuilder, com.commercetools.api.models.approval_flow.ApprovalFlowBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Approval Flows matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder withResults(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowBuilder, com.commercetools.api.models.approval_flow.ApprovalFlowBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Approval Flows matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder addResults(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowBuilder, com.commercetools.api.models.approval_flow.ApprovalFlow> builder) {
        return plusResults(builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowBuilder.of()));
    }

    /**
     *  <p>Approval Flows matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */

    public ApprovalFlowPagedQueryResponseBuilder setResults(
            Function<com.commercetools.api.models.approval_flow.ApprovalFlowBuilder, com.commercetools.api.models.approval_flow.ApprovalFlow> builder) {
        return results(builder.apply(com.commercetools.api.models.approval_flow.ApprovalFlowBuilder.of()));
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
     *  <p>Approval Flows matching the query.</p>
     * @return results
     */

    public java.util.List<com.commercetools.api.models.approval_flow.ApprovalFlow> getResults() {
        return this.results;
    }

    /**
     * builds ApprovalFlowPagedQueryResponse with checking for non-null required values
     * @return ApprovalFlowPagedQueryResponse
     */
    public ApprovalFlowPagedQueryResponse build() {
        Objects.requireNonNull(limit, ApprovalFlowPagedQueryResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ApprovalFlowPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ApprovalFlowPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(results, ApprovalFlowPagedQueryResponse.class + ": results is missing");
        return new ApprovalFlowPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * builds ApprovalFlowPagedQueryResponse without checking for non-null required values
     * @return ApprovalFlowPagedQueryResponse
     */
    public ApprovalFlowPagedQueryResponse buildUnchecked() {
        return new ApprovalFlowPagedQueryResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ApprovalFlowPagedQueryResponseBuilder
     * @return builder
     */
    public static ApprovalFlowPagedQueryResponseBuilder of() {
        return new ApprovalFlowPagedQueryResponseBuilder();
    }

    /**
     * create builder for ApprovalFlowPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowPagedQueryResponseBuilder of(final ApprovalFlowPagedQueryResponse template) {
        ApprovalFlowPagedQueryResponseBuilder builder = new ApprovalFlowPagedQueryResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
