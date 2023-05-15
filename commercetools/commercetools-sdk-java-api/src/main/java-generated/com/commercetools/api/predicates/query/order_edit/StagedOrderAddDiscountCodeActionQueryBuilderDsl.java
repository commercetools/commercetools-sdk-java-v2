
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderAddDiscountCodeActionQueryBuilderDsl {
    public StagedOrderAddDiscountCodeActionQueryBuilderDsl() {
    }

    public static StagedOrderAddDiscountCodeActionQueryBuilderDsl of() {
        return new StagedOrderAddDiscountCodeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderAddDiscountCodeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddDiscountCodeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderAddDiscountCodeActionQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderAddDiscountCodeActionQueryBuilderDsl::of));
    }
}
