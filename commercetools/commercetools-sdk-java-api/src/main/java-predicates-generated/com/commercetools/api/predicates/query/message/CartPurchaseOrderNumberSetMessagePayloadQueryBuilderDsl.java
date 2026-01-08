
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl {
    public CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl() {
    }

    public static CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl of() {
        return new CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl> oldPurchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldPurchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessagePayloadQueryBuilderDsl::of));
    }

}
