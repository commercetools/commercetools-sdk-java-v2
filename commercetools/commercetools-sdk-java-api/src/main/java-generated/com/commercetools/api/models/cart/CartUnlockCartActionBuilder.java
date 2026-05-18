
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUnlockCartActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnlockCartAction cartUnlockCartAction = CartUnlockCartAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartUnlockCartActionBuilder implements Builder<CartUnlockCartAction> {

    /**
     * builds CartUnlockCartAction with checking for non-null required values
     * @return CartUnlockCartAction
     */
    public CartUnlockCartAction build() {
        return new CartUnlockCartActionImpl();
    }

    /**
     * builds CartUnlockCartAction without checking for non-null required values
     * @return CartUnlockCartAction
     */
    public CartUnlockCartAction buildUnchecked() {
        return new CartUnlockCartActionImpl();
    }

    /**
     * factory method for an instance of CartUnlockCartActionBuilder
     * @return builder
     */
    public static CartUnlockCartActionBuilder of() {
        return new CartUnlockCartActionBuilder();
    }

    /**
     * create builder for CartUnlockCartAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUnlockCartActionBuilder of(final CartUnlockCartAction template) {
        CartUnlockCartActionBuilder builder = new CartUnlockCartActionBuilder();
        return builder;
    }

}
