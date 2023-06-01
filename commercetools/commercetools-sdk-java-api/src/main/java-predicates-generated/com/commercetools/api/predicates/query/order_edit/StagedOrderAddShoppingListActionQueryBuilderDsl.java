package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderAddShoppingListActionQueryBuilderDsl  {
    public StagedOrderAddShoppingListActionQueryBuilderDsl() {
    }

    public static StagedOrderAddShoppingListActionQueryBuilderDsl of() {
        return new StagedOrderAddShoppingListActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderAddShoppingListActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderAddShoppingListActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedOrderAddShoppingListActionQueryBuilderDsl> shoppingList(
        Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shoppingList"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shopping_list.ShoppingListResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderAddShoppingListActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderAddShoppingListActionQueryBuilderDsl> supplyChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("supplyChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderAddShoppingListActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StagedOrderAddShoppingListActionQueryBuilderDsl> distributionChannel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderAddShoppingListActionQueryBuilderDsl::of);
    }
    
    
}
