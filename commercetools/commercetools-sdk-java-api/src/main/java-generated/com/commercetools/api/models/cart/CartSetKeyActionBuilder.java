
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetKeyAction cartSetKeyAction = CartSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetKeyActionBuilder implements Builder<CartSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing key will be removed.</p>
     */

    public CartSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CartSetKeyAction build() {
        return new CartSetKeyActionImpl(key);
    }

    /**
     * builds CartSetKeyAction without checking for non null required values
     */
    public CartSetKeyAction buildUnchecked() {
        return new CartSetKeyActionImpl(key);
    }

    public static CartSetKeyActionBuilder of() {
        return new CartSetKeyActionBuilder();
    }

    public static CartSetKeyActionBuilder of(final CartSetKeyAction template) {
        CartSetKeyActionBuilder builder = new CartSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
