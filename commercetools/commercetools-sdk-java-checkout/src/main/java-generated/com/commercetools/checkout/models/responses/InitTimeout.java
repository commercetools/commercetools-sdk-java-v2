
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
 *  <p>Generated when Checkout does not receive the configuration properties with the <code>checkoutFlow</code> or <code>paymentFlow</code> <span>method</span> on time.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InitTimeout initTimeout = InitTimeout.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("init_timeout")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InitTimeoutImpl.class)
public interface InitTimeout extends Message {

    /**
     * discriminator value for InitTimeout
     */
    String INIT_TIMEOUT = "init_timeout";

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
     *  <p>Timeout error, no init message received.</p>
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
     *  <p>`error`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Timeout error, no init message received.</p>
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
     * @return instance of InitTimeout
     */
    public static InitTimeout of() {
        return new InitTimeoutImpl();
    }

    /**
     * factory method to create a shallow copy InitTimeout
     * @param template instance to be copied
     * @return copy instance
     */
    public static InitTimeout of(final InitTimeout template) {
        InitTimeoutImpl instance = new InitTimeoutImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public InitTimeout copyDeep();

    /**
     * factory method to create a deep copy of InitTimeout
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InitTimeout deepCopy(@Nullable final InitTimeout template) {
        if (template == null) {
            return null;
        }
        InitTimeoutImpl instance = new InitTimeoutImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for InitTimeout
     * @return builder
     */
    public static InitTimeoutBuilder builder() {
        return InitTimeoutBuilder.of();
    }

    /**
     * create builder for InitTimeout instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InitTimeoutBuilder builder(final InitTimeout template) {
        return InitTimeoutBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInitTimeout(Function<InitTimeout, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InitTimeout> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InitTimeout>() {
            @Override
            public String toString() {
                return "TypeReference<InitTimeout>";
            }
        };
    }
}
