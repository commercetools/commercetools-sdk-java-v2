
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl {
    public RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl> previousTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTypeId")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCustomTypeRemovedMessagePayloadQueryBuilderDsl::of));
    }

}
