
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.approval_rule.ApproverHierarchy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Approvers update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleApproversSetMessagePayload approvalRuleApproversSetMessagePayload = ApprovalRuleApproversSetMessagePayload.builder()
 *             .approvers(approversBuilder -> approversBuilder)
 *             .oldApprovers(oldApproversBuilder -> oldApproversBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalRuleApproversSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleApproversSetMessagePayloadImpl.class)
public interface ApprovalRuleApproversSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalRuleApproversSetMessagePayload
     */
    String APPROVAL_RULE_APPROVERS_SET = "ApprovalRuleApproversSet";

    /**
     *  <p>Approver hierarchy of the ApprovalRule after the Set Approvers update action.</p>
     * @return approvers
     */
    @NotNull
    @Valid
    @JsonProperty("approvers")
    public ApproverHierarchy getApprovers();

    /**
     *  <p>Approver hierarchy of the ApprovalRule before the Set Approvers update action.</p>
     * @return oldApprovers
     */
    @NotNull
    @Valid
    @JsonProperty("oldApprovers")
    public ApproverHierarchy getOldApprovers();

    /**
     *  <p>Approver hierarchy of the ApprovalRule after the Set Approvers update action.</p>
     * @param approvers value to be set
     */

    public void setApprovers(final ApproverHierarchy approvers);

    /**
     *  <p>Approver hierarchy of the ApprovalRule before the Set Approvers update action.</p>
     * @param oldApprovers value to be set
     */

    public void setOldApprovers(final ApproverHierarchy oldApprovers);

    /**
     * factory method
     * @return instance of ApprovalRuleApproversSetMessagePayload
     */
    public static ApprovalRuleApproversSetMessagePayload of() {
        return new ApprovalRuleApproversSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleApproversSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleApproversSetMessagePayload of(final ApprovalRuleApproversSetMessagePayload template) {
        ApprovalRuleApproversSetMessagePayloadImpl instance = new ApprovalRuleApproversSetMessagePayloadImpl();
        instance.setApprovers(template.getApprovers());
        instance.setOldApprovers(template.getOldApprovers());
        return instance;
    }

    public ApprovalRuleApproversSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleApproversSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleApproversSetMessagePayload deepCopy(
            @Nullable final ApprovalRuleApproversSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleApproversSetMessagePayloadImpl instance = new ApprovalRuleApproversSetMessagePayloadImpl();
        instance.setApprovers(
            com.commercetools.api.models.approval_rule.ApproverHierarchy.deepCopy(template.getApprovers()));
        instance.setOldApprovers(
            com.commercetools.api.models.approval_rule.ApproverHierarchy.deepCopy(template.getOldApprovers()));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleApproversSetMessagePayload
     * @return builder
     */
    public static ApprovalRuleApproversSetMessagePayloadBuilder builder() {
        return ApprovalRuleApproversSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalRuleApproversSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleApproversSetMessagePayloadBuilder builder(
            final ApprovalRuleApproversSetMessagePayload template) {
        return ApprovalRuleApproversSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleApproversSetMessagePayload(
            Function<ApprovalRuleApproversSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleApproversSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleApproversSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleApproversSetMessagePayload>";
            }
        };
    }
}
