
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl {
    public DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl() {
    }

    public static DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl of() {
        return new DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl> isActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isActive")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl> oldIsActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldIsActive")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupIsActiveSetMessagePayloadQueryBuilderDsl::of));
    }

}
