
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl {
    public StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl() {
    }

    public static StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl of() {
        return new StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            StagedOrderUpdateItemShippingAddressActionQueryBuilderDsl::of);
    }

}
