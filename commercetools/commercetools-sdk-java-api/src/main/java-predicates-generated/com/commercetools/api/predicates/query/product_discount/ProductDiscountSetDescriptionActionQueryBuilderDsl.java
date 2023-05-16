
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountSetDescriptionActionQueryBuilderDsl {
    public ProductDiscountSetDescriptionActionQueryBuilderDsl() {
    }

    public static ProductDiscountSetDescriptionActionQueryBuilderDsl of() {
        return new ProductDiscountSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDiscountSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountSetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountSetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ProductDiscountSetDescriptionActionQueryBuilderDsl::of);
    }

}
