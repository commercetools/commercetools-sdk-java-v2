
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ImportUnresolvedEventQueryBuilderDsl {
    public ImportUnresolvedEventQueryBuilderDsl() {
    }

    public static ImportUnresolvedEventQueryBuilderDsl of() {
        return new ImportUnresolvedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportUnresolvedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportUnresolvedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportUnresolvedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, ImportUnresolvedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportUnresolvedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, ImportUnresolvedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportUnresolvedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ImportUnresolvedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ImportUnresolvedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ImportUnresolvedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ImportUnresolvedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.ImportUnresolvedEventDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportUnresolvedEventDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("data"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.event.ImportUnresolvedEventDataQueryBuilderDsl.of())),
            ImportUnresolvedEventQueryBuilderDsl::of);
    }

}
