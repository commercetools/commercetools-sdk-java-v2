
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerRemoveAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerRemoveAddressAction myCustomerRemoveAddressAction = MyCustomerRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerRemoveAddressActionBuilder implements Builder<MyCustomerRemoveAddressAction> {

    @Nullable
    private String addressId;

    @Nullable
    private String addressKey;

    /**
     *  <p><code>id</code> of the Address to remove.</p>
     * @param addressId value to be set
     * @return Builder
     */

    public MyCustomerRemoveAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *  <p><code>key</code> of the Address to remove.</p>
     * @param addressKey value to be set
     * @return Builder
     */

    public MyCustomerRemoveAddressActionBuilder addressKey(@Nullable final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    /**
     *  <p><code>id</code> of the Address to remove.</p>
     * @return addressId
     */

    @Nullable
    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p><code>key</code> of the Address to remove.</p>
     * @return addressKey
     */

    @Nullable
    public String getAddressKey() {
        return this.addressKey;
    }

    /**
     * builds MyCustomerRemoveAddressAction with checking for non-null required values
     * @return MyCustomerRemoveAddressAction
     */
    public MyCustomerRemoveAddressAction build() {
        return new MyCustomerRemoveAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerRemoveAddressAction without checking for non-null required values
     * @return MyCustomerRemoveAddressAction
     */
    public MyCustomerRemoveAddressAction buildUnchecked() {
        return new MyCustomerRemoveAddressActionImpl(addressId, addressKey);
    }

    /**
     * factory method for an instance of MyCustomerRemoveAddressActionBuilder
     * @return builder
     */
    public static MyCustomerRemoveAddressActionBuilder of() {
        return new MyCustomerRemoveAddressActionBuilder();
    }

    /**
     * create builder for MyCustomerRemoveAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerRemoveAddressActionBuilder of(final MyCustomerRemoveAddressAction template) {
        MyCustomerRemoveAddressActionBuilder builder = new MyCustomerRemoveAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
