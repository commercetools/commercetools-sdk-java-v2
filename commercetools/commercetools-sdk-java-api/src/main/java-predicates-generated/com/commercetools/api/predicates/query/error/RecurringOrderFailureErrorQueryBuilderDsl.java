
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderFailureErrorQueryBuilderDsl {
    public RecurringOrderFailureErrorQueryBuilderDsl() {
    }

    public static RecurringOrderFailureErrorQueryBuilderDsl of() {
        return new RecurringOrderFailureErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailureErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailureErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailureErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailureErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderFailureErrorQueryBuilderDsl> details() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("details")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderFailureErrorQueryBuilderDsl::of));
    }

}
