
package com.commercetools.api.models.approval_rule;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleSetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetNameAction approvalRuleSetNameAction = ApprovalRuleSetNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetNameActionBuilder implements Builder<ApprovalRuleSetNameAction> {

    private String name;

    /**
     *  <p>New name to set for the Approval Rule.</p>
     * @param name value to be set
     * @return Builder
     */

    public ApprovalRuleSetNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New name to set for the Approval Rule.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds ApprovalRuleSetNameAction with checking for non-null required values
     * @return ApprovalRuleSetNameAction
     */
    public ApprovalRuleSetNameAction build() {
        Objects.requireNonNull(name, ApprovalRuleSetNameAction.class + ": name is missing");
        return new ApprovalRuleSetNameActionImpl(name);
    }

    /**
     * builds ApprovalRuleSetNameAction without checking for non-null required values
     * @return ApprovalRuleSetNameAction
     */
    public ApprovalRuleSetNameAction buildUnchecked() {
        return new ApprovalRuleSetNameActionImpl(name);
    }

    /**
     * factory method for an instance of ApprovalRuleSetNameActionBuilder
     * @return builder
     */
    public static ApprovalRuleSetNameActionBuilder of() {
        return new ApprovalRuleSetNameActionBuilder();
    }

    /**
     * create builder for ApprovalRuleSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetNameActionBuilder of(final ApprovalRuleSetNameAction template) {
        ApprovalRuleSetNameActionBuilder builder = new ApprovalRuleSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
