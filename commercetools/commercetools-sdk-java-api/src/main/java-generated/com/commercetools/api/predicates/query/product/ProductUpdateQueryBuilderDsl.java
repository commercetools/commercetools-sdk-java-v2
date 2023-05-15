
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductUpdateQueryBuilderDsl {
    public ProductUpdateQueryBuilderDsl() {
    }

    public static ProductUpdateQueryBuilderDsl of() {
        return new ProductUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.product.ProductUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("actions"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.ProductUpdateActionQueryBuilderDsl.of())),
            ProductUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, ProductUpdateQueryBuilderDsl::of));
    }
}
