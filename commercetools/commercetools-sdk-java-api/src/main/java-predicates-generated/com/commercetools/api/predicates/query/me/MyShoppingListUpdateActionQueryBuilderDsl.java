package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyShoppingListUpdateActionQueryBuilderDsl  {
    public MyShoppingListUpdateActionQueryBuilderDsl() {
    }

    public static MyShoppingListUpdateActionQueryBuilderDsl of() {
        return new MyShoppingListUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyShoppingListUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyShoppingListUpdateActionQueryBuilderDsl::of));
    }
    
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asAddLineItem(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListAddLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListAddLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListAddLineItemActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asAddTextLineItem(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListAddTextLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListAddTextLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListAddTextLineItemActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asChangeLineItemQuantity(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListChangeLineItemQuantityActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asChangeLineItemsOrder(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListChangeLineItemsOrderActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asChangeName(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListChangeNameActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asChangeTextLineItemName(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListChangeTextLineItemNameActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asChangeTextLineItemQuantity(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListChangeTextLineItemQuantityActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asChangeTextLineItemsOrder(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListChangeTextLineItemsOrderActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asRemoveLineItem(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListRemoveLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListRemoveLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListRemoveLineItemActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asRemoveTextLineItem(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListRemoveTextLineItemActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListRemoveTextLineItemActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListRemoveTextLineItemActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asSetCustomField(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListSetCustomFieldActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asSetCustomType(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListSetCustomTypeActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asSetDeleteDaysAfterLastModification(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListSetDeleteDaysAfterLastModificationActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asSetDescription(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListSetDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListSetDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListSetDescriptionActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asSetLineItemCustomField(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListSetLineItemCustomFieldActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asSetLineItemCustomType(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListSetLineItemCustomTypeActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asSetTextLineItemCustomField(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListSetTextLineItemCustomFieldActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asSetTextLineItemCustomType(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListSetTextLineItemCustomTypeActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
    public CombinationQueryPredicate<MyShoppingListUpdateActionQueryBuilderDsl> asSetTextLineItemDescription(
        Function<com.commercetools.api.predicates.query.me.MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.me.MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(com.commercetools.api.predicates.query.me.MyShoppingListSetTextLineItemDescriptionActionQueryBuilderDsl.of()),
            MyShoppingListUpdateActionQueryBuilderDsl::of);
    }
}
