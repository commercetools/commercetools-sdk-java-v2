
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
 *  <p>Generated when the customer selects a Shipping Method and moves to the next step of the checkout process.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSelectionConfirmation shippingMethodSelectionConfirmation = ShippingMethodSelectionConfirmation.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("shipping_method_selection_confirmation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSelectionConfirmationImpl.class)
public interface ShippingMethodSelectionConfirmation extends ResponseMessage {

    /**
     * discriminator value for ShippingMethodSelectionConfirmation
     */
    String SHIPPING_METHOD_SELECTION_CONFIRMATION = "shipping_method_selection_confirmation";

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
     *  <p>Shipping Method selection confirmed.</p>
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
     *  <p>Shipping Method selection confirmed.</p>
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
     * @return instance of ShippingMethodSelectionConfirmation
     */
    public static ShippingMethodSelectionConfirmation of() {
        return new ShippingMethodSelectionConfirmationImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSelectionConfirmation
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSelectionConfirmation of(final ShippingMethodSelectionConfirmation template) {
        ShippingMethodSelectionConfirmationImpl instance = new ShippingMethodSelectionConfirmationImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    public ShippingMethodSelectionConfirmation copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSelectionConfirmation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSelectionConfirmation deepCopy(
            @Nullable final ShippingMethodSelectionConfirmation template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSelectionConfirmationImpl instance = new ShippingMethodSelectionConfirmationImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        instance.setPayload(template.getPayload());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSelectionConfirmation
     * @return builder
     */
    public static ShippingMethodSelectionConfirmationBuilder builder() {
        return ShippingMethodSelectionConfirmationBuilder.of();
    }

    /**
     * create builder for ShippingMethodSelectionConfirmation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSelectionConfirmationBuilder builder(
            final ShippingMethodSelectionConfirmation template) {
        return ShippingMethodSelectionConfirmationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSelectionConfirmation(Function<ShippingMethodSelectionConfirmation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSelectionConfirmation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSelectionConfirmation>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSelectionConfirmation>";
            }
        };
    }
}
