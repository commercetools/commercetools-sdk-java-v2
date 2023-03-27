
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
     *  <p><code>id</code> of the Address to become a shipping address.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyCustomerAddShippingAddressIdActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to become a shipping address.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyCustomerAddShippingAddressIdActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p><code>id</code> of the Address to become a shipping address.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p><code>key</code> of the Address to become a shipping address.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds MyCustomerAddShippingAddressIdAction with checking for non-null required values
     * @return MyCustomerAddShippingAddressIdAction
     */
    public MyCustomerAddShippingAddressIdAction build() {
        return new MyCustomerAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerAddShippingAddressIdAction without checking for non-null required values
     * @return MyCustomerAddShippingAddressIdAction
     */
    public MyCustomerAddShippingAddressIdAction buildUnchecked() {
        return new MyCustomerAddShippingAddressIdActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyCustomerAddShippingAddressIdActionBuilder
     * @return builder
     */
    public static MyCustomerAddShippingAddressIdActionBuilder of() {
        return new MyCustomerAddShippingAddressIdActionBuilder();
    }

    /**
     * create builder for MyCustomerAddShippingAddressIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerAddShippingAddressIdActionBuilder of(final MyCustomerAddShippingAddressIdAction template) {
        MyCustomerAddShippingAddressIdActionBuilder builder = new MyCustomerAddShippingAddressIdActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
