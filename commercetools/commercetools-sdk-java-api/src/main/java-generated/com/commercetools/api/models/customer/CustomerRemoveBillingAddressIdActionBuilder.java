
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
     <>
     */

    public CustomerRemoveBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     <>
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

    public CustomerRemoveBillingAddressIdAction build() {
        return new CustomerRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds CustomerRemoveBillingAddressIdAction without checking for non null required values
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
