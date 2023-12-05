
package com.commercetools.api.models.approval_rule;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleSetDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetDescriptionAction approvalRuleSetDescriptionAction = ApprovalRuleSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetDescriptionActionBuilder implements Builder<ApprovalRuleSetDescriptionAction> {

    @Nullable
    private String description;

    /**
     *  <p>New description to set for the Approval Rule.</p>
     * @param description value to be set
     * @return Builder
     */

    public ApprovalRuleSetDescriptionActionBuilder description(@Nullable final String description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>New description to set for the Approval Rule.</p>
     * @return description
     */

    @Nullable
    public String getDescription() {
        return this.description;
    }

    /**
     * builds ApprovalRuleSetDescriptionAction with checking for non-null required values
     * @return ApprovalRuleSetDescriptionAction
     */
    public ApprovalRuleSetDescriptionAction build() {
        return new ApprovalRuleSetDescriptionActionImpl(description);
    }

    /**
     * builds ApprovalRuleSetDescriptionAction without checking for non-null required values
     * @return ApprovalRuleSetDescriptionAction
     */
    public ApprovalRuleSetDescriptionAction buildUnchecked() {
        return new ApprovalRuleSetDescriptionActionImpl(description);
    }

    /**
     * factory method for an instance of ApprovalRuleSetDescriptionActionBuilder
     * @return builder
     */
    public static ApprovalRuleSetDescriptionActionBuilder of() {
        return new ApprovalRuleSetDescriptionActionBuilder();
    }

    /**
     * create builder for ApprovalRuleSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetDescriptionActionBuilder of(final ApprovalRuleSetDescriptionAction template) {
        ApprovalRuleSetDescriptionActionBuilder builder = new ApprovalRuleSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
