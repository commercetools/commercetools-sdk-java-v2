package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class InternalConstraintViolatedErrorQueryBuilderDsl  {
    public InternalConstraintViolatedErrorQueryBuilderDsl() {
    }

    public static InternalConstraintViolatedErrorQueryBuilderDsl of() {
        return new InternalConstraintViolatedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<InternalConstraintViolatedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, InternalConstraintViolatedErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<InternalConstraintViolatedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, InternalConstraintViolatedErrorQueryBuilderDsl::of));
    }
    
}
