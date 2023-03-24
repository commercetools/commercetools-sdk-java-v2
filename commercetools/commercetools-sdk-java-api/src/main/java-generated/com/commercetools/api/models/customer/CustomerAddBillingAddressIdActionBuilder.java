
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerAddBillingAddressIdActionBuilder
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
public class CustomerAddBillingAddressIdActionBuilder implements Builder<CustomerAddBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the Address to become a billing address.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to become a billing address.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public CustomerAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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
     * builds CustomerAddBillingAddressIdAction with checking for non-null required values
     * @return CustomerAddBillingAddressIdAction
     */
    public CustomerAddBillingAddressIdAction build() {
        return new CustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds CustomerAddBillingAddressIdAction without checking for non-null required values
     * @return CustomerAddBillingAddressIdAction
     */
    public CustomerAddBillingAddressIdAction buildUnchecked() {
        return new CustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static CustomerAddBillingAddressIdActionBuilder of() {
        return new CustomerAddBillingAddressIdActionBuilder();
    }

    public static CustomerAddBillingAddressIdActionBuilder of(final CustomerAddBillingAddressIdAction template) {
        CustomerAddBillingAddressIdActionBuilder builder = new CustomerAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
