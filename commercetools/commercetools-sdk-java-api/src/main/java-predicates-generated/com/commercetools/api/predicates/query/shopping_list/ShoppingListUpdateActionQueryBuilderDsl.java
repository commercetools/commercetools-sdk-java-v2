
package com.commercetools.api.predicates.query.shopping_list;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShoppingListUpdateActionQueryBuilderDsl {
    public ShoppingListUpdateActionQueryBuilderDsl() {
    }

    public static ShoppingListUpdateActionQueryBuilderDsl of() {
        return new ShoppingListUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShoppingListUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asAddLineItem(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListAddLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListAddLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.shopping_list.ShoppingListAddLineItemActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asAddTextLineItem(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListAddTextLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListAddTextLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListAddTextLineItemActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asChangeLineItemQuantity(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeLineItemQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeLineItemQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeLineItemQuantityActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asChangeLineItemsOrder(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeLineItemsOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeLineItemsOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeLineItemsOrderActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeNameActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asChangeTextLineItemName(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeTextLineItemNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeTextLineItemNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeTextLineItemNameActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asChangeTextLineItemQuantity(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asChangeTextLineItemsOrder(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asRemoveLineItem(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListRemoveLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListRemoveLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListRemoveLineItemActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asRemoveTextLineItem(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListRemoveTextLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListRemoveTextLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListRemoveTextLineItemActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetAnonymousId(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetAnonymousIdActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetAnonymousIdActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetAnonymousIdActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetBusinessUnit(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetBusinessUnitActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetBusinessUnitActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetBusinessUnitActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetCustomFieldActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetCustomTypeActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetCustomer(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetCustomerActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetCustomerActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.shopping_list.ShoppingListSetCustomerActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetDeleteDaysAfterLastModification(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetDescription(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetDescriptionActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetKey(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.shopping_list.ShoppingListSetKeyActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetLineItemCustomField(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetLineItemCustomFieldActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetLineItemCustomType(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetLineItemCustomTypeActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetSlug(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetSlugActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetSlugActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.shopping_list.ShoppingListSetSlugActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetStore(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetStoreActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetStoreActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.shopping_list.ShoppingListSetStoreActionQueryBuilderDsl.of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetTextLineItemCustomField(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetTextLineItemCustomType(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShoppingListUpdateActionQueryBuilderDsl> asSetTextLineItemDescription(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.shopping_list.ShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl
                    .of()),
            ShoppingListUpdateActionQueryBuilderDsl::of);
    }
}
