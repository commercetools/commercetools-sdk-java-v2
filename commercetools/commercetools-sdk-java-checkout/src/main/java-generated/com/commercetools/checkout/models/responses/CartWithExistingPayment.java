
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when trying to add a <span>Payment</span> to a <span>Cart</span> that already references an approved Payment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartWithExistingPayment cartWithExistingPayment = CartWithExistingPayment.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("cart_with_exisiting_payment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartWithExistingPaymentImpl.class)
public interface CartWithExistingPayment extends ResponseMessage {

    /**
     * discriminator value for CartWithExistingPayment
     */
    String CART_WITH_EXISITING_PAYMENT = "cart_with_exisiting_payment";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`error`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Cart with existing approved payment.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Cart with existing approved payment.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of CartWithExistingPayment
     */
    public static CartWithExistingPayment of() {
        return new CartWithExistingPaymentImpl();
    }

    /**
     * factory method to create a shallow copy CartWithExistingPayment
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartWithExistingPayment of(final CartWithExistingPayment template) {
        CartWithExistingPaymentImpl instance = new CartWithExistingPaymentImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public CartWithExistingPayment copyDeep();

    /**
     * factory method to create a deep copy of CartWithExistingPayment
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartWithExistingPayment deepCopy(@Nullable final CartWithExistingPayment template) {
        if (template == null) {
            return null;
        }
        CartWithExistingPaymentImpl instance = new CartWithExistingPaymentImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for CartWithExistingPayment
     * @return builder
     */
    public static CartWithExistingPaymentBuilder builder() {
        return CartWithExistingPaymentBuilder.of();
    }

    /**
     * create builder for CartWithExistingPayment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartWithExistingPaymentBuilder builder(final CartWithExistingPayment template) {
        return CartWithExistingPaymentBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartWithExistingPayment(Function<CartWithExistingPayment, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartWithExistingPayment> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartWithExistingPayment>() {
            @Override
            public String toString() {
                return "TypeReference<CartWithExistingPayment>";
            }
        };
    }
}
