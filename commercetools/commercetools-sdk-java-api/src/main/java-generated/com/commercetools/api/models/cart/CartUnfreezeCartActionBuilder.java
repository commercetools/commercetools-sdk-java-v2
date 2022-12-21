
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUnfreezeCartActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnfreezeCartAction cartUnfreezeCartAction = CartUnfreezeCartAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartUnfreezeCartActionBuilder implements Builder<CartUnfreezeCartAction> {

    public CartUnfreezeCartAction build() {
        return new CartUnfreezeCartActionImpl();
    }

    /**
     * builds CartUnfreezeCartAction without checking for non null required values
     */
    public CartUnfreezeCartAction buildUnchecked() {
        return new CartUnfreezeCartActionImpl();
    }

    public static CartUnfreezeCartActionBuilder of() {
        return new CartUnfreezeCartActionBuilder();
    }

    public static CartUnfreezeCartActionBuilder of(final CartUnfreezeCartAction template) {
        CartUnfreezeCartActionBuilder builder = new CartUnfreezeCartActionBuilder();
        return builder;
    }

}
