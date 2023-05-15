
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodSetCustomFieldActionQueryBuilderDsl {
    public ShippingMethodSetCustomFieldActionQueryBuilderDsl() {
    }

    public static ShippingMethodSetCustomFieldActionQueryBuilderDsl of() {
        return new ShippingMethodSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodSetCustomFieldActionQueryBuilderDsl::of));
    }
}
