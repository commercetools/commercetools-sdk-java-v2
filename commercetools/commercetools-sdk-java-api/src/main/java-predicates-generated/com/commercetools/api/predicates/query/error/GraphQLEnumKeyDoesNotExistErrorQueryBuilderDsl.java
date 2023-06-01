package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl  {
    public GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl() {
    }

    public static GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl of() {
        return new GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl> conflictingEnumKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingEnumKey")),
        p -> new CombinationQueryPredicate<>(p, GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl> conflictingAttributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingAttributeName")),
        p -> new CombinationQueryPredicate<>(p, GraphQLEnumKeyDoesNotExistErrorQueryBuilderDsl::of));
    }
    
}
