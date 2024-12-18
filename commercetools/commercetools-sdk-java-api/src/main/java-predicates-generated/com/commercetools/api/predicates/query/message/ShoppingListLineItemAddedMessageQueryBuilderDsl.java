
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListLineItemAddedMessageQueryBuilderDsl {
    public ShoppingListLineItemAddedMessageQueryBuilderDsl() {
    }

    public static ShoppingListLineItemAddedMessageQueryBuilderDsl of() {
        return new ShoppingListLineItemAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListLineItemAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemAddedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListLineItemAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ShoppingListLineItemAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemAddedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ShoppingListLineItemAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemAddedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ShoppingListLineItemAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListLineItemAddedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ShoppingListLineItemAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ShoppingListLineItemAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemAddedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ShoppingListLineItemAddedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ShoppingListLineItemAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemAddedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShoppingListLineItemAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListLineItemAddedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListLineItemAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ShoppingListLineItemAddedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListLineItemAddedMessageQueryBuilderDsl> lineItem(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lineItem"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl.of())),
            ShoppingListLineItemAddedMessageQueryBuilderDsl::of);
    }

}
