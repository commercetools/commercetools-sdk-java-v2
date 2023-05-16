
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

@Deprecated
public class ShippingMethodSetDescriptionActionQueryBuilderDsl {
    public ShippingMethodSetDescriptionActionQueryBuilderDsl() {
    }

    public static ShippingMethodSetDescriptionActionQueryBuilderDsl of() {
        return new ShippingMethodSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetDescriptionActionQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetDescriptionActionQueryBuilderDsl::of));
    }

}
