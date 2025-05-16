
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Removes a Shipping Method from a Cart that has the <code>Multiple</code> ShippingMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveShippingMethodAction cartRemoveShippingMethodAction = CartRemoveShippingMethodAction.builder()
 *             .shippingKey("{shippingKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeShippingMethod")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRemoveShippingMethodActionImpl.class)
public interface CartRemoveShippingMethodAction extends CartUpdateAction {

    /**
     * discriminator value for CartRemoveShippingMethodAction
     */
    String REMOVE_SHIPPING_METHOD = "removeShippingMethod";

    /**
     *  <p>User-defined unique identifier of the Shipping Method to remove from the Cart.</p>
     * @return shippingKey
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

    /**
     *  <p>User-defined unique identifier of the Shipping Method to remove from the Cart.</p>
     * @param shippingKey value to be set
     */

    public void setShippingKey(final String shippingKey);

    /**
     * factory method
     * @return instance of CartRemoveShippingMethodAction
     */
    public static CartRemoveShippingMethodAction of() {
        return new CartRemoveShippingMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy CartRemoveShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartRemoveShippingMethodAction of(final CartRemoveShippingMethodAction template) {
        CartRemoveShippingMethodActionImpl instance = new CartRemoveShippingMethodActionImpl();
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public CartRemoveShippingMethodAction copyDeep();

    /**
     * factory method to create a deep copy of CartRemoveShippingMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartRemoveShippingMethodAction deepCopy(@Nullable final CartRemoveShippingMethodAction template) {
        if (template == null) {
            return null;
        }
        CartRemoveShippingMethodActionImpl instance = new CartRemoveShippingMethodActionImpl();
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    /**
     * builder factory method for CartRemoveShippingMethodAction
     * @return builder
     */
    public static CartRemoveShippingMethodActionBuilder builder() {
        return CartRemoveShippingMethodActionBuilder.of();
    }

    /**
     * create builder for CartRemoveShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveShippingMethodActionBuilder builder(final CartRemoveShippingMethodAction template) {
        return CartRemoveShippingMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartRemoveShippingMethodAction(Function<CartRemoveShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartRemoveShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemoveShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveShippingMethodAction>";
            }
        };
    }
}
