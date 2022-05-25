
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
     *
     */

    public MyCustomerRemoveAddressActionBuilder addressId(@Nullable final String addressId) {
        this.addressId = addressId;
        return this;
    }

    /**
     *
     */

    public MyCustomerRemoveAddressActionBuilder addressKey(@Nullable final String addressKey) {
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

    public MyCustomerRemoveAddressAction build() {
        return new MyCustomerRemoveAddressActionImpl(addressId, addressKey);
    }

    /**
     * builds MyCustomerRemoveAddressAction without checking for non null required values
     */
    public MyCustomerRemoveAddressAction buildUnchecked() {
        return new MyCustomerRemoveAddressActionImpl(addressId, addressKey);
    }

    public static MyCustomerRemoveAddressActionBuilder of() {
        return new MyCustomerRemoveAddressActionBuilder();
    }

    public static MyCustomerRemoveAddressActionBuilder of(final MyCustomerRemoveAddressAction template) {
        MyCustomerRemoveAddressActionBuilder builder = new MyCustomerRemoveAddressActionBuilder();
        builder.addressId = template.getAddressId();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
