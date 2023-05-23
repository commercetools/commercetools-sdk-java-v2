
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategorySetKeyActionQueryBuilderDsl {
    public CategorySetKeyActionQueryBuilderDsl() {
    }

    public static CategorySetKeyActionQueryBuilderDsl of() {
        return new CategorySetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategorySetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CategorySetKeyActionQueryBuilderDsl::of));
    }

}
