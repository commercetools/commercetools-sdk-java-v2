
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeSetMaxApplicationsActionQueryBuilderDsl {
    public DiscountCodeSetMaxApplicationsActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetMaxApplicationsActionQueryBuilderDsl of() {
        return new DiscountCodeSetMaxApplicationsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetMaxApplicationsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetMaxApplicationsActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountCodeSetMaxApplicationsActionQueryBuilderDsl> maxApplications() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxApplications")),
            p -> new CombinationQueryPredicate<>(p, DiscountCodeSetMaxApplicationsActionQueryBuilderDsl::of));
    }

}
