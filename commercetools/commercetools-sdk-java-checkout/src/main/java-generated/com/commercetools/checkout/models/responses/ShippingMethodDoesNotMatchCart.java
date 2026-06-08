
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
 *  <p>Generated when the selected Shipping Method does not match the Cart anymore.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodDoesNotMatchCart shippingMethodDoesNotMatchCart = ShippingMethodDoesNotMatchCart.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("shipping_method_does_not_match_cart")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodDoesNotMatchCartImpl.class)
public interface ShippingMethodDoesNotMatchCart extends Message {

    /**
     * discriminator value for ShippingMethodDoesNotMatchCart
     */
    String SHIPPING_METHOD_DOES_NOT_MATCH_CART = "shipping_method_does_not_match_cart";

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
     *  <p>Selected shipping method no longer matches cart.</p>
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
     *  <p>Selected shipping method no longer matches cart.</p>
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
     * @return instance of ShippingMethodDoesNotMatchCart
     */
    public static ShippingMethodDoesNotMatchCart of() {
        return new ShippingMethodDoesNotMatchCartImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodDoesNotMatchCart
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodDoesNotMatchCart of(final ShippingMethodDoesNotMatchCart template) {
        ShippingMethodDoesNotMatchCartImpl instance = new ShippingMethodDoesNotMatchCartImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    public ShippingMethodDoesNotMatchCart copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodDoesNotMatchCart
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodDoesNotMatchCart deepCopy(@Nullable final ShippingMethodDoesNotMatchCart template) {
        if (template == null) {
            return null;
        }
        ShippingMethodDoesNotMatchCartImpl instance = new ShippingMethodDoesNotMatchCartImpl();
        instance.setSeverity(template.getSeverity());
        instance.setMessage(template.getMessage());
        instance.setCorrelationId(template.getCorrelationId());
        return instance;
    }

    /**
     * builder factory method for ShippingMethodDoesNotMatchCart
     * @return builder
     */
    public static ShippingMethodDoesNotMatchCartBuilder builder() {
        return ShippingMethodDoesNotMatchCartBuilder.of();
    }

    /**
     * create builder for ShippingMethodDoesNotMatchCart instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodDoesNotMatchCartBuilder builder(final ShippingMethodDoesNotMatchCart template) {
        return ShippingMethodDoesNotMatchCartBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodDoesNotMatchCart(Function<ShippingMethodDoesNotMatchCart, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodDoesNotMatchCart> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodDoesNotMatchCart>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodDoesNotMatchCart>";
            }
        };
    }
}
