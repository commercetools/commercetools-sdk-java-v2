
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerRemoveBillingAddressIdActionImpl.class)
public interface CustomerRemoveBillingAddressIdAction extends CustomerUpdateAction {

    String REMOVE_BILLING_ADDRESS_ID = "removeBillingAddressId";

    /**
     *  <p><code>id</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static CustomerRemoveBillingAddressIdAction of() {
        return new CustomerRemoveBillingAddressIdActionImpl();
    }

    public static CustomerRemoveBillingAddressIdAction of(final CustomerRemoveBillingAddressIdAction template) {
        CustomerRemoveBillingAddressIdActionImpl instance = new CustomerRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerRemoveBillingAddressIdActionBuilder builder() {
        return CustomerRemoveBillingAddressIdActionBuilder.of();
    }

    public static CustomerRemoveBillingAddressIdActionBuilder builder(
            final CustomerRemoveBillingAddressIdAction template) {
        return CustomerRemoveBillingAddressIdActionBuilder.of(template);
    }

    default <T> T withCustomerRemoveBillingAddressIdAction(Function<CustomerRemoveBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerRemoveBillingAddressIdAction>";
            }
        };
    }
}
