
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CartLockedMessagePayloadQueryBuilderDsl {
    public CartLockedMessagePayloadQueryBuilderDsl() {
    }

    public static CartLockedMessagePayloadQueryBuilderDsl of() {
        return new CartLockedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartLockedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartLockedMessagePayloadQueryBuilderDsl::of));
    }

}
