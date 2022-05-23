
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
     <*  <p>New value to set. If set to <code>true</code>, the Discount will be applied to Product Prices.</p>>
     */

    public ProductDiscountChangeIsActiveActionBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public ProductDiscountChangeIsActiveAction build() {
        Objects.requireNonNull(isActive, ProductDiscountChangeIsActiveAction.class + ": isActive is missing");
        return new ProductDiscountChangeIsActiveActionImpl(isActive);
    }

    /**
     * builds ProductDiscountChangeIsActiveAction without checking for non null required values
     */
    public ProductDiscountChangeIsActiveAction buildUnchecked() {
        return new ProductDiscountChangeIsActiveActionImpl(isActive);
    }

    public static ProductDiscountChangeIsActiveActionBuilder of() {
        return new ProductDiscountChangeIsActiveActionBuilder();
    }

    public static ProductDiscountChangeIsActiveActionBuilder of(final ProductDiscountChangeIsActiveAction template) {
        ProductDiscountChangeIsActiveActionBuilder builder = new ProductDiscountChangeIsActiveActionBuilder();
        builder.isActive = template.getIsActive();
        return builder;
    }

}
