
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountChangeValueActionQueryBuilderDsl {
    public ProductDiscountChangeValueActionQueryBuilderDsl() {
    }

    public static ProductDiscountChangeValueActionQueryBuilderDsl of() {
        return new ProductDiscountChangeValueActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountChangeValueActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountChangeValueActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountChangeValueActionQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountValueDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("value"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_discount.ProductDiscountValueDraftQueryBuilderDsl
                            .of())),
            ProductDiscountChangeValueActionQueryBuilderDsl::of);
    }

}
