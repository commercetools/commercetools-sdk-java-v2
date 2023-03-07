
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>An address can only be removed if it is not referenced in any ItemShippingTarget of the Cart.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRemoveItemShippingAddressActionImpl.class)
public interface CartRemoveItemShippingAddressAction extends CartUpdateAction {

    String REMOVE_ITEM_SHIPPING_ADDRESS = "removeItemShippingAddress";

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     */
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressKey(final String addressKey);

    public static CartRemoveItemShippingAddressAction of() {
        return new CartRemoveItemShippingAddressActionImpl();
    }

    public static CartRemoveItemShippingAddressAction of(final CartRemoveItemShippingAddressAction template) {
        CartRemoveItemShippingAddressActionImpl instance = new CartRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CartRemoveItemShippingAddressActionBuilder builder() {
        return CartRemoveItemShippingAddressActionBuilder.of();
    }

    public static CartRemoveItemShippingAddressActionBuilder builder(
            final CartRemoveItemShippingAddressAction template) {
        return CartRemoveItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withCartRemoveItemShippingAddressAction(Function<CartRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartRemoveItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemoveItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveItemShippingAddressAction>";
            }
        };
    }
}
