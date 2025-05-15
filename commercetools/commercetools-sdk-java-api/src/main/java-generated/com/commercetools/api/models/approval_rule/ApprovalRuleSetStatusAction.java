
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Setting the status for an Approval Rule generates an ApprovalRuleStatusSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetStatusAction approvalRuleSetStatusAction = ApprovalRuleSetStatusAction.builder()
 *             .status(ApprovalRuleStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStatus")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleSetStatusActionImpl.class)
public interface ApprovalRuleSetStatusAction extends ApprovalRuleUpdateAction {

    /**
     * discriminator value for ApprovalRuleSetStatusAction
     */
    String SET_STATUS = "setStatus";

    /**
     *  <p>New status to set for the Approval Rule.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ApprovalRuleStatus getStatus();

    /**
     *  <p>New status to set for the Approval Rule.</p>
     * @param status value to be set
     */

    public void setStatus(final ApprovalRuleStatus status);

    /**
     * factory method
     * @return instance of ApprovalRuleSetStatusAction
     */
    public static ApprovalRuleSetStatusAction of() {
        return new ApprovalRuleSetStatusActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleSetStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleSetStatusAction of(final ApprovalRuleSetStatusAction template) {
        ApprovalRuleSetStatusActionImpl instance = new ApprovalRuleSetStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public ApprovalRuleSetStatusAction copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleSetStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleSetStatusAction deepCopy(@Nullable final ApprovalRuleSetStatusAction template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleSetStatusActionImpl instance = new ApprovalRuleSetStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleSetStatusAction
     * @return builder
     */
    public static ApprovalRuleSetStatusActionBuilder builder() {
        return ApprovalRuleSetStatusActionBuilder.of();
    }

    /**
     * create builder for ApprovalRuleSetStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetStatusActionBuilder builder(final ApprovalRuleSetStatusAction template) {
        return ApprovalRuleSetStatusActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleSetStatusAction(Function<ApprovalRuleSetStatusAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetStatusAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetStatusAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleSetStatusAction>";
            }
        };
    }
}
