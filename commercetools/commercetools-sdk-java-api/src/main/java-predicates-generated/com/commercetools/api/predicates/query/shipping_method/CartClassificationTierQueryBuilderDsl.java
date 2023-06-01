package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartClassificationTierQueryBuilderDsl  {
    public CartClassificationTierQueryBuilderDsl() {
    }

    public static CartClassificationTierQueryBuilderDsl of() {
        return new CartClassificationTierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartClassificationTierQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, CartClassificationTierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartClassificationTierQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, CartClassificationTierQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartClassificationTierQueryBuilderDsl> price(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("price"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartClassificationTierQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<CartClassificationTierQueryBuilderDsl> isMatching() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isMatching")),
        p -> new CombinationQueryPredicate<>(p, CartClassificationTierQueryBuilderDsl::of));
    }
    
}
