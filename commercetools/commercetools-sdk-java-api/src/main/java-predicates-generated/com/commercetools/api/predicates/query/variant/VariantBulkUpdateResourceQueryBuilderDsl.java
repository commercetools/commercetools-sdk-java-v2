
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantBulkUpdateResourceQueryBuilderDsl {
    public VariantBulkUpdateResourceQueryBuilderDsl() {
    }

    public static VariantBulkUpdateResourceQueryBuilderDsl of() {
        return new VariantBulkUpdateResourceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateResourceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateResourceQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantBulkUpdateResourceQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateResourceQueryBuilderDsl::of));
    }

}
