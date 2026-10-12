
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringPaymentConfigurationQueryBuilderDsl {
    public RecurringPaymentConfigurationQueryBuilderDsl() {
    }

    public static RecurringPaymentConfigurationQueryBuilderDsl of() {
        return new RecurringPaymentConfigurationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringPaymentConfigurationQueryBuilderDsl> paymentStrategy() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentStrategy")),
            p -> new CombinationQueryPredicate<>(p, RecurringPaymentConfigurationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringPaymentConfigurationQueryBuilderDsl> paymentAllocations(
            Function<com.commercetools.api.predicates.query.cart.RecurringPaymentAllocationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.RecurringPaymentAllocationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("paymentAllocations"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.RecurringPaymentAllocationQueryBuilderDsl.of())),
            RecurringPaymentConfigurationQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<RecurringPaymentConfigurationQueryBuilderDsl> paymentAllocations() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentAllocations")),
            p -> new CombinationQueryPredicate<>(p, RecurringPaymentConfigurationQueryBuilderDsl::of));
    }

}
