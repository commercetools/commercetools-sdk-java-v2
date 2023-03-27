
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds an address to a Cart when shipping to multiple addresses is desired.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddItemShippingAddressAction cartAddItemShippingAddressAction = CartAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddItemShippingAddressActionImpl.class)
public interface CartAddItemShippingAddressAction extends CartUpdateAction {

    /**
     * discriminator value for CartAddItemShippingAddressAction
     */
    String ADD_ITEM_SHIPPING_ADDRESS = "addItemShippingAddress";

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new Address must have a <code>key</code> that is unique accross this Cart.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new Address must have a <code>key</code> that is unique accross this Cart.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of CartAddItemShippingAddressAction
     */
    public static CartAddItemShippingAddressAction of() {
        return new CartAddItemShippingAddressActionImpl();
    }

    /**
     * factory method to copy an instance of CartAddItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartAddItemShippingAddressAction of(final CartAddItemShippingAddressAction template) {
        CartAddItemShippingAddressActionImpl instance = new CartAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * builder factory method for CartAddItemShippingAddressAction
     * @return builder
     */
    public static CartAddItemShippingAddressActionBuilder builder() {
        return CartAddItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for CartAddItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddItemShippingAddressActionBuilder builder(final CartAddItemShippingAddressAction template) {
        return CartAddItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartAddItemShippingAddressAction(Function<CartAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartAddItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddItemShippingAddressAction>";
            }
        };
    }
}
