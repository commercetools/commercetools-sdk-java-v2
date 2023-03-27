
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueRelativeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueRelative cartDiscountValueRelative = CartDiscountValueRelative.builder()
 *             .permyriad(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueRelativeBuilder implements Builder<CartDiscountValueRelative> {

    private Long permyriad;

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @param permyriad value to be set
     * @return Builder
     */

    public CartDiscountValueRelativeBuilder permyriad(final Long permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @return permyriad
     */

    public Long getPermyriad() {
        return this.permyriad;
    }

    /**
     * builds CartDiscountValueRelative with checking for non-null required values
     * @return CartDiscountValueRelative
     */
    public CartDiscountValueRelative build() {
        Objects.requireNonNull(permyriad, CartDiscountValueRelative.class + ": permyriad is missing");
        return new CartDiscountValueRelativeImpl(permyriad);
    }

    /**
     * builds CartDiscountValueRelative without checking for non-null required values
     * @return CartDiscountValueRelative
     */
    public CartDiscountValueRelative buildUnchecked() {
        return new CartDiscountValueRelativeImpl(permyriad);
    }

    /**
     * factory method for an instance of CartDiscountValueRelativeBuilder
     * @return builder
     */
    public static CartDiscountValueRelativeBuilder of() {
        return new CartDiscountValueRelativeBuilder();
    }

    /**
     * create builder for CartDiscountValueRelative instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueRelativeBuilder of(final CartDiscountValueRelative template) {
        CartDiscountValueRelativeBuilder builder = new CartDiscountValueRelativeBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
