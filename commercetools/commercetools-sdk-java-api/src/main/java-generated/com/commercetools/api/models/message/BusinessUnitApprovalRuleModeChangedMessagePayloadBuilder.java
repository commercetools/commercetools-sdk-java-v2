
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitApprovalRuleModeChangedMessagePayload businessUnitApprovalRuleModeChangedMessagePayload = BusinessUnitApprovalRuleModeChangedMessagePayload.builder()
 *             .approvalRuleMode(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder
        implements Builder<BusinessUnitApprovalRuleModeChangedMessagePayload> {

    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode oldApprovalRuleMode;

    /**
     *  <p>BusinessUnitApprovalRuleMode of the Business Unit after the Change Approval Rule Mode update action.</p>
     * @param approvalRuleMode value to be set
     * @return Builder
     */

    public BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder approvalRuleMode(
            final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
        return this;
    }

    /**
     *  <p>BusinessUnitApprovalRuleMode of the Business Unit before the Change Approval Rule Mode update action.</p>
     * @param oldApprovalRuleMode value to be set
     * @return Builder
     */

    public BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder oldApprovalRuleMode(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode oldApprovalRuleMode) {
        this.oldApprovalRuleMode = oldApprovalRuleMode;
        return this;
    }

    /**
     *  <p>BusinessUnitApprovalRuleMode of the Business Unit after the Change Approval Rule Mode update action.</p>
     * @return approvalRuleMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getApprovalRuleMode() {
        return this.approvalRuleMode;
    }

    /**
     *  <p>BusinessUnitApprovalRuleMode of the Business Unit before the Change Approval Rule Mode update action.</p>
     * @return oldApprovalRuleMode
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getOldApprovalRuleMode() {
        return this.oldApprovalRuleMode;
    }

    /**
     * builds BusinessUnitApprovalRuleModeChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitApprovalRuleModeChangedMessagePayload
     */
    public BusinessUnitApprovalRuleModeChangedMessagePayload build() {
        Objects.requireNonNull(approvalRuleMode,
            BusinessUnitApprovalRuleModeChangedMessagePayload.class + ": approvalRuleMode is missing");
        return new BusinessUnitApprovalRuleModeChangedMessagePayloadImpl(approvalRuleMode, oldApprovalRuleMode);
    }

    /**
     * builds BusinessUnitApprovalRuleModeChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitApprovalRuleModeChangedMessagePayload
     */
    public BusinessUnitApprovalRuleModeChangedMessagePayload buildUnchecked() {
        return new BusinessUnitApprovalRuleModeChangedMessagePayloadImpl(approvalRuleMode, oldApprovalRuleMode);
    }

    /**
     * factory method for an instance of BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder of() {
        return new BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitApprovalRuleModeChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder of(
            final BusinessUnitApprovalRuleModeChangedMessagePayload template) {
        BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder builder = new BusinessUnitApprovalRuleModeChangedMessagePayloadBuilder();
        builder.approvalRuleMode = template.getApprovalRuleMode();
        builder.oldApprovalRuleMode = template.getOldApprovalRuleMode();
        return builder;
    }

}
