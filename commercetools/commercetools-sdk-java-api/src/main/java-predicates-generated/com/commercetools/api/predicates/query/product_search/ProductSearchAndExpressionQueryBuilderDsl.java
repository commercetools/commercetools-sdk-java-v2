
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchAndExpressionQueryBuilderDsl {
    public ProductSearchAndExpressionQueryBuilderDsl() {
    }

    public static ProductSearchAndExpressionQueryBuilderDsl of() {
        return new ProductSearchAndExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchAndExpressionQueryBuilderDsl> and(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("and"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_search.ProductSearchQueryQueryBuilderDsl.of())),
            ProductSearchAndExpressionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchAndExpressionQueryBuilderDsl> and() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("and")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchAndExpressionQueryBuilderDsl::of));
    }

}
