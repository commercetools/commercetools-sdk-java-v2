
package com.commercetools.api.predicates.query.shipping_method;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodSetLocalizedNameActionQueryBuilderDsl {
    public ShippingMethodSetLocalizedNameActionQueryBuilderDsl() {
    }

    public static ShippingMethodSetLocalizedNameActionQueryBuilderDsl of() {
        return new ShippingMethodSetLocalizedNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetLocalizedNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetLocalizedNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingMethodSetLocalizedNameActionQueryBuilderDsl> localizedName(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("localizedName"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShippingMethodSetLocalizedNameActionQueryBuilderDsl::of);
    }

}
