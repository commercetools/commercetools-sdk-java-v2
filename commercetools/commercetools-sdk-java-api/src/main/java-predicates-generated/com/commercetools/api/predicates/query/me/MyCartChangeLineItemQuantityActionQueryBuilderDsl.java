package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartChangeLineItemQuantityActionQueryBuilderDsl  {
    public MyCartChangeLineItemQuantityActionQueryBuilderDsl() {
    }

    public static MyCartChangeLineItemQuantityActionQueryBuilderDsl of() {
        return new MyCartChangeLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartChangeLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCartChangeLineItemQuantityActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, MyCartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<MyCartChangeLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, MyCartChangeLineItemQuantityActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartChangeLineItemQuantityActionQueryBuilderDsl> externalPrice(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            MyCartChangeLineItemQuantityActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<MyCartChangeLineItemQuantityActionQueryBuilderDsl> externalTotalPrice(
        Function<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTotalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl.of())),
            MyCartChangeLineItemQuantityActionQueryBuilderDsl::of);
    }
    
    
}
