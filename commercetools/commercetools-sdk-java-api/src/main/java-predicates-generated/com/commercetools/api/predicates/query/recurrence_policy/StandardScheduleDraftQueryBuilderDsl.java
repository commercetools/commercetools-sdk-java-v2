
package com.commercetools.api.predicates.query.recurrence_policy;

import com.commercetools.api.predicates.query.*;

public class StandardScheduleDraftQueryBuilderDsl {
    public StandardScheduleDraftQueryBuilderDsl() {
    }

    public static StandardScheduleDraftQueryBuilderDsl of() {
        return new StandardScheduleDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandardScheduleDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandardScheduleDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandardScheduleDraftQueryBuilderDsl> value() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, StandardScheduleDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandardScheduleDraftQueryBuilderDsl> intervalUnit() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("intervalUnit")),
            p -> new CombinationQueryPredicate<>(p, StandardScheduleDraftQueryBuilderDsl::of));
    }

}
