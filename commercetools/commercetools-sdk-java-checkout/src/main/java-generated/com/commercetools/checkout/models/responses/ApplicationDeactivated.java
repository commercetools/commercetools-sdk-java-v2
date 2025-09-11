
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
 *  <p>Generated when the requested <span>Application</span> is deactivated. Activate the Application in the Merchant Center to continue.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationDeactivated applicationDeactivated = ApplicationDeactivated.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("application_disabled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ApplicationDeactivatedImpl.class)
public interface ApplicationDeactivated extends ResponseMessage {

    /**
     * discriminator value for ApplicationDeactivated
     */
    String APPLICATION_DISABLED = "application_disabled";

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
     *  <p>Application <code>{applicationKey}</code> for <code>{projectKey}</code> is disabled.</p>
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
     *  <p>Contains the <code>project</code> and <code>application</code> objects with the related <code>key</code> property.</p>
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
     *  <p>Application <code>{applicationKey}</code> for <code>{projectKey}</code> is disabled.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>project</code> and <code>application</code> objects with the related <code>key</code> property.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of ApplicationDeactivated
     */
    public static ApplicationDeactivated of() {
        return new ApplicationDeactivatedImpl();
    }

    /**
     * factory method to create a shallow copy ApplicationDeactivated
     * @param template instance to be copied
     * @return copy instance
     */
    public static ApplicationDeactivated of(final ApplicationDeactivated template) {
        ApplicationDeactivatedImpl instance = new ApplicationDeactivatedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ApplicationDeactivated copyDeep();

    /**
     * factory method to create a deep copy of ApplicationDeactivated
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ApplicationDeactivated deepCopy(@Nullable final ApplicationDeactivated template) {
        if (template == null) {
            return null;
        }
        ApplicationDeactivatedImpl instance = new ApplicationDeactivatedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ApplicationDeactivated
     * @return builder
     */
    public static ApplicationDeactivatedBuilder builder() {
        return ApplicationDeactivatedBuilder.of();
    }

    /**
     * create builder for ApplicationDeactivated instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationDeactivatedBuilder builder(final ApplicationDeactivated template) {
        return ApplicationDeactivatedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withApplicationDeactivated(Function<ApplicationDeactivated, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ApplicationDeactivated> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ApplicationDeactivated>() {
            @Override
            public String toString() {
                return "TypeReference<ApplicationDeactivated>";
            }
        };
    }
}
