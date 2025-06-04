
package com.commercetools.api.models.event;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.order.OrderReference;
import com.commercetools.api.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The <code>data</code> payload of all payment related event messages.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutMessagePaymentsPayloadBaseData checkoutMessagePaymentsPayloadBaseData = CheckoutMessagePaymentsPayloadBaseData.builder()
 *             .projectKey("{projectKey}")
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .transactionId("{transactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutMessagePaymentsPayloadBaseDataImpl.class)
public interface CheckoutMessagePaymentsPayloadBaseData {

    /**
     *  <p><code>key</code> of the Project where the payment was made.</p>
     * @return projectKey
     */
    @NotNull
    @JsonProperty("projectKey")
    public String getProjectKey();

    /**
     *  <p>The Payment on which the change or action was performed.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentReference getPayment();

    /**
     *  <p><code>id</code> of the Transaction.</p>
     * @return transactionId
     */
    @NotNull
    @JsonProperty("transactionId")
    public String getTransactionId();

    /**
     *  <p>The Cart on which the change or action was performed.</p>
     * @return cart
     */
    @Valid
    @JsonProperty("cart")
    public CartReference getCart();

    /**
     *  <p>The Order on which the change or action was performed.</p>
     * @return order
     */
    @Valid
    @JsonProperty("order")
    public OrderReference getOrder();

    /**
     *  <p><code>key</code> of the Project where the payment was made.</p>
     * @param projectKey value to be set
     */

    public void setProjectKey(final String projectKey);

    /**
     *  <p>The Payment on which the change or action was performed.</p>
     * @param payment value to be set
     */

    public void setPayment(final PaymentReference payment);

    /**
     *  <p><code>id</code> of the Transaction.</p>
     * @param transactionId value to be set
     */

    public void setTransactionId(final String transactionId);

    /**
     *  <p>The Cart on which the change or action was performed.</p>
     * @param cart value to be set
     */

    public void setCart(final CartReference cart);

    /**
     *  <p>The Order on which the change or action was performed.</p>
     * @param order value to be set
     */

    public void setOrder(final OrderReference order);

    /**
     * factory method
     * @return instance of CheckoutMessagePaymentsPayloadBaseData
     */
    public static CheckoutMessagePaymentsPayloadBaseData of() {
        return new CheckoutMessagePaymentsPayloadBaseDataImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutMessagePaymentsPayloadBaseData
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutMessagePaymentsPayloadBaseData of(final CheckoutMessagePaymentsPayloadBaseData template) {
        CheckoutMessagePaymentsPayloadBaseDataImpl instance = new CheckoutMessagePaymentsPayloadBaseDataImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setPayment(template.getPayment());
        instance.setTransactionId(template.getTransactionId());
        instance.setCart(template.getCart());
        instance.setOrder(template.getOrder());
        return instance;
    }

    public CheckoutMessagePaymentsPayloadBaseData copyDeep();

    /**
     * factory method to create a deep copy of CheckoutMessagePaymentsPayloadBaseData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutMessagePaymentsPayloadBaseData deepCopy(
            @Nullable final CheckoutMessagePaymentsPayloadBaseData template) {
        if (template == null) {
            return null;
        }
        CheckoutMessagePaymentsPayloadBaseDataImpl instance = new CheckoutMessagePaymentsPayloadBaseDataImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setPayment(com.commercetools.api.models.payment.PaymentReference.deepCopy(template.getPayment()));
        instance.setTransactionId(template.getTransactionId());
        instance.setCart(com.commercetools.api.models.cart.CartReference.deepCopy(template.getCart()));
        instance.setOrder(com.commercetools.api.models.order.OrderReference.deepCopy(template.getOrder()));
        return instance;
    }

    /**
     * builder factory method for CheckoutMessagePaymentsPayloadBaseData
     * @return builder
     */
    public static CheckoutMessagePaymentsPayloadBaseDataBuilder builder() {
        return CheckoutMessagePaymentsPayloadBaseDataBuilder.of();
    }

    /**
     * create builder for CheckoutMessagePaymentsPayloadBaseData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutMessagePaymentsPayloadBaseDataBuilder builder(
            final CheckoutMessagePaymentsPayloadBaseData template) {
        return CheckoutMessagePaymentsPayloadBaseDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutMessagePaymentsPayloadBaseData(
            Function<CheckoutMessagePaymentsPayloadBaseData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutMessagePaymentsPayloadBaseData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutMessagePaymentsPayloadBaseData>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutMessagePaymentsPayloadBaseData>";
            }
        };
    }
}
