package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetShippingAddressCustomTypeActionQueryBuilderDsl  {
    public CartSetShippingAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static CartSetShippingAddressCustomTypeActionQueryBuilderDsl of() {
        return new CartSetShippingAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetShippingAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetShippingAddressCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetShippingAddressCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            CartSetShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartSetShippingAddressCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            CartSetShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
