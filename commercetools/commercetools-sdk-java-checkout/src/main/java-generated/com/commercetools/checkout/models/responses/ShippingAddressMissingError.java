
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
 *  <p>Generated when the shipping address is missing for the given Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingAddressMissingError shippingAddressMissingError = ShippingAddressMissingError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("shipping_address_missing")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingAddressMissingErrorImpl.class)
public interface ShippingAddressMissingError extends ResponseMessage {

    /**
     * discriminator value for ShippingAddressMissingError
     */
    String SHIPPING_ADDRESS_MISSING = "shipping_address_missing";

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
     *  <p>The shippingAddress field is missing for cart <code>{cartId}</code>.</p>
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
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
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
     *  <p>The shippingAddress field is missing for cart <code>{cartId}</code>.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of ShippingAddressMissingError
     */
    public static ShippingAddressMissingError of() {
        return new ShippingAddressMissingErrorImpl();
    }

    /**
     * factory method to create a shallow copy ShippingAddressMissingError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingAddressMissingError of(final ShippingAddressMissingError template) {
        ShippingAddressMissingErrorImpl instance = new ShippingAddressMissingErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ShippingAddressMissingError copyDeep();

    /**
     * factory method to create a deep copy of ShippingAddressMissingError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingAddressMissingError deepCopy(@Nullable final ShippingAddressMissingError template) {
        if (template == null) {
            return null;
        }
        ShippingAddressMissingErrorImpl instance = new ShippingAddressMissingErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ShippingAddressMissingError
     * @return builder
     */
    public static ShippingAddressMissingErrorBuilder builder() {
        return ShippingAddressMissingErrorBuilder.of();
    }

    /**
     * create builder for ShippingAddressMissingError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingAddressMissingErrorBuilder builder(final ShippingAddressMissingError template) {
        return ShippingAddressMissingErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingAddressMissingError(Function<ShippingAddressMissingError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingAddressMissingError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingAddressMissingError>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingAddressMissingError>";
            }
        };
    }
}
