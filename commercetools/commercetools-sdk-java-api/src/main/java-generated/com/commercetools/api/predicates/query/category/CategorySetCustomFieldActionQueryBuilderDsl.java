
package com.commercetools.api.predicates.query.category;

import com.commercetools.api.predicates.query.*;

public class CategorySetCustomFieldActionQueryBuilderDsl {
    public CategorySetCustomFieldActionQueryBuilderDsl() {
    }

    public static CategorySetCustomFieldActionQueryBuilderDsl of() {
        return new CategorySetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CategorySetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CategorySetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, CategorySetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CategorySetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, CategorySetCustomFieldActionQueryBuilderDsl::of));
    }
}
