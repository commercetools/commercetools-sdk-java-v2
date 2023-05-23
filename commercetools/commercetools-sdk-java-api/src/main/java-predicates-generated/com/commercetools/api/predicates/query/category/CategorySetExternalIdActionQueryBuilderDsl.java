
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategorySetExternalIdActionQueryBuilderDsl {
    public CategorySetExternalIdActionQueryBuilderDsl() {
    }

    public static CategorySetExternalIdActionQueryBuilderDsl of() {
        return new CategorySetExternalIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetExternalIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategorySetExternalIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetExternalIdActionQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, CategorySetExternalIdActionQueryBuilderDsl::of));
    }

}
