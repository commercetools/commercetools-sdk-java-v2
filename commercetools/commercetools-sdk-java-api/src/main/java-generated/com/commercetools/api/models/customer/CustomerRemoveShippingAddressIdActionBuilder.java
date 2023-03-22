
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerRemoveShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerRemoveShippingAddressIdAction customerRemoveShippingAddressIdAction = CustomerRemoveShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerRemoveShippingAddressIdActionBuilder implements Builder<CustomerRemoveShippingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @param addressId
     * @return Builder
     */

    public CustomerRemoveShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to remove from <code>shippingAddressesIds</code>.</p>
     * @param addressKey
     * @return Builder
     */

    public CustomerRemoveShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public CustomerRemoveShippingAddressIdAction build() {
        return new CustomerRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds CustomerRemoveShippingAddressIdAction without checking for non null required values
     */
    public CustomerRemoveShippingAddressIdAction buildUnchecked() {
        return new CustomerRemoveShippingAddressIdActionImpl(addressId, addressKey);
    }

    public static CustomerRemoveShippingAddressIdActionBuilder of() {
        return new CustomerRemoveShippingAddressIdActionBuilder();
    }

    public static CustomerRemoveShippingAddressIdActionBuilder of(
            final CustomerRemoveShippingAddressIdAction template) {
        CustomerRemoveShippingAddressIdActionBuilder builder = new CustomerRemoveShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
