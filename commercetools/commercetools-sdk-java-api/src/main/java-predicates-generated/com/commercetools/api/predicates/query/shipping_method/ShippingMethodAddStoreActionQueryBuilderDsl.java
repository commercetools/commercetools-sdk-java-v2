
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodAddStoreActionQueryBuilderDsl {
    public ShippingMethodAddStoreActionQueryBuilderDsl() {
    }

    public static ShippingMethodAddStoreActionQueryBuilderDsl of() {
        return new ShippingMethodAddStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodAddStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodAddStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodAddStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            ShippingMethodAddStoreActionQueryBuilderDsl::of);
    }

}
