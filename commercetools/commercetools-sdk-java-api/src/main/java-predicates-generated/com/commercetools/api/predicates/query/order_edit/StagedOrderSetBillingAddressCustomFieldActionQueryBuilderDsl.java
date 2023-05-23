
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl {
    public StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl() {
    }

    public static StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl of() {
        return new StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetBillingAddressCustomFieldActionQueryBuilderDsl::of));
    }

}
