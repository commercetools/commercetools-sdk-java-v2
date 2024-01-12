
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchOrExpressionQueryBuilderDsl {
    public ProductSearchOrExpressionQueryBuilderDsl() {
    }

    public static ProductSearchOrExpressionQueryBuilderDsl of() {
        return new ProductSearchOrExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchOrExpressionQueryBuilderDsl> or(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("or"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl.of())),
            ProductSearchOrExpressionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchOrExpressionQueryBuilderDsl> or() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("or")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchOrExpressionQueryBuilderDsl::of));
    }

}
