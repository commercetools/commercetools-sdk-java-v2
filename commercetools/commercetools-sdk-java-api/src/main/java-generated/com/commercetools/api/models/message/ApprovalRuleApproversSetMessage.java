
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetApproversAction" rel="nofollow">Set Approvers</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleApproversSetMessage approvalRuleApproversSetMessage = ApprovalRuleApproversSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .approvers(approversBuilder -> approversBuilder)
 *             .oldApprovers(oldApproversBuilder -> oldApproversBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalRuleApproversSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleApproversSetMessageImpl.class)
public interface ApprovalRuleApproversSetMessage extends Message {

    /**
     * discriminator value for ApprovalRuleApproversSetMessage
     */
    String APPROVAL_RULE_APPROVERS_SET = "ApprovalRuleApproversSet";

    /**
     *  <p>Approver hierarchy of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetApproversAction" rel="nofollow">Set Approvers</a> update action.</p>
     * @return approvers
     */
    @NotNull
    @Valid
    @JsonProperty("approvers")
    public ApproverHierarchy getApprovers();

    /**
     *  <p>Approver hierarchy of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetApproversAction" rel="nofollow">Set Approvers</a> update action.</p>
     * @return oldApprovers
     */
    @NotNull
    @Valid
    @JsonProperty("oldApprovers")
    public ApproverHierarchy getOldApprovers();

    /**
     *  <p>Approver hierarchy of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetApproversAction" rel="nofollow">Set Approvers</a> update action.</p>
     * @param approvers value to be set
     */

    public void setApprovers(final ApproverHierarchy approvers);

    /**
     *  <p>Approver hierarchy of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleSetApproversAction" rel="nofollow">Set Approvers</a> update action.</p>
     * @param oldApprovers value to be set
     */

    public void setOldApprovers(final ApproverHierarchy oldApprovers);

    /**
     * factory method
     * @return instance of ApprovalRuleApproversSetMessage
     */
    public static ApprovalRuleApproversSetMessage of() {
        return new ApprovalRuleApproversSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleApproversSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleApproversSetMessage of(final ApprovalRuleApproversSetMessage template) {
        ApprovalRuleApproversSetMessageImpl instance = new ApprovalRuleApproversSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setApprovers(template.getApprovers());
        instance.setOldApprovers(template.getOldApprovers());
        return instance;
    }

    public ApprovalRuleApproversSetMessage copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleApproversSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleApproversSetMessage deepCopy(@Nullable final ApprovalRuleApproversSetMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleApproversSetMessageImpl instance = new ApprovalRuleApproversSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setApprovers(
            com.commercetools.api.models.approval_rule.ApproverHierarchy.deepCopy(template.getApprovers()));
        instance.setOldApprovers(
            com.commercetools.api.models.approval_rule.ApproverHierarchy.deepCopy(template.getOldApprovers()));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleApproversSetMessage
     * @return builder
     */
    public static ApprovalRuleApproversSetMessageBuilder builder() {
        return ApprovalRuleApproversSetMessageBuilder.of();
    }

    /**
     * create builder for ApprovalRuleApproversSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleApproversSetMessageBuilder builder(final ApprovalRuleApproversSetMessage template) {
        return ApprovalRuleApproversSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleApproversSetMessage(Function<ApprovalRuleApproversSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleApproversSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleApproversSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleApproversSetMessage>";
            }
        };
    }
}
