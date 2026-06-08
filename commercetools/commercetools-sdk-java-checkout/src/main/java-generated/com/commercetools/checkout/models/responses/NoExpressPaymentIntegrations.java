
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
 *  <p>Generated when no express payment integrations are configured.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NoExpressPaymentIntegrations noExpressPaymentIntegrations = NoExpressPaymentIntegrations.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("no_express_payment_integrations")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NoExpressPaymentIntegrationsImpl.class)
public interface NoExpressPaymentIntegrations extends Message {

    /**
     * discriminator value for NoExpressPaymentIntegrations
     */
    String NO_EXPRESS_PAYMENT_INTEGRATIONS = "no_express_payment_integrations";

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
     *  <p>There are no Express Payments integrations configured.</p>
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
     *  <p>There are no Express Payments integrations configured.</p>
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
     * @return instance of NoExpressPaymentIntegrations
     */
    public static NoExpressPaymentIntegrations of() {
        return new NoExpressPaymentIntegrationsImpl();
    }

    /**
     * factory method to create a shallow copy NoExpressPaymentIntegrations
     * @param template instance to be copied
     * @return copy instance
     */
    public static NoExpressPaymentIntegrations of(final NoExpressPaymentIntegrations template) {
        NoExpressPaymentIntegrationsImpl instance = new NoExpressPaymentIntegrationsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public NoExpressPaymentIntegrations copyDeep();

    /**
     * factory method to create a deep copy of NoExpressPaymentIntegrations
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NoExpressPaymentIntegrations deepCopy(@Nullable final NoExpressPaymentIntegrations template) {
        if (template == null) {
            return null;
        }
        NoExpressPaymentIntegrationsImpl instance = new NoExpressPaymentIntegrationsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for NoExpressPaymentIntegrations
     * @return builder
     */
    public static NoExpressPaymentIntegrationsBuilder builder() {
        return NoExpressPaymentIntegrationsBuilder.of();
    }

    /**
     * create builder for NoExpressPaymentIntegrations instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NoExpressPaymentIntegrationsBuilder builder(final NoExpressPaymentIntegrations template) {
        return NoExpressPaymentIntegrationsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNoExpressPaymentIntegrations(Function<NoExpressPaymentIntegrations, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NoExpressPaymentIntegrations> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NoExpressPaymentIntegrations>() {
            @Override
            public String toString() {
                return "TypeReference<NoExpressPaymentIntegrations>";
            }
        };
    }
}
