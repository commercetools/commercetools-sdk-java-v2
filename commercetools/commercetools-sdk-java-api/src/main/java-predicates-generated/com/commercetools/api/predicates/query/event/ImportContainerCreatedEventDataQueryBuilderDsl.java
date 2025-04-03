
package com.commercetools.api.predicates.query.event;

import com.commercetools.api.predicates.query.*;

public class ImportContainerCreatedEventDataQueryBuilderDsl {
    public ImportContainerCreatedEventDataQueryBuilderDsl() {
    }

    public static ImportContainerCreatedEventDataQueryBuilderDsl of() {
        return new ImportContainerCreatedEventDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportContainerCreatedEventDataQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerCreatedEventDataQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ImportContainerCreatedEventDataQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerCreatedEventDataQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ImportContainerCreatedEventDataQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerCreatedEventDataQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ImportContainerCreatedEventDataQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerCreatedEventDataQueryBuilderDsl::of));
    }

}
