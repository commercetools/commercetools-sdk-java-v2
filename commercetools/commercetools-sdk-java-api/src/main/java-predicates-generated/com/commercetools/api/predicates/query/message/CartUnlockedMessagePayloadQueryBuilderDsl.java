
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CartUnlockedMessagePayloadQueryBuilderDsl {
    public CartUnlockedMessagePayloadQueryBuilderDsl() {
    }

    public static CartUnlockedMessagePayloadQueryBuilderDsl of() {
        return new CartUnlockedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartUnlockedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartUnlockedMessagePayloadQueryBuilderDsl::of));
    }

}
