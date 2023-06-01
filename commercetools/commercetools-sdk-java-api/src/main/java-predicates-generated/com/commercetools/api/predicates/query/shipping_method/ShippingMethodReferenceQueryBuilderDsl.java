package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShippingMethodReferenceQueryBuilderDsl  {
    public ShippingMethodReferenceQueryBuilderDsl() {
    }

    public static ShippingMethodReferenceQueryBuilderDsl of() {
        return new ShippingMethodReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShippingMethodReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ShippingMethodReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShippingMethodReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shipping_method.ShippingMethodQueryBuilderDsl.of())),
            ShippingMethodReferenceQueryBuilderDsl::of);
    }
    
    
}
