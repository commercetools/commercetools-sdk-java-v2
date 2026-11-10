
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CartFrozenMessagePayloadQueryBuilderDsl {
    public CartFrozenMessagePayloadQueryBuilderDsl() {
    }

    public static CartFrozenMessagePayloadQueryBuilderDsl of() {
        return new CartFrozenMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartFrozenMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartFrozenMessagePayloadQueryBuilderDsl::of));
    }

}
