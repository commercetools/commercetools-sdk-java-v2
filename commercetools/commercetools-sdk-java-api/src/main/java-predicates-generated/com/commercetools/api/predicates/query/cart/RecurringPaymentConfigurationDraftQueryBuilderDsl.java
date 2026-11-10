
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringPaymentConfigurationDraftQueryBuilderDsl {
    public RecurringPaymentConfigurationDraftQueryBuilderDsl() {
    }

    public static RecurringPaymentConfigurationDraftQueryBuilderDsl of() {
        return new RecurringPaymentConfigurationDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringPaymentConfigurationDraftQueryBuilderDsl> paymentStrategy() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentStrategy")),
            p -> new CombinationQueryPredicate<>(p, RecurringPaymentConfigurationDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringPaymentConfigurationDraftQueryBuilderDsl> paymentAllocations(
            Function<com.commercetools.api.predicates.query.cart.PaymentAllocationDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.PaymentAllocationDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("paymentAllocations"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.PaymentAllocationDraftQueryBuilderDsl.of())),
            RecurringPaymentConfigurationDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<RecurringPaymentConfigurationDraftQueryBuilderDsl> paymentAllocations() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentAllocations")),
            p -> new CombinationQueryPredicate<>(p, RecurringPaymentConfigurationDraftQueryBuilderDsl::of));
    }

}
