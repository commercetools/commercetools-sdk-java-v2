
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
 *  <p>Generated after an <span>approval in the Approval Flow</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApprovalFlowApprovedMessagePayload approvalFlowApprovedMessagePayload = ApprovalFlowApprovedMessagePayload.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ApprovalFlowApproved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApprovalFlowApprovedMessagePayloadImpl.class)
public interface ApprovalFlowApprovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ApprovalFlowApprovedMessagePayload
     */
    String APPROVAL_FLOW_APPROVED = "ApprovalFlowApproved";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who approved the <span>Approval Flow</span>.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public CustomerReference getAssociate();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that received the approval.</p>
     * @return order
     */
    @NotNull
    @Valid
    @JsonProperty("order")
    public OrderReference getOrder();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> who approved the <span>Approval Flow</span>.</p>
     * @param associate value to be set
     */

    public void setAssociate(final CustomerReference associate);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> that received the approval.</p>
     * @param order value to be set
     */

    public void setOrder(final OrderReference order);

    /**
     * factory method
     * @return instance of ApprovalFlowApprovedMessagePayload
     */
    public static ApprovalFlowApprovedMessagePayload of() {
        return new ApprovalFlowApprovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ApprovalFlowApprovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApprovalFlowApprovedMessagePayload of(final ApprovalFlowApprovedMessagePayload template) {
        ApprovalFlowApprovedMessagePayloadImpl instance = new ApprovalFlowApprovedMessagePayloadImpl();
        instance.setAssociate(template.getAssociate());
        instance.setOrder(template.getOrder());
        return instance;
    }

    public ApprovalFlowApprovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ApprovalFlowApprovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApprovalFlowApprovedMessagePayload deepCopy(
            @Nullable final ApprovalFlowApprovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ApprovalFlowApprovedMessagePayloadImpl instance = new ApprovalFlowApprovedMessagePayloadImpl();
        instance.setAssociate(
            com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getAssociate()));
        instance.setOrder(com.commercetools.api.models.order.OrderReference.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for ApprovalFlowApprovedMessagePayload
     * @return builder
     */
    public static ApprovalFlowApprovedMessagePayloadBuilder builder() {
        return ApprovalFlowApprovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ApprovalFlowApprovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApprovalFlowApprovedMessagePayloadBuilder builder(final ApprovalFlowApprovedMessagePayload template) {
        return ApprovalFlowApprovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApprovalFlowApprovedMessagePayload(Function<ApprovalFlowApprovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowApprovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApprovalFlowApprovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ApprovalFlowApprovedMessagePayload>";
            }
        };
    }
}
