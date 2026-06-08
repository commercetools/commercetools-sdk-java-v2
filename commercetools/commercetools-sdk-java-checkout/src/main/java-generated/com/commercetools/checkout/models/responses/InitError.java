
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
 *  <p>Generated when an error occurs during Checkout's initialization.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InitError initError = InitError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("init_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InitErrorImpl.class)
public interface InitError extends Message {

    /**
     * discriminator value for InitError
     */
    String INIT_ERROR = "init_error";

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
     *  <p>Error during initialization.</p>
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
     *  <p>Error during initialization.</p>
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
     * @return instance of InitError
     */
    public static InitError of() {
        return new InitErrorImpl();
    }

    /**
     * factory method to create a shallow copy InitError
     * @param template instance to be copied
     * @return copy instance
     */
    public static InitError of(final InitError template) {
        InitErrorImpl instance = new InitErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public InitError copyDeep();

    /**
     * factory method to create a deep copy of InitError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InitError deepCopy(@Nullable final InitError template) {
        if (template == null) {
            return null;
        }
        InitErrorImpl instance = new InitErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for InitError
     * @return builder
     */
    public static InitErrorBuilder builder() {
        return InitErrorBuilder.of();
    }

    /**
     * create builder for InitError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InitErrorBuilder builder(final InitError template) {
        return InitErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInitError(Function<InitError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InitError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InitError>() {
            @Override
            public String toString() {
                return "TypeReference<InitError>";
            }
        };
    }
}
