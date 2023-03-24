
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetAnonymousIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetAnonymousIdAction cartSetAnonymousIdAction = CartSetAnonymousIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetAnonymousIdActionBuilder implements Builder<CartSetAnonymousIdAction> {

    @Nullable
    private String anonymousId;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public CartSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     * builds CartSetAnonymousIdAction with checking for non-null required values
     * @return CartSetAnonymousIdAction
     */
    public CartSetAnonymousIdAction build() {
        return new CartSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * builds CartSetAnonymousIdAction without checking for non-null required values
     * @return CartSetAnonymousIdAction
     */
    public CartSetAnonymousIdAction buildUnchecked() {
        return new CartSetAnonymousIdActionImpl(anonymousId);
    }

    public static CartSetAnonymousIdActionBuilder of() {
        return new CartSetAnonymousIdActionBuilder();
    }

    public static CartSetAnonymousIdActionBuilder of(final CartSetAnonymousIdAction template) {
        CartSetAnonymousIdActionBuilder builder = new CartSetAnonymousIdActionBuilder();
        builder.anonymousId = template.getAnonymousId();
        return builder;
    }

}
