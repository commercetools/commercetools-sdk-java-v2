package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerResetPasswordQueryBuilderDsl  {
    public CustomerResetPasswordQueryBuilderDsl() {
    }

    public static CustomerResetPasswordQueryBuilderDsl of() {
        return new CustomerResetPasswordQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerResetPasswordQueryBuilderDsl> tokenValue() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tokenValue")),
        p -> new CombinationQueryPredicate<>(p, CustomerResetPasswordQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerResetPasswordQueryBuilderDsl> newPassword() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newPassword")),
        p -> new CombinationQueryPredicate<>(p, CustomerResetPasswordQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomerResetPasswordQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, CustomerResetPasswordQueryBuilderDsl::of));
    }
    
}
