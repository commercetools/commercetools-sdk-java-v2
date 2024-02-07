
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeCreatedMessagePayloadQueryBuilderDsl {
    public DiscountCodeCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static DiscountCodeCreatedMessagePayloadQueryBuilderDsl of() {
        return new DiscountCodeCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<DiscountCodeCreatedMessagePayloadQueryBuilderDsl> discountCode(
            Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountCode"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.discount_code.DiscountCodeQueryBuilderDsl.of())),
            DiscountCodeCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
