
package com.commercetools.api.models.me;

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
 *     MyCartAddItemShippingAddressAction myCartAddItemShippingAddressAction = MyCartAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartAddItemShippingAddressActionImpl.class)
public interface MyCartAddItemShippingAddressAction extends MyCartUpdateAction {

    String ADD_ITEM_SHIPPING_ADDRESS = "addItemShippingAddress";

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new address must have a key that is unique accross this Cart.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static MyCartAddItemShippingAddressAction of() {
        return new MyCartAddItemShippingAddressActionImpl();
    }

    public static MyCartAddItemShippingAddressAction of(final MyCartAddItemShippingAddressAction template) {
        MyCartAddItemShippingAddressActionImpl instance = new MyCartAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCartAddItemShippingAddressActionBuilder builder() {
        return MyCartAddItemShippingAddressActionBuilder.of();
    }

    public static MyCartAddItemShippingAddressActionBuilder builder(final MyCartAddItemShippingAddressAction template) {
        return MyCartAddItemShippingAddressActionBuilder.of(template);
    }

    default <T> T withMyCartAddItemShippingAddressAction(Function<MyCartAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartAddItemShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartAddItemShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartAddItemShippingAddressAction>";
            }
        };
    }
}
