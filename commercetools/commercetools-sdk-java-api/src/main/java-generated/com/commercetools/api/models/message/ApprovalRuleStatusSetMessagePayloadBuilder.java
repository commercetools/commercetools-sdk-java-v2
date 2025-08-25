
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalRuleStatusSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleStatusSetMessagePayload approvalRuleStatusSetMessagePayload = ApprovalRuleStatusSetMessagePayload.builder()
 *             .status(ApprovalRuleStatus.ACTIVE)
 *             .oldStatus(ApprovalRuleStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleStatusSetMessagePayloadBuilder implements Builder<ApprovalRuleStatusSetMessagePayload> {

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus status;

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus oldStatus;

    /**
     *  <p>Status of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetStatusAction" rel="nofollow">Set Status</a> update action.</p>
     * @param status value to be set
     * @return Builder
     */

    public ApprovalRuleStatusSetMessagePayloadBuilder status(
            final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Status of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetStatusAction" rel="nofollow">Set Status</a> update action.</p>
     * @param oldStatus value to be set
     * @return Builder
     */

    public ApprovalRuleStatusSetMessagePayloadBuilder oldStatus(
            final com.commercetools.api.models.approval_rule.ApprovalRuleStatus oldStatus) {
        this.oldStatus = oldStatus;
        return this;
    }

    /**
     *  <p>Status of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetStatusAction" rel="nofollow">Set Status</a> update action.</p>
     * @return status
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Status of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetStatusAction" rel="nofollow">Set Status</a> update action.</p>
     * @return oldStatus
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getOldStatus() {
        return this.oldStatus;
    }

    /**
     * builds ApprovalRuleStatusSetMessagePayload with checking for non-null required values
     * @return ApprovalRuleStatusSetMessagePayload
     */
    public ApprovalRuleStatusSetMessagePayload build() {
        Objects.requireNonNull(status, ApprovalRuleStatusSetMessagePayload.class + ": status is missing");
        Objects.requireNonNull(oldStatus, ApprovalRuleStatusSetMessagePayload.class + ": oldStatus is missing");
        return new ApprovalRuleStatusSetMessagePayloadImpl(status, oldStatus);
    }

    /**
     * builds ApprovalRuleStatusSetMessagePayload without checking for non-null required values
     * @return ApprovalRuleStatusSetMessagePayload
     */
    public ApprovalRuleStatusSetMessagePayload buildUnchecked() {
        return new ApprovalRuleStatusSetMessagePayloadImpl(status, oldStatus);
    }

    /**
     * factory method for an instance of ApprovalRuleStatusSetMessagePayloadBuilder
     * @return builder
     */
    public static ApprovalRuleStatusSetMessagePayloadBuilder of() {
        return new ApprovalRuleStatusSetMessagePayloadBuilder();
    }

    /**
     * create builder for ApprovalRuleStatusSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleStatusSetMessagePayloadBuilder of(final ApprovalRuleStatusSetMessagePayload template) {
        ApprovalRuleStatusSetMessagePayloadBuilder builder = new ApprovalRuleStatusSetMessagePayloadBuilder();
        builder.status = template.getStatus();
        builder.oldStatus = template.getOldStatus();
        return builder;
    }

}
