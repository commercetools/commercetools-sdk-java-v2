
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class DuplicateFieldErrorQueryBuilderDsl {
    public DuplicateFieldErrorQueryBuilderDsl() {
    }

    public static DuplicateFieldErrorQueryBuilderDsl of() {
        return new DuplicateFieldErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DuplicateFieldErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, DuplicateFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DuplicateFieldErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, DuplicateFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DuplicateFieldErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, DuplicateFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DuplicateFieldErrorQueryBuilderDsl> duplicateValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("duplicateValue")),
            p -> new CombinationQueryPredicate<>(p, DuplicateFieldErrorQueryBuilderDsl::of));
    }
}
