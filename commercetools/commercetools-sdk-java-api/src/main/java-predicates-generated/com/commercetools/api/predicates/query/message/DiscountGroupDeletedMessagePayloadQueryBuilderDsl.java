
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class DiscountGroupDeletedMessagePayloadQueryBuilderDsl {
    public DiscountGroupDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static DiscountGroupDeletedMessagePayloadQueryBuilderDsl of() {
        return new DiscountGroupDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountGroupDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountGroupDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
