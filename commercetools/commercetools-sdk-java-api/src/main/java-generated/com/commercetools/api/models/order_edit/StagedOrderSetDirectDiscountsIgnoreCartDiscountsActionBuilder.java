
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction stagedOrderSetDirectDiscountsIgnoreCartDiscountsAction = StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder
        implements Builder<StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction> {

    @Nullable
    private Boolean directDiscountsIgnoreCartDiscounts;

    /**
     *  <ul>
     *   <li>If <code>true</code>, only <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> apply to the Order. Matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> are ignored, and Discount Codes cannot be added.</li>
     *  </ul>
     *  <p>The value can be set to <code>true</code> only if the Order does not have both <code>discountCodes</code> and <code>directDiscounts</code>.</p>
     *  <ul>
     *   <li>If <code>false</code>, Cart Discounts, Discount Codes, and Direct Discounts apply to the Order.</li>
     *  </ul>
     * @param directDiscountsIgnoreCartDiscounts value to be set
     * @return Builder
     */

    public StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder directDiscountsIgnoreCartDiscounts(
            @Nullable final Boolean directDiscountsIgnoreCartDiscounts) {
        this.directDiscountsIgnoreCartDiscounts = directDiscountsIgnoreCartDiscounts;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>true</code>, only <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">Direct Discounts</a> apply to the Order. Matching <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> are ignored, and Discount Codes cannot be added.</li>
     *  </ul>
     *  <p>The value can be set to <code>true</code> only if the Order does not have both <code>discountCodes</code> and <code>directDiscounts</code>.</p>
     *  <ul>
     *   <li>If <code>false</code>, Cart Discounts, Discount Codes, and Direct Discounts apply to the Order.</li>
     *  </ul>
     * @return directDiscountsIgnoreCartDiscounts
     */

    @Nullable
    public Boolean getDirectDiscountsIgnoreCartDiscounts() {
        return this.directDiscountsIgnoreCartDiscounts;
    }

    /**
     * builds StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction with checking for non-null required values
     * @return StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction
     */
    public StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction build() {
        return new StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl(directDiscountsIgnoreCartDiscounts);
    }

    /**
     * builds StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction without checking for non-null required values
     * @return StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction
     */
    public StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction buildUnchecked() {
        return new StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionImpl(directDiscountsIgnoreCartDiscounts);
    }

    /**
     * factory method for an instance of StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder
     * @return builder
     */
    public static StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder of() {
        return new StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder();
    }

    /**
     * create builder for StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder of(
            final StagedOrderSetDirectDiscountsIgnoreCartDiscountsAction template) {
        StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder builder = new StagedOrderSetDirectDiscountsIgnoreCartDiscountsActionBuilder();
        builder.directDiscountsIgnoreCartDiscounts = template.getDirectDiscountsIgnoreCartDiscounts();
        return builder;
    }

}
