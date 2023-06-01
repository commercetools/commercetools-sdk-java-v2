package com.commercetools.api.predicates.query.customer_group;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerGroupResourceIdentifierQueryBuilderDsl  {
    public CustomerGroupResourceIdentifierQueryBuilderDsl() {
    }

    public static CustomerGroupResourceIdentifierQueryBuilderDsl of() {
        return new CustomerGroupResourceIdentifierQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerGroupResourceIdentifierQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerGroupResourceIdentifierQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupResourceIdentifierQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerGroupResourceIdentifierQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, CustomerGroupResourceIdentifierQueryBuilderDsl::of));
    }
    
}
