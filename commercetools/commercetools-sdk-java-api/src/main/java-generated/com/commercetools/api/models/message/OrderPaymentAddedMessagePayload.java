
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderAddPaymentAction" rel="nofollow">Add Payment</a> update action or when a <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> is added via <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddPaymentAction" rel="nofollow">Order Edits</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentAddedMessagePayload orderPaymentAddedMessagePayload = OrderPaymentAddedMessagePayload.builder()
 *             .paymentRef(paymentRefBuilder -> paymentRefBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderPaymentAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPaymentAddedMessagePayloadImpl.class)
public interface OrderPaymentAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for OrderPaymentAddedMessagePayload
     */
    String ORDER_PAYMENT_ADDED = "OrderPaymentAdded";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return paymentRef
     */
    @NotNull
    @Valid
    @JsonProperty("paymentRef")
    public PaymentReference getPaymentRef();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param paymentRef value to be set
     */

    public void setPaymentRef(final PaymentReference paymentRef);

    /**
     * factory method
     * @return instance of OrderPaymentAddedMessagePayload
     */
    public static OrderPaymentAddedMessagePayload of() {
        return new OrderPaymentAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderPaymentAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPaymentAddedMessagePayload of(final OrderPaymentAddedMessagePayload template) {
        OrderPaymentAddedMessagePayloadImpl instance = new OrderPaymentAddedMessagePayloadImpl();
        instance.setPaymentRef(template.getPaymentRef());
        return instance;
    }

    public OrderPaymentAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderPaymentAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPaymentAddedMessagePayload deepCopy(@Nullable final OrderPaymentAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderPaymentAddedMessagePayloadImpl instance = new OrderPaymentAddedMessagePayloadImpl();
        instance.setPaymentRef(
            com.commercetools.api.models.payment.PaymentReference.deepCopy(template.getPaymentRef()));
        return instance;
    }

    /**
     * builder factory method for OrderPaymentAddedMessagePayload
     * @return builder
     */
    public static OrderPaymentAddedMessagePayloadBuilder builder() {
        return OrderPaymentAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderPaymentAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentAddedMessagePayloadBuilder builder(final OrderPaymentAddedMessagePayload template) {
        return OrderPaymentAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPaymentAddedMessagePayload(Function<OrderPaymentAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentAddedMessagePayload>";
            }
        };
    }
}
