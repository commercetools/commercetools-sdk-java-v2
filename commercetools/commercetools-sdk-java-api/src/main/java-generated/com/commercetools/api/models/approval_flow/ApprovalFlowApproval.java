
package com.commercetools.api.models.approval_flow;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowApproval
 *
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
@JsonDeserialize(as = ApprovalFlowApprovalImpl.class)
public interface ApprovalFlowApproval {

    /**
     *  <p>Associate who approved the Approval Flow.</p>
     * @return approver
     */
    @NotNull
    @Valid
    @JsonProperty("approver")
    public Associate getApprover();

    /**
     *  <p>Date and time (UTC) the Approval Flow was approved.</p>
     * @return approvedAt
     */
    @NotNull
    @JsonProperty("approvedAt")
    public ZonedDateTime getApprovedAt();

    /**
     *  <p>Associate who approved the Approval Flow.</p>
     * @param approver value to be set
     */

    public void setApprover(final Associate approver);

    /**
     *  <p>Date and time (UTC) the Approval Flow was approved.</p>
     * @param approvedAt value to be set
     */

    public void setApprovedAt(final ZonedDateTime approvedAt);

    /**
     * factory method
     * @return instance of ApprovalFlowApproval
     */
    public static ApprovalFlowApproval of() {
        return new ApprovalFlowApprovalImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowApproval
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowApproval of(final ApprovalFlowApproval template) {
        ApprovalFlowApprovalImpl instance = new ApprovalFlowApprovalImpl();
        instance.setApprover(template.getApprover());
        instance.setApprovedAt(template.getApprovedAt());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalFlowApproval
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowApproval deepCopy(@Nullable final ApprovalFlowApproval template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowApprovalImpl instance = new ApprovalFlowApprovalImpl();
        instance.setApprover(com.commercetools.api.models.business_unit.Associate.deepCopy(template.getApprover()));
        instance.setApprovedAt(template.getApprovedAt());
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowApproval
     * @return builder
     */
    public static ApprovalFlowApprovalBuilder builder() {
        return ApprovalFlowApprovalBuilder.of();
    }

    /**
     * create builder for ApprovalFlowApproval instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowApprovalBuilder builder(final ApprovalFlowApproval template) {
        return ApprovalFlowApprovalBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowApproval(Function<ApprovalFlowApproval, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowApproval> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowApproval>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowApproval>";
            }
        };
    }
}
