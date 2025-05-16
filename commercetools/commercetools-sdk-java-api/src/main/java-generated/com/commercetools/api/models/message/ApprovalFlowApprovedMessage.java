
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.order.OrderReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after an approval in the Approval Flow.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowApprovedMessage approvalFlowApprovedMessage = ApprovalFlowApprovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .associate(associateBuilder -> associateBuilder)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalFlowApproved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowApprovedMessageImpl.class)
public interface ApprovalFlowApprovedMessage extends Message {

    /**
     * discriminator value for ApprovalFlowApprovedMessage
     */
    String APPROVAL_FLOW_APPROVED = "ApprovalFlowApproved";

    /**
     *  <p>Reference to the Customer who approved the Approval Flow.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public CustomerReference getAssociate();

    /**
     *  <p>Reference to the Order that received the approval.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public OrderReference getOrder();

    /**
     *  <p>Reference to the Customer who approved the Approval Flow.</p>
     * @param associate value to be set
     */

    public void setAssociate(final CustomerReference associate);

    /**
     *  <p>Reference to the Order that received the approval.</p>
     * @param order value to be set
     */

    public void setOrder(final OrderReference order);

    /**
     * factory method
     * @return instance of ApprovalFlowApprovedMessage
     */
    public static ApprovalFlowApprovedMessage of() {
        return new ApprovalFlowApprovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowApprovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowApprovedMessage of(final ApprovalFlowApprovedMessage template) {
        ApprovalFlowApprovedMessageImpl instance = new ApprovalFlowApprovedMessageImpl();
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
        instance.setAssociate(template.getAssociate());
        instance.setOrder(template.getOrder());
        return instance;
    }

    public ApprovalFlowApprovedMessage copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowApprovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowApprovedMessage deepCopy(@Nullable final ApprovalFlowApprovedMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowApprovedMessageImpl instance = new ApprovalFlowApprovedMessageImpl();
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
        instance.setAssociate(
            com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getAssociate()));
        instance.setOrder(com.commercetools.api.models.order.OrderReference.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowApprovedMessage
     * @return builder
     */
    public static ApprovalFlowApprovedMessageBuilder builder() {
        return ApprovalFlowApprovedMessageBuilder.of();
    }

    /**
     * create builder for ApprovalFlowApprovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowApprovedMessageBuilder builder(final ApprovalFlowApprovedMessage template) {
        return ApprovalFlowApprovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowApprovedMessage(Function<ApprovalFlowApprovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowApprovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowApprovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowApprovedMessage>";
            }
        };
    }
}
