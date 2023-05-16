
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyShoppingListDraftQueryBuilderDsl {
    public MyShoppingListDraftQueryBuilderDsl() {
    }

    public static MyShoppingListDraftQueryBuilderDsl of() {
        return new MyShoppingListDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<MyShoppingListDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            MyShoppingListDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyShoppingListDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            MyShoppingListDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<MyShoppingListDraftQueryBuilderDsl> lineItems(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("lineItems"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemDraftQueryBuilderDsl
                            .of())),
            MyShoppingListDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyShoppingListDraftQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListDraftQueryBuilderDsl> textLineItems(
            Function<com.commercetools.api.predicates.query.shopping_list.TextLineItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.TextLineItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("textLineItems"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shopping_list.TextLineItemDraftQueryBuilderDsl.of())),
            MyShoppingListDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MyShoppingListDraftQueryBuilderDsl> textLineItems() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItems")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            MyShoppingListDraftQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<MyShoppingListDraftQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
            p -> new CombinationQueryPredicate<>(p, MyShoppingListDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyShoppingListDraftQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            MyShoppingListDraftQueryBuilderDsl::of);
    }

}
