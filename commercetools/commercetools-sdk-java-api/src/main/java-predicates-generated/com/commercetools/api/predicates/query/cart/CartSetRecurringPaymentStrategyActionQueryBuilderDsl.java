
package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

public class CartSetRecurringPaymentStrategyActionQueryBuilderDsl {
    public CartSetRecurringPaymentStrategyActionQueryBuilderDsl() {
    }

    public static CartSetRecurringPaymentStrategyActionQueryBuilderDsl of() {
        return new CartSetRecurringPaymentStrategyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetRecurringPaymentStrategyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetRecurringPaymentStrategyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartSetRecurringPaymentStrategyActionQueryBuilderDsl> paymentStrategy() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentStrategy")),
            p -> new CombinationQueryPredicate<>(p, CartSetRecurringPaymentStrategyActionQueryBuilderDsl::of));
    }

}
