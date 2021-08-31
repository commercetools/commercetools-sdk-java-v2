
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountChangePredicateActionBuilder
        implements Builder<ProductDiscountChangePredicateAction> {

    private String predicate;

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
