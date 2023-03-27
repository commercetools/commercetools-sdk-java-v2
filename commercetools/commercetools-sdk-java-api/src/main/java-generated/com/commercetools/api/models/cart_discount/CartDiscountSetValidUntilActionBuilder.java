
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetValidUntilActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetValidUntilAction cartDiscountSetValidUntilAction = CartDiscountSetValidUntilAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetValidUntilActionBuilder implements Builder<CartDiscountSetValidUntilAction> {

    @Nullable
    private java.time.ZonedDateTime validUntil;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public CartDiscountSetValidUntilActionBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     * builds CartDiscountSetValidUntilAction with checking for non-null required values
     * @return CartDiscountSetValidUntilAction
     */
    public CartDiscountSetValidUntilAction build() {
        return new CartDiscountSetValidUntilActionImpl(validUntil);
    }

    /**
     * builds CartDiscountSetValidUntilAction without checking for non-null required values
     * @return CartDiscountSetValidUntilAction
     */
    public CartDiscountSetValidUntilAction buildUnchecked() {
        return new CartDiscountSetValidUntilActionImpl(validUntil);
    }

    /**
     * factory method for an instance of CartDiscountSetValidUntilActionBuilder
     * @return builder
     */
    public static CartDiscountSetValidUntilActionBuilder of() {
        return new CartDiscountSetValidUntilActionBuilder();
    }

    /**
     * create builder for CartDiscountSetValidUntilAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetValidUntilActionBuilder of(final CartDiscountSetValidUntilAction template) {
        CartDiscountSetValidUntilActionBuilder builder = new CartDiscountSetValidUntilActionBuilder();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
