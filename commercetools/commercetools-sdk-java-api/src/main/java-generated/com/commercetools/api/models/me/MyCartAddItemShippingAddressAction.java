
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
 *     MyCartAddItemShippingAddressAction myCartAddItemShippingAddressAction = MyCartAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartAddItemShippingAddressActionImpl.class)
public interface MyCartAddItemShippingAddressAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartAddItemShippingAddressAction
     */
    String ADD_ITEM_SHIPPING_ADDRESS = "addItemShippingAddress";

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new address must have a key that is unique accross this Cart.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new address must have a key that is unique accross this Cart.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of MyCartAddItemShippingAddressAction
     */
    public static MyCartAddItemShippingAddressAction of() {
        return new MyCartAddItemShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartAddItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartAddItemShippingAddressAction of(final MyCartAddItemShippingAddressAction template) {
        MyCartAddItemShippingAddressActionImpl instance = new MyCartAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCartAddItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartAddItemShippingAddressAction deepCopy(
            @Nullable final MyCartAddItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        MyCartAddItemShippingAddressActionImpl instance = new MyCartAddItemShippingAddressActionImpl();
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyCartAddItemShippingAddressAction
     * @return builder
     */
    public static MyCartAddItemShippingAddressActionBuilder builder() {
        return MyCartAddItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for MyCartAddItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartAddItemShippingAddressActionBuilder builder(final MyCartAddItemShippingAddressAction template) {
        return MyCartAddItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartAddItemShippingAddressAction(Function<MyCartAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartAddItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartAddItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartAddItemShippingAddressAction>";
            }
        };
    }
}
