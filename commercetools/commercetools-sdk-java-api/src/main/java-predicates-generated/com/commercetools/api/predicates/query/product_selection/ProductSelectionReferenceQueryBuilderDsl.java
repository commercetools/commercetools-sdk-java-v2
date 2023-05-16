
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionReferenceQueryBuilderDsl {
    public ProductSelectionReferenceQueryBuilderDsl() {
    }

    public static ProductSelectionReferenceQueryBuilderDsl of() {
        return new ProductSelectionReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSelectionReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl.of())),
            ProductSelectionReferenceQueryBuilderDsl::of);
    }

}
