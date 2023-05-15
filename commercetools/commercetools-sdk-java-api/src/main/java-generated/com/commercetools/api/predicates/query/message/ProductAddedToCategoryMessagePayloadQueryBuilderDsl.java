
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductAddedToCategoryMessagePayloadQueryBuilderDsl {
    public ProductAddedToCategoryMessagePayloadQueryBuilderDsl() {
    }

    public static ProductAddedToCategoryMessagePayloadQueryBuilderDsl of() {
        return new ProductAddedToCategoryMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductAddedToCategoryMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductAddedToCategoryMessagePayloadQueryBuilderDsl> category(
            Function<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("category"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl.of())),
            ProductAddedToCategoryMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductAddedToCategoryMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductAddedToCategoryMessagePayloadQueryBuilderDsl::of));
    }
}
