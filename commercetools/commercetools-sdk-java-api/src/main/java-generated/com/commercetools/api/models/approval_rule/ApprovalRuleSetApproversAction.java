
package com.commercetools.api.models.approval_rule;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Setting the approvers for an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> generates an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleApproversSetMessage" rel="nofollow">ApprovalRuleApproversSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleSetApproversAction approvalRuleSetApproversAction = ApprovalRuleSetApproversAction.builder()
 *             .approvers(approversBuilder -> approversBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setApprovers")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleSetApproversActionImpl.class)
public interface ApprovalRuleSetApproversAction extends ApprovalRuleUpdateAction {

    /**
     * discriminator value for ApprovalRuleSetApproversAction
     */
    String SET_APPROVERS = "setApprovers";

    /**
     *  <p>New approvers to set for the Approval Rule.</p>
     * @return approvers
     */
    @NotNull
    @Valid
    @JsonProperty("approvers")
    public ApproverHierarchyDraft getApprovers();

    /**
     *  <p>New approvers to set for the Approval Rule.</p>
     * @param approvers value to be set
     */

    public void setApprovers(final ApproverHierarchyDraft approvers);

    /**
     * factory method
     * @return instance of ApprovalRuleSetApproversAction
     */
    public static ApprovalRuleSetApproversAction of() {
        return new ApprovalRuleSetApproversActionImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleSetApproversAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleSetApproversAction of(final ApprovalRuleSetApproversAction template) {
        ApprovalRuleSetApproversActionImpl instance = new ApprovalRuleSetApproversActionImpl();
        instance.setApprovers(template.getApprovers());
        return instance;
    }

    public ApprovalRuleSetApproversAction copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleSetApproversAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleSetApproversAction deepCopy(@Nullable final ApprovalRuleSetApproversAction template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleSetApproversActionImpl instance = new ApprovalRuleSetApproversActionImpl();
        instance.setApprovers(
            com.commercetools.api.models.approval_rule.ApproverHierarchyDraft.deepCopy(template.getApprovers()));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleSetApproversAction
     * @return builder
     */
    public static ApprovalRuleSetApproversActionBuilder builder() {
        return ApprovalRuleSetApproversActionBuilder.of();
    }

    /**
     * create builder for ApprovalRuleSetApproversAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleSetApproversActionBuilder builder(final ApprovalRuleSetApproversAction template) {
        return ApprovalRuleSetApproversActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleSetApproversAction(Function<ApprovalRuleSetApproversAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetApproversAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleSetApproversAction>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleSetApproversAction>";
            }
        };
    }
}
