
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartRemoveItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemoveItemShippingAddressAction myCartRemoveItemShippingAddressAction = MyCartRemoveItemShippingAddressAction.builder()
 *             .addressKey("{addressKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartRemoveItemShippingAddressActionBuilder implements Builder<MyCartRemoveItemShippingAddressAction> {

    private String addressKey;

    /**
     *  <p><code>key</code> of the Address to remove from <code>itemShippingAddresses</code>.</p>
     */

    public MyCartRemoveItemShippingAddressActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public MyCartRemoveItemShippingAddressAction build() {
        Objects.requireNonNull(addressKey, MyCartRemoveItemShippingAddressAction.class + ": addressKey is missing");
        return new MyCartRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * builds MyCartRemoveItemShippingAddressAction without checking for non null required values
     */
    public MyCartRemoveItemShippingAddressAction buildUnchecked() {
        return new MyCartRemoveItemShippingAddressActionImpl(addressKey);
    }

    public static MyCartRemoveItemShippingAddressActionBuilder of() {
        return new MyCartRemoveItemShippingAddressActionBuilder();
    }

    public static MyCartRemoveItemShippingAddressActionBuilder of(
            final MyCartRemoveItemShippingAddressAction template) {
        MyCartRemoveItemShippingAddressActionBuilder builder = new MyCartRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
