
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CartUnfrozenMessagePayloadQueryBuilderDsl {
    public CartUnfrozenMessagePayloadQueryBuilderDsl() {
    }

    public static CartUnfrozenMessagePayloadQueryBuilderDsl of() {
        return new CartUnfrozenMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartUnfrozenMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartUnfrozenMessagePayloadQueryBuilderDsl::of));
    }

}
