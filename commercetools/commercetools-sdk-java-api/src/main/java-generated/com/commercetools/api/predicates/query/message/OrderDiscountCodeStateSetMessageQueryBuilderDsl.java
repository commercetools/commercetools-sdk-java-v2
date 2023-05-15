
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderDiscountCodeStateSetMessageQueryBuilderDsl {
    public OrderDiscountCodeStateSetMessageQueryBuilderDsl() {
    }

    public static OrderDiscountCodeStateSetMessageQueryBuilderDsl of() {
        return new OrderDiscountCodeStateSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderDiscountCodeStateSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderDiscountCodeStateSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderDiscountCodeStateSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderDiscountCodeStateSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderDiscountCodeStateSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderDiscountCodeStateSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderDiscountCodeStateSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderDiscountCodeStateSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderDiscountCodeStateSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderDiscountCodeStateSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderDiscountCodeStateSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderDiscountCodeStateSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderDiscountCodeStateSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderDiscountCodeStateSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderDiscountCodeStateSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderDiscountCodeStateSetMessageQueryBuilderDsl> discountCode(
            Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("discountCode"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl.of())),
            OrderDiscountCodeStateSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderDiscountCodeStateSetMessageQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderDiscountCodeStateSetMessageQueryBuilderDsl> oldState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldState")),
            p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessageQueryBuilderDsl::of));
    }
}
