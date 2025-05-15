
package com.commercetools.api.models.approval_flow;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action allows an Associate to reject an Approval Flow, setting its status to <code>Rejected</code>. The process takes into account all Associate Roles held by the Associate, aligning with the matched Approval Rules and their respective approver hierarchies. Even a single rejection in the process will result in the rejection of the entire Approval Flow.</p>
 *  <p>An Associate is eligible to reject only if their roles are within tiers of the Approval Rule hierarchy that are yet to be rejected. An Associate may alter a prior approval into a rejection.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowRejectAction approvalFlowRejectAction = ApprovalFlowRejectAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("reject")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowRejectActionImpl.class)
public interface ApprovalFlowRejectAction extends ApprovalFlowUpdateAction {

    /**
     * discriminator value for ApprovalFlowRejectAction
     */
    String REJECT = "reject";

    /**
     *  <p>The reason for the rejection of the Approval Flow.</p>
     * @return reason
     */

    @JsonProperty("reason")
    public String getReason();

    /**
     *  <p>The reason for the rejection of the Approval Flow.</p>
     * @param reason value to be set
     */

    public void setReason(final String reason);

    /**
     * factory method
     * @return instance of ApprovalFlowRejectAction
     */
    public static ApprovalFlowRejectAction of() {
        return new ApprovalFlowRejectActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowRejectAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowRejectAction of(final ApprovalFlowRejectAction template) {
        ApprovalFlowRejectActionImpl instance = new ApprovalFlowRejectActionImpl();
        instance.setReason(template.getReason());
        return instance;
    }

    public ApprovalFlowRejectAction copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowRejectAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowRejectAction deepCopy(@Nullable final ApprovalFlowRejectAction template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowRejectActionImpl instance = new ApprovalFlowRejectActionImpl();
        instance.setReason(template.getReason());
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowRejectAction
     * @return builder
     */
    public static ApprovalFlowRejectActionBuilder builder() {
        return ApprovalFlowRejectActionBuilder.of();
    }

    /**
     * create builder for ApprovalFlowRejectAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowRejectActionBuilder builder(final ApprovalFlowRejectAction template) {
        return ApprovalFlowRejectActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowRejectAction(Function<ApprovalFlowRejectAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowRejectAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowRejectAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowRejectAction>";
            }
        };
    }
}
