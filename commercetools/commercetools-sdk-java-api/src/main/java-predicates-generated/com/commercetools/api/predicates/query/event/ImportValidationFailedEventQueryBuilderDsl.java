
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ImportValidationFailedEventQueryBuilderDsl {
    public ImportValidationFailedEventQueryBuilderDsl() {
    }

    public static ImportValidationFailedEventQueryBuilderDsl of() {
        return new ImportValidationFailedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportValidationFailedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportValidationFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportValidationFailedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, ImportValidationFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportValidationFailedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, ImportValidationFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportValidationFailedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ImportValidationFailedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ImportValidationFailedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ImportValidationFailedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ImportValidationFailedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.ImportValidationFailedEventDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportValidationFailedEventDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.ImportValidationFailedEventDataQueryBuilderDsl.of())),
            ImportValidationFailedEventQueryBuilderDsl::of);
    }

}
