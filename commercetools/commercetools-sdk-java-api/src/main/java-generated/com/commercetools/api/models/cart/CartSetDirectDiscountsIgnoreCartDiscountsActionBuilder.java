
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDirectDiscountsIgnoreCartDiscountsAction cartSetDirectDiscountsIgnoreCartDiscountsAction = CartSetDirectDiscountsIgnoreCartDiscountsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder
        implements Builder<CartSetDirectDiscountsIgnoreCartDiscountsAction> {

    @Nullable
    private Boolean directDiscountsIgnoreCartDiscounts;

    /**
     *  <ul>
     *   <li>If <code>true</code>, only <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> apply to the Cart. Matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> are ignored, and Discount Codes cannot be added.</li>
     *  </ul>
     *  <p>The value can be set to <code>true</code> only if the Cart does not have both <code>discountCodes</code> and <code>directDiscounts</code>.</p>
     *  <ul>
     *   <li>If <code>false</code>, Cart Discounts, Discount Codes, and Direct Discounts apply to the Cart.</li>
     *  </ul>
     * @param directDiscountsIgnoreCartDiscounts value to be set
     * @return Builder
     */

    public CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder directDiscountsIgnoreCartDiscounts(
            @Nullable final Boolean directDiscountsIgnoreCartDiscounts) {
        this.directDiscountsIgnoreCartDiscounts = directDiscountsIgnoreCartDiscounts;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, only <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> apply to the Cart. Matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> are ignored, and Discount Codes cannot be added.</li>
     *  </ul>
     *  <p>The value can be set to <code>true</code> only if the Cart does not have both <code>discountCodes</code> and <code>directDiscounts</code>.</p>
     *  <ul>
     *   <li>If <code>false</code>, Cart Discounts, Discount Codes, and Direct Discounts apply to the Cart.</li>
     *  </ul>
     * @return directDiscountsIgnoreCartDiscounts
     */

    @Nullable
    public Boolean getDirectDiscountsIgnoreCartDiscounts() {
        return this.directDiscountsIgnoreCartDiscounts;
    }

    /**
     * builds CartSetDirectDiscountsIgnoreCartDiscountsAction with checking for non-null required values
     * @return CartSetDirectDiscountsIgnoreCartDiscountsAction
     */
    public CartSetDirectDiscountsIgnoreCartDiscountsAction build() {
        return new CartSetDirectDiscountsIgnoreCartDiscountsActionImpl(directDiscountsIgnoreCartDiscounts);
    }

    /**
     * builds CartSetDirectDiscountsIgnoreCartDiscountsAction without checking for non-null required values
     * @return CartSetDirectDiscountsIgnoreCartDiscountsAction
     */
    public CartSetDirectDiscountsIgnoreCartDiscountsAction buildUnchecked() {
        return new CartSetDirectDiscountsIgnoreCartDiscountsActionImpl(directDiscountsIgnoreCartDiscounts);
    }

    /**
     * factory method for an instance of CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder
     * @return builder
     */
    public static CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder of() {
        return new CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder();
    }

    /**
     * create builder for CartSetDirectDiscountsIgnoreCartDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder of(
            final CartSetDirectDiscountsIgnoreCartDiscountsAction template) {
        CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder builder = new CartSetDirectDiscountsIgnoreCartDiscountsActionBuilder();
        builder.directDiscountsIgnoreCartDiscounts = template.getDirectDiscountsIgnoreCartDiscounts();
        return builder;
    }

}
