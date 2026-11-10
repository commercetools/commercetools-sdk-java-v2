
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartEstimatedDeliverySetMessageQueryBuilderDsl {
    public CartEstimatedDeliverySetMessageQueryBuilderDsl() {
    }

    public static CartEstimatedDeliverySetMessageQueryBuilderDsl of() {
        return new CartEstimatedDeliverySetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartEstimatedDeliverySetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CartEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartEstimatedDeliverySetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CartEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartEstimatedDeliverySetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CartEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartEstimatedDeliverySetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CartEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartEstimatedDeliverySetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CartEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartEstimatedDeliverySetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CartEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CartEstimatedDeliverySetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CartEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartEstimatedDeliverySetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CartEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CartEstimatedDeliverySetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CartEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartEstimatedDeliverySetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartEstimatedDeliverySetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CartEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartEstimatedDeliverySetMessageQueryBuilderDsl> estimatedDelivery(
            Function<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("estimatedDelivery"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.EstimatedDeliveryQueryBuilderDsl.of())),
            CartEstimatedDeliverySetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartEstimatedDeliverySetMessageQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, CartEstimatedDeliverySetMessageQueryBuilderDsl::of));
    }

}
