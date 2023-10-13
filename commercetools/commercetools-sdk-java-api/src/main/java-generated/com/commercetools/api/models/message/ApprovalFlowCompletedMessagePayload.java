
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.approval_flow.ApprovalFlowStatus;
import com.commercetools.api.models.order.OrderReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after an Approval Flow is completed and reaches a final status.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowCompletedMessagePayload approvalFlowCompletedMessagePayload = ApprovalFlowCompletedMessagePayload.builder()
 *             .status(ApprovalFlowStatus.PENDING)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowCompletedMessagePayloadImpl.class)
public interface ApprovalFlowCompletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalFlowCompletedMessagePayload
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
     * @return instance of ApprovalFlowCompletedMessagePayload
     */
    public static ApprovalFlowCompletedMessagePayload of() {
        return new ApprovalFlowCompletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowCompletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowCompletedMessagePayload of(final ApprovalFlowCompletedMessagePayload template) {
        ApprovalFlowCompletedMessagePayloadImpl instance = new ApprovalFlowCompletedMessagePayloadImpl();
        instance.setStatus(template.getStatus());
        instance.setOrder(template.getOrder());
        return instance;
    }

    /**
     * factory method to create a deep copy of ApprovalFlowCompletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowCompletedMessagePayload deepCopy(
            @Nullable final ApprovalFlowCompletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowCompletedMessagePayloadImpl instance = new ApprovalFlowCompletedMessagePayloadImpl();
        instance.setStatus(template.getStatus());
        instance.setOrder(com.commercetools.api.models.order.OrderReference.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowCompletedMessagePayload
     * @return builder
     */
    public static ApprovalFlowCompletedMessagePayloadBuilder builder() {
        return ApprovalFlowCompletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalFlowCompletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowCompletedMessagePayloadBuilder builder(
            final ApprovalFlowCompletedMessagePayload template) {
        return ApprovalFlowCompletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowCompletedMessagePayload(Function<ApprovalFlowCompletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowCompletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowCompletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowCompletedMessagePayload>";
            }
        };
    }
}
