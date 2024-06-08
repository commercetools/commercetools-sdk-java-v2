
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
 *  <p>Adding an address to the Customer produces the CustomerAddressAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerAddAddressAction myCustomerAddAddressAction = MyCustomerAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerAddAddressActionImpl.class)
public interface MyCustomerAddAddressAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerAddAddressAction
     */
    String ADD_ADDRESS = "addAddress";

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of MyCustomerAddAddressAction
     */
    public static MyCustomerAddAddressAction of() {
        return new MyCustomerAddAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerAddAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerAddAddressAction of(final MyCustomerAddAddressAction template) {
        MyCustomerAddAddressActionImpl instance = new MyCustomerAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerAddAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerAddAddressAction deepCopy(@Nullable final MyCustomerAddAddressAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerAddAddressActionImpl instance = new MyCustomerAddAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for MyCustomerAddAddressAction
     * @return builder
     */
    public static MyCustomerAddAddressActionBuilder builder() {
        return MyCustomerAddAddressActionBuilder.of();
    }

    /**
     * create builder for MyCustomerAddAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerAddAddressActionBuilder builder(final MyCustomerAddAddressAction template) {
        return MyCustomerAddAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerAddAddressAction(Function<MyCustomerAddAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerAddAddressAction>";
            }
        };
    }
}
