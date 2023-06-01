package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShippingMethodSetKeyActionQueryBuilderDsl  {
    public ShippingMethodSetKeyActionQueryBuilderDsl() {
    }

    public static ShippingMethodSetKeyActionQueryBuilderDsl of() {
        return new ShippingMethodSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodSetKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShippingMethodSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodSetKeyActionQueryBuilderDsl::of));
    }
    
}
