
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetDefaultShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetDefaultShippingAddressAction myCustomerSetDefaultShippingAddressAction = MyCustomerSetDefaultShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetDefaultShippingAddressActionBuilder
        implements Builder<MyCustomerSetDefaultShippingAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the Address to become the default shipping address.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyCustomerSetDefaultShippingAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to become the default shipping address.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyCustomerSetDefaultShippingAddressActionBuilder addressKey(@Nullable final String addressKey) {
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
     * builds MyCustomerSetDefaultShippingAddressAction with checking for non-null required values
     * @return MyCustomerSetDefaultShippingAddressAction
     */
    public MyCustomerSetDefaultShippingAddressAction build() {
        return new MyCustomerSetDefaultShippingAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerSetDefaultShippingAddressAction without checking for non-null required values
     * @return MyCustomerSetDefaultShippingAddressAction
     */
    public MyCustomerSetDefaultShippingAddressAction buildUnchecked() {
        return new MyCustomerSetDefaultShippingAddressActionImpl(addressId, addressKey);
    }

    public static MyCustomerSetDefaultShippingAddressActionBuilder of() {
        return new MyCustomerSetDefaultShippingAddressActionBuilder();
    }

    public static MyCustomerSetDefaultShippingAddressActionBuilder of(
            final MyCustomerSetDefaultShippingAddressAction template) {
        MyCustomerSetDefaultShippingAddressActionBuilder builder = new MyCustomerSetDefaultShippingAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
