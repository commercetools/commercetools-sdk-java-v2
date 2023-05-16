
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodUpdateQueryBuilderDsl {
    public ShippingMethodUpdateQueryBuilderDsl() {
    }

    public static ShippingMethodUpdateQueryBuilderDsl of() {
        return new ShippingMethodUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ShippingMethodUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingMethodUpdateActionQueryBuilderDsl
                            .of())),
            ShippingMethodUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShippingMethodUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodUpdateQueryBuilderDsl::of));
    }

}
