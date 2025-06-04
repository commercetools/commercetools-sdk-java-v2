
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CheckoutPaymentChargedEventQueryBuilderDsl {
    public CheckoutPaymentChargedEventQueryBuilderDsl() {
    }

    public static CheckoutPaymentChargedEventQueryBuilderDsl of() {
        return new CheckoutPaymentChargedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentChargedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentChargedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentChargedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentChargedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CheckoutPaymentChargedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentChargedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutPaymentChargedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl
                            .of())),
            CheckoutPaymentChargedEventQueryBuilderDsl::of);
    }

}
