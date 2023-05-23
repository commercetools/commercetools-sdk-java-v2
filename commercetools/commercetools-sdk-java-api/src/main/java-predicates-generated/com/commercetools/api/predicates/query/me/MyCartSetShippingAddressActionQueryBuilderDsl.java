
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyCartSetShippingAddressActionQueryBuilderDsl {
    public MyCartSetShippingAddressActionQueryBuilderDsl() {
    }

    public static MyCartSetShippingAddressActionQueryBuilderDsl of() {
        return new MyCartSetShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartSetShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyCartSetShippingAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyCartSetShippingAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyCartSetShippingAddressActionQueryBuilderDsl::of);
    }

}
