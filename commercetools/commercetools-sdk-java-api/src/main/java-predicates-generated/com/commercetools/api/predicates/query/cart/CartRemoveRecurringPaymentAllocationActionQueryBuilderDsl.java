
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartRemoveRecurringPaymentAllocationActionQueryBuilderDsl {
    public CartRemoveRecurringPaymentAllocationActionQueryBuilderDsl() {
    }

    public static CartRemoveRecurringPaymentAllocationActionQueryBuilderDsl of() {
        return new CartRemoveRecurringPaymentAllocationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartRemoveRecurringPaymentAllocationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartRemoveRecurringPaymentAllocationActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartRemoveRecurringPaymentAllocationActionQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CartRemoveRecurringPaymentAllocationActionQueryBuilderDsl::of));
    }

}
