
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when the payment <span>Connector</span> does not respond within the configured timeout of 30 seconds. The Connector may still be processing the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConnectorTimeoutError connectorTimeoutError = ConnectorTimeoutError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ConnectorTimeout")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ConnectorTimeoutErrorImpl.class)
public interface ConnectorTimeoutError extends ErrorObject {

    /**
     * discriminator value for ConnectorTimeoutError
     */
    String CONNECTOR_TIMEOUT = "ConnectorTimeout";

    /**
     *  <p>Error code, always <code>ConnectorTimeout</code>.</p>
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The connector did not respond within the configured timeout."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The connector did not respond within the configured timeout."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ConnectorTimeoutError
     */
    public static ConnectorTimeoutError of() {
        return new ConnectorTimeoutErrorImpl();
    }

    /**
     * factory method to create a shallow copy ConnectorTimeoutError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ConnectorTimeoutError of(final ConnectorTimeoutError template) {
        ConnectorTimeoutErrorImpl instance = new ConnectorTimeoutErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public ConnectorTimeoutError copyDeep();

    /**
     * factory method to create a deep copy of ConnectorTimeoutError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ConnectorTimeoutError deepCopy(@Nullable final ConnectorTimeoutError template) {
        if (template == null) {
            return null;
        }
        ConnectorTimeoutErrorImpl instance = new ConnectorTimeoutErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for ConnectorTimeoutError
     * @return builder
     */
    public static ConnectorTimeoutErrorBuilder builder() {
        return ConnectorTimeoutErrorBuilder.of();
    }

    /**
     * create builder for ConnectorTimeoutError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConnectorTimeoutErrorBuilder builder(final ConnectorTimeoutError template) {
        return ConnectorTimeoutErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withConnectorTimeoutError(Function<ConnectorTimeoutError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ConnectorTimeoutError> typeReference() {
        return new tools.jackson.core.type.TypeReference<ConnectorTimeoutError>() {
            @Override
            public String toString() {
                return "TypeReference<ConnectorTimeoutError>";
            }
        };
    }
}
