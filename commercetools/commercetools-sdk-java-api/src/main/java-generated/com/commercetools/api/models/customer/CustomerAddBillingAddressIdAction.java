
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds an Address from the <code>addresses</code> array to <code>billingAddressIds</code>. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddBillingAddressIdAction customerAddBillingAddressIdAction = CustomerAddBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddBillingAddressIdActionImpl.class)
public interface CustomerAddBillingAddressIdAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerAddBillingAddressIdAction
     */
    String ADD_BILLING_ADDRESS_ID = "addBillingAddressId";

    /**
     *  <p><code>id</code> of the Address to become a billing address.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to become a billing address.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the Address to become a billing address.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the Address to become a billing address.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of CustomerAddBillingAddressIdAction
     */
    public static CustomerAddBillingAddressIdAction of() {
        return new CustomerAddBillingAddressIdActionImpl();
    }

    /**
     * factory method to copy an instance of CustomerAddBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddBillingAddressIdAction of(final CustomerAddBillingAddressIdAction template) {
        CustomerAddBillingAddressIdActionImpl instance = new CustomerAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for CustomerAddBillingAddressIdAction
     * @return builder
     */
    public static CustomerAddBillingAddressIdActionBuilder builder() {
        return CustomerAddBillingAddressIdActionBuilder.of();
    }

    /**
     * create builder for CustomerAddBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddBillingAddressIdActionBuilder builder(final CustomerAddBillingAddressIdAction template) {
        return CustomerAddBillingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddBillingAddressIdAction(Function<CustomerAddBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddBillingAddressIdAction>";
            }
        };
    }
}
