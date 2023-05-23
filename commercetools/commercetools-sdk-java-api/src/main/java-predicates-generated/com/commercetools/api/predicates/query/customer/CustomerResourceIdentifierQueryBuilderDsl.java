
package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

public class CustomerResourceIdentifierQueryBuilderDsl {
    public CustomerResourceIdentifierQueryBuilderDsl() {
    }

    public static CustomerResourceIdentifierQueryBuilderDsl of() {
        return new CustomerResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, CustomerResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CustomerResourceIdentifierQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomerResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomerResourceIdentifierQueryBuilderDsl::of));
    }

}
