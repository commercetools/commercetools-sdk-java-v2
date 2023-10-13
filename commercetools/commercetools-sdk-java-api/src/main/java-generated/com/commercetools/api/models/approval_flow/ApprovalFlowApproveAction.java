
package com.commercetools.api.models.approval_flow;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action allows an Associate to approve an Approval Flow. The process takes into account all Associate Roles held by the Associate, aligning with the matched Approval Rules and their respective approver hierarchies.</p>
 *  <p>When every required Associate has given their approval, the Approval Flow achieves a fully approved state, automatically updating its status to <code>Approved</code>. An Associate is eligible to approve only if their roles are within tiers of the Approval Rule hierarchy that are yet to be fully approved or rejected. As such, an Associate may be able to give their approval more than once.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowApproveAction approvalFlowApproveAction = ApprovalFlowApproveAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowApproveActionImpl.class)
public interface ApprovalFlowApproveAction extends ApprovalFlowUpdateAction {

    /**
     * discriminator value for ApprovalFlowApproveAction
     */
    String APPROVE = "approve";

    /**
     * factory method
     * @return instance of ApprovalFlowApproveAction
     */
    public static ApprovalFlowApproveAction of() {
        return new ApprovalFlowApproveActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowApproveAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowApproveAction of(final ApprovalFlowApproveAction template) {
        ApprovalFlowApproveActionImpl instance = new ApprovalFlowApproveActionImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalFlowApproveAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowApproveAction deepCopy(@Nullable final ApprovalFlowApproveAction template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowApproveActionImpl instance = new ApprovalFlowApproveActionImpl();
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowApproveAction
     * @return builder
     */
    public static ApprovalFlowApproveActionBuilder builder() {
        return ApprovalFlowApproveActionBuilder.of();
    }

    /**
     * create builder for ApprovalFlowApproveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowApproveActionBuilder builder(final ApprovalFlowApproveAction template) {
        return ApprovalFlowApproveActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowApproveAction(Function<ApprovalFlowApproveAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowApproveAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowApproveAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowApproveAction>";
            }
        };
    }
}
