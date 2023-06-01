package com.commercetools.api.predicates.query.customer;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomerSigninQueryBuilderDsl  {
    public CustomerSigninQueryBuilderDsl() {
    }

    public static CustomerSigninQueryBuilderDsl of() {
        return new CustomerSigninQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomerSigninQueryBuilderDsl> email() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("email")),
        p -> new CombinationQueryPredicate<>(p, CustomerSigninQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSigninQueryBuilderDsl> password() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("password")),
        p -> new CombinationQueryPredicate<>(p, CustomerSigninQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSigninQueryBuilderDsl> anonymousCartId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousCartId")),
        p -> new CombinationQueryPredicate<>(p, CustomerSigninQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomerSigninQueryBuilderDsl> anonymousCart(
        Function<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("anonymousCart"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartResourceIdentifierQueryBuilderDsl.of())),
            CustomerSigninQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<CustomerSigninQueryBuilderDsl> anonymousCartSignInMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousCartSignInMode")),
        p -> new CombinationQueryPredicate<>(p, CustomerSigninQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CustomerSigninQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
        p -> new CombinationQueryPredicate<>(p, CustomerSigninQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<CustomerSigninQueryBuilderDsl> updateProductData() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updateProductData")),
        p -> new CombinationQueryPredicate<>(p, CustomerSigninQueryBuilderDsl::of));
    }
    
}
