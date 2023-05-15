
package com.commercetools.api.predicates.query.product_type;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTypeUpdateQueryBuilderDsl {
    public ProductTypeUpdateQueryBuilderDsl() {
    }

    public static ProductTypeUpdateQueryBuilderDsl of() {
        return new ProductTypeUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductTypeUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTypeUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_type.ProductTypeUpdateActionQueryBuilderDsl.of())),
            ProductTypeUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTypeUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, ProductTypeUpdateQueryBuilderDsl::of));
    }
}
