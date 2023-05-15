
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class DuplicateEnumValuesErrorQueryBuilderDsl {
    public DuplicateEnumValuesErrorQueryBuilderDsl() {
    }

    public static DuplicateEnumValuesErrorQueryBuilderDsl of() {
        return new DuplicateEnumValuesErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DuplicateEnumValuesErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, DuplicateEnumValuesErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DuplicateEnumValuesErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, DuplicateEnumValuesErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<DuplicateEnumValuesErrorQueryBuilderDsl> duplicates() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("duplicates")),
            p -> new CombinationQueryPredicate<>(p, DuplicateEnumValuesErrorQueryBuilderDsl::of));
    }
}
