
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
     *  <p><code>id</code> of the Address to become the default billing address.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public CustomerSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to become the default billing address.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public CustomerSetDefaultBillingAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p><code>id</code> of the Address to become the default billing address.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p><code>key</code> of the Address to become the default billing address.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds CustomerSetDefaultBillingAddressAction with checking for non-null required values
     * @return CustomerSetDefaultBillingAddressAction
     */
    public CustomerSetDefaultBillingAddressAction build() {
        return new CustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds CustomerSetDefaultBillingAddressAction without checking for non-null required values
     * @return CustomerSetDefaultBillingAddressAction
     */
    public CustomerSetDefaultBillingAddressAction buildUnchecked() {
        return new CustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of CustomerSetDefaultBillingAddressActionBuilder
     * @return builder
     */
    public static CustomerSetDefaultBillingAddressActionBuilder of() {
        return new CustomerSetDefaultBillingAddressActionBuilder();
    }

    /**
     * create builder for CustomerSetDefaultBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetDefaultBillingAddressActionBuilder of(
            final CustomerSetDefaultBillingAddressAction template) {
        CustomerSetDefaultBillingAddressActionBuilder builder = new CustomerSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
