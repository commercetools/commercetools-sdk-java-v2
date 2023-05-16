
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountChangeNameActionQueryBuilderDsl {
    public ProductDiscountChangeNameActionQueryBuilderDsl() {
    }

    public static ProductDiscountChangeNameActionQueryBuilderDsl of() {
        return new ProductDiscountChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountChangeNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountChangeNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDiscountChangeNameActionQueryBuilderDsl::of);
    }

}
