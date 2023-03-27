
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetDefaultBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetDefaultBillingAddressAction myCustomerSetDefaultBillingAddressAction = MyCustomerSetDefaultBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetDefaultBillingAddressActionBuilder
        implements Builder<MyCustomerSetDefaultBillingAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the Address to become the default billing address.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyCustomerSetDefaultBillingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to become the default billing address.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyCustomerSetDefaultBillingAddressActionBuilder addressKey(@Nullable final String addressKey) {
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
     * builds MyCustomerSetDefaultBillingAddressAction with checking for non-null required values
     * @return MyCustomerSetDefaultBillingAddressAction
     */
    public MyCustomerSetDefaultBillingAddressAction build() {
        return new MyCustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerSetDefaultBillingAddressAction without checking for non-null required values
     * @return MyCustomerSetDefaultBillingAddressAction
     */
    public MyCustomerSetDefaultBillingAddressAction buildUnchecked() {
        return new MyCustomerSetDefaultBillingAddressActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyCustomerSetDefaultBillingAddressActionBuilder
     * @return builder
     */
    public static MyCustomerSetDefaultBillingAddressActionBuilder of() {
        return new MyCustomerSetDefaultBillingAddressActionBuilder();
    }

    /**
     * create builder for MyCustomerSetDefaultBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetDefaultBillingAddressActionBuilder of(
            final MyCustomerSetDefaultBillingAddressAction template) {
        MyCustomerSetDefaultBillingAddressActionBuilder builder = new MyCustomerSetDefaultBillingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
