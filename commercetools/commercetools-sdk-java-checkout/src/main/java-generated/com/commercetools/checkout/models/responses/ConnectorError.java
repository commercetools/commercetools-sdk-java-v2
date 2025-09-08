
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
 *  <p>Generated when the <span>Connector</span> triggers an error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConnectorError connectorError = ConnectorError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("connector_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ConnectorErrorImpl.class)
public interface ConnectorError extends ResponseMessage {

    /**
     * discriminator value for ConnectorError
     */
    String CONNECTOR_ERROR = "connector_error";

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
     *  <p>Connector error.</p>
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
     *  <p>Contains the <code>connector</code> object with the <code>id</code> property and optional <code>error</code>, <code>message</code>, and <code>data</code> properties.</p>
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
     *  <p>Connector error.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>connector</code> object with the <code>id</code> property and optional <code>error</code>, <code>message</code>, and <code>data</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of ConnectorError
     */
    public static ConnectorError of() {
        return new ConnectorErrorImpl();
    }

    /**
     * factory method to create a shallow copy ConnectorError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ConnectorError of(final ConnectorError template) {
        ConnectorErrorImpl instance = new ConnectorErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ConnectorError copyDeep();

    /**
     * factory method to create a deep copy of ConnectorError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ConnectorError deepCopy(@Nullable final ConnectorError template) {
        if (template == null) {
            return null;
        }
        ConnectorErrorImpl instance = new ConnectorErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ConnectorError
     * @return builder
     */
    public static ConnectorErrorBuilder builder() {
        return ConnectorErrorBuilder.of();
    }

    /**
     * create builder for ConnectorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConnectorErrorBuilder builder(final ConnectorError template) {
        return ConnectorErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withConnectorError(Function<ConnectorError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ConnectorError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ConnectorError>() {
            @Override
            public String toString() {
                return "TypeReference<ConnectorError>";
            }
        };
    }
}
