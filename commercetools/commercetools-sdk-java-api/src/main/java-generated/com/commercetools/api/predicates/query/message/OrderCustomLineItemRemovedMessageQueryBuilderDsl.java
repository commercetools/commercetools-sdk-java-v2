
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCustomLineItemRemovedMessageQueryBuilderDsl {
    public OrderCustomLineItemRemovedMessageQueryBuilderDsl() {
    }

    public static OrderCustomLineItemRemovedMessageQueryBuilderDsl of() {
        return new OrderCustomLineItemRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderCustomLineItemRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderCustomLineItemRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderCustomLineItemRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderCustomLineItemRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCustomLineItemRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderCustomLineItemRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderCustomLineItemRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderCustomLineItemRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderCustomLineItemRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderCustomLineItemRemovedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemRemovedMessageQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCustomLineItemRemovedMessageQueryBuilderDsl> customLineItem(
            Function<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customLineItem"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl.of())),
            OrderCustomLineItemRemovedMessageQueryBuilderDsl::of);
    }

}
