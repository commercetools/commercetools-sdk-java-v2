
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class VariantDeletedMessagePayloadQueryBuilderDsl {
    public VariantDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static VariantDeletedMessagePayloadQueryBuilderDsl of() {
        return new VariantDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
