
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodRemoveStoreActionQueryBuilderDsl {
    public ShippingMethodRemoveStoreActionQueryBuilderDsl() {
    }

    public static ShippingMethodRemoveStoreActionQueryBuilderDsl of() {
        return new ShippingMethodRemoveStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodRemoveStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodRemoveStoreActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodRemoveStoreActionQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            ShippingMethodRemoveStoreActionQueryBuilderDsl::of);
    }

}
