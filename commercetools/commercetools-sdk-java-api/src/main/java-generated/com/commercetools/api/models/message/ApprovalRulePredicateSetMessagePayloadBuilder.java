
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRulePredicateSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRulePredicateSetMessagePayload approvalRulePredicateSetMessagePayload = ApprovalRulePredicateSetMessagePayload.builder()
 *             .predicate("{predicate}")
 *             .oldPredicate("{oldPredicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRulePredicateSetMessagePayloadBuilder implements Builder<ApprovalRulePredicateSetMessagePayload> {

    private String predicate;

    private String oldPredicate;

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public ApprovalRulePredicateSetMessagePayloadBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
     * @param oldPredicate value to be set
     * @return Builder
     */

    public ApprovalRulePredicateSetMessagePayloadBuilder oldPredicate(final String oldPredicate) {
        this.oldPredicate = oldPredicate;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetPredicateAction" rel="nofollow">Set Predicate</a> update action.</p>
     * @return oldPredicate
     */

    public String getOldPredicate() {
        return this.oldPredicate;
    }

    /**
     * builds ApprovalRulePredicateSetMessagePayload with checking for non-null required values
     * @return ApprovalRulePredicateSetMessagePayload
     */
    public ApprovalRulePredicateSetMessagePayload build() {
        Objects.requireNonNull(predicate, ApprovalRulePredicateSetMessagePayload.class + ": predicate is missing");
        Objects.requireNonNull(oldPredicate,
            ApprovalRulePredicateSetMessagePayload.class + ": oldPredicate is missing");
        return new ApprovalRulePredicateSetMessagePayloadImpl(predicate, oldPredicate);
    }

    /**
     * builds ApprovalRulePredicateSetMessagePayload without checking for non-null required values
     * @return ApprovalRulePredicateSetMessagePayload
     */
    public ApprovalRulePredicateSetMessagePayload buildUnchecked() {
        return new ApprovalRulePredicateSetMessagePayloadImpl(predicate, oldPredicate);
    }

    /**
     * factory method for an instance of ApprovalRulePredicateSetMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalRulePredicateSetMessagePayloadBuilder of() {
        return new ApprovalRulePredicateSetMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalRulePredicateSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRulePredicateSetMessagePayloadBuilder of(
            final ApprovalRulePredicateSetMessagePayload template) {
        ApprovalRulePredicateSetMessagePayloadBuilder builder = new ApprovalRulePredicateSetMessagePayloadBuilder();
        builder.predicate = template.getPredicate();
        builder.oldPredicate = template.getOldPredicate();
        return builder;
    }

}
