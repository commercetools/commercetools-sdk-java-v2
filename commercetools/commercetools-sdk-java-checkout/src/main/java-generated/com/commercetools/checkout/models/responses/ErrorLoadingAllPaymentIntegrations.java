
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
 *  <p>Generated when the loading of all the payment integrations have failed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorLoadingAllPaymentIntegrations errorLoadingAllPaymentIntegrations = ErrorLoadingAllPaymentIntegrations.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("error_loading_all_payment_integrations")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ErrorLoadingAllPaymentIntegrationsImpl.class)
public interface ErrorLoadingAllPaymentIntegrations extends Message {

    /**
     * discriminator value for ErrorLoadingAllPaymentIntegrations
     */
    String ERROR_LOADING_ALL_PAYMENT_INTEGRATIONS = "error_loading_all_payment_integrations";

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
     *  <p>Error loading all payment integrations.</p>
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
     *  <p>Error loading all payment integrations.</p>
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
     * @return instance of ErrorLoadingAllPaymentIntegrations
     */
    public static ErrorLoadingAllPaymentIntegrations of() {
        return new ErrorLoadingAllPaymentIntegrationsImpl();
    }

    /**
     * factory method to create a shallow copy ErrorLoadingAllPaymentIntegrations
     * @param template instance to be copied
     * @return copy instance
     */
    public static ErrorLoadingAllPaymentIntegrations of(final ErrorLoadingAllPaymentIntegrations template) {
        ErrorLoadingAllPaymentIntegrationsImpl instance = new ErrorLoadingAllPaymentIntegrationsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public ErrorLoadingAllPaymentIntegrations copyDeep();

    /**
     * factory method to create a deep copy of ErrorLoadingAllPaymentIntegrations
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ErrorLoadingAllPaymentIntegrations deepCopy(
            @Nullable final ErrorLoadingAllPaymentIntegrations template) {
        if (template == null) {
            return null;
        }
        ErrorLoadingAllPaymentIntegrationsImpl instance = new ErrorLoadingAllPaymentIntegrationsImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for ErrorLoadingAllPaymentIntegrations
     * @return builder
     */
    public static ErrorLoadingAllPaymentIntegrationsBuilder builder() {
        return ErrorLoadingAllPaymentIntegrationsBuilder.of();
    }

    /**
     * create builder for ErrorLoadingAllPaymentIntegrations instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ErrorLoadingAllPaymentIntegrationsBuilder builder(final ErrorLoadingAllPaymentIntegrations template) {
        return ErrorLoadingAllPaymentIntegrationsBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withErrorLoadingAllPaymentIntegrations(Function<ErrorLoadingAllPaymentIntegrations, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ErrorLoadingAllPaymentIntegrations> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ErrorLoadingAllPaymentIntegrations>() {
            @Override
            public String toString() {
                return "TypeReference<ErrorLoadingAllPaymentIntegrations>";
            }
        };
    }
}
