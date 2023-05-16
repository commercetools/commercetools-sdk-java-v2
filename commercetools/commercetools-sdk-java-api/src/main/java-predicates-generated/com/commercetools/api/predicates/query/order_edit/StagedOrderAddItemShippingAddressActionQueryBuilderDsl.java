
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderAddItemShippingAddressActionQueryBuilderDsl {
    public StagedOrderAddItemShippingAddressActionQueryBuilderDsl() {
    }

    public static StagedOrderAddItemShippingAddressActionQueryBuilderDsl of() {
        return new StagedOrderAddItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderAddItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddItemShippingAddressActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderAddItemShippingAddressActionQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            StagedOrderAddItemShippingAddressActionQueryBuilderDsl::of);
    }

}
