package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLInvalidFieldErrorQueryBuilderDsl  {
    public GraphQLInvalidFieldErrorQueryBuilderDsl() {
    }

    public static GraphQLInvalidFieldErrorQueryBuilderDsl of() {
        return new GraphQLInvalidFieldErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidFieldErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInvalidFieldErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLInvalidFieldErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInvalidFieldErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLInvalidFieldErrorQueryBuilderDsl> invalidValue() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("invalidValue")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInvalidFieldErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLInvalidFieldErrorQueryBuilderDsl> allowedValues() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("allowedValues")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInvalidFieldErrorQueryBuilderDsl::of));
    }
    
}
