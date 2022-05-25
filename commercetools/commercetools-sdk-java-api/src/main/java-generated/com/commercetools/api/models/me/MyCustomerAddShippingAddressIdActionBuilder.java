
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerAddShippingAddressIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerAddShippingAddressIdAction myCustomerAddShippingAddressIdAction = MyCustomerAddShippingAddressIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerAddShippingAddressIdActionBuilder implements Builder<MyCustomerAddShippingAddressIdAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *
     */

    public MyCustomerAddShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *
     */

    public MyCustomerAddShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyCustomerAddShippingAddressIdAction build() {
        return new MyCustomerAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerAddShippingAddressIdAction without checking for non null required values
     */
    public MyCustomerAddShippingAddressIdAction buildUnchecked() {
        return new MyCustomerAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    public static MyCustomerAddShippingAddressIdActionBuilder of() {
        return new MyCustomerAddShippingAddressIdActionBuilder();
    }

    public static MyCustomerAddShippingAddressIdActionBuilder of(final MyCustomerAddShippingAddressIdAction template) {
        MyCustomerAddShippingAddressIdActionBuilder builder = new MyCustomerAddShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
