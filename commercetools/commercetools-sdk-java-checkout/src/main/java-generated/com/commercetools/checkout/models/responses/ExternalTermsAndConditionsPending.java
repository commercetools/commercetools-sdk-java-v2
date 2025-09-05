
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
 *  <p>Generated in Payment Only <span>mode</span> when the customer hasn't accepted the terms and conditions yet.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalTermsAndConditionsPending externalTermsAndConditionsPending = ExternalTermsAndConditionsPending.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("external_terms_and_conditions_pending")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExternalTermsAndConditionsPendingImpl.class)
public interface ExternalTermsAndConditionsPending extends Message {

    /**
     * discriminator value for ExternalTermsAndConditionsPending
     */
    String EXTERNAL_TERMS_AND_CONDITIONS_PENDING = "external_terms_and_conditions_pending";

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
     *  <p>External terms and conditions pending.</p>
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
     *  <p>External terms and conditions pending.</p>
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
     * @return instance of ExternalTermsAndConditionsPending
     */
    public static ExternalTermsAndConditionsPending of() {
        return new ExternalTermsAndConditionsPendingImpl();
    }

    /**
     * factory method to create a shallow copy ExternalTermsAndConditionsPending
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExternalTermsAndConditionsPending of(final ExternalTermsAndConditionsPending template) {
        ExternalTermsAndConditionsPendingImpl instance = new ExternalTermsAndConditionsPendingImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public ExternalTermsAndConditionsPending copyDeep();

    /**
     * factory method to create a deep copy of ExternalTermsAndConditionsPending
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExternalTermsAndConditionsPending deepCopy(
            @Nullable final ExternalTermsAndConditionsPending template) {
        if (template == null) {
            return null;
        }
        ExternalTermsAndConditionsPendingImpl instance = new ExternalTermsAndConditionsPendingImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for ExternalTermsAndConditionsPending
     * @return builder
     */
    public static ExternalTermsAndConditionsPendingBuilder builder() {
        return ExternalTermsAndConditionsPendingBuilder.of();
    }

    /**
     * create builder for ExternalTermsAndConditionsPending instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalTermsAndConditionsPendingBuilder builder(final ExternalTermsAndConditionsPending template) {
        return ExternalTermsAndConditionsPendingBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExternalTermsAndConditionsPending(Function<ExternalTermsAndConditionsPending, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExternalTermsAndConditionsPending> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalTermsAndConditionsPending>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalTermsAndConditionsPending>";
            }
        };
    }
}
