
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
     <*  <p>If not set, any existing anonymous ID will be removed.</p>>
     */

    public CartSetAnonymousIdActionBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public CartSetAnonymousIdAction build() {
        return new CartSetAnonymousIdActionImpl(anonymousId);
    }

    /**
     * builds CartSetAnonymousIdAction without checking for non null required values
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
