
package com.commercetools.api.models.approval_flow;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowApprovalBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowApproval approvalFlowApproval = ApprovalFlowApproval.builder()
 *             .approver(approverBuilder -> approverBuilder)
 *             .approvedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowApprovalBuilder implements Builder<ApprovalFlowApproval> {

    private com.commercetools.api.models.business_unit.Associate approver;

    private java.time.ZonedDateTime approvedAt;

    /**
     *  <p>Associate who approved the Approval Flow.</p>
     * @param builder function to build the approver value
     * @return Builder
     */

    public ApprovalFlowApprovalBuilder approver(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.approver = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Associate who approved the Approval Flow.</p>
     * @param builder function to build the approver value
     * @return Builder
     */

    public ApprovalFlowApprovalBuilder withApprover(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        this.approver = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of());
        return this;
    }

    /**
     *  <p>Associate who approved the Approval Flow.</p>
     * @param approver value to be set
     * @return Builder
     */

    public ApprovalFlowApprovalBuilder approver(final com.commercetools.api.models.business_unit.Associate approver) {
        this.approver = approver;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Approval Flow was approved.</p>
     * @param approvedAt value to be set
     * @return Builder
     */

    public ApprovalFlowApprovalBuilder approvedAt(final java.time.ZonedDateTime approvedAt) {
        this.approvedAt = approvedAt;
        return this;
    }

    /**
     *  <p>Associate who approved the Approval Flow.</p>
     * @return approver
     */

    public com.commercetools.api.models.business_unit.Associate getApprover() {
        return this.approver;
    }

    /**
     *  <p>Date and time (UTC) the Approval Flow was approved.</p>
     * @return approvedAt
     */

    public java.time.ZonedDateTime getApprovedAt() {
        return this.approvedAt;
    }

    /**
     * builds ApprovalFlowApproval with checking for non-null required values
     * @return ApprovalFlowApproval
     */
    public ApprovalFlowApproval build() {
        Objects.requireNonNull(approver, ApprovalFlowApproval.class + ": approver is missing");
        Objects.requireNonNull(approvedAt, ApprovalFlowApproval.class + ": approvedAt is missing");
        return new ApprovalFlowApprovalImpl(approver, approvedAt);
    }

    /**
     * builds ApprovalFlowApproval without checking for non-null required values
     * @return ApprovalFlowApproval
     */
    public ApprovalFlowApproval buildUnchecked() {
        return new ApprovalFlowApprovalImpl(approver, approvedAt);
    }

    /**
     * factory method for an instance of ApprovalFlowApprovalBuilder
     * @return builder
     */
    public static ApprovalFlowApprovalBuilder of() {
        return new ApprovalFlowApprovalBuilder();
    }

    /**
     * create builder for ApprovalFlowApproval instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowApprovalBuilder of(final ApprovalFlowApproval template) {
        ApprovalFlowApprovalBuilder builder = new ApprovalFlowApprovalBuilder();
        builder.approver = template.getApprover();
        builder.approvedAt = template.getApprovedAt();
        return builder;
    }

}
