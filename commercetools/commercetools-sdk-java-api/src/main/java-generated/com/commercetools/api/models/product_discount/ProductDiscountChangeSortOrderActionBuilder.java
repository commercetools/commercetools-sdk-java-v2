
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangeSortOrderActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeSortOrderAction productDiscountChangeSortOrderAction = ProductDiscountChangeSortOrderAction.builder()
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountChangeSortOrderActionBuilder implements Builder<ProductDiscountChangeSortOrderAction> {

    private String sortOrder;

    /**
     <*  <p>New value to set. Must not be empty. The string value must be a number between <code>0</code> and <code>1</code>. A Discount with a higher sortOrder is prioritized.</p>>
     */

    public ProductDiscountChangeSortOrderActionBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public ProductDiscountChangeSortOrderAction build() {
        Objects.requireNonNull(sortOrder, ProductDiscountChangeSortOrderAction.class + ": sortOrder is missing");
        return new ProductDiscountChangeSortOrderActionImpl(sortOrder);
    }

    /**
     * builds ProductDiscountChangeSortOrderAction without checking for non null required values
     */
    public ProductDiscountChangeSortOrderAction buildUnchecked() {
        return new ProductDiscountChangeSortOrderActionImpl(sortOrder);
    }

    public static ProductDiscountChangeSortOrderActionBuilder of() {
        return new ProductDiscountChangeSortOrderActionBuilder();
    }

    public static ProductDiscountChangeSortOrderActionBuilder of(final ProductDiscountChangeSortOrderAction template) {
        ProductDiscountChangeSortOrderActionBuilder builder = new ProductDiscountChangeSortOrderActionBuilder();
        builder.sortOrder = template.getSortOrder();
        return builder;
    }

}
