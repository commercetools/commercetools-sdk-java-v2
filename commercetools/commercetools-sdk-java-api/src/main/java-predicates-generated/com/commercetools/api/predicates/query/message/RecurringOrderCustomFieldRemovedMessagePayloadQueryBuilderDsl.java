
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl {
    public RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomFieldRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
