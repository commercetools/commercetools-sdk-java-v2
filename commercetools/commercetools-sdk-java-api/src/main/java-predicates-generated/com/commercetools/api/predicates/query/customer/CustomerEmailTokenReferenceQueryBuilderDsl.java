
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerEmailTokenReferenceQueryBuilderDsl {
    public CustomerEmailTokenReferenceQueryBuilderDsl() {
    }

    public static CustomerEmailTokenReferenceQueryBuilderDsl of() {
        return new CustomerEmailTokenReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerEmailTokenReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, CustomerEmailTokenReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerEmailTokenReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerEmailTokenReferenceQueryBuilderDsl::of));
    }

}
