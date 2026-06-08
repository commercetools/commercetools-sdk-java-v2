
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Updates an address in <code>itemShippingAddresses</code> by keeping the Address <code>key</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartUpdateItemShippingAddressAction myCartUpdateItemShippingAddressAction = MyCartUpdateItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("updateItemShippingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartUpdateItemShippingAddressActionImpl.class)
public interface MyCartUpdateItemShippingAddressAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartUpdateItemShippingAddressAction
     */
    String UPDATE_ITEM_SHIPPING_ADDRESS = "updateItemShippingAddress";

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>The new Address with the same <code>key</code> as the Address it will replace.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of MyCartUpdateItemShippingAddressAction
     */
    public static MyCartUpdateItemShippingAddressAction of() {
        return new MyCartUpdateItemShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartUpdateItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartUpdateItemShippingAddressAction of(final MyCartUpdateItemShippingAddressAction template) {
        MyCartUpdateItemShippingAddressActionImpl instance = new MyCartUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public MyCartUpdateItemShippingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartUpdateItemShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartUpdateItemShippingAddressAction deepCopy(
            @Nullable final MyCartUpdateItemShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        MyCartUpdateItemShippingAddressActionImpl instance = new MyCartUpdateItemShippingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for MyCartUpdateItemShippingAddressAction
     * @return builder
     */
    public static MyCartUpdateItemShippingAddressActionBuilder builder() {
        return MyCartUpdateItemShippingAddressActionBuilder.of();
    }

    /**
     * create builder for MyCartUpdateItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartUpdateItemShippingAddressActionBuilder builder(
            final MyCartUpdateItemShippingAddressAction template) {
        return MyCartUpdateItemShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartUpdateItemShippingAddressAction(Function<MyCartUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartUpdateItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartUpdateItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartUpdateItemShippingAddressAction>";
            }
        };
    }
}
