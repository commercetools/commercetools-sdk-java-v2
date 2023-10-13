
package com.commercetools.api.models.approval_rule;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApproverDisjunctionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApproverDisjunction approverDisjunction = ApproverDisjunction.builder()
 *             .plusOr(orBuilder -> orBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApproverDisjunctionBuilder implements Builder<ApproverDisjunction> {

    private java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> or;

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or value to be set
     * @return Builder
     */

    public ApproverDisjunctionBuilder or(final com.commercetools.api.models.approval_rule.RuleApprover... or) {
        this.or = new ArrayList<>(Arrays.asList(or));
        return this;
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or value to be set
     * @return Builder
     */

    public ApproverDisjunctionBuilder or(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> or) {
        this.or = or;
        return this;
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param or value to be set
     * @return Builder
     */

    public ApproverDisjunctionBuilder plusOr(final com.commercetools.api.models.approval_rule.RuleApprover... or) {
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

    public ApproverDisjunctionBuilder plusOr(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApproverBuilder> builder) {
        if (this.or == null) {
            this.or = new ArrayList<>();
        }
        this.or.add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param builder function to build the or value
     * @return Builder
     */

    public ApproverDisjunctionBuilder withOr(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApproverBuilder> builder) {
        this.or = new ArrayList<>();
        this.or.add(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param builder function to build the or value
     * @return Builder
     */

    public ApproverDisjunctionBuilder addOr(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApprover> builder) {
        return plusOr(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()));
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @param builder function to build the or value
     * @return Builder
     */

    public ApproverDisjunctionBuilder setOr(
            Function<com.commercetools.api.models.approval_rule.RuleApproverBuilder, com.commercetools.api.models.approval_rule.RuleApprover> builder) {
        return or(builder.apply(com.commercetools.api.models.approval_rule.RuleApproverBuilder.of()));
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     * @return or
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> getOr() {
        return this.or;
    }

    /**
     * builds ApproverDisjunction with checking for non-null required values
     * @return ApproverDisjunction
     */
    public ApproverDisjunction build() {
        Objects.requireNonNull(or, ApproverDisjunction.class + ": or is missing");
        return new ApproverDisjunctionImpl(or);
    }

    /**
     * builds ApproverDisjunction without checking for non-null required values
     * @return ApproverDisjunction
     */
    public ApproverDisjunction buildUnchecked() {
        return new ApproverDisjunctionImpl(or);
    }

    /**
     * factory method for an instance of ApproverDisjunctionBuilder
     * @return builder
     */
    public static ApproverDisjunctionBuilder of() {
        return new ApproverDisjunctionBuilder();
    }

    /**
     * create builder for ApproverDisjunction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApproverDisjunctionBuilder of(final ApproverDisjunction template) {
        ApproverDisjunctionBuilder builder = new ApproverDisjunctionBuilder();
        builder.or = template.getOr();
        return builder;
    }

}
