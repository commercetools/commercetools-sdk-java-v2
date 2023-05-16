
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderShippingRateInputSetMessageQueryBuilderDsl {
    public OrderShippingRateInputSetMessageQueryBuilderDsl() {
    }

    public static OrderShippingRateInputSetMessageQueryBuilderDsl of() {
        return new OrderShippingRateInputSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderShippingRateInputSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderShippingRateInputSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderShippingRateInputSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderShippingRateInputSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderShippingRateInputSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderShippingRateInputSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderShippingRateInputSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderShippingRateInputSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderShippingRateInputSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderShippingRateInputSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderShippingRateInputSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderShippingRateInputSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderShippingRateInputSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderShippingRateInputSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderShippingRateInputSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderShippingRateInputSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderShippingRateInputSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderShippingRateInputSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderShippingRateInputSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderShippingRateInputSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderShippingRateInputSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderShippingRateInputSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderShippingRateInputSetMessageQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            OrderShippingRateInputSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderShippingRateInputSetMessageQueryBuilderDsl> oldShippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldShippingRateInput"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            OrderShippingRateInputSetMessageQueryBuilderDsl::of);
    }

}
