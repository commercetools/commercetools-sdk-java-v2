
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListLineItemRemovedMessageQueryBuilderDsl {
    public ShoppingListLineItemRemovedMessageQueryBuilderDsl() {
    }

    public static ShoppingListLineItemRemovedMessageQueryBuilderDsl of() {
        return new ShoppingListLineItemRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListLineItemRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListLineItemRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ShoppingListLineItemRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ShoppingListLineItemRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ShoppingListLineItemRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListLineItemRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ShoppingListLineItemRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ShoppingListLineItemRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ShoppingListLineItemRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ShoppingListLineItemRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListLineItemRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ShoppingListLineItemRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListLineItemRemovedMessageQueryBuilderDsl> lineItem(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItem"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl.of())),
            ShoppingListLineItemRemovedMessageQueryBuilderDsl::of);
    }

}
