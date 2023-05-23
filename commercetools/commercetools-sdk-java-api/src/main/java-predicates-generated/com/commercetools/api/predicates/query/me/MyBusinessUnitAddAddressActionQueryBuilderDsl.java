
package com.commercetools.api.predicates.query.me;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MyBusinessUnitAddAddressActionQueryBuilderDsl {
    public MyBusinessUnitAddAddressActionQueryBuilderDsl() {
    }

    public static MyBusinessUnitAddAddressActionQueryBuilderDsl of() {
        return new MyBusinessUnitAddAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyBusinessUnitAddAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, MyBusinessUnitAddAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MyBusinessUnitAddAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            MyBusinessUnitAddAddressActionQueryBuilderDsl::of);
    }

}
