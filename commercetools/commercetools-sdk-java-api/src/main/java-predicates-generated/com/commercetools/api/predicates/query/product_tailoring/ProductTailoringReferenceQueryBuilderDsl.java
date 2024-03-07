
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringReferenceQueryBuilderDsl {
    public ProductTailoringReferenceQueryBuilderDsl() {
    }

    public static ProductTailoringReferenceQueryBuilderDsl of() {
        return new ProductTailoringReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_tailoring.ProductTailoringQueryBuilderDsl.of())),
            ProductTailoringReferenceQueryBuilderDsl::of);
    }

}
