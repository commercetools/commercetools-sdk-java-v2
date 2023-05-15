
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetCountryActionQueryBuilderDsl {
    public StagedOrderSetCountryActionQueryBuilderDsl() {
    }

    public static StagedOrderSetCountryActionQueryBuilderDsl of() {
        return new StagedOrderSetCountryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCountryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCountryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCountryActionQueryBuilderDsl> country() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("country")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCountryActionQueryBuilderDsl::of));
    }
}
