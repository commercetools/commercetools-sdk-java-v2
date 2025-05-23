
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

/**
 * MyCartSetBillingAddressAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetBillingAddressAction myCartSetBillingAddressAction = MyCartSetBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setBillingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetBillingAddressActionImpl.class)
public interface MyCartSetBillingAddressAction extends MyCartUpdateAction {

    /**
     * discriminator value for MyCartSetBillingAddressAction
     */
    String SET_BILLING_ADDRESS = "setBillingAddress";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     * factory method
     * @return instance of MyCartSetBillingAddressAction
     */
    public static MyCartSetBillingAddressAction of() {
        return new MyCartSetBillingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCartSetBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCartSetBillingAddressAction of(final MyCartSetBillingAddressAction template) {
        MyCartSetBillingAddressActionImpl instance = new MyCartSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public MyCartSetBillingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of MyCartSetBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCartSetBillingAddressAction deepCopy(@Nullable final MyCartSetBillingAddressAction template) {
        if (template == null) {
            return null;
        }
        MyCartSetBillingAddressActionImpl instance = new MyCartSetBillingAddressActionImpl();
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for MyCartSetBillingAddressAction
     * @return builder
     */
    public static MyCartSetBillingAddressActionBuilder builder() {
        return MyCartSetBillingAddressActionBuilder.of();
    }

    /**
     * create builder for MyCartSetBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetBillingAddressActionBuilder builder(final MyCartSetBillingAddressAction template) {
        return MyCartSetBillingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCartSetBillingAddressAction(Function<MyCartSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetBillingAddressAction>";
            }
        };
    }
}
