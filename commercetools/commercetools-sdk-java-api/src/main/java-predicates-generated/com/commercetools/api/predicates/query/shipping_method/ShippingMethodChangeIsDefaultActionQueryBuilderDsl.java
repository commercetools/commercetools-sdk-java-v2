package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShippingMethodChangeIsDefaultActionQueryBuilderDsl  {
    public ShippingMethodChangeIsDefaultActionQueryBuilderDsl() {
    }

    public static ShippingMethodChangeIsDefaultActionQueryBuilderDsl of() {
        return new ShippingMethodChangeIsDefaultActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodChangeIsDefaultActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodChangeIsDefaultActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<ShippingMethodChangeIsDefaultActionQueryBuilderDsl> isDefault() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isDefault")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodChangeIsDefaultActionQueryBuilderDsl::of));
    }
    
}
