
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl {
    public StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl() {
    }

    public static StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl of() {
        return new StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
            p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")), p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")), p -> new CombinationQueryPredicate<>(p,
                StagedOrderSetItemShippingAddressCustomFieldActionQueryBuilderDsl::of));
    }

}
