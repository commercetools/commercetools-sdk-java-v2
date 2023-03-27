
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing an address from the Customer produces the CustomerAddressRemoved Message.</p>
 *  <p>Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveAddressAction customerRemoveAddressAction = CustomerRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerRemoveAddressActionImpl.class)
public interface CustomerRemoveAddressAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerRemoveAddressAction
     */
    String REMOVE_ADDRESS = "removeAddress";

    /**
     *  <p><code>id</code> of the Address to remove.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to remove.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the Address to remove.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the Address to remove.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of CustomerRemoveAddressAction
     */
    public static CustomerRemoveAddressAction of() {
        return new CustomerRemoveAddressActionImpl();
    }

    /**
     * factory method to copy an instance of CustomerRemoveAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerRemoveAddressAction of(final CustomerRemoveAddressAction template) {
        CustomerRemoveAddressActionImpl instance = new CustomerRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for CustomerRemoveAddressAction
     * @return builder
     */
    public static CustomerRemoveAddressActionBuilder builder() {
        return CustomerRemoveAddressActionBuilder.of();
    }

    /**
     * create builder for CustomerRemoveAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerRemoveAddressActionBuilder builder(final CustomerRemoveAddressAction template) {
        return CustomerRemoveAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerRemoveAddressAction(Function<CustomerRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerRemoveAddressAction>";
            }
        };
    }
}
