
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ImportContainerDeletedEventQueryBuilderDsl {
    public ImportContainerDeletedEventQueryBuilderDsl() {
    }

    public static ImportContainerDeletedEventQueryBuilderDsl of() {
        return new ImportContainerDeletedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportContainerDeletedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerDeletedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportContainerDeletedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerDeletedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportContainerDeletedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerDeletedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportContainerDeletedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerDeletedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ImportContainerDeletedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerDeletedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ImportContainerDeletedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.ImportContainerDeletedEventDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportContainerDeletedEventDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.ImportContainerDeletedEventDataQueryBuilderDsl.of())),
            ImportContainerDeletedEventQueryBuilderDsl::of);
    }

}
