package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartValueTierQueryBuilderDsl  {
    public CartValueTierQueryBuilderDsl() {
    }

    public static CartValueTierQueryBuilderDsl of() {
        return new CartValueTierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartValueTierQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CartValueTierQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartValueTierQueryBuilderDsl> minimumCentAmount() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("minimumCentAmount")),
        p -> new CombinationQueryPredicate<>(p, CartValueTierQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartValueTierQueryBuilderDsl> price(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("price"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartValueTierQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<CartValueTierQueryBuilderDsl> isMatching() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isMatching")),
        p -> new CombinationQueryPredicate<>(p, CartValueTierQueryBuilderDsl::of));
    }
    
}
