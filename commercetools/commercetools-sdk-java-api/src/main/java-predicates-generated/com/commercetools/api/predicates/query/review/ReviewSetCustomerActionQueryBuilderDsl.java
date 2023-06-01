package com.commercetools.api.predicates.query.review;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ReviewSetCustomerActionQueryBuilderDsl  {
    public ReviewSetCustomerActionQueryBuilderDsl() {
    }

    public static ReviewSetCustomerActionQueryBuilderDsl of() {
        return new ReviewSetCustomerActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ReviewSetCustomerActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ReviewSetCustomerActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ReviewSetCustomerActionQueryBuilderDsl> customer(
        Function<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerResourceIdentifierQueryBuilderDsl.of())),
            ReviewSetCustomerActionQueryBuilderDsl::of);
    }
    
    
}
