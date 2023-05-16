
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl {
    public ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl() {
    }

    public static ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl of() {
        return new ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl> localizedDescription(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("localizedDescription"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShippingMethodSetLocalizedDescriptionActionQueryBuilderDsl::of);
    }

}
