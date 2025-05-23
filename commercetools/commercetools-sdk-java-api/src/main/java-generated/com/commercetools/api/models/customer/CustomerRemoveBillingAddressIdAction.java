
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes a billing address from <code>billingAddressesIds</code>. If the billing address is the default billing address, the <code>defaultBillingAddressId</code> is unset. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveBillingAddressIdAction customerRemoveBillingAddressIdAction = CustomerRemoveBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeBillingAddressId")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerRemoveBillingAddressIdActionImpl.class)
public interface CustomerRemoveBillingAddressIdAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerRemoveBillingAddressIdAction
     */
    String REMOVE_BILLING_ADDRESS_ID = "removeBillingAddressId";

    /**
     *  <p><code>id</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of CustomerRemoveBillingAddressIdAction
     */
    public static CustomerRemoveBillingAddressIdAction of() {
        return new CustomerRemoveBillingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerRemoveBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerRemoveBillingAddressIdAction of(final CustomerRemoveBillingAddressIdAction template) {
        CustomerRemoveBillingAddressIdActionImpl instance = new CustomerRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public CustomerRemoveBillingAddressIdAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerRemoveBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerRemoveBillingAddressIdAction deepCopy(
            @Nullable final CustomerRemoveBillingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        CustomerRemoveBillingAddressIdActionImpl instance = new CustomerRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for CustomerRemoveBillingAddressIdAction
     * @return builder
     */
    public static CustomerRemoveBillingAddressIdActionBuilder builder() {
        return CustomerRemoveBillingAddressIdActionBuilder.of();
    }

    /**
     * create builder for CustomerRemoveBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerRemoveBillingAddressIdActionBuilder builder(
            final CustomerRemoveBillingAddressIdAction template) {
        return CustomerRemoveBillingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerRemoveBillingAddressIdAction(Function<CustomerRemoveBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerRemoveBillingAddressIdAction>";
            }
        };
    }
}
