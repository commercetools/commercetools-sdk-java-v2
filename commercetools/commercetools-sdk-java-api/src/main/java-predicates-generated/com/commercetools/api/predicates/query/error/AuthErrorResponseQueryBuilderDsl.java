package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AuthErrorResponseQueryBuilderDsl  {
    public AuthErrorResponseQueryBuilderDsl() {
    }

    public static AuthErrorResponseQueryBuilderDsl of() {
        return new AuthErrorResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<AuthErrorResponseQueryBuilderDsl> statusCode() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("statusCode")),
        p -> new CombinationQueryPredicate<>(p, AuthErrorResponseQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AuthErrorResponseQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, AuthErrorResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<AuthErrorResponseQueryBuilderDsl> errors(
        Function<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("errors"))
            .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl.of())),
            AuthErrorResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<AuthErrorResponseQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
                p -> new CombinationQueryPredicate<>(p, AuthErrorResponseQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AuthErrorResponseQueryBuilderDsl> error() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("error")),
        p -> new CombinationQueryPredicate<>(p, AuthErrorResponseQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<AuthErrorResponseQueryBuilderDsl> error_description() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("error_description")),
        p -> new CombinationQueryPredicate<>(p, AuthErrorResponseQueryBuilderDsl::of));
    }
    
}
