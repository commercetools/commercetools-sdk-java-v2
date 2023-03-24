
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetShippingAddressAction myCartSetShippingAddressAction = MyCartSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetShippingAddressActionBuilder implements Builder<MyCartSetShippingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Value to set. If not set, the shipping address is unset, and the <code>taxedPrice</code> and <code>taxRate</code> are unset in all Line Items.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public MyCartSetShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If not set, the shipping address is unset, and the <code>taxedPrice</code> and <code>taxRate</code> are unset in all Line Items.</p>
     * @param address value to be set
     * @return Builder
     */

    public MyCartSetShippingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds MyCartSetShippingAddressAction with checking for non-null required values
     * @return MyCartSetShippingAddressAction
     */
    public MyCartSetShippingAddressAction build() {
        return new MyCartSetShippingAddressActionImpl(address);
    }

    /**
     * builds MyCartSetShippingAddressAction without checking for non-null required values
     * @return MyCartSetShippingAddressAction
     */
    public MyCartSetShippingAddressAction buildUnchecked() {
        return new MyCartSetShippingAddressActionImpl(address);
    }

    public static MyCartSetShippingAddressActionBuilder of() {
        return new MyCartSetShippingAddressActionBuilder();
    }

    public static MyCartSetShippingAddressActionBuilder of(final MyCartSetShippingAddressAction template) {
        MyCartSetShippingAddressActionBuilder builder = new MyCartSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
