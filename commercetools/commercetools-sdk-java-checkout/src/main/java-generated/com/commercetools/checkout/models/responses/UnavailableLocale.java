
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
 *  <p>Generated when the provided <code>locale</code> is not <span>available for localization</span>. The localization falls back to English.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnavailableLocale unavailableLocale = UnavailableLocale.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("unavailable_locale")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UnavailableLocaleImpl.class)
public interface UnavailableLocale extends ResponseMessage {

    /**
     * discriminator value for UnavailableLocale
     */
    String UNAVAILABLE_LOCALE = "unavailable_locale";

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
     *  <p>The provided locale <code>{locale}</code> is not available for translated definitions.</p>
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
     *  <p>Contains the <code>locale</code> and the <code>fallback</code> properties.</p>
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
     *  <p>The provided locale <code>{locale}</code> is not available for translated definitions.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>locale</code> and the <code>fallback</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of UnavailableLocale
     */
    public static UnavailableLocale of() {
        return new UnavailableLocaleImpl();
    }

    /**
     * factory method to create a shallow copy UnavailableLocale
     * @param template instance to be copied
     * @return copy instance
     */
    public static UnavailableLocale of(final UnavailableLocale template) {
        UnavailableLocaleImpl instance = new UnavailableLocaleImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public UnavailableLocale copyDeep();

    /**
     * factory method to create a deep copy of UnavailableLocale
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UnavailableLocale deepCopy(@Nullable final UnavailableLocale template) {
        if (template == null) {
            return null;
        }
        UnavailableLocaleImpl instance = new UnavailableLocaleImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for UnavailableLocale
     * @return builder
     */
    public static UnavailableLocaleBuilder builder() {
        return UnavailableLocaleBuilder.of();
    }

    /**
     * create builder for UnavailableLocale instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnavailableLocaleBuilder builder(final UnavailableLocale template) {
        return UnavailableLocaleBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUnavailableLocale(Function<UnavailableLocale, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<UnavailableLocale> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UnavailableLocale>() {
            @Override
            public String toString() {
                return "TypeReference<UnavailableLocale>";
            }
        };
    }
}
