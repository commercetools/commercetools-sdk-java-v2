
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
 *  <p>Generated when the customer selects a Shipping Method that is different from the default option.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSelected shippingMethodSelected = ShippingMethodSelected.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("shipping_method_selected")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSelectedImpl.class)
public interface ShippingMethodSelected extends ResponseMessage {

    /**
     * discriminator value for ShippingMethodSelected
     */
    String SHIPPING_METHOD_SELECTED = "shipping_method_selected";

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
     *  <p>Shipping Method selected.</p>
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
     *  <p>Contains the <code>method</code> object with the <code>name</code> and <code>id</code> properties.</p>
     * @return payload
     */
    @NotNull
    @Valid
    @JsonProperty("payload")
    public Object getPayload();

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     */

    public void setSeverity(final String severity);

    /**
     *  <p>Shipping Method selected.</p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     */

    public void setCorrelationId(final String correlationId);

    /**
     *  <p>Contains the <code>method</code> object with the <code>name</code> and <code>id</code> properties.</p>
     * @param payload value to be set
     */

    public void setPayload(final Object payload);

    /**
     * factory method
     * @return instance of ShippingMethodSelected
     */
    public static ShippingMethodSelected of() {
        return new ShippingMethodSelectedImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSelected
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSelected of(final ShippingMethodSelected template) {
        ShippingMethodSelectedImpl instance = new ShippingMethodSelectedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ShippingMethodSelected copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSelected
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSelected deepCopy(@Nullable final ShippingMethodSelected template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSelectedImpl instance = new ShippingMethodSelectedImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSelected
     * @return builder
     */
    public static ShippingMethodSelectedBuilder builder() {
        return ShippingMethodSelectedBuilder.of();
    }

    /**
     * create builder for ShippingMethodSelected instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSelectedBuilder builder(final ShippingMethodSelected template) {
        return ShippingMethodSelectedBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSelected(Function<ShippingMethodSelected, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSelected> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSelected>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSelected>";
            }
        };
    }
}
