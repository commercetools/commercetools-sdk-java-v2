
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
 *  <p>An address can only be removed if it is not referenced in any <a href="https://docs.commercetools.com/apis/ctp:api:type:ItemShippingTarget" rel="nofollow">ItemShippingTarget</a> of the Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveItemShippingAddressAction cartRemoveItemShippingAddressAction = CartRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeItemShippingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRemoveItemShippingAddressActionImpl.class)
public interface CartRemoveItemShippingAddressAction extends CartUpdateAction {

    /**
     * discriminator value for CartRemoveItemShippingAddressAction
     */
    String REMOVE_ITEM_SHIPPING_ADDRESS = "removeItemShippingAddress";

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @return addressKey
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of CartRemoveItemShippingAddressAction
     */
    public static CartRemoveItemShippingAddressAction of() {
        return new CartRemoveItemShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy CartRemoveItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartRemoveItemShippingAddressAction of(final CartRemoveItemShippingAddressAction template) {
        CartRemoveItemShippingAddressActionImpl instance = new CartRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public CartRemoveItemShippingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of CartRemoveItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartRemoveItemShippingAddressAction deepCopy(
            @Nullable final CartRemoveItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        CartRemoveItemShippingAddressActionImpl instance = new CartRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for CartRemoveItemShippingAddressAction
     * @return builder
     */
    public static CartRemoveItemShippingAddressActionBuilder builder() {
        return CartRemoveItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for CartRemoveItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveItemShippingAddressActionBuilder builder(
            final CartRemoveItemShippingAddressAction template) {
        return CartRemoveItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartRemoveItemShippingAddressAction(Function<CartRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartRemoveItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemoveItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveItemShippingAddressAction>";
            }
        };
    }
}
