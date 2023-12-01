
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApproverConjunctionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverConjunctionDraft approverConjunctionDraft = ApproverConjunctionDraft.builder()
 *             .plusAnd(andBuilder -> andBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApproverConjunctionDraftBuilder implements Builder<ApproverConjunctionDraft> {

    private java.util.List<com.commercetools.api.models.approval_rule.ApproverDisjunctionDraft> and;

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved. The total count of approvers across the nested disjunctions must not exceed 10.</p>
     * @param and value to be set
     * @return Builder
     */

    public ApproverConjunctionDraftBuilder and(
            final com.commercetools.api.models.approval_rule.ApproverDisjunctionDraft... and) {
        this.and = new ArrayList<>(Arrays.asList(and));
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved. The total count of approvers across the nested disjunctions must not exceed 10.</p>
     * @param and value to be set
     * @return Builder
     */

    public ApproverConjunctionDraftBuilder and(
            final java.util.List<com.commercetools.api.models.approval_rule.ApproverDisjunctionDraft> and) {
        this.and = and;
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved. The total count of approvers across the nested disjunctions must not exceed 10.</p>
     * @param and value to be set
     * @return Builder
     */

    public ApproverConjunctionDraftBuilder plusAnd(
            final com.commercetools.api.models.approval_rule.ApproverDisjunctionDraft... and) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.addAll(Arrays.asList(and));
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved. The total count of approvers across the nested disjunctions must not exceed 10.</p>
     * @param builder function to build the and value
     * @return Builder
     */

    public ApproverConjunctionDraftBuilder plusAnd(
            Function<com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder, com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder> builder) {
        if (this.and == null) {
            this.and = new ArrayList<>();
        }
        this.and.add(
            builder.apply(com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved. The total count of approvers across the nested disjunctions must not exceed 10.</p>
     * @param builder function to build the and value
     * @return Builder
     */

    public ApproverConjunctionDraftBuilder withAnd(
            Function<com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder, com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder> builder) {
        this.and = new ArrayList<>();
        this.and.add(
            builder.apply(com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved. The total count of approvers across the nested disjunctions must not exceed 10.</p>
     * @param builder function to build the and value
     * @return Builder
     */

    public ApproverConjunctionDraftBuilder addAnd(
            Function<com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder, com.commercetools.api.models.approval_rule.ApproverDisjunctionDraft> builder) {
        return plusAnd(builder.apply(com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder.of()));
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved. The total count of approvers across the nested disjunctions must not exceed 10.</p>
     * @param builder function to build the and value
     * @return Builder
     */

    public ApproverConjunctionDraftBuilder setAnd(
            Function<com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder, com.commercetools.api.models.approval_rule.ApproverDisjunctionDraft> builder) {
        return and(builder.apply(com.commercetools.api.models.approval_rule.ApproverDisjunctionDraftBuilder.of()));
    }

    /**
     *  <p>All of the nested disjunctions must be approved in order for the conjunction to be considered approved. The total count of approvers across the nested disjunctions must not exceed 10.</p>
     * @return and
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApproverDisjunctionDraft> getAnd() {
        return this.and;
    }

    /**
     * builds ApproverConjunctionDraft with checking for non-null required values
     * @return ApproverConjunctionDraft
     */
    public ApproverConjunctionDraft build() {
        Objects.requireNonNull(and, ApproverConjunctionDraft.class + ": and is missing");
        return new ApproverConjunctionDraftImpl(and);
    }

    /**
     * builds ApproverConjunctionDraft without checking for non-null required values
     * @return ApproverConjunctionDraft
     */
    public ApproverConjunctionDraft buildUnchecked() {
        return new ApproverConjunctionDraftImpl(and);
    }

    /**
     * factory method for an instance of ApproverConjunctionDraftBuilder
     * @return builder
     */
    public static ApproverConjunctionDraftBuilder of() {
        return new ApproverConjunctionDraftBuilder();
    }

    /**
     * create builder for ApproverConjunctionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverConjunctionDraftBuilder of(final ApproverConjunctionDraft template) {
        ApproverConjunctionDraftBuilder builder = new ApproverConjunctionDraftBuilder();
        builder.and = template.getAnd();
        return builder;
    }

}
