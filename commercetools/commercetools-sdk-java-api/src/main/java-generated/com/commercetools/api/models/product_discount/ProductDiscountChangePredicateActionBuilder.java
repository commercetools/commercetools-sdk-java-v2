
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountChangePredicateActionBuilder {

    private String predicate;

    public ProductDiscountChangePredicateActionBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public ProductDiscountChangePredicateAction build() {
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
