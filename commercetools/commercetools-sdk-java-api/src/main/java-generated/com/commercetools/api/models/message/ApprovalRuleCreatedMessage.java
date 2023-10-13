
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.approval_rule.ApprovalRule;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after an Approval Rule is created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleCreatedMessage approvalRuleCreatedMessage = ApprovalRuleCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .approvalRule(approvalRuleBuilder -> approvalRuleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleCreatedMessageImpl.class)
public interface ApprovalRuleCreatedMessage extends Message {

    /**
     * discriminator value for ApprovalRuleCreatedMessage
     */
    String APPROVAL_RULE_CREATED = "ApprovalRuleCreated";

    /**
     *  <p>The Approval Rule that was created.</p>
     * @return approvalRule
     */
    @NotNull
    @Valid
    @JsonProperty("approvalRule")
    public ApprovalRule getApprovalRule();

    /**
     *  <p>The Approval Rule that was created.</p>
     * @param approvalRule value to be set
     */

    public void setApprovalRule(final ApprovalRule approvalRule);

    /**
     * factory method
     * @return instance of ApprovalRuleCreatedMessage
     */
    public static ApprovalRuleCreatedMessage of() {
        return new ApprovalRuleCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleCreatedMessage of(final ApprovalRuleCreatedMessage template) {
        ApprovalRuleCreatedMessageImpl instance = new ApprovalRuleCreatedMessageImpl();
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
        instance.setApprovalRule(template.getApprovalRule());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalRuleCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleCreatedMessage deepCopy(@Nullable final ApprovalRuleCreatedMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleCreatedMessageImpl instance = new ApprovalRuleCreatedMessageImpl();
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
        instance.setApprovalRule(
            com.commercetools.api.models.approval_rule.ApprovalRule.deepCopy(template.getApprovalRule()));
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleCreatedMessage
     * @return builder
     */
    public static ApprovalRuleCreatedMessageBuilder builder() {
        return ApprovalRuleCreatedMessageBuilder.of();
    }

    /**
     * create builder for ApprovalRuleCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleCreatedMessageBuilder builder(final ApprovalRuleCreatedMessage template) {
        return ApprovalRuleCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleCreatedMessage(Function<ApprovalRuleCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleCreatedMessage>";
            }
        };
    }
}
