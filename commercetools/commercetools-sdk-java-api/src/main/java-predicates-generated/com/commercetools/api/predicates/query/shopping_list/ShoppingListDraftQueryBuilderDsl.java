
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListDraftQueryBuilderDsl {
    public ShoppingListDraftQueryBuilderDsl() {
    }

    public static ShoppingListDraftQueryBuilderDsl of() {
        return new ShoppingListDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ShoppingListDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListDraftQueryBuilderDsl> slug(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("slug"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListDraftQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("customer"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            ShoppingListDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ShoppingListDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ShoppingListDraftQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ShoppingListDraftQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListDraftQueryBuilderDsl> lineItems(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("lineItems"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemDraftQueryBuilderDsl
                            .of())),
            ShoppingListDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShoppingListDraftQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListDraftQueryBuilderDsl> textLineItems(
            Function<com.commercetools.api.predicates.query.shopping_list.TextLineItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.TextLineItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("textLineItems"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shopping_list.TextLineItemDraftQueryBuilderDsl.of())),
            ShoppingListDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShoppingListDraftQueryBuilderDsl> textLineItems() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItems")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListDraftQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            ShoppingListDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListDraftQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            ShoppingListDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            ShoppingListDraftQueryBuilderDsl::of);
    }

}
