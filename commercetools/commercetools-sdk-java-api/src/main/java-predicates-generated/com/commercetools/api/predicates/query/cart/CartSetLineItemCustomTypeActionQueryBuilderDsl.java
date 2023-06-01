package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetLineItemCustomTypeActionQueryBuilderDsl  {
    public CartSetLineItemCustomTypeActionQueryBuilderDsl() {
    }

    public static CartSetLineItemCustomTypeActionQueryBuilderDsl of() {
        return new CartSetLineItemCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetLineItemCustomTypeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetLineItemCustomTypeActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, CartSetLineItemCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetLineItemCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            CartSetLineItemCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartSetLineItemCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CartSetLineItemCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
