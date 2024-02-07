
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeDeletedMessagePayloadQueryBuilderDsl {
    public DiscountCodeDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static DiscountCodeDeletedMessagePayloadQueryBuilderDsl of() {
        return new DiscountCodeDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
