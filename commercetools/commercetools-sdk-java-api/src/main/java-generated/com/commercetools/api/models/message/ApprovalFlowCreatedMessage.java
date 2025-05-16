
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.approval_flow.ApprovalFlow;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after an Approval Flow is created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowCreatedMessage approvalFlowCreatedMessage = ApprovalFlowCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .approvalFlow(approvalFlowBuilder -> approvalFlowBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalFlowCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowCreatedMessageImpl.class)
public interface ApprovalFlowCreatedMessage extends Message {

    /**
     * discriminator value for ApprovalFlowCreatedMessage
     */
    String APPROVAL_FLOW_CREATED = "ApprovalFlowCreated";

    /**
     *  <p>The Approval Flow that was created.</p>
     * @return approvalFlow
     */
    @NotNull
    @Valid
    @JsonProperty("approvalFlow")
    public ApprovalFlow getApprovalFlow();

    /**
     *  <p>The Approval Flow that was created.</p>
     * @param approvalFlow value to be set
     */

    public void setApprovalFlow(final ApprovalFlow approvalFlow);

    /**
     * factory method
     * @return instance of ApprovalFlowCreatedMessage
     */
    public static ApprovalFlowCreatedMessage of() {
        return new ApprovalFlowCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowCreatedMessage of(final ApprovalFlowCreatedMessage template) {
        ApprovalFlowCreatedMessageImpl instance = new ApprovalFlowCreatedMessageImpl();
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
        instance.setApprovalFlow(template.getApprovalFlow());
        return instance;
    }

    public ApprovalFlowCreatedMessage copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowCreatedMessage deepCopy(@Nullable final ApprovalFlowCreatedMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowCreatedMessageImpl instance = new ApprovalFlowCreatedMessageImpl();
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
        instance.setApprovalFlow(
            com.commercetools.api.models.approval_flow.ApprovalFlow.deepCopy(template.getApprovalFlow()));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowCreatedMessage
     * @return builder
     */
    public static ApprovalFlowCreatedMessageBuilder builder() {
        return ApprovalFlowCreatedMessageBuilder.of();
    }

    /**
     * create builder for ApprovalFlowCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowCreatedMessageBuilder builder(final ApprovalFlowCreatedMessage template) {
        return ApprovalFlowCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowCreatedMessage(Function<ApprovalFlowCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowCreatedMessage>";
            }
        };
    }
}
