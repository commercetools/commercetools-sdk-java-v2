
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetPurchaseOrderNumberActionQueryBuilderDsl {
    public CartSetPurchaseOrderNumberActionQueryBuilderDsl() {
    }

    public static CartSetPurchaseOrderNumberActionQueryBuilderDsl of() {
        return new CartSetPurchaseOrderNumberActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetPurchaseOrderNumberActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetPurchaseOrderNumberActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetPurchaseOrderNumberActionQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, CartSetPurchaseOrderNumberActionQueryBuilderDsl::of));
    }

}
