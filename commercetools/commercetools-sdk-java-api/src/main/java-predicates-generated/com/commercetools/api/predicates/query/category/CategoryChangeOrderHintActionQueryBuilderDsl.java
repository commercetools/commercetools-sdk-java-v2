
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategoryChangeOrderHintActionQueryBuilderDsl {
    public CategoryChangeOrderHintActionQueryBuilderDsl() {
    }

    public static CategoryChangeOrderHintActionQueryBuilderDsl of() {
        return new CategoryChangeOrderHintActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategoryChangeOrderHintActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategoryChangeOrderHintActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategoryChangeOrderHintActionQueryBuilderDsl> orderHint() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderHint")),
            p -> new CombinationQueryPredicate<>(p, CategoryChangeOrderHintActionQueryBuilderDsl::of));
    }

}
