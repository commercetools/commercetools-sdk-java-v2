
package com.commercetools.api.predicates.query.product_search;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSearchHitQueryBuilderDsl {
    public ProductSearchHitQueryBuilderDsl() {
    }

    public static ProductSearchHitQueryBuilderDsl of() {
        return new ProductSearchHitQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSearchHitQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchHitQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSearchHitQueryBuilderDsl> productProjection(
            Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productProjection"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of())),
            ProductSearchHitQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSearchHitQueryBuilderDsl> matchingVariants(
            Function<com.commercetools.api.predicates.query.product_search.ProductSearchMatchingVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_search.ProductSearchMatchingVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("matchingVariants"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_search.ProductSearchMatchingVariantQueryBuilderDsl
                            .of())),
            ProductSearchHitQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSearchHitQueryBuilderDsl> matchingVariants() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("matchingVariants")),
            p -> new CombinationQueryPredicate<>(p, ProductSearchHitQueryBuilderDsl::of));
    }

}
