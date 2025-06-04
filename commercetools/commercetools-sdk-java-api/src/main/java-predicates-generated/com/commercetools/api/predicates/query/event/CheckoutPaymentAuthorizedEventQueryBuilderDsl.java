
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CheckoutPaymentAuthorizedEventQueryBuilderDsl {
    public CheckoutPaymentAuthorizedEventQueryBuilderDsl() {
    }

    public static CheckoutPaymentAuthorizedEventQueryBuilderDsl of() {
        return new CheckoutPaymentAuthorizedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutPaymentAuthorizedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CheckoutPaymentAuthorizedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CheckoutPaymentAuthorizedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutPaymentAuthorizedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl
                            .of())),
            CheckoutPaymentAuthorizedEventQueryBuilderDsl::of);
    }

}
