
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerSetExternalIdActionQueryBuilderDsl {
    public CustomerSetExternalIdActionQueryBuilderDsl() {
    }

    public static CustomerSetExternalIdActionQueryBuilderDsl of() {
        return new CustomerSetExternalIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetExternalIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetExternalIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerSetExternalIdActionQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, CustomerSetExternalIdActionQueryBuilderDsl::of));
    }
}
