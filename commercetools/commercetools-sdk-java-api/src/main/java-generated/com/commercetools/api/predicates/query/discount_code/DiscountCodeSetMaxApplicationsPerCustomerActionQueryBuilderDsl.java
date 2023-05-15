
package com.commercetools.api.predicates.query.discount_code;

import com.commercetools.api.predicates.query.*;

public class DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl {
    public DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl() {
    }

    public static DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl of() {
        return new DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl> maxApplicationsPerCustomer() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("maxApplicationsPerCustomer")),
            p -> new CombinationQueryPredicate<>(p,
                DiscountCodeSetMaxApplicationsPerCustomerActionQueryBuilderDsl::of));
    }
}
