package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartScoreTierQueryBuilderDsl  {
    public CartScoreTierQueryBuilderDsl() {
    }

    public static CartScoreTierQueryBuilderDsl of() {
        return new CartScoreTierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartScoreTierQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CartScoreTierQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartScoreTierQueryBuilderDsl> score() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("score")),
        p -> new CombinationQueryPredicate<>(p, CartScoreTierQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartScoreTierQueryBuilderDsl> price(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("price"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartScoreTierQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartScoreTierQueryBuilderDsl> priceFunction(
        Function<com.commercetools.api.predicates.query.shipping_method.PriceFunctionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.PriceFunctionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("priceFunction"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shipping_method.PriceFunctionQueryBuilderDsl.of())),
            CartScoreTierQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<CartScoreTierQueryBuilderDsl> isMatching() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isMatching")),
        p -> new CombinationQueryPredicate<>(p, CartScoreTierQueryBuilderDsl::of));
    }
    
}
