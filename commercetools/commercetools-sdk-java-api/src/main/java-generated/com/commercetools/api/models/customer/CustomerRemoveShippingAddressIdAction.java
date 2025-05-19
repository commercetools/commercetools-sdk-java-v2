
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes a shipping address from <code>shippingAddressesIds</code>. If the shipping address is the default shipping address, the <code>defaultShippingAddressId</code> is unset. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveShippingAddressIdAction customerRemoveShippingAddressIdAction = CustomerRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeShippingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerRemoveShippingAddressIdActionImpl.class)
public interface CustomerRemoveShippingAddressIdAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerRemoveShippingAddressIdAction
     */
    String REMOVE_SHIPPING_ADDRESS_ID = "removeShippingAddressId";

    /**
     *  <p><code>id</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of CustomerRemoveShippingAddressIdAction
     */
    public static CustomerRemoveShippingAddressIdAction of() {
        return new CustomerRemoveShippingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerRemoveShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerRemoveShippingAddressIdAction of(final CustomerRemoveShippingAddressIdAction template) {
        CustomerRemoveShippingAddressIdActionImpl instance = new CustomerRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public CustomerRemoveShippingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerRemoveShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerRemoveShippingAddressIdAction deepCopy(
            @Nullable final CustomerRemoveShippingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        CustomerRemoveShippingAddressIdActionImpl instance = new CustomerRemoveShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for CustomerRemoveShippingAddressIdAction
     * @return builder
     */
    public static CustomerRemoveShippingAddressIdActionBuilder builder() {
        return CustomerRemoveShippingAddressIdActionBuilder.of();
    }

    /**
     * create builder for CustomerRemoveShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerRemoveShippingAddressIdActionBuilder builder(
            final CustomerRemoveShippingAddressIdAction template) {
        return CustomerRemoveShippingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerRemoveShippingAddressIdAction(Function<CustomerRemoveShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerRemoveShippingAddressIdAction>";
            }
        };
    }
}
