
package com.commercetools.api.models.approval_rule;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetKeyAction approvalRuleSetKeyAction = ApprovalRuleSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetKeyActionBuilder implements Builder<ApprovalRuleSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. Must be unique within a Business Unit. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */

    public ApprovalRuleSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique within a Business Unit. If empty, any existing value will be removed.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds ApprovalRuleSetKeyAction with checking for non-null required values
     * @return ApprovalRuleSetKeyAction
     */
    public ApprovalRuleSetKeyAction build() {
        return new ApprovalRuleSetKeyActionImpl(key);
    }

    /**
     * builds ApprovalRuleSetKeyAction without checking for non-null required values
     * @return ApprovalRuleSetKeyAction
     */
    public ApprovalRuleSetKeyAction buildUnchecked() {
        return new ApprovalRuleSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ApprovalRuleSetKeyActionBuilder
     * @return builder
     */
    public static ApprovalRuleSetKeyActionBuilder of() {
        return new ApprovalRuleSetKeyActionBuilder();
    }

    /**
     * create builder for ApprovalRuleSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetKeyActionBuilder of(final ApprovalRuleSetKeyAction template) {
        ApprovalRuleSetKeyActionBuilder builder = new ApprovalRuleSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
