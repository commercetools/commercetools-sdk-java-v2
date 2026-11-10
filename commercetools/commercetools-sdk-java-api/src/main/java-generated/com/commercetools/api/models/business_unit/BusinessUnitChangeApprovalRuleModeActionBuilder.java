
package com.commercetools.api.models.business_unit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitChangeApprovalRuleModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeApprovalRuleModeAction businessUnitChangeApprovalRuleModeAction = BusinessUnitChangeApprovalRuleModeAction.builder()
 *             .approvalRuleMode(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeApprovalRuleModeActionBuilder
        implements Builder<BusinessUnitChangeApprovalRuleModeAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode;

    /**
     *  <p>The new value for <code>approvalRuleMode</code>.</p>
     * @param approvalRuleMode value to be set
     * @return Builder
     */

    public BusinessUnitChangeApprovalRuleModeActionBuilder approvalRuleMode(
            final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
        return this;
    }

    /**
     *  <p>The new value for <code>approvalRuleMode</code>.</p>
     * @return approvalRuleMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getApprovalRuleMode() {
        return this.approvalRuleMode;
    }

    /**
     * builds BusinessUnitChangeApprovalRuleModeAction with checking for non-null required values
     * @return BusinessUnitChangeApprovalRuleModeAction
     */
    public BusinessUnitChangeApprovalRuleModeAction build() {
        Objects.requireNonNull(approvalRuleMode,
            BusinessUnitChangeApprovalRuleModeAction.class + ": approvalRuleMode is missing");
        return new BusinessUnitChangeApprovalRuleModeActionImpl(approvalRuleMode);
    }

    /**
     * builds BusinessUnitChangeApprovalRuleModeAction without checking for non-null required values
     * @return BusinessUnitChangeApprovalRuleModeAction
     */
    public BusinessUnitChangeApprovalRuleModeAction buildUnchecked() {
        return new BusinessUnitChangeApprovalRuleModeActionImpl(approvalRuleMode);
    }

    /**
     * factory method for an instance of BusinessUnitChangeApprovalRuleModeActionBuilder
     * @return builder
     */
    public static BusinessUnitChangeApprovalRuleModeActionBuilder of() {
        return new BusinessUnitChangeApprovalRuleModeActionBuilder();
    }

    /**
     * create builder for BusinessUnitChangeApprovalRuleModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeApprovalRuleModeActionBuilder of(
            final BusinessUnitChangeApprovalRuleModeAction template) {
        BusinessUnitChangeApprovalRuleModeActionBuilder builder = new BusinessUnitChangeApprovalRuleModeActionBuilder();
        builder.approvalRuleMode = template.getApprovalRuleMode();
        return builder;
    }

}
