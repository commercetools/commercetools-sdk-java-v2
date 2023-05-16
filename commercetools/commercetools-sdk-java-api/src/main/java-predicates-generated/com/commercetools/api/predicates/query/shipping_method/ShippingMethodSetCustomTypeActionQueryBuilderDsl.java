
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodSetCustomTypeActionQueryBuilderDsl {
    public ShippingMethodSetCustomTypeActionQueryBuilderDsl() {
    }

    public static ShippingMethodSetCustomTypeActionQueryBuilderDsl of() {
        return new ShippingMethodSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ShippingMethodSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingMethodSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ShippingMethodSetCustomTypeActionQueryBuilderDsl::of);
    }

}
