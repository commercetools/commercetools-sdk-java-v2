
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupKeySetMessagePayloadQueryBuilderDsl {
    public DiscountGroupKeySetMessagePayloadQueryBuilderDsl() {
    }

    public static DiscountGroupKeySetMessagePayloadQueryBuilderDsl of() {
        return new DiscountGroupKeySetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupKeySetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupKeySetMessagePayloadQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<DiscountGroupKeySetMessagePayloadQueryBuilderDsl> oldKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldKey")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupKeySetMessagePayloadQueryBuilderDsl::of));
    }

}
