
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
 *  <p>Generated when the customer completes the checkout process.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutCompleted checkoutCompleted = CheckoutCompleted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("checkout_completed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutCompletedImpl.class)
public interface CheckoutCompleted extends ResponseMessage {

    /**
     * discriminator value for CheckoutCompleted
     */
    String CHECKOUT_COMPLETED = "checkout_completed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`info`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>Checkout for <code>{orderId}</code> completed.</p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */
    @NotNull
    @JsonProperty("correlationId")
    public String getCorrelationId();

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Checkout for <code>{orderId}</code> completed.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     * factory method
     * @return instance of CheckoutCompleted
     */
    public static CheckoutCompleted of() {
        return new CheckoutCompletedImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutCompleted
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutCompleted of(final CheckoutCompleted template) {
        CheckoutCompletedImpl instance = new CheckoutCompletedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public CheckoutCompleted copyDeep();

    /**
     * factory method to create a deep copy of CheckoutCompleted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutCompleted deepCopy(@Nullable final CheckoutCompleted template) {
        if (template == null) {
            return null;
        }
        CheckoutCompletedImpl instance = new CheckoutCompletedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for CheckoutCompleted
     * @return builder
     */
    public static CheckoutCompletedBuilder builder() {
        return CheckoutCompletedBuilder.of();
    }

    /**
     * create builder for CheckoutCompleted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutCompletedBuilder builder(final CheckoutCompleted template) {
        return CheckoutCompletedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutCompleted(Function<CheckoutCompleted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutCompleted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutCompleted>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutCompleted>";
            }
        };
    }
}
