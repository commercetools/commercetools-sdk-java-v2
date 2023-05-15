
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderLineItemAddedMessageQueryBuilderDsl {
    public OrderLineItemAddedMessageQueryBuilderDsl() {
    }

    public static OrderLineItemAddedMessageQueryBuilderDsl of() {
        return new OrderLineItemAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderLineItemAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderLineItemAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderLineItemAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderLineItemAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderLineItemAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderLineItemAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderLineItemAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderLineItemAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderLineItemAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderLineItemAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderLineItemAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemAddedMessageQueryBuilderDsl> lineItem(
            Function<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItem"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.LineItemQueryBuilderDsl.of())),
            OrderLineItemAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderLineItemAddedMessageQueryBuilderDsl> addedQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedQuantity")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemAddedMessageQueryBuilderDsl::of));
    }
}
