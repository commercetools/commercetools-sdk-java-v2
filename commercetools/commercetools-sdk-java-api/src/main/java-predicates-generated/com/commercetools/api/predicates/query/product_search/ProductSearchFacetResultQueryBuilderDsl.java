
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchFacetResultQueryBuilderDsl {
    public ProductSearchFacetResultQueryBuilderDsl() {
    }

    public static ProductSearchFacetResultQueryBuilderDsl of() {
        return new ProductSearchFacetResultQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSearchFacetResultQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchFacetResultExpressionQueryBuilderDsl
                            .of())),
            ProductSearchFacetResultQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchFacetResultQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchFacetResultQueryBuilderDsl::of));
    }

}
