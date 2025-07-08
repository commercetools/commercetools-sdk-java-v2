
package com.commercetools.api.predicates.query.recurring_order;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderResourceIdentifierQueryBuilderDsl {
    public RecurringOrderResourceIdentifierQueryBuilderDsl() {
    }

    public static RecurringOrderResourceIdentifierQueryBuilderDsl of() {
        return new RecurringOrderResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderResourceIdentifierQueryBuilderDsl::of));
    }

}
