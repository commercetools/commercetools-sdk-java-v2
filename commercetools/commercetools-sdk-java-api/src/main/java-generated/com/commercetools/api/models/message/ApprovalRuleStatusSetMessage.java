
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.approval_rule.ApprovalRuleStatus;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Status update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalRuleStatusSetMessage approvalRuleStatusSetMessage = ApprovalRuleStatusSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .status(ApprovalRuleStatus.ACTIVE)
 *             .oldStatus(ApprovalRuleStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalRuleStatusSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalRuleStatusSetMessageImpl.class)
public interface ApprovalRuleStatusSetMessage extends Message {

    /**
     * discriminator value for ApprovalRuleStatusSetMessage
     */
    String APPROVAL_RULE_STATUS_SET = "ApprovalRuleStatusSet";

    /**
     *  <p>Status of the ApprovalRule after the Set Status update action.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ApprovalRuleStatus getStatus();

    /**
     *  <p>Status of the ApprovalRule before the Set Status update action.</p>
     * @return oldStatus
     */
    @NotNull
    @JsonProperty("oldStatus")
    public ApprovalRuleStatus getOldStatus();

    /**
     *  <p>Status of the ApprovalRule after the Set Status update action.</p>
     * @param status value to be set
     */

    public void setStatus(final ApprovalRuleStatus status);

    /**
     *  <p>Status of the ApprovalRule before the Set Status update action.</p>
     * @param oldStatus value to be set
     */

    public void setOldStatus(final ApprovalRuleStatus oldStatus);

    /**
     * factory method
     * @return instance of ApprovalRuleStatusSetMessage
     */
    public static ApprovalRuleStatusSetMessage of() {
        return new ApprovalRuleStatusSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalRuleStatusSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalRuleStatusSetMessage of(final ApprovalRuleStatusSetMessage template) {
        ApprovalRuleStatusSetMessageImpl instance = new ApprovalRuleStatusSetMessageImpl();
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
        instance.setStatus(template.getStatus());
        instance.setOldStatus(template.getOldStatus());
        return instance;
    }

    public ApprovalRuleStatusSetMessage copyDeep();

    /**
     * factory method to create a deep copy of ApprovalRuleStatusSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalRuleStatusSetMessage deepCopy(@Nullable final ApprovalRuleStatusSetMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalRuleStatusSetMessageImpl instance = new ApprovalRuleStatusSetMessageImpl();
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
        instance.setStatus(template.getStatus());
        instance.setOldStatus(template.getOldStatus());
        return instance;
    }

    /**
     * builder factory method for ApprovalRuleStatusSetMessage
     * @return builder
     */
    public static ApprovalRuleStatusSetMessageBuilder builder() {
        return ApprovalRuleStatusSetMessageBuilder.of();
    }

    /**
     * create builder for ApprovalRuleStatusSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalRuleStatusSetMessageBuilder builder(final ApprovalRuleStatusSetMessage template) {
        return ApprovalRuleStatusSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalRuleStatusSetMessage(Function<ApprovalRuleStatusSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleStatusSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalRuleStatusSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalRuleStatusSetMessage>";
            }
        };
    }
}
