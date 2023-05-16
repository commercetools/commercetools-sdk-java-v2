
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CategoryCreatedMessagePayloadQueryBuilderDsl {
    public CategoryCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static CategoryCreatedMessagePayloadQueryBuilderDsl of() {
        return new CategoryCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CategoryCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CategoryCreatedMessagePayloadQueryBuilderDsl> category(
            Function<com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("category"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.category.CategoryQueryBuilderDsl.of())),
            CategoryCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
