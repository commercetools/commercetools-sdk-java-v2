
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class VariantKeySetMessagePayloadQueryBuilderDsl {
    public VariantKeySetMessagePayloadQueryBuilderDsl() {
    }

    public static VariantKeySetMessagePayloadQueryBuilderDsl of() {
        return new VariantKeySetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantKeySetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, VariantKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantKeySetMessagePayloadQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantKeySetMessagePayloadQueryBuilderDsl> oldKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldKey")),
            p -> new CombinationQueryPredicate<>(p, VariantKeySetMessagePayloadQueryBuilderDsl::of));
    }

}
