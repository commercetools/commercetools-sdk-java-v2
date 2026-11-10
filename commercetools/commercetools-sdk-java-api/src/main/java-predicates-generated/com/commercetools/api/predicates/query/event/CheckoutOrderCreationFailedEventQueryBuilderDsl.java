
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CheckoutOrderCreationFailedEventQueryBuilderDsl {
    public CheckoutOrderCreationFailedEventQueryBuilderDsl() {
    }

    public static CheckoutOrderCreationFailedEventQueryBuilderDsl of() {
        return new CheckoutOrderCreationFailedEventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CheckoutOrderCreationFailedEventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CheckoutOrderCreationFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutOrderCreationFailedEventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutOrderCreationFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutOrderCreationFailedEventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, CheckoutOrderCreationFailedEventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CheckoutOrderCreationFailedEventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CheckoutOrderCreationFailedEventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CheckoutOrderCreationFailedEventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CheckoutOrderCreationFailedEventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutOrderCreationFailedEventQueryBuilderDsl> data(
            Function<com.commercetools.api.predicates.query.event.CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("data"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.event.CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl
                            .of())),
            CheckoutOrderCreationFailedEventQueryBuilderDsl::of);
    }

}
