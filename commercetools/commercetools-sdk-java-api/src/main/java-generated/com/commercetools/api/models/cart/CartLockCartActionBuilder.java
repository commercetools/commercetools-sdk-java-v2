
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartLockCartActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartLockCartAction cartLockCartAction = CartLockCartAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartLockCartActionBuilder implements Builder<CartLockCartAction> {

    /**
     * builds CartLockCartAction with checking for non-null required values
     * @return CartLockCartAction
     */
    public CartLockCartAction build() {
        return new CartLockCartActionImpl();
    }

    /**
     * builds CartLockCartAction without checking for non-null required values
     * @return CartLockCartAction
     */
    public CartLockCartAction buildUnchecked() {
        return new CartLockCartActionImpl();
    }

    /**
     * factory method for an instance of CartLockCartActionBuilder
     * @return builder
     */
    public static CartLockCartActionBuilder of() {
        return new CartLockCartActionBuilder();
    }

    /**
     * create builder for CartLockCartAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartLockCartActionBuilder of(final CartLockCartAction template) {
        CartLockCartActionBuilder builder = new CartLockCartActionBuilder();
        return builder;
    }

}
