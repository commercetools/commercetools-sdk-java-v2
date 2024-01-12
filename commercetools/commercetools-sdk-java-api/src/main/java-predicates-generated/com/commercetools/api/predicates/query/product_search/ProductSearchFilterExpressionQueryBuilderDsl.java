
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFilterExpressionQueryBuilderDsl {
    public ProductSearchFilterExpressionQueryBuilderDsl() {
    }

    public static ProductSearchFilterExpressionQueryBuilderDsl of() {
        return new ProductSearchFilterExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchFilterExpressionQueryBuilderDsl> filter(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchQueryExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchQueryExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("filter"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchQueryExpressionQueryBuilderDsl
                            .of())),
            ProductSearchFilterExpressionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchFilterExpressionQueryBuilderDsl> filter() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("filter")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFilterExpressionQueryBuilderDsl::of));
    }

}
