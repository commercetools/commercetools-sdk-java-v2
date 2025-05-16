
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.approval_flow.ApprovalFlowStatus;
import com.commercetools.api.models.order.OrderReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after an Approval Flow is completed and reaches a final status.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowCompletedMessage approvalFlowCompletedMessage = ApprovalFlowCompletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .status(ApprovalFlowStatus.PENDING)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalFlowCompleted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowCompletedMessageImpl.class)
public interface ApprovalFlowCompletedMessage extends Message {

    /**
     * discriminator value for ApprovalFlowCompletedMessage
     */
    String APPROVAL_FLOW_COMPLETED = "ApprovalFlowCompleted";

    /**
     *  <p>Final status of the Approval Flow.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ApprovalFlowStatus getStatus();

    /**
     *  <p>Reference to the Order related to the completed Approval Flow.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public OrderReference getOrder();

    /**
     *  <p>Final status of the Approval Flow.</p>
     * @param status value to be set
     */

    public void setStatus(final ApprovalFlowStatus status);

    /**
     *  <p>Reference to the Order related to the completed Approval Flow.</p>
     * @param order value to be set
     */

    public void setOrder(final OrderReference order);

    /**
     * factory method
     * @return instance of ApprovalFlowCompletedMessage
     */
    public static ApprovalFlowCompletedMessage of() {
        return new ApprovalFlowCompletedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowCompletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowCompletedMessage of(final ApprovalFlowCompletedMessage template) {
        ApprovalFlowCompletedMessageImpl instance = new ApprovalFlowCompletedMessageImpl();
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
        instance.setOrder(template.getOrder());
        return instance;
    }

    public ApprovalFlowCompletedMessage copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowCompletedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowCompletedMessage deepCopy(@Nullable final ApprovalFlowCompletedMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowCompletedMessageImpl instance = new ApprovalFlowCompletedMessageImpl();
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
        instance.setOrder(com.commercetools.api.models.order.OrderReference.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowCompletedMessage
     * @return builder
     */
    public static ApprovalFlowCompletedMessageBuilder builder() {
        return ApprovalFlowCompletedMessageBuilder.of();
    }

    /**
     * create builder for ApprovalFlowCompletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowCompletedMessageBuilder builder(final ApprovalFlowCompletedMessage template) {
        return ApprovalFlowCompletedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowCompletedMessage(Function<ApprovalFlowCompletedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowCompletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowCompletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowCompletedMessage>";
            }
        };
    }
}
