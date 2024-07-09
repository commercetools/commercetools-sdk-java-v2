
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the Cart contains a ShippingMethod that is not allowed for the Cart. In this case, the ShippingMethodState value is <code>DoesNotMatchCart</code>.</p>
 *  <p>When a Cart is frozen, the error can be returned as a failed response to all update actions on Carts and My Carts.</p>
 *  <p>The error is also returned as a failed response to:</p>
 *  <ul>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on Orders.</li>
 *   <li>Create Order from Cart and Create Order in Store from Cart requests on My Orders.</li>
 *   <li>Create Order from Cart in BusinessUnit request on Associate Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodDoesNotMatchCartError shippingMethodDoesNotMatchCartError = ShippingMethodDoesNotMatchCartError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodDoesNotMatchCartErrorImpl.class)
public interface ShippingMethodDoesNotMatchCartError extends ErrorObject {

    /**
     * discriminator value for ShippingMethodDoesNotMatchCartError
     */
    String SHIPPING_METHOD_DOES_NOT_MATCH_CART = "ShippingMethodDoesNotMatchCart";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The predicate does not match the cart."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The predicate does not match the cart."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of ShippingMethodDoesNotMatchCartError
     */
    public static ShippingMethodDoesNotMatchCartError of() {
        return new ShippingMethodDoesNotMatchCartErrorImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodDoesNotMatchCartError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodDoesNotMatchCartError of(final ShippingMethodDoesNotMatchCartError template) {
        ShippingMethodDoesNotMatchCartErrorImpl instance = new ShippingMethodDoesNotMatchCartErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of ShippingMethodDoesNotMatchCartError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodDoesNotMatchCartError deepCopy(
            @Nullable final ShippingMethodDoesNotMatchCartError template) {
        if (template == null) {
            return null;
        }
        ShippingMethodDoesNotMatchCartErrorImpl instance = new ShippingMethodDoesNotMatchCartErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodDoesNotMatchCartError
     * @return builder
     */
    public static ShippingMethodDoesNotMatchCartErrorBuilder builder() {
        return ShippingMethodDoesNotMatchCartErrorBuilder.of();
    }

    /**
     * create builder for ShippingMethodDoesNotMatchCartError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodDoesNotMatchCartErrorBuilder builder(
            final ShippingMethodDoesNotMatchCartError template) {
        return ShippingMethodDoesNotMatchCartErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodDoesNotMatchCartError(Function<ShippingMethodDoesNotMatchCartError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodDoesNotMatchCartError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodDoesNotMatchCartError>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodDoesNotMatchCartError>";
            }
        };
    }
}
