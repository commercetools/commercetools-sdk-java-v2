package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerEmailVerifyQueryBuilderDsl  {
    public CustomerEmailVerifyQueryBuilderDsl() {
    }

    public static CustomerEmailVerifyQueryBuilderDsl of() {
        return new CustomerEmailVerifyQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CustomerEmailVerifyQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, CustomerEmailVerifyQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerEmailVerifyQueryBuilderDsl> tokenValue() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tokenValue")),
        p -> new CombinationQueryPredicate<>(p, CustomerEmailVerifyQueryBuilderDsl::of));
    }
    
}
