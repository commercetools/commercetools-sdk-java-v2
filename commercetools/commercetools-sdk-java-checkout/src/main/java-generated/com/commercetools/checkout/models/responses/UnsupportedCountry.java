
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
 *  <p>Generated when the country of the shipping address and/or billing address associated with the <span>Cart</span> does not match the countries set for the <span>Application</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnsupportedCountry unsupportedCountry = UnsupportedCountry.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("unsupported_country")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UnsupportedCountryImpl.class)
public interface UnsupportedCountry extends ResponseMessage {

    /**
     * discriminator value for UnsupportedCountry
     */
    String UNSUPPORTED_COUNTRY = "unsupported_country";

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
     *  <p>Cart <code>{cartId}</code> has unsupported country.</p>
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
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property, <code>shippingCountry</code>, <code>billingCountry</code>, and the <code>supportedCountries</code> array.</p>
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
     *  <p>Cart <code>{cartId}</code> has unsupported country.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property, <code>shippingCountry</code>, <code>billingCountry</code>, and the <code>supportedCountries</code> array.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of UnsupportedCountry
     */
    public static UnsupportedCountry of() {
        return new UnsupportedCountryImpl();
    }

    /**
     * factory method to create a shallow copy UnsupportedCountry
     * @param template instance to be copied
     * @return copy instance
     */
    public static UnsupportedCountry of(final UnsupportedCountry template) {
        UnsupportedCountryImpl instance = new UnsupportedCountryImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public UnsupportedCountry copyDeep();

    /**
     * factory method to create a deep copy of UnsupportedCountry
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UnsupportedCountry deepCopy(@Nullable final UnsupportedCountry template) {
        if (template == null) {
            return null;
        }
        UnsupportedCountryImpl instance = new UnsupportedCountryImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for UnsupportedCountry
     * @return builder
     */
    public static UnsupportedCountryBuilder builder() {
        return UnsupportedCountryBuilder.of();
    }

    /**
     * create builder for UnsupportedCountry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnsupportedCountryBuilder builder(final UnsupportedCountry template) {
        return UnsupportedCountryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUnsupportedCountry(Function<UnsupportedCountry, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<UnsupportedCountry> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UnsupportedCountry>() {
            @Override
            public String toString() {
                return "TypeReference<UnsupportedCountry>";
            }
        };
    }
}
