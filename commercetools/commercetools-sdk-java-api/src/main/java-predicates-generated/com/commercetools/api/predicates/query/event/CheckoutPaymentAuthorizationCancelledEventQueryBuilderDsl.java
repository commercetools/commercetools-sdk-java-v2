
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl {
    public CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl() {
    }

    public static CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl of() {
        return new CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl
                            .of())),
            CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl::of);
    }

}
