
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetShippingAddressActionQueryBuilderDsl {
    public StagedOrderSetShippingAddressActionQueryBuilderDsl() {
    }

    public static StagedOrderSetShippingAddressActionQueryBuilderDsl of() {
        return new StagedOrderSetShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetShippingAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderSetShippingAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            StagedOrderSetShippingAddressActionQueryBuilderDsl::of);
    }

}
