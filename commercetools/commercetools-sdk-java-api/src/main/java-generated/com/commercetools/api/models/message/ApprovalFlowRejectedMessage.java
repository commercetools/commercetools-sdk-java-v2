
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
 *  <p>Generated after an <span>Approval Flow is rejected</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowRejectedMessage approvalFlowRejectedMessage = ApprovalFlowRejectedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalFlowRejected")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowRejectedMessageImpl.class)
public interface ApprovalFlowRejectedMessage extends Message {

    /**
     * discriminator value for ApprovalFlowRejectedMessage
     */
    String APPROVAL_FLOW_REJECTED = "ApprovalFlowRejected";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who rejected the <span>Approval Flow</span>.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public CustomerReference getAssociate();

    /**
     *  <p>Description of the reason why the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> was rejected.</p>
     * @return rejectionReason
     */

    @JsonProperty("rejectionReason")
    public String getRejectionReason();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that received the rejection.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public OrderReference getOrder();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who rejected the <span>Approval Flow</span>.</p>
     * @param associate value to be set
     */

    public void setAssociate(final CustomerReference associate);

    /**
     *  <p>Description of the reason why the <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">Approval Flow</a> was rejected.</p>
     * @param rejectionReason value to be set
     */

    public void setRejectionReason(final String rejectionReason);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that received the rejection.</p>
     * @param order value to be set
     */

    public void setOrder(final OrderReference order);

    /**
     * factory method
     * @return instance of ApprovalFlowRejectedMessage
     */
    public static ApprovalFlowRejectedMessage of() {
        return new ApprovalFlowRejectedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowRejectedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowRejectedMessage of(final ApprovalFlowRejectedMessage template) {
        ApprovalFlowRejectedMessageImpl instance = new ApprovalFlowRejectedMessageImpl();
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
        instance.setRejectionReason(template.getRejectionReason());
        instance.setOrder(template.getOrder());
        return instance;
    }

    public ApprovalFlowRejectedMessage copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowRejectedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowRejectedMessage deepCopy(@Nullable final ApprovalFlowRejectedMessage template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowRejectedMessageImpl instance = new ApprovalFlowRejectedMessageImpl();
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
        instance.setRejectionReason(template.getRejectionReason());
        instance.setOrder(com.commercetools.api.models.order.OrderReference.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowRejectedMessage
     * @return builder
     */
    public static ApprovalFlowRejectedMessageBuilder builder() {
        return ApprovalFlowRejectedMessageBuilder.of();
    }

    /**
     * create builder for ApprovalFlowRejectedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowRejectedMessageBuilder builder(final ApprovalFlowRejectedMessage template) {
        return ApprovalFlowRejectedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowRejectedMessage(Function<ApprovalFlowRejectedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowRejectedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowRejectedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowRejectedMessage>";
            }
        };
    }
}
