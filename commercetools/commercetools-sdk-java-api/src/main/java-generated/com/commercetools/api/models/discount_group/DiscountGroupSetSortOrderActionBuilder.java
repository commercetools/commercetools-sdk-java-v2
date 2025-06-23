
package com.commercetools.api.models.discount_group;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupSetSortOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetSortOrderAction discountGroupSetSortOrderAction = DiscountGroupSetSortOrderAction.builder()
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupSetSortOrderActionBuilder implements Builder<DiscountGroupSetSortOrderAction> {

    private String sortOrder;

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>). A CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
     * @param sortOrder value to be set
     * @return Builder
     */

    public DiscountGroupSetSortOrderActionBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <p>New value to set (between <code>0</code> and <code>1</code>). A CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
     * @return sortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * builds DiscountGroupSetSortOrderAction with checking for non-null required values
     * @return DiscountGroupSetSortOrderAction
     */
    public DiscountGroupSetSortOrderAction build() {
        Objects.requireNonNull(sortOrder, DiscountGroupSetSortOrderAction.class + ": sortOrder is missing");
        return new DiscountGroupSetSortOrderActionImpl(sortOrder);
    }

    /**
     * builds DiscountGroupSetSortOrderAction without checking for non-null required values
     * @return DiscountGroupSetSortOrderAction
     */
    public DiscountGroupSetSortOrderAction buildUnchecked() {
        return new DiscountGroupSetSortOrderActionImpl(sortOrder);
    }

    /**
     * factory method for an instance of DiscountGroupSetSortOrderActionBuilder
     * @return builder
     */
    public static DiscountGroupSetSortOrderActionBuilder of() {
        return new DiscountGroupSetSortOrderActionBuilder();
    }

    /**
     * create builder for DiscountGroupSetSortOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetSortOrderActionBuilder of(final DiscountGroupSetSortOrderAction template) {
        DiscountGroupSetSortOrderActionBuilder builder = new DiscountGroupSetSortOrderActionBuilder();
        builder.sortOrder = template.getSortOrder();
        return builder;
    }

}
