
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetBillingAddressAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBillingAddressAction cartSetBillingAddressAction = CartSetBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetBillingAddressActionImpl.class)
public interface CartSetBillingAddressAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetBillingAddressAction
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
     * @return instance of CartSetBillingAddressAction
     */
    public static CartSetBillingAddressAction of() {
        return new CartSetBillingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetBillingAddressAction of(final CartSetBillingAddressAction template) {
        CartSetBillingAddressActionImpl instance = new CartSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetBillingAddressAction deepCopy(@Nullable final CartSetBillingAddressAction template) {
        if (template == null) {
            return null;
        }
        CartSetBillingAddressActionImpl instance = new CartSetBillingAddressActionImpl();
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartSetBillingAddressAction
     * @return builder
     */
    public static CartSetBillingAddressActionBuilder builder() {
        return CartSetBillingAddressActionBuilder.of();
    }

    /**
     * create builder for CartSetBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetBillingAddressActionBuilder builder(final CartSetBillingAddressAction template) {
        return CartSetBillingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetBillingAddressAction(Function<CartSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetBillingAddressAction>";
            }
        };
    }
}
