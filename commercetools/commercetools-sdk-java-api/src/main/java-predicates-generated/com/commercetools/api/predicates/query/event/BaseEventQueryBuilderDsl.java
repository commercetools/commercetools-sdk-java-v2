
package com.commercetools.api.predicates.query.event;

import com.commercetools.api.predicates.query.*;

public class BaseEventQueryBuilderDsl {
    public BaseEventQueryBuilderDsl() {
    }

    public static BaseEventQueryBuilderDsl of() {
        return new BaseEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BaseEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BaseEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BaseEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, BaseEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BaseEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, BaseEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BaseEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BaseEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BaseEventQueryBuilderDsl> data() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("data")),
            p -> new CombinationQueryPredicate<>(p, BaseEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BaseEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, BaseEventQueryBuilderDsl::of));
    }

}
