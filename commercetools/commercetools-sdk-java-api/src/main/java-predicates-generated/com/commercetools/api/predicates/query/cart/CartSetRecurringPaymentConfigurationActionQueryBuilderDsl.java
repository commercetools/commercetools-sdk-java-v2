
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartSetRecurringPaymentConfigurationActionQueryBuilderDsl {
    public CartSetRecurringPaymentConfigurationActionQueryBuilderDsl() {
    }

    public static CartSetRecurringPaymentConfigurationActionQueryBuilderDsl of() {
        return new CartSetRecurringPaymentConfigurationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetRecurringPaymentConfigurationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartSetRecurringPaymentConfigurationActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartSetRecurringPaymentConfigurationActionQueryBuilderDsl> recurringPaymentConfiguration(
            Function<com.commercetools.api.predicates.query.cart.RecurringPaymentConfigurationDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.RecurringPaymentConfigurationDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurringPaymentConfiguration"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.cart.RecurringPaymentConfigurationDraftQueryBuilderDsl
                            .of())),
            CartSetRecurringPaymentConfigurationActionQueryBuilderDsl::of);
    }

}
