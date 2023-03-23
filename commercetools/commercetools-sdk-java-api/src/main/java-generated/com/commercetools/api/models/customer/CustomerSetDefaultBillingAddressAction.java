
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static CustomerSetDefaultBillingAddressAction of() {
        return new CustomerSetDefaultBillingAddressActionImpl();
    }

    public static CustomerSetDefaultBillingAddressAction of(final CustomerSetDefaultBillingAddressAction template) {
        CustomerSetDefaultBillingAddressActionImpl instance = new CustomerSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerSetDefaultBillingAddressActionBuilder builder() {
        return CustomerSetDefaultBillingAddressActionBuilder.of();
    }

    public static CustomerSetDefaultBillingAddressActionBuilder builder(
            final CustomerSetDefaultBillingAddressAction template) {
        return CustomerSetDefaultBillingAddressActionBuilder.of(template);
    }

    default <T> T withCustomerSetDefaultBillingAddressAction(
            Function<CustomerSetDefaultBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetDefaultBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetDefaultBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetDefaultBillingAddressAction>";
            }
        };
    }
}
