
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueRelativeDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueRelativeDraft cartDiscountValueRelativeDraft = CartDiscountValueRelativeDraft.builder()
 *             .permyriad(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueRelativeDraftBuilder implements Builder<CartDiscountValueRelativeDraft> {

    private Long permyriad;

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     * @param permyriad value to be set
     * @return Builder
     */

    public CartDiscountValueRelativeDraftBuilder permyriad(final Long permyriad) {
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
     * builds CartDiscountValueRelativeDraft with checking for non-null required values
     * @return CartDiscountValueRelativeDraft
     */
    public CartDiscountValueRelativeDraft build() {
        Objects.requireNonNull(permyriad, CartDiscountValueRelativeDraft.class + ": permyriad is missing");
        return new CartDiscountValueRelativeDraftImpl(permyriad);
    }

    /**
     * builds CartDiscountValueRelativeDraft without checking for non-null required values
     * @return CartDiscountValueRelativeDraft
     */
    public CartDiscountValueRelativeDraft buildUnchecked() {
        return new CartDiscountValueRelativeDraftImpl(permyriad);
    }

    /**
     * factory method for an instance of CartDiscountValueRelativeDraftBuilder
     * @return builder
     */
    public static CartDiscountValueRelativeDraftBuilder of() {
        return new CartDiscountValueRelativeDraftBuilder();
    }

    /**
     * create builder for CartDiscountValueRelativeDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountValueRelativeDraftBuilder of(final CartDiscountValueRelativeDraft template) {
        CartDiscountValueRelativeDraftBuilder builder = new CartDiscountValueRelativeDraftBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
