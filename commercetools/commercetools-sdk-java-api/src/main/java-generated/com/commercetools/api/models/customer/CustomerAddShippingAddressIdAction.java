
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds an Address from the <code>addresses</code> array to <code>shippingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddShippingAddressIdAction customerAddShippingAddressIdAction = CustomerAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddShippingAddressIdActionImpl.class)
public interface CustomerAddShippingAddressIdAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerAddShippingAddressIdAction
     */
    String ADD_SHIPPING_ADDRESS_ID = "addShippingAddressId";

    /**
     *  <p><code>id</code> of the Address to become a shipping address.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to become a shipping address.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the Address to become a shipping address.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the Address to become a shipping address.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of CustomerAddShippingAddressIdAction
     */
    public static CustomerAddShippingAddressIdAction of() {
        return new CustomerAddShippingAddressIdActionImpl();
    }

    /**
     * factory method to copy an instance of CustomerAddShippingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddShippingAddressIdAction of(final CustomerAddShippingAddressIdAction template) {
        CustomerAddShippingAddressIdActionImpl instance = new CustomerAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for CustomerAddShippingAddressIdAction
     * @return builder
     */
    public static CustomerAddShippingAddressIdActionBuilder builder() {
        return CustomerAddShippingAddressIdActionBuilder.of();
    }

    /**
     * create builder for CustomerAddShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddShippingAddressIdActionBuilder builder(final CustomerAddShippingAddressIdAction template) {
        return CustomerAddShippingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddShippingAddressIdAction(Function<CustomerAddShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddShippingAddressIdAction>";
            }
        };
    }
}
