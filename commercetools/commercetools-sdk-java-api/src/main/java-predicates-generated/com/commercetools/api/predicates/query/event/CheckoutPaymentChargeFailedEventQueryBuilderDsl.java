
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CheckoutPaymentChargeFailedEventQueryBuilderDsl {
    public CheckoutPaymentChargeFailedEventQueryBuilderDsl() {
    }

    public static CheckoutPaymentChargeFailedEventQueryBuilderDsl of() {
        return new CheckoutPaymentChargeFailedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentChargeFailedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargeFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentChargeFailedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargeFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentChargeFailedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargeFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentChargeFailedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargeFailedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CheckoutPaymentChargeFailedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargeFailedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutPaymentChargeFailedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl
                            .of())),
            CheckoutPaymentChargeFailedEventQueryBuilderDsl::of);
    }

}
