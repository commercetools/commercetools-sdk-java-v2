
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AssignedProductSelectionQueryBuilderDsl {
    public AssignedProductSelectionQueryBuilderDsl() {
    }

    public static AssignedProductSelectionQueryBuilderDsl of() {
        return new AssignedProductSelectionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AssignedProductSelectionQueryBuilderDsl> productSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl
                            .of())),
            AssignedProductSelectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AssignedProductSelectionQueryBuilderDsl> variantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variantSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl
                            .of())),
            AssignedProductSelectionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AssignedProductSelectionQueryBuilderDsl> variantExclusion(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variantExclusion"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl
                            .of())),
            AssignedProductSelectionQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<AssignedProductSelectionQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, AssignedProductSelectionQueryBuilderDsl::of));
    }
}
