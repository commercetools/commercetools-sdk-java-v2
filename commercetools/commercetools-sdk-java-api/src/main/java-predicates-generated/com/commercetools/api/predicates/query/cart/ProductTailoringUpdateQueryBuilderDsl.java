
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringUpdateQueryBuilderDsl {
    public ProductTailoringUpdateQueryBuilderDsl() {
    }

    public static ProductTailoringUpdateQueryBuilderDsl of() {
        return new ProductTailoringUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductTailoringUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_tailoring.ProductTailoringUpdateActionQueryBuilderDsl
                            .of())),
            ProductTailoringUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringUpdateQueryBuilderDsl::of));
    }

}
