
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl {
    public StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl() {
    }

    public static StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl of() {
        return new StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveItemShippingAddressActionQueryBuilderDsl::of));
    }
}
