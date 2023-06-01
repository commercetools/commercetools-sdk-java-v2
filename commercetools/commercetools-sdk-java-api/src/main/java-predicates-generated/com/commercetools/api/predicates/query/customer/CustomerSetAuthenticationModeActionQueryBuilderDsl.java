package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSetAuthenticationModeActionQueryBuilderDsl  {
    public CustomerSetAuthenticationModeActionQueryBuilderDsl() {
    }

    public static CustomerSetAuthenticationModeActionQueryBuilderDsl of() {
        return new CustomerSetAuthenticationModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSetAuthenticationModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetAuthenticationModeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetAuthenticationModeActionQueryBuilderDsl> authMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("authMode")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetAuthenticationModeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSetAuthenticationModeActionQueryBuilderDsl> password() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("password")),
        p -> new CombinationQueryPredicate<>(p, CustomerSetAuthenticationModeActionQueryBuilderDsl::of));
    }
    
}
