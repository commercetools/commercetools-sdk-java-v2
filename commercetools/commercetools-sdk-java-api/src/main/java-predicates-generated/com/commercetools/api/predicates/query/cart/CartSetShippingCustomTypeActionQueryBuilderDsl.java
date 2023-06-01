package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetShippingCustomTypeActionQueryBuilderDsl  {
    public CartSetShippingCustomTypeActionQueryBuilderDsl() {
    }

    public static CartSetShippingCustomTypeActionQueryBuilderDsl of() {
        return new CartSetShippingCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetShippingCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetShippingCustomTypeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetShippingCustomTypeActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
        p -> new CombinationQueryPredicate<>(p, CartSetShippingCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetShippingCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            CartSetShippingCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartSetShippingCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CartSetShippingCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
