
package com.commercetools.api.models.approval_flow;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApprovalFlowUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowUpdateAction approvalFlowUpdateAction = ApprovalFlowUpdateAction.approveBuilder()
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.approval_flow.ApprovalFlowApproveActionImpl.class, name = ApprovalFlowApproveAction.APPROVE),
        @JsonSubTypes.Type(value = com.commercetools.api.models.approval_flow.ApprovalFlowRejectActionImpl.class, name = ApprovalFlowRejectAction.REJECT) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = ApprovalFlowUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = ApprovalFlowUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ApprovalFlowUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     * factory method to create a deep copy of ApprovalFlowUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowUpdateAction deepCopy(@Nullable final ApprovalFlowUpdateAction template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.approval_flow.ApprovalFlowApproveAction) {
            return com.commercetools.api.models.approval_flow.ApprovalFlowApproveAction
                    .deepCopy((com.commercetools.api.models.approval_flow.ApprovalFlowApproveAction) template);
        }
        if (template instanceof com.commercetools.api.models.approval_flow.ApprovalFlowRejectAction) {
            return com.commercetools.api.models.approval_flow.ApprovalFlowRejectAction
                    .deepCopy((com.commercetools.api.models.approval_flow.ApprovalFlowRejectAction) template);
        }
        ApprovalFlowUpdateActionImpl instance = new ApprovalFlowUpdateActionImpl();
        return instance;
    }

    /**
     * builder for approve subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_flow.ApprovalFlowApproveActionBuilder approveBuilder() {
        return com.commercetools.api.models.approval_flow.ApprovalFlowApproveActionBuilder.of();
    }

    /**
     * builder for reject subtype
     * @return builder
     */
    public static com.commercetools.api.models.approval_flow.ApprovalFlowRejectActionBuilder rejectBuilder() {
        return com.commercetools.api.models.approval_flow.ApprovalFlowRejectActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowUpdateAction(Function<ApprovalFlowUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowUpdateAction>";
            }
        };
    }
}
