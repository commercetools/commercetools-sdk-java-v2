
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerAddBillingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerAddBillingAddressIdAction myCustomerAddBillingAddressIdAction = MyCustomerAddBillingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerAddBillingAddressIdActionBuilder implements Builder<MyCustomerAddBillingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the Address to become a billing address.</p>
     * @param addressId
     * @return Builder
     */

    public MyCustomerAddBillingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to become a billing address.</p>
     * @param addressKey
     * @return Builder
     */

    public MyCustomerAddBillingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyCustomerAddBillingAddressIdAction build() {
        return new MyCustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerAddBillingAddressIdAction without checking for non null required values
     */
    public MyCustomerAddBillingAddressIdAction buildUnchecked() {
        return new MyCustomerAddBillingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyCustomerAddBillingAddressIdActionBuilder of() {
        return new MyCustomerAddBillingAddressIdActionBuilder();
    }

    public static MyCustomerAddBillingAddressIdActionBuilder of(final MyCustomerAddBillingAddressIdAction template) {
        MyCustomerAddBillingAddressIdActionBuilder builder = new MyCustomerAddBillingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
