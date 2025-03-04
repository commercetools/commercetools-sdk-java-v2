
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BestDealBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BestDeal bestDeal = BestDeal.builder()
 *             .chosenDiscountType("{chosenDiscountType}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BestDealBuilder implements Builder<BestDeal> {

    private String chosenDiscountType;

    /**
     *  <p>Discount type that offers the best deal; the value can be <code>product-discount</code> or <code>cart-discount</code>.</p>
     * @param chosenDiscountType value to be set
     * @return Builder
     */

    public BestDealBuilder chosenDiscountType(final String chosenDiscountType) {
        this.chosenDiscountType = chosenDiscountType;
        return this;
    }

    /**
     *  <p>Discount type that offers the best deal; the value can be <code>product-discount</code> or <code>cart-discount</code>.</p>
     * @return chosenDiscountType
     */

    public String getChosenDiscountType() {
        return this.chosenDiscountType;
    }

    /**
     * builds BestDeal with checking for non-null required values
     * @return BestDeal
     */
    public BestDeal build() {
        Objects.requireNonNull(chosenDiscountType, BestDeal.class + ": chosenDiscountType is missing");
        return new BestDealImpl(chosenDiscountType);
    }

    /**
     * builds BestDeal without checking for non-null required values
     * @return BestDeal
     */
    public BestDeal buildUnchecked() {
        return new BestDealImpl(chosenDiscountType);
    }

    /**
     * factory method for an instance of BestDealBuilder
     * @return builder
     */
    public static BestDealBuilder of() {
        return new BestDealBuilder();
    }

    /**
     * create builder for BestDeal instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BestDealBuilder of(final BestDeal template) {
        BestDealBuilder builder = new BestDealBuilder();
        builder.chosenDiscountType = template.getChosenDiscountType();
        return builder;
    }

}
