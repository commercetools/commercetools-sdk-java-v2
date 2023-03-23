
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerRemoveBillingAddressIdActionBuilder
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
public class MyCustomerRemoveBillingAddressIdActionBuilder implements Builder<MyCustomerRemoveBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     * @param addressId
     * @return Builder
     */

    public MyCustomerRemoveBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to remove from <code>billingAddressesIds</code>.</p>
     * @param addressKey
     * @return Builder
     */

    public MyCustomerRemoveBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyCustomerRemoveBillingAddressIdAction build() {
        return new MyCustomerRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerRemoveBillingAddressIdAction without checking for non null required values
     */
    public MyCustomerRemoveBillingAddressIdAction buildUnchecked() {
        return new MyCustomerRemoveBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyCustomerRemoveBillingAddressIdActionBuilder of() {
        return new MyCustomerRemoveBillingAddressIdActionBuilder();
    }

    public static MyCustomerRemoveBillingAddressIdActionBuilder of(
            final MyCustomerRemoveBillingAddressIdAction template) {
        MyCustomerRemoveBillingAddressIdActionBuilder builder = new MyCustomerRemoveBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
