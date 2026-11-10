
package com.commercetools.api.predicates.query.event;

import com.commercetools.api.predicates.query.*;

public class ImportValidationFailedEventDataQueryBuilderDsl {
    public ImportValidationFailedEventDataQueryBuilderDsl() {
    }

    public static ImportValidationFailedEventDataQueryBuilderDsl of() {
        return new ImportValidationFailedEventDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ImportValidationFailedEventDataQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ImportValidationFailedEventDataQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ImportValidationFailedEventDataQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ImportValidationFailedEventDataQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ImportValidationFailedEventDataQueryBuilderDsl> importContainerKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("importContainerKey")),
            p -> new CombinationQueryPredicate<>(p, ImportValidationFailedEventDataQueryBuilderDsl::of));
    }

}
