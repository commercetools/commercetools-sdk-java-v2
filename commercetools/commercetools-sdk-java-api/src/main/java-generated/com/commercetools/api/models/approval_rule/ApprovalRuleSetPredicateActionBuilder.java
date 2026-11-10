
package com.commercetools.api.models.approval_rule;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleSetPredicateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetPredicateAction approvalRuleSetPredicateAction = ApprovalRuleSetPredicateAction.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetPredicateActionBuilder implements Builder<ApprovalRuleSetPredicateAction> {

    private String predicate;

    /**
     *  <p>A valid <span>Order Predicate</span> to set for the Approval Rule.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public ApprovalRuleSetPredicateActionBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>A valid <span>Order Predicate</span> to set for the Approval Rule.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     * builds ApprovalRuleSetPredicateAction with checking for non-null required values
     * @return ApprovalRuleSetPredicateAction
     */
    public ApprovalRuleSetPredicateAction build() {
        Objects.requireNonNull(predicate, ApprovalRuleSetPredicateAction.class + ": predicate is missing");
        return new ApprovalRuleSetPredicateActionImpl(predicate);
    }

    /**
     * builds ApprovalRuleSetPredicateAction without checking for non-null required values
     * @return ApprovalRuleSetPredicateAction
     */
    public ApprovalRuleSetPredicateAction buildUnchecked() {
        return new ApprovalRuleSetPredicateActionImpl(predicate);
    }

    /**
     * factory method for an instance of ApprovalRuleSetPredicateActionBuilder
     * @return builder
     */
    public static ApprovalRuleSetPredicateActionBuilder of() {
        return new ApprovalRuleSetPredicateActionBuilder();
    }

    /**
     * create builder for ApprovalRuleSetPredicateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetPredicateActionBuilder of(final ApprovalRuleSetPredicateAction template) {
        ApprovalRuleSetPredicateActionBuilder builder = new ApprovalRuleSetPredicateActionBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
