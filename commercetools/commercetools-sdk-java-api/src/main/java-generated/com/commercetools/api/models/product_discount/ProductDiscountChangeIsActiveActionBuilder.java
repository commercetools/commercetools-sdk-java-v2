
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangeIsActiveActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangeIsActiveAction productDiscountChangeIsActiveAction = ProductDiscountChangeIsActiveAction.builder()
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountChangeIsActiveActionBuilder implements Builder<ProductDiscountChangeIsActiveAction> {

    private Boolean isActive;

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount will be applied to Product Prices.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public ProductDiscountChangeIsActiveActionBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>New value to set. If set to <code>true</code>, the Discount will be applied to Product Prices.</p>
     * @return isActive
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * builds ProductDiscountChangeIsActiveAction with checking for non-null required values
     * @return ProductDiscountChangeIsActiveAction
     */
    public ProductDiscountChangeIsActiveAction build() {
        Objects.requireNonNull(isActive, ProductDiscountChangeIsActiveAction.class + ": isActive is missing");
        return new ProductDiscountChangeIsActiveActionImpl(isActive);
    }

    /**
     * builds ProductDiscountChangeIsActiveAction without checking for non-null required values
     * @return ProductDiscountChangeIsActiveAction
     */
    public ProductDiscountChangeIsActiveAction buildUnchecked() {
        return new ProductDiscountChangeIsActiveActionImpl(isActive);
    }

    /**
     * factory method for an instance of ProductDiscountChangeIsActiveActionBuilder
     * @return builder
     */
    public static ProductDiscountChangeIsActiveActionBuilder of() {
        return new ProductDiscountChangeIsActiveActionBuilder();
    }

    /**
     * create builder for ProductDiscountChangeIsActiveAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountChangeIsActiveActionBuilder of(final ProductDiscountChangeIsActiveAction template) {
        ProductDiscountChangeIsActiveActionBuilder builder = new ProductDiscountChangeIsActiveActionBuilder();
        builder.isActive = template.getIsActive();
        return builder;
    }

}
