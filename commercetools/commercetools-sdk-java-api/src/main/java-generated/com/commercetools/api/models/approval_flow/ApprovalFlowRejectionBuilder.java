
package com.commercetools.api.models.approval_flow;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowRejectionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowRejection approvalFlowRejection = ApprovalFlowRejection.builder()
 *             .rejecter(rejecterBuilder -> rejecterBuilder)
 *             .rejectedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalFlowRejectionBuilder implements Builder<ApprovalFlowRejection> {

    private com.commercetools.api.models.business_unit.Associate rejecter;

    private java.time.ZonedDateTime rejectedAt;

    @Nullable
    private String reason;

    /**
     *  <p>Associate who rejected the Approval Flow.</p>
     * @param builder function to build the rejecter value
     * @return Builder
     */

    public ApprovalFlowRejectionBuilder rejecter(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.rejecter = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Associate who rejected the Approval Flow.</p>
     * @param builder function to build the rejecter value
     * @return Builder
     */

    public ApprovalFlowRejectionBuilder withRejecter(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        this.rejecter = builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of());
        return this;
    }

    /**
     *  <p>Associate who rejected the Approval Flow.</p>
     * @param rejecter value to be set
     * @return Builder
     */

    public ApprovalFlowRejectionBuilder rejecter(final com.commercetools.api.models.business_unit.Associate rejecter) {
        this.rejecter = rejecter;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the Approval Flow was rejected at.</p>
     * @param rejectedAt value to be set
     * @return Builder
     */

    public ApprovalFlowRejectionBuilder rejectedAt(final java.time.ZonedDateTime rejectedAt) {
        this.rejectedAt = rejectedAt;
        return this;
    }

    /**
     *  <p>The reason for the rejection of the Approval Flow.</p>
     * @param reason value to be set
     * @return Builder
     */

    public ApprovalFlowRejectionBuilder reason(@Nullable final String reason) {
        this.reason = reason;
        return this;
    }

    /**
     *  <p>Associate who rejected the Approval Flow.</p>
     * @return rejecter
     */

    public com.commercetools.api.models.business_unit.Associate getRejecter() {
        return this.rejecter;
    }

    /**
     *  <p>Date and time (UTC) when the Approval Flow was rejected at.</p>
     * @return rejectedAt
     */

    public java.time.ZonedDateTime getRejectedAt() {
        return this.rejectedAt;
    }

    /**
     *  <p>The reason for the rejection of the Approval Flow.</p>
     * @return reason
     */

    @Nullable
    public String getReason() {
        return this.reason;
    }

    /**
     * builds ApprovalFlowRejection with checking for non-null required values
     * @return ApprovalFlowRejection
     */
    public ApprovalFlowRejection build() {
        Objects.requireNonNull(rejecter, ApprovalFlowRejection.class + ": rejecter is missing");
        Objects.requireNonNull(rejectedAt, ApprovalFlowRejection.class + ": rejectedAt is missing");
        return new ApprovalFlowRejectionImpl(rejecter, rejectedAt, reason);
    }

    /**
     * builds ApprovalFlowRejection without checking for non-null required values
     * @return ApprovalFlowRejection
     */
    public ApprovalFlowRejection buildUnchecked() {
        return new ApprovalFlowRejectionImpl(rejecter, rejectedAt, reason);
    }

    /**
     * factory method for an instance of ApprovalFlowRejectionBuilder
     * @return builder
     */
    public static ApprovalFlowRejectionBuilder of() {
        return new ApprovalFlowRejectionBuilder();
    }

    /**
     * create builder for ApprovalFlowRejection instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowRejectionBuilder of(final ApprovalFlowRejection template) {
        ApprovalFlowRejectionBuilder builder = new ApprovalFlowRejectionBuilder();
        builder.rejecter = template.getRejecter();
        builder.rejectedAt = template.getRejectedAt();
        builder.reason = template.getReason();
        return builder;
    }

}
