
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
 *  <p>Generated when the configuration properties are passed successfully with the <code>checkoutFlow</code> or <code>paymentFlow</code> <span>method</span> and the checkout process starts.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutStarted checkoutStarted = CheckoutStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("checkout_started")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutStartedImpl.class)
public interface CheckoutStarted extends Message {

    /**
     * discriminator value for CheckoutStarted
     */
    String CHECKOUT_STARTED = "checkout_started";

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
     *  <p>Checkout started.</p>
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
     *  <p>Checkout started.</p>
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
     * @return instance of CheckoutStarted
     */
    public static CheckoutStarted of() {
        return new CheckoutStartedImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutStarted
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutStarted of(final CheckoutStarted template) {
        CheckoutStartedImpl instance = new CheckoutStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public CheckoutStarted copyDeep();

    /**
     * factory method to create a deep copy of CheckoutStarted
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutStarted deepCopy(@Nullable final CheckoutStarted template) {
        if (template == null) {
            return null;
        }
        CheckoutStartedImpl instance = new CheckoutStartedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for CheckoutStarted
     * @return builder
     */
    public static CheckoutStartedBuilder builder() {
        return CheckoutStartedBuilder.of();
    }

    /**
     * create builder for CheckoutStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutStartedBuilder builder(final CheckoutStarted template) {
        return CheckoutStartedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutStarted(Function<CheckoutStarted, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutStarted> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutStarted>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutStarted>";
            }
        };
    }
}
