
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
 *  <p>Generated when the Application does not support the requested Checkout <span>mode</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidMode invalidMode = InvalidMode.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("invalid_mode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidModeImpl.class)
public interface InvalidMode extends Message {

    /**
     * discriminator value for InvalidMode
     */
    String INVALID_MODE = "invalid_mode";

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
     *  <p>`{mode}<code>mode requires an application with mode type</code>{modeTypeRequested}<code>. Current mode </code>{modeTypeReceived}`.</p>
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
     *  <p>`{mode}<code>mode requires an application with mode type</code>{modeTypeRequested}<code>. Current mode </code>{modeTypeReceived}`.</p>
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
     * @return instance of InvalidMode
     */
    public static InvalidMode of() {
        return new InvalidModeImpl();
    }

    /**
     * factory method to create a shallow copy InvalidMode
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidMode of(final InvalidMode template) {
        InvalidModeImpl instance = new InvalidModeImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public InvalidMode copyDeep();

    /**
     * factory method to create a deep copy of InvalidMode
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidMode deepCopy(@Nullable final InvalidMode template) {
        if (template == null) {
            return null;
        }
        InvalidModeImpl instance = new InvalidModeImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for InvalidMode
     * @return builder
     */
    public static InvalidModeBuilder builder() {
        return InvalidModeBuilder.of();
    }

    /**
     * create builder for InvalidMode instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidModeBuilder builder(final InvalidMode template) {
        return InvalidModeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidMode(Function<InvalidMode, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidMode> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidMode>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidMode>";
            }
        };
    }
}
