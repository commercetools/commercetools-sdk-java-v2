
package com.commercetools.api.predicates.query.shipping_method;

import com.commercetools.api.predicates.query.*;

public class ShippingMethodResourceIdentifierQueryBuilderDsl {
    public ShippingMethodResourceIdentifierQueryBuilderDsl() {
    }

    public static ShippingMethodResourceIdentifierQueryBuilderDsl of() {
        return new ShippingMethodResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingMethodResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ShippingMethodResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ShippingMethodResourceIdentifierQueryBuilderDsl::of));
    }

}
