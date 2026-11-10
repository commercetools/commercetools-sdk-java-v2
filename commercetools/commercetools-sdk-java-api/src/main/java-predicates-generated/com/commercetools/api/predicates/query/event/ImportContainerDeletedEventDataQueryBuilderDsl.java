
package com.commercetools.api.predicates.query.event;

import com.commercetools.api.predicates.query.*;

public class ImportContainerDeletedEventDataQueryBuilderDsl {
    public ImportContainerDeletedEventDataQueryBuilderDsl() {
    }

    public static ImportContainerDeletedEventDataQueryBuilderDsl of() {
        return new ImportContainerDeletedEventDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportContainerDeletedEventDataQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerDeletedEventDataQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ImportContainerDeletedEventDataQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ImportContainerDeletedEventDataQueryBuilderDsl::of));
    }

}
