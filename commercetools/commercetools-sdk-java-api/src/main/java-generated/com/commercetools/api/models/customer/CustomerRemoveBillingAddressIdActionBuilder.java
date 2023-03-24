
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerRemoveBillingAddressIdActionBuilder
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
public class CustomerRemoveBillingAddressIdActionBuilder implements Builder<CustomerRemoveBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerRemoveBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public CustomerRemoveBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds CustomerRemoveBillingAddressIdAction with checking for non-null required values
     * @return CustomerRemoveBillingAddressIdAction
     */
    public CustomerRemoveBillingAddressIdAction build() {
        return new CustomerRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds CustomerRemoveBillingAddressIdAction without checking for non-null required values
     * @return CustomerRemoveBillingAddressIdAction
     */
    public CustomerRemoveBillingAddressIdAction buildUnchecked() {
        return new CustomerRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static CustomerRemoveBillingAddressIdActionBuilder of() {
        return new CustomerRemoveBillingAddressIdActionBuilder();
    }

    public static CustomerRemoveBillingAddressIdActionBuilder of(final CustomerRemoveBillingAddressIdAction template) {
        CustomerRemoveBillingAddressIdActionBuilder builder = new CustomerRemoveBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
