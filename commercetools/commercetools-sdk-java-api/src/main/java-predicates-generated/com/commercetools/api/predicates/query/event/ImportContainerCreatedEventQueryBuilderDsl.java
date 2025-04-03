
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ImportContainerCreatedEventQueryBuilderDsl {
    public ImportContainerCreatedEventQueryBuilderDsl() {
    }

    public static ImportContainerCreatedEventQueryBuilderDsl of() {
        return new ImportContainerCreatedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportContainerCreatedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerCreatedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportContainerCreatedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerCreatedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportContainerCreatedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerCreatedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportContainerCreatedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerCreatedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ImportContainerCreatedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerCreatedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ImportContainerCreatedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.ImportContainerCreatedEventDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportContainerCreatedEventDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.ImportContainerCreatedEventDataQueryBuilderDsl.of())),
            ImportContainerCreatedEventQueryBuilderDsl::of);
    }

}
