
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeKeySetMessagePayloadQueryBuilderDsl {
    public DiscountCodeKeySetMessagePayloadQueryBuilderDsl() {
    }

    public static DiscountCodeKeySetMessagePayloadQueryBuilderDsl of() {
        return new DiscountCodeKeySetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeKeySetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeKeySetMessagePayloadQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountCodeKeySetMessagePayloadQueryBuilderDsl> oldKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldKey")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeKeySetMessagePayloadQueryBuilderDsl::of));
    }

}
