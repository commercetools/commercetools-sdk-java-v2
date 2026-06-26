
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantBulkUpdateItemQueryBuilderDsl {
    public VariantBulkUpdateItemQueryBuilderDsl() {
    }

    public static VariantBulkUpdateItemQueryBuilderDsl of() {
        return new VariantBulkUpdateItemQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateItemQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateItemQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateItemQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateItemQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantBulkUpdateItemQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateItemQueryBuilderDsl::of));
    }

}
