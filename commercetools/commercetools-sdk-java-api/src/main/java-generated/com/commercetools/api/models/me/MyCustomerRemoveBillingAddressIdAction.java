
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes an existing billing address from <code>billingAddressesIds</code>. If the billing address is the default billing address, the <code>defaultBillingAddressId</code> is unset. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerRemoveBillingAddressIdAction myCustomerRemoveBillingAddressIdAction = MyCustomerRemoveBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerRemoveBillingAddressIdActionImpl.class)
public interface MyCustomerRemoveBillingAddressIdAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerRemoveBillingAddressIdAction
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
     * @return instance of MyCustomerRemoveBillingAddressIdAction
     */
    public static MyCustomerRemoveBillingAddressIdAction of() {
        return new MyCustomerRemoveBillingAddressIdActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerRemoveBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerRemoveBillingAddressIdAction of(final MyCustomerRemoveBillingAddressIdAction template) {
        MyCustomerRemoveBillingAddressIdActionImpl instance = new MyCustomerRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerRemoveBillingAddressIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerRemoveBillingAddressIdAction deepCopy(
            @Nullable final MyCustomerRemoveBillingAddressIdAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerRemoveBillingAddressIdActionImpl instance = new MyCustomerRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    /**
     * builder factory method for MyCustomerRemoveBillingAddressIdAction
     * @return builder
     */
    public static MyCustomerRemoveBillingAddressIdActionBuilder builder() {
        return MyCustomerRemoveBillingAddressIdActionBuilder.of();
    }

    /**
     * create builder for MyCustomerRemoveBillingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerRemoveBillingAddressIdActionBuilder builder(
            final MyCustomerRemoveBillingAddressIdAction template) {
        return MyCustomerRemoveBillingAddressIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerRemoveBillingAddressIdAction(
            Function<MyCustomerRemoveBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerRemoveBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerRemoveBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerRemoveBillingAddressIdAction>";
            }
        };
    }
}
