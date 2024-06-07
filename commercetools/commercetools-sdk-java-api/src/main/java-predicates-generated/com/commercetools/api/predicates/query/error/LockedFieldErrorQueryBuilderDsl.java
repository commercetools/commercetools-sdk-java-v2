
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class LockedFieldErrorQueryBuilderDsl {
    public LockedFieldErrorQueryBuilderDsl() {
    }

    public static LockedFieldErrorQueryBuilderDsl of() {
        return new LockedFieldErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<LockedFieldErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, LockedFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LockedFieldErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, LockedFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<LockedFieldErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, LockedFieldErrorQueryBuilderDsl::of));
    }

}
