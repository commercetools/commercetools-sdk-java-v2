
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductCatalogDataQueryBuilderDsl {
    public ProductCatalogDataQueryBuilderDsl() {
    }

    public static ProductCatalogDataQueryBuilderDsl of() {
        return new ProductCatalogDataQueryBuilderDsl();
    }

    public BooleanComparisonPredicateBuilder<ProductCatalogDataQueryBuilderDsl> published() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("published")),
            p -> new CombinationQueryPredicate<>(p, ProductCatalogDataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductCatalogDataQueryBuilderDsl> current(
            Function<com.commercetools.api.predicates.query.product.ProductDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("current"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductDataQueryBuilderDsl.of())),
            ProductCatalogDataQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductCatalogDataQueryBuilderDsl> staged(
            Function<com.commercetools.api.predicates.query.product.ProductDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("staged"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductDataQueryBuilderDsl.of())),
            ProductCatalogDataQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductCatalogDataQueryBuilderDsl> hasStagedChanges() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("hasStagedChanges")),
            p -> new CombinationQueryPredicate<>(p, ProductCatalogDataQueryBuilderDsl::of));
    }

}
