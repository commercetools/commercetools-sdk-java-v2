
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
 *  <p>Generated when the <span>Cart</span> cannot be updated with the shipping address.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingAddressError setShippingAddressError = SetShippingAddressError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("set_shipping_address_error")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetShippingAddressErrorImpl.class)
public interface SetShippingAddressError extends ResponseMessage {

    /**
     * discriminator value for SetShippingAddressError
     */
    String SET_SHIPPING_ADDRESS_ERROR = "set_shipping_address_error";

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
     *  <p>Error setting shipping address.</p>
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
     *  <p>Contains the <code>errors</code> array of objects, with the related <code>code</code> and <code>message</code> properties.</p>
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
     *  <p>Error setting shipping address.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>errors</code> array of objects, with the related <code>code</code> and <code>message</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of SetShippingAddressError
     */
    public static SetShippingAddressError of() {
        return new SetShippingAddressErrorImpl();
    }

    /**
     * factory method to create a shallow copy SetShippingAddressError
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetShippingAddressError of(final SetShippingAddressError template) {
        SetShippingAddressErrorImpl instance = new SetShippingAddressErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public SetShippingAddressError copyDeep();

    /**
     * factory method to create a deep copy of SetShippingAddressError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetShippingAddressError deepCopy(@Nullable final SetShippingAddressError template) {
        if (template == null) {
            return null;
        }
        SetShippingAddressErrorImpl instance = new SetShippingAddressErrorImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for SetShippingAddressError
     * @return builder
     */
    public static SetShippingAddressErrorBuilder builder() {
        return SetShippingAddressErrorBuilder.of();
    }

    /**
     * create builder for SetShippingAddressError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingAddressErrorBuilder builder(final SetShippingAddressError template) {
        return SetShippingAddressErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetShippingAddressError(Function<SetShippingAddressError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingAddressError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingAddressError>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingAddressError>";
            }
        };
    }
}
