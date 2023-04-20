
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartAddItemShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddItemShippingAddressAction cartAddItemShippingAddressAction = CartAddItemShippingAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddItemShippingAddressActionBuilder implements Builder<CartAddItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new Address must have a <code>key</code> that is unique accross this Cart.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CartAddItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new Address must have a <code>key</code> that is unique accross this Cart.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public CartAddItemShippingAddressActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new Address must have a <code>key</code> that is unique accross this Cart.</p>
     * @param address value to be set
     * @return Builder
     */

    public CartAddItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Address to append to <code>itemShippingAddresses</code>.</p>
     *  <p>The new Address must have a <code>key</code> that is unique accross this Cart.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * builds CartAddItemShippingAddressAction with checking for non-null required values
     * @return CartAddItemShippingAddressAction
     */
    public CartAddItemShippingAddressAction build() {
        Objects.requireNonNull(address, CartAddItemShippingAddressAction.class + ": address is missing");
        return new CartAddItemShippingAddressActionImpl(address);
    }

    /**
     * builds CartAddItemShippingAddressAction without checking for non-null required values
     * @return CartAddItemShippingAddressAction
     */
    public CartAddItemShippingAddressAction buildUnchecked() {
        return new CartAddItemShippingAddressActionImpl(address);
    }

    /**
     * factory method for an instance of CartAddItemShippingAddressActionBuilder
     * @return builder
     */
    public static CartAddItemShippingAddressActionBuilder of() {
        return new CartAddItemShippingAddressActionBuilder();
    }

    /**
     * create builder for CartAddItemShippingAddressAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddItemShippingAddressActionBuilder of(final CartAddItemShippingAddressAction template) {
        CartAddItemShippingAddressActionBuilder builder = new CartAddItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
