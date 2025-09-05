
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
 *  <p>Generated when the <span>Cart</span> was emptied during the checkout process. It is not possible to recover from this, the customer must restart the checkout process.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartEmptiedDuringCheckout cartEmptiedDuringCheckout = CartEmptiedDuringCheckout.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("cart_emptied_during_checkout")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartEmptiedDuringCheckoutImpl.class)
public interface CartEmptiedDuringCheckout extends ResponseMessage {

    /**
     * discriminator value for CartEmptiedDuringCheckout
     */
    String CART_EMPTIED_DURING_CHECKOUT = "cart_emptied_during_checkout";

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
     *  <p>Cart <code>{cartId}</code> was emptied during checkout.</p>
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
     *  <p>Cart <code>{cartId}</code> was emptied during checkout.</p>
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
     * @return instance of CartEmptiedDuringCheckout
     */
    public static CartEmptiedDuringCheckout of() {
        return new CartEmptiedDuringCheckoutImpl();
    }

    /**
     * factory method to create a shallow copy CartEmptiedDuringCheckout
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartEmptiedDuringCheckout of(final CartEmptiedDuringCheckout template) {
        CartEmptiedDuringCheckoutImpl instance = new CartEmptiedDuringCheckoutImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public CartEmptiedDuringCheckout copyDeep();

    /**
     * factory method to create a deep copy of CartEmptiedDuringCheckout
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartEmptiedDuringCheckout deepCopy(@Nullable final CartEmptiedDuringCheckout template) {
        if (template == null) {
            return null;
        }
        CartEmptiedDuringCheckoutImpl instance = new CartEmptiedDuringCheckoutImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for CartEmptiedDuringCheckout
     * @return builder
     */
    public static CartEmptiedDuringCheckoutBuilder builder() {
        return CartEmptiedDuringCheckoutBuilder.of();
    }

    /**
     * create builder for CartEmptiedDuringCheckout instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartEmptiedDuringCheckoutBuilder builder(final CartEmptiedDuringCheckout template) {
        return CartEmptiedDuringCheckoutBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartEmptiedDuringCheckout(Function<CartEmptiedDuringCheckout, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartEmptiedDuringCheckout> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartEmptiedDuringCheckout>() {
            @Override
            public String toString() {
                return "TypeReference<CartEmptiedDuringCheckout>";
            }
        };
    }
}
