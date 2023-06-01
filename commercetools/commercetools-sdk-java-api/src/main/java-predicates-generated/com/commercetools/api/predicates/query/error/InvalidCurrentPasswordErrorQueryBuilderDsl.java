package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InvalidCurrentPasswordErrorQueryBuilderDsl  {
    public InvalidCurrentPasswordErrorQueryBuilderDsl() {
    }

    public static InvalidCurrentPasswordErrorQueryBuilderDsl of() {
        return new InvalidCurrentPasswordErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InvalidCurrentPasswordErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, InvalidCurrentPasswordErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<InvalidCurrentPasswordErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, InvalidCurrentPasswordErrorQueryBuilderDsl::of));
    }
    
}
