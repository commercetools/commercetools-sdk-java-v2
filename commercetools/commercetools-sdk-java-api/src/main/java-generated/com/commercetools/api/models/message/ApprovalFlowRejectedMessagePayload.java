
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
 *  <p>Generated after an Approval Flow is rejected.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowRejectedMessagePayload approvalFlowRejectedMessagePayload = ApprovalFlowRejectedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalFlowRejected")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowRejectedMessagePayloadImpl.class)
public interface ApprovalFlowRejectedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalFlowRejectedMessagePayload
     */
    String APPROVAL_FLOW_REJECTED = "ApprovalFlowRejected";

    /**
     *  <p>Reference to the Customer who rejected the Approval Flow.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public CustomerReference getAssociate();

    /**
     *  <p>Description of the reason why the Approval Flow was rejected.</p>
     * @return rejectionReason
     */

    @JsonProperty("rejectionReason")
    public String getRejectionReason();

    /**
     *  <p>Reference to the Order that received the rejection.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public OrderReference getOrder();

    /**
     *  <p>Reference to the Customer who rejected the Approval Flow.</p>
     * @param associate value to be set
     */

    public void setAssociate(final CustomerReference associate);

    /**
     *  <p>Description of the reason why the Approval Flow was rejected.</p>
     * @param rejectionReason value to be set
     */

    public void setRejectionReason(final String rejectionReason);

    /**
     *  <p>Reference to the Order that received the rejection.</p>
     * @param order value to be set
     */

    public void setOrder(final OrderReference order);

    /**
     * factory method
     * @return instance of ApprovalFlowRejectedMessagePayload
     */
    public static ApprovalFlowRejectedMessagePayload of() {
        return new ApprovalFlowRejectedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowRejectedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowRejectedMessagePayload of(final ApprovalFlowRejectedMessagePayload template) {
        ApprovalFlowRejectedMessagePayloadImpl instance = new ApprovalFlowRejectedMessagePayloadImpl();
        instance.setAssociate(template.getAssociate());
        instance.setRejectionReason(template.getRejectionReason());
        instance.setOrder(template.getOrder());
        return instance;
    }

    public ApprovalFlowRejectedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowRejectedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowRejectedMessagePayload deepCopy(
            @Nullable final ApprovalFlowRejectedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowRejectedMessagePayloadImpl instance = new ApprovalFlowRejectedMessagePayloadImpl();
        instance.setAssociate(
            com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getAssociate()));
        instance.setRejectionReason(template.getRejectionReason());
        instance.setOrder(com.commercetools.api.models.order.OrderReference.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowRejectedMessagePayload
     * @return builder
     */
    public static ApprovalFlowRejectedMessagePayloadBuilder builder() {
        return ApprovalFlowRejectedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalFlowRejectedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowRejectedMessagePayloadBuilder builder(final ApprovalFlowRejectedMessagePayload template) {
        return ApprovalFlowRejectedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowRejectedMessagePayload(Function<ApprovalFlowRejectedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowRejectedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowRejectedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowRejectedMessagePayload>";
            }
        };
    }
}
