
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the default billing address from <code>addresses</code>. The action adds the <code>id</code> of the specified Address to the <code>billingAddressIds</code> if not contained already. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetDefaultBillingAddressAction customerSetDefaultBillingAddressAction = CustomerSetDefaultBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetDefaultBillingAddressActionImpl.class)
public interface CustomerSetDefaultBillingAddressAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetDefaultBillingAddressAction
     */
    String SET_DEFAULT_BILLING_ADDRESS = "setDefaultBillingAddress";

    /**
     *  <p><code>id</code> of the Address to become the default billing address.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to become the default billing address.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p><code>id</code> of the Address to become the default billing address.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     *  <p><code>key</code> of the Address to become the default billing address.</p>
     * @param addressKey value to be set
     */

    public void setAddressKey(final String addressKey);

    /**
     * factory method
     * @return instance of CustomerSetDefaultBillingAddressAction
     */
    public static CustomerSetDefaultBillingAddressAction of() {
        return new CustomerSetDefaultBillingAddressActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetDefaultBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetDefaultBillingAddressAction of(final CustomerSetDefaultBillingAddressAction template) {
        CustomerSetDefaultBillingAddressActionImpl instance = new CustomerSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSetDefaultBillingAddressAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetDefaultBillingAddressAction deepCopy(
            @Nullable final CustomerSetDefaultBillingAddressAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetDefaultBillingAddressActionImpl instance = new CustomerSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for CustomerSetDefaultBillingAddressAction
     * @return builder
     */
    public static CustomerSetDefaultBillingAddressActionBuilder builder() {
        return CustomerSetDefaultBillingAddressActionBuilder.of();
    }

    /**
     * create builder for CustomerSetDefaultBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetDefaultBillingAddressActionBuilder builder(
            final CustomerSetDefaultBillingAddressAction template) {
        return CustomerSetDefaultBillingAddressActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetDefaultBillingAddressAction(
            Function<CustomerSetDefaultBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetDefaultBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetDefaultBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetDefaultBillingAddressAction>";
            }
        };
    }
}
