
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListMessageQueryBuilderDsl {
    public ShoppingListMessageQueryBuilderDsl() {
    }

    public static ShoppingListMessageQueryBuilderDsl of() {
        return new ShoppingListMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ShoppingListMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ShoppingListMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ShoppingListMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ShoppingListMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ShoppingListMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ShoppingListMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ShoppingListMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ShoppingListMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListMessageQueryBuilderDsl> asShoppingListLineItemAdded(
            Function<com.commercetools.api.predicates.query.message.ShoppingListLineItemAddedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ShoppingListLineItemAddedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ShoppingListLineItemAddedMessageQueryBuilderDsl.of()),
            ShoppingListMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListMessageQueryBuilderDsl> asShoppingListLineItemRemoved(
            Function<com.commercetools.api.predicates.query.message.ShoppingListLineItemRemovedMessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.ShoppingListLineItemRemovedMessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.message.ShoppingListLineItemRemovedMessageQueryBuilderDsl.of()),
            ShoppingListMessageQueryBuilderDsl::of);
    }
}
