
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl {
    public GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl() {
    }

    public static GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl of() {
        return new GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")), p -> new CombinationQueryPredicate<>(p,
                GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl> existingVariantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("existingVariantSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl
                            .of())),
            GraphQLProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl::of);
    }

}
