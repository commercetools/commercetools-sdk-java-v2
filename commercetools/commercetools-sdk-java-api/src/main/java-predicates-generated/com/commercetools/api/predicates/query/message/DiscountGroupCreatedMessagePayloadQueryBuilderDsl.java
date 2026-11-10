
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupCreatedMessagePayloadQueryBuilderDsl {
    public DiscountGroupCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static DiscountGroupCreatedMessagePayloadQueryBuilderDsl of() {
        return new DiscountGroupCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountGroupCreatedMessagePayloadQueryBuilderDsl> discountGroup(
            Function<com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountGroup"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.discount_group.DiscountGroupQueryBuilderDsl.of())),
            DiscountGroupCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
