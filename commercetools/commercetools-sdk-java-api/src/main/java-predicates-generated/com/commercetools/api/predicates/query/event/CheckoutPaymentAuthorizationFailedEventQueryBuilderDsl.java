
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl {
    public CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl() {
    }

    public static CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl of() {
        return new CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl
                            .of())),
            CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl::of);
    }

}
