
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategoryUpdateActionQueryBuilderDsl {
    public CategoryUpdateActionQueryBuilderDsl() {
    }

    public static CategoryUpdateActionQueryBuilderDsl of() {
        return new CategoryUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryUpdateActionQueryBuilderDsl::of));
    }
}
