
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class CustomerSearchProjectNotIndexedErrorQueryBuilderDsl {
    public CustomerSearchProjectNotIndexedErrorQueryBuilderDsl() {
    }

    public static CustomerSearchProjectNotIndexedErrorQueryBuilderDsl of() {
        return new CustomerSearchProjectNotIndexedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSearchProjectNotIndexedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchProjectNotIndexedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSearchProjectNotIndexedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, CustomerSearchProjectNotIndexedErrorQueryBuilderDsl::of));
    }

}
