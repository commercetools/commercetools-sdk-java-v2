
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountChangePredicateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountChangePredicateAction productDiscountChangePredicateAction = ProductDiscountChangePredicateAction.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountChangePredicateActionBuilder implements Builder<ProductDiscountChangePredicateAction> {

    private String predicate;

    /**
     *  <p>New value to set. Must be a valid ProductDiscount predicate.</p>
     * @param predicate
     * @return Builder
     */

    public ProductDiscountChangePredicateActionBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public ProductDiscountChangePredicateAction build() {
        Objects.requireNonNull(predicate, ProductDiscountChangePredicateAction.class + ": predicate is missing");
        return new ProductDiscountChangePredicateActionImpl(predicate);
    }

    /**
     * builds ProductDiscountChangePredicateAction without checking for non null required values
     */
    public ProductDiscountChangePredicateAction buildUnchecked() {
        return new ProductDiscountChangePredicateActionImpl(predicate);
    }

    public static ProductDiscountChangePredicateActionBuilder of() {
        return new ProductDiscountChangePredicateActionBuilder();
    }

    public static ProductDiscountChangePredicateActionBuilder of(final ProductDiscountChangePredicateAction template) {
        ProductDiscountChangePredicateActionBuilder builder = new ProductDiscountChangePredicateActionBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
