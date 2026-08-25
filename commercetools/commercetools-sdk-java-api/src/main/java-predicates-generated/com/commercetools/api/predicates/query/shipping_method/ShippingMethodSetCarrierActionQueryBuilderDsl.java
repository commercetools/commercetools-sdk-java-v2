
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodSetCarrierActionQueryBuilderDsl {
    public ShippingMethodSetCarrierActionQueryBuilderDsl() {
    }

    public static ShippingMethodSetCarrierActionQueryBuilderDsl of() {
        return new ShippingMethodSetCarrierActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetCarrierActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetCarrierActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetCarrierActionQueryBuilderDsl> carrier() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("carrier")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetCarrierActionQueryBuilderDsl::of));
    }

}
