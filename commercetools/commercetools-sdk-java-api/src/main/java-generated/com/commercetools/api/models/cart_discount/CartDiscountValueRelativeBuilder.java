
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

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

    @Nullable
    private com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode;

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
     *  <p>Indicates how the discount applies when using <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>.</p>
     *  <ul>
     *   <li>If the mode is <code>IndividualApplication</code>, the discounted percentage is applied on each unit's price. The units matching the <code>triggerPattern</code> are not considered.</li>
     *   <li>If the mode is <code>ProportionateDistribution</code> and <code>EvenDistribution</code> the discounted value is calculated from the total value of the units matching the <code>targetPattern</code> and distributed among the units matching the <code>targetPattern</code> or <code>triggerPattern</code>. These modes are allowed only if <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> is non-empty.</li>
     *  </ul>
     * @param applicationMode value to be set
     * @return Builder
     */

    public CartDiscountValueRelativeBuilder applicationMode(
            @Nullable final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.applicationMode = applicationMode;
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
     *  <p>Indicates how the discount applies when using <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>.</p>
     *  <ul>
     *   <li>If the mode is <code>IndividualApplication</code>, the discounted percentage is applied on each unit's price. The units matching the <code>triggerPattern</code> are not considered.</li>
     *   <li>If the mode is <code>ProportionateDistribution</code> and <code>EvenDistribution</code> the discounted value is calculated from the total value of the units matching the <code>targetPattern</code> and distributed among the units matching the <code>targetPattern</code> or <code>triggerPattern</code>. These modes are allowed only if <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a> <code>triggerPattern</code> is non-empty.</li>
     *  </ul>
     * @return applicationMode
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.DiscountApplicationMode getApplicationMode() {
        return this.applicationMode;
    }

    /**
     * builds CartDiscountValueRelative with checking for non-null required values
     * @return CartDiscountValueRelative
     */
    public CartDiscountValueRelative build() {
        Objects.requireNonNull(permyriad, CartDiscountValueRelative.class + ": permyriad is missing");
        return new CartDiscountValueRelativeImpl(permyriad, applicationMode);
    }

    /**
     * builds CartDiscountValueRelative without checking for non-null required values
     * @return CartDiscountValueRelative
     */
    public CartDiscountValueRelative buildUnchecked() {
        return new CartDiscountValueRelativeImpl(permyriad, applicationMode);
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
        builder.applicationMode = template.getApplicationMode();
        return builder;
    }

}
