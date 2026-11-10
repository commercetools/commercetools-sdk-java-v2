
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchResultQueryBuilderDsl {
    public ProductSearchResultQueryBuilderDsl() {
    }

    public static ProductSearchResultQueryBuilderDsl of() {
        return new ProductSearchResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchResultQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchResultQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchResultQueryBuilderDsl> matchingVariants(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchMatchingVariantsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchMatchingVariantsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("matchingVariants"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchMatchingVariantsQueryBuilderDsl
                            .of())),
            ProductSearchResultQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchResultQueryBuilderDsl> productProjection(
            Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productProjection"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of())),
            ProductSearchResultQueryBuilderDsl::of);
    }

}
