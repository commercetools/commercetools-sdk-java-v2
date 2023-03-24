
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingAddressAction cartSetShippingAddressAction = CartSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingAddressActionBuilder implements Builder<CartSetShippingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Value to set. If not set, the shipping address is unset, and the <code>taxedPrice</code> and <code>taxRate</code> are unset in all Line Items of the Cart.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CartSetShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If not set, the shipping address is unset, and the <code>taxedPrice</code> and <code>taxRate</code> are unset in all Line Items of the Cart.</p>
     * @param address value to be set
     * @return Builder
     */

    public CartSetShippingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds CartSetShippingAddressAction with checking for non-null required values
     * @return CartSetShippingAddressAction
     */
    public CartSetShippingAddressAction build() {
        return new CartSetShippingAddressActionImpl(address);
    }

    /**
     * builds CartSetShippingAddressAction without checking for non-null required values
     * @return CartSetShippingAddressAction
     */
    public CartSetShippingAddressAction buildUnchecked() {
        return new CartSetShippingAddressActionImpl(address);
    }

    public static CartSetShippingAddressActionBuilder of() {
        return new CartSetShippingAddressActionBuilder();
    }

    public static CartSetShippingAddressActionBuilder of(final CartSetShippingAddressAction template) {
        CartSetShippingAddressActionBuilder builder = new CartSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
