
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderRemovePaymentAction" rel="nofollow">Remove Payment</a> update action or when a <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> is removed via <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemovePaymentAction" rel="nofollow">Order Edits</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentRemovedMessagePayload orderPaymentRemovedMessagePayload = OrderPaymentRemovedMessagePayload.builder()
 *             .paymentRef(paymentRefBuilder -> paymentRefBuilder)
 *             .removedPaymentInfo(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderPaymentRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderPaymentRemovedMessagePayloadImpl.class)
public interface OrderPaymentRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for OrderPaymentRemovedMessagePayload
     */
    String ORDER_PAYMENT_REMOVED = "OrderPaymentRemoved";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return paymentRef
     */
    @NotNull
    @Valid
    @JsonProperty("paymentRef")
    public PaymentReference getPaymentRef();

    /**
     *  <p>Indicates whether the removal of the Payment resulted in no Payments remaining on the Order. The value is <code>true</code> if all Payments have been removed (none remain), and <code>false</code> if there are still Payments associated with the Order after the removal.</p>
     * @return removedPaymentInfo
     */
    @NotNull
    @JsonProperty("removedPaymentInfo")
    public Boolean getRemovedPaymentInfo();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param paymentRef value to be set
     */

    public void setPaymentRef(final PaymentReference paymentRef);

    /**
     *  <p>Indicates whether the removal of the Payment resulted in no Payments remaining on the Order. The value is <code>true</code> if all Payments have been removed (none remain), and <code>false</code> if there are still Payments associated with the Order after the removal.</p>
     * @param removedPaymentInfo value to be set
     */

    public void setRemovedPaymentInfo(final Boolean removedPaymentInfo);

    /**
     * factory method
     * @return instance of OrderPaymentRemovedMessagePayload
     */
    public static OrderPaymentRemovedMessagePayload of() {
        return new OrderPaymentRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderPaymentRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderPaymentRemovedMessagePayload of(final OrderPaymentRemovedMessagePayload template) {
        OrderPaymentRemovedMessagePayloadImpl instance = new OrderPaymentRemovedMessagePayloadImpl();
        instance.setPaymentRef(template.getPaymentRef());
        instance.setRemovedPaymentInfo(template.getRemovedPaymentInfo());
        return instance;
    }

    public OrderPaymentRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderPaymentRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderPaymentRemovedMessagePayload deepCopy(
            @Nullable final OrderPaymentRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderPaymentRemovedMessagePayloadImpl instance = new OrderPaymentRemovedMessagePayloadImpl();
        instance.setPaymentRef(
            com.commercetools.api.models.payment.PaymentReference.deepCopy(template.getPaymentRef()));
        instance.setRemovedPaymentInfo(template.getRemovedPaymentInfo());
        return instance;
    }

    /**
     * builder factory method for OrderPaymentRemovedMessagePayload
     * @return builder
     */
    public static OrderPaymentRemovedMessagePayloadBuilder builder() {
        return OrderPaymentRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderPaymentRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentRemovedMessagePayloadBuilder builder(final OrderPaymentRemovedMessagePayload template) {
        return OrderPaymentRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderPaymentRemovedMessagePayload(Function<OrderPaymentRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentRemovedMessagePayload>";
            }
        };
    }
}
