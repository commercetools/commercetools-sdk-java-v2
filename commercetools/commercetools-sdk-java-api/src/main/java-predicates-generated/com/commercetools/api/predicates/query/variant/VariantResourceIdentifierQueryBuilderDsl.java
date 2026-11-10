
package com.commercetools.api.predicates.query.variant;

import com.commercetools.api.predicates.query.*;

public class VariantResourceIdentifierQueryBuilderDsl {
    public VariantResourceIdentifierQueryBuilderDsl() {
    }

    public static VariantResourceIdentifierQueryBuilderDsl of() {
        return new VariantResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, VariantResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantResourceIdentifierQueryBuilderDsl::of));
    }

}
