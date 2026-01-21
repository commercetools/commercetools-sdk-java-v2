
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartFreezeCartActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartFreezeCartAction cartFreezeCartAction = CartFreezeCartAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartFreezeCartActionBuilder implements Builder<CartFreezeCartAction> {

    @Nullable
    private com.commercetools.api.models.cart.FreezeStrategy strategy;

    /**
     *  <p>Strategy that determines the freezing behavior.</p>
     * @param strategy value to be set
     * @return Builder
     */

    public CartFreezeCartActionBuilder strategy(
            @Nullable final com.commercetools.api.models.cart.FreezeStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     *  <p>Strategy that determines the freezing behavior.</p>
     * @return strategy
     */

    @Nullable
    public com.commercetools.api.models.cart.FreezeStrategy getStrategy() {
        return this.strategy;
    }

    /**
     * builds CartFreezeCartAction with checking for non-null required values
     * @return CartFreezeCartAction
     */
    public CartFreezeCartAction build() {
        return new CartFreezeCartActionImpl(strategy);
    }

    /**
     * builds CartFreezeCartAction without checking for non-null required values
     * @return CartFreezeCartAction
     */
    public CartFreezeCartAction buildUnchecked() {
        return new CartFreezeCartActionImpl(strategy);
    }

    /**
     * factory method for an instance of CartFreezeCartActionBuilder
     * @return builder
     */
    public static CartFreezeCartActionBuilder of() {
        return new CartFreezeCartActionBuilder();
    }

    /**
     * create builder for CartFreezeCartAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartFreezeCartActionBuilder of(final CartFreezeCartAction template) {
        CartFreezeCartActionBuilder builder = new CartFreezeCartActionBuilder();
        builder.strategy = template.getStrategy();
        return builder;
    }

}
