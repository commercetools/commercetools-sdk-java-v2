
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApproverDisjunctionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverDisjunctionDraft approverDisjunctionDraft = ApproverDisjunctionDraft.builder()
 *             .plusOr(orBuilder -> orBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApproverDisjunctionDraftBuilder implements Builder<ApproverDisjunctionDraft> {

    private java.util.List<com.commercetools.api.models.approval_rule.RuleApproverDraft> or;

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or value to be set
     * @return Builder
     */

    public ApproverDisjunctionDraftBuilder or(
            final com.commercetools.api.models.approval_rule.RuleApproverDraft... or) {
        this.or = new ArrayList<>(Arrays.asList(or));
        return this;
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or value to be set
     * @return Builder
     */

    public ApproverDisjunctionDraftBuilder or(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleApproverDraft> or) {
        this.or = or;
        return this;
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or value to be set
     * @return Builder
     */

    public ApproverDisjunctionDraftBuilder plusOr(
            final com.commercetools.api.models.approval_rule.RuleApproverDraft... or) {
        if (this.or == null) {
            this.or = new ArrayList<>();
        }
        this.or.addAll(Arrays.asList(or));
        return this;
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param builder function to build the or value
     * @return Builder
     */

    public ApproverDisjunctionDraftBuilder plusOr(
            Function<com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder, com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder> builder) {
        if (this.or == null) {
            this.or = new ArrayList<>();
        }
        this.or.add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param builder function to build the or value
     * @return Builder
     */

    public ApproverDisjunctionDraftBuilder withOr(
            Function<com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder, com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder> builder) {
        this.or = new ArrayList<>();
        this.or.add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param builder function to build the or value
     * @return Builder
     */

    public ApproverDisjunctionDraftBuilder addOr(
            Function<com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder, com.commercetools.api.models.approval_rule.RuleApproverDraft> builder) {
        return plusOr(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder.of()));
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param builder function to build the or value
     * @return Builder
     */

    public ApproverDisjunctionDraftBuilder setOr(
            Function<com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder, com.commercetools.api.models.approval_rule.RuleApproverDraft> builder) {
        return or(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverDraftBuilder.of()));
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @return or
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleApproverDraft> getOr() {
        return this.or;
    }

    /**
     * builds ApproverDisjunctionDraft with checking for non-null required values
     * @return ApproverDisjunctionDraft
     */
    public ApproverDisjunctionDraft build() {
        Objects.requireNonNull(or, ApproverDisjunctionDraft.class + ": or is missing");
        return new ApproverDisjunctionDraftImpl(or);
    }

    /**
     * builds ApproverDisjunctionDraft without checking for non-null required values
     * @return ApproverDisjunctionDraft
     */
    public ApproverDisjunctionDraft buildUnchecked() {
        return new ApproverDisjunctionDraftImpl(or);
    }

    /**
     * factory method for an instance of ApproverDisjunctionDraftBuilder
     * @return builder
     */
    public static ApproverDisjunctionDraftBuilder of() {
        return new ApproverDisjunctionDraftBuilder();
    }

    /**
     * create builder for ApproverDisjunctionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverDisjunctionDraftBuilder of(final ApproverDisjunctionDraft template) {
        ApproverDisjunctionDraftBuilder builder = new ApproverDisjunctionDraftBuilder();
        builder.or = template.getOr();
        return builder;
    }

}
