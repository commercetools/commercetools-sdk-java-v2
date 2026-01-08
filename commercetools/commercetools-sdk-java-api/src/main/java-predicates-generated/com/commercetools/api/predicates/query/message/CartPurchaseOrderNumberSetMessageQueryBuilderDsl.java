
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartPurchaseOrderNumberSetMessageQueryBuilderDsl {
    public CartPurchaseOrderNumberSetMessageQueryBuilderDsl() {
    }

    public static CartPurchaseOrderNumberSetMessageQueryBuilderDsl of() {
        return new CartPurchaseOrderNumberSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartPurchaseOrderNumberSetMessageQueryBuilderDsl> oldPurchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldPurchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, CartPurchaseOrderNumberSetMessageQueryBuilderDsl::of));
    }

}
