
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetKeyAction cartDiscountSetKeyAction = CartDiscountSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetKeyActionBuilder implements Builder<CartDiscountSetKeyAction> {

    @Nullable
    private String key;

    /**
     <*  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>>
     */

    public CartDiscountSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CartDiscountSetKeyAction build() {
        return new CartDiscountSetKeyActionImpl(key);
    }

    /**
     * builds CartDiscountSetKeyAction without checking for non null required values
     */
    public CartDiscountSetKeyAction buildUnchecked() {
        return new CartDiscountSetKeyActionImpl(key);
    }

    public static CartDiscountSetKeyActionBuilder of() {
        return new CartDiscountSetKeyActionBuilder();
    }

    public static CartDiscountSetKeyActionBuilder of(final CartDiscountSetKeyAction template) {
        CartDiscountSetKeyActionBuilder builder = new CartDiscountSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
