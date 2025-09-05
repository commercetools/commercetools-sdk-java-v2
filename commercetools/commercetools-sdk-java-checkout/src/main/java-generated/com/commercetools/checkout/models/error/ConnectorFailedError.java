
package com.commercetools.checkout.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the payment <span>Connector</span> cannot be reached.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConnectorFailedError connectorFailedError = ConnectorFailedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ConnectorFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ConnectorFailedErrorImpl.class)
public interface ConnectorFailedError extends ErrorObject {

    /**
     * discriminator value for ConnectorFailedError
     */
    String CONNECTOR_FAILED = "ConnectorFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The connector could not be reached."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The connector could not be reached."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ConnectorFailedError
     */
    public static ConnectorFailedError of() {
        return new ConnectorFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy ConnectorFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ConnectorFailedError of(final ConnectorFailedError template) {
        ConnectorFailedErrorImpl instance = new ConnectorFailedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public ConnectorFailedError copyDeep();

    /**
     * factory method to create a deep copy of ConnectorFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ConnectorFailedError deepCopy(@Nullable final ConnectorFailedError template) {
        if (template == null) {
            return null;
        }
        ConnectorFailedErrorImpl instance = new ConnectorFailedErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    /**
     * builder factory method for ConnectorFailedError
     * @return builder
     */
    public static ConnectorFailedErrorBuilder builder() {
        return ConnectorFailedErrorBuilder.of();
    }

    /**
     * create builder for ConnectorFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConnectorFailedErrorBuilder builder(final ConnectorFailedError template) {
        return ConnectorFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withConnectorFailedError(Function<ConnectorFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ConnectorFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ConnectorFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<ConnectorFailedError>";
            }
        };
    }
}
