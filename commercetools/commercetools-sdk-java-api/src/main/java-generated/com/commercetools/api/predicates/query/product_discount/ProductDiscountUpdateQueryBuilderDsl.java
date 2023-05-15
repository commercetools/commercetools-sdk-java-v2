
package com.commercetools.api.predicates.query.product_discount;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDiscountUpdateQueryBuilderDsl {
    public ProductDiscountUpdateQueryBuilderDsl() {
    }

    public static ProductDiscountUpdateQueryBuilderDsl of() {
        return new ProductDiscountUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductDiscountUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDiscountUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.product_discount.ProductDiscountUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_discount.ProductDiscountUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_discount.ProductDiscountUpdateActionQueryBuilderDsl
                            .of())),
            ProductDiscountUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductDiscountUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, ProductDiscountUpdateQueryBuilderDsl::of));
    }
}
