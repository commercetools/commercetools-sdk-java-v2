
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodSetStoresActionQueryBuilderDsl {
    public ShippingMethodSetStoresActionQueryBuilderDsl() {
    }

    public static ShippingMethodSetStoresActionQueryBuilderDsl of() {
        return new ShippingMethodSetStoresActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetStoresActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetStoresActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodSetStoresActionQueryBuilderDsl> stores(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("stores"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            ShippingMethodSetStoresActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShippingMethodSetStoresActionQueryBuilderDsl> stores() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("stores")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetStoresActionQueryBuilderDsl::of));
    }

}
