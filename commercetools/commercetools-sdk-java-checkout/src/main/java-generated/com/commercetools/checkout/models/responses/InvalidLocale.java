
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
 *  <p>Generated when the provided locale is invalid.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidLocale invalidLocale = InvalidLocale.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("invalid_locale")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InvalidLocaleImpl.class)
public interface InvalidLocale extends ResponseMessage {

    /**
     * discriminator value for InvalidLocale
     */
    String INVALID_LOCALE = "invalid_locale";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>`warn`</p>
     * @return severity
     */
    @NotNull
    @JsonProperty("severity")
    public String getSeverity();

    /**
     *  <p>The provided <code>{locale}</code> is invalid.</p>
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
     *  <p>Contains the provided locale string, the related locale field (language or currency), and the used fallback one.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>The provided <code>{locale}</code> is invalid.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the provided locale string, the related locale field (language or currency), and the used fallback one.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of InvalidLocale
     */
    public static InvalidLocale of() {
        return new InvalidLocaleImpl();
    }

    /**
     * factory method to create a shallow copy InvalidLocale
     * @param template instance to be copied
     * @return copy instance
     */
    public static InvalidLocale of(final InvalidLocale template) {
        InvalidLocaleImpl instance = new InvalidLocaleImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public InvalidLocale copyDeep();

    /**
     * factory method to create a deep copy of InvalidLocale
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InvalidLocale deepCopy(@Nullable final InvalidLocale template) {
        if (template == null) {
            return null;
        }
        InvalidLocaleImpl instance = new InvalidLocaleImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for InvalidLocale
     * @return builder
     */
    public static InvalidLocaleBuilder builder() {
        return InvalidLocaleBuilder.of();
    }

    /**
     * create builder for InvalidLocale instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidLocaleBuilder builder(final InvalidLocale template) {
        return InvalidLocaleBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInvalidLocale(Function<InvalidLocale, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InvalidLocale> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InvalidLocale>() {
            @Override
            public String toString() {
                return "TypeReference<InvalidLocale>";
            }
        };
    }
}
