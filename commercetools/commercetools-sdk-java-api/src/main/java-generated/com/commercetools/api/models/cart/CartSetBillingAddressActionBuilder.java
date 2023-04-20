
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetBillingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBillingAddressAction cartSetBillingAddressAction = CartSetBillingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetBillingAddressActionBuilder implements Builder<CartSetBillingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CartSetBillingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CartSetBillingAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param address value to be set
     * @return Builder
     */

    public CartSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds CartSetBillingAddressAction with checking for non-null required values
     * @return CartSetBillingAddressAction
     */
    public CartSetBillingAddressAction build() {
        return new CartSetBillingAddressActionImpl(address);
    }

    /**
     * builds CartSetBillingAddressAction without checking for non-null required values
     * @return CartSetBillingAddressAction
     */
    public CartSetBillingAddressAction buildUnchecked() {
        return new CartSetBillingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of CartSetBillingAddressActionBuilder
     * @return builder
     */
    public static CartSetBillingAddressActionBuilder of() {
        return new CartSetBillingAddressActionBuilder();
    }

    /**
     * create builder for CartSetBillingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetBillingAddressActionBuilder of(final CartSetBillingAddressAction template) {
        CartSetBillingAddressActionBuilder builder = new CartSetBillingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
