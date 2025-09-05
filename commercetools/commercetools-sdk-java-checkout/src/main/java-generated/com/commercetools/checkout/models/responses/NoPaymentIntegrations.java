
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
 *  <p>Generated when no payment integration is set up for an <span>Application</span>. Add at least one Payment integration to the Application in the Merchant Center.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NoPaymentIntegrations noPaymentIntegrations = NoPaymentIntegrations.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("no_payment_integrations")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = NoPaymentIntegrationsImpl.class)
public interface NoPaymentIntegrations extends Message {

    /**
     * discriminator value for NoPaymentIntegrations
     */
    String NO_PAYMENT_INTEGRATIONS = "no_payment_integrations";

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
     *  <p>There are no payment integrations configured.</p>
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
     *  <p>There are no payment integrations configured.</p>
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
     * @return instance of NoPaymentIntegrations
     */
    public static NoPaymentIntegrations of() {
        return new NoPaymentIntegrationsImpl();
    }

    /**
     * factory method to create a shallow copy NoPaymentIntegrations
     * @param template instance to be copied
     * @return copy instance
     */
    public static NoPaymentIntegrations of(final NoPaymentIntegrations template) {
        NoPaymentIntegrationsImpl instance = new NoPaymentIntegrationsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public NoPaymentIntegrations copyDeep();

    /**
     * factory method to create a deep copy of NoPaymentIntegrations
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static NoPaymentIntegrations deepCopy(@Nullable final NoPaymentIntegrations template) {
        if (template == null) {
            return null;
        }
        NoPaymentIntegrationsImpl instance = new NoPaymentIntegrationsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for NoPaymentIntegrations
     * @return builder
     */
    public static NoPaymentIntegrationsBuilder builder() {
        return NoPaymentIntegrationsBuilder.of();
    }

    /**
     * create builder for NoPaymentIntegrations instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NoPaymentIntegrationsBuilder builder(final NoPaymentIntegrations template) {
        return NoPaymentIntegrationsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withNoPaymentIntegrations(Function<NoPaymentIntegrations, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<NoPaymentIntegrations> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<NoPaymentIntegrations>() {
            @Override
            public String toString() {
                return "TypeReference<NoPaymentIntegrations>";
            }
        };
    }
}
