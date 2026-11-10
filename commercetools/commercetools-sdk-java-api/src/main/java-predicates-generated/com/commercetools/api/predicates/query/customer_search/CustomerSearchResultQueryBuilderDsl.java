
package com.commercetools.api.predicates.query.customer_search;

import com.commercetools.api.predicates.query.*;

public class CustomerSearchResultQueryBuilderDsl {
    public CustomerSearchResultQueryBuilderDsl() {
    }

    public static CustomerSearchResultQueryBuilderDsl of() {
        return new CustomerSearchResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSearchResultQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchResultQueryBuilderDsl::of));
    }

    public DoubleComparisonPredicateBuilder<CustomerSearchResultQueryBuilderDsl> relevance() {
        return new DoubleComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("relevance")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchResultQueryBuilderDsl::of));
    }

}
