
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchNotExpressionQueryBuilderDsl {
    public ProductSearchNotExpressionQueryBuilderDsl() {
    }

    public static ProductSearchNotExpressionQueryBuilderDsl of() {
        return new ProductSearchNotExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchNotExpressionQueryBuilderDsl> not(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("not"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl.of())),
            ProductSearchNotExpressionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchNotExpressionQueryBuilderDsl> not() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("not")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchNotExpressionQueryBuilderDsl::of));
    }

}
