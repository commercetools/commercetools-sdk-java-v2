
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CartDiscountDeletedMessagePayloadQueryBuilderDsl {
    public CartDiscountDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static CartDiscountDeletedMessagePayloadQueryBuilderDsl of() {
        return new CartDiscountDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartDiscountDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartDiscountDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
