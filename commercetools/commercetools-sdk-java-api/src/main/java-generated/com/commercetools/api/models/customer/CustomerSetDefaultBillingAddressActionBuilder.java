
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetDefaultBillingAddressActionBuilder
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
public class CustomerSetDefaultBillingAddressActionBuilder implements Builder<CustomerSetDefaultBillingAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     <*  <p>If not defined, the customer's <code>defaultBillingAddress</code> is unset.</p>>
     */

    public CustomerSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     <>
     */

    public CustomerSetDefaultBillingAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public CustomerSetDefaultBillingAddressAction build() {
        return new CustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds CustomerSetDefaultBillingAddressAction without checking for non null required values
     */
    public CustomerSetDefaultBillingAddressAction buildUnchecked() {
        return new CustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    public static CustomerSetDefaultBillingAddressActionBuilder of() {
        return new CustomerSetDefaultBillingAddressActionBuilder();
    }

    public static CustomerSetDefaultBillingAddressActionBuilder of(
            final CustomerSetDefaultBillingAddressAction template) {
        CustomerSetDefaultBillingAddressActionBuilder builder = new CustomerSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
