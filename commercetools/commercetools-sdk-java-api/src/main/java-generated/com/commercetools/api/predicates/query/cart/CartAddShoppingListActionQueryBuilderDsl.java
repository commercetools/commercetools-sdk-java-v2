
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartAddShoppingListActionQueryBuilderDsl {
    public CartAddShoppingListActionQueryBuilderDsl() {
    }

    public static CartAddShoppingListActionQueryBuilderDsl of() {
        return new CartAddShoppingListActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartAddShoppingListActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartAddShoppingListActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartAddShoppingListActionQueryBuilderDsl> shoppingList(
            Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shoppingList"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shopping_list.ShoppingListResourceIdentifierQueryBuilderDsl
                            .of())),
            CartAddShoppingListActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddShoppingListActionQueryBuilderDsl> distributionChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            CartAddShoppingListActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddShoppingListActionQueryBuilderDsl> supplyChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            CartAddShoppingListActionQueryBuilderDsl::of);
    }

}
