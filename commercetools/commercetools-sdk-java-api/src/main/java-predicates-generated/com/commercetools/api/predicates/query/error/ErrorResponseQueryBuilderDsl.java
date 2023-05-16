
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ErrorResponseQueryBuilderDsl {
    public ErrorResponseQueryBuilderDsl() {
    }

    public static ErrorResponseQueryBuilderDsl of() {
        return new ErrorResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ErrorResponseQueryBuilderDsl> statusCode() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("statusCode")),
            p -> new CombinationQueryPredicate<>(p, ErrorResponseQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ErrorResponseQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ErrorResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ErrorResponseQueryBuilderDsl> errors(
            Function<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("errors"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl.of())),
            ErrorResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ErrorResponseQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
            p -> new CombinationQueryPredicate<>(p, ErrorResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ErrorResponseQueryBuilderDsl> asAuthErrorResponse(
            Function<com.commercetools.api.predicates.query.error.AuthErrorResponseQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.AuthErrorResponseQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.error.AuthErrorResponseQueryBuilderDsl.of()),
            ErrorResponseQueryBuilderDsl::of);
    }
}
