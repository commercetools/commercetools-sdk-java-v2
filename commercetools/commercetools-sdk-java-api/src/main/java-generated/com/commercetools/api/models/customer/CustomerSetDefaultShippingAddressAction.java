
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the default shipping address from <code>addresses</code>. The action adds the <code>id</code> of the specified address to the <code>shippingAddressIds</code> if not contained already. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerDefaultShippingAddressSetMessage" rel="nofollow">CustomerDefaultShippingAddressSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetDefaultShippingAddressAction customerSetDefaultShippingAddressAction = CustomerSetDefaultShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDefaultShippingAddress")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetDefaultShippingAddressActionImpl.class)
public interface CustomerSetDefaultShippingAddressAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetDefaultShippingAddressAction
     */
    String SET_DEFAULT_SHIPPING_ADDRESS = "setDefaultShippingAddress";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become the default shipping address.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become the default shipping address.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become the default shipping address.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> to become the default shipping address.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of CustomerSetDefaultShippingAddressAction
     */
    public static CustomerSetDefaultShippingAddressAction of() {
        return new CustomerSetDefaultShippingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetDefaultShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetDefaultShippingAddressAction of(final CustomerSetDefaultShippingAddressAction template) {
        CustomerSetDefaultShippingAddressActionImpl instance = new CustomerSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public CustomerSetDefaultShippingAddressAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetDefaultShippingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetDefaultShippingAddressAction deepCopy(
            @Nullable final CustomerSetDefaultShippingAddressAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetDefaultShippingAddressActionImpl instance = new CustomerSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for CustomerSetDefaultShippingAddressAction
     * @return builder
     */
    public static CustomerSetDefaultShippingAddressActionBuilder builder() {
        return CustomerSetDefaultShippingAddressActionBuilder.of();
    }

    /**
     * create builder for CustomerSetDefaultShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetDefaultShippingAddressActionBuilder builder(
            final CustomerSetDefaultShippingAddressAction template) {
        return CustomerSetDefaultShippingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetDefaultShippingAddressAction(
            Function<CustomerSetDefaultShippingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetDefaultShippingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetDefaultShippingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetDefaultShippingAddressAction>";
            }
        };
    }
}
