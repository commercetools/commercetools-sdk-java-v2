
package com.commercetools.checkout.models.responses;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when the customer cancels the checkout process.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutCancelled checkoutCancelled = CheckoutCancelled.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("checkout_cancelled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutCancelledImpl.class)
public interface CheckoutCancelled extends Message {

    /**
     * discriminator value for CheckoutCancelled
     */
    String CHECKOUT_CANCELLED = "checkout_cancelled";

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
     *  <p>Checkout cancelled.</p>
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
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Checkout cancelled.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     * factory method
     * @return instance of CheckoutCancelled
     */
    public static CheckoutCancelled of() {
        return new CheckoutCancelledImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutCancelled
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutCancelled of(final CheckoutCancelled template) {
        CheckoutCancelledImpl instance = new CheckoutCancelledImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public CheckoutCancelled copyDeep();

    /**
     * factory method to create a deep copy of CheckoutCancelled
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutCancelled deepCopy(@Nullable final CheckoutCancelled template) {
        if (template == null) {
            return null;
        }
        CheckoutCancelledImpl instance = new CheckoutCancelledImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for CheckoutCancelled
     * @return builder
     */
    public static CheckoutCancelledBuilder builder() {
        return CheckoutCancelledBuilder.of();
    }

    /**
     * create builder for CheckoutCancelled instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutCancelledBuilder builder(final CheckoutCancelled template) {
        return CheckoutCancelledBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutCancelled(Function<CheckoutCancelled, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutCancelled> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutCancelled>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutCancelled>";
            }
        };
    }
}
