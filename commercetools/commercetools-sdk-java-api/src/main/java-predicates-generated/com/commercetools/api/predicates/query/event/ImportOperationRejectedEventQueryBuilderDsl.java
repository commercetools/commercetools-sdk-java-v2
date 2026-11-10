
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ImportOperationRejectedEventQueryBuilderDsl {
    public ImportOperationRejectedEventQueryBuilderDsl() {
    }

    public static ImportOperationRejectedEventQueryBuilderDsl of() {
        return new ImportOperationRejectedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportOperationRejectedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportOperationRejectedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportOperationRejectedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, ImportOperationRejectedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportOperationRejectedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, ImportOperationRejectedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportOperationRejectedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ImportOperationRejectedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ImportOperationRejectedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ImportOperationRejectedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ImportOperationRejectedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.ImportOperationRejectedEventDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportOperationRejectedEventDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.ImportOperationRejectedEventDataQueryBuilderDsl.of())),
            ImportOperationRejectedEventQueryBuilderDsl::of);
    }

}
