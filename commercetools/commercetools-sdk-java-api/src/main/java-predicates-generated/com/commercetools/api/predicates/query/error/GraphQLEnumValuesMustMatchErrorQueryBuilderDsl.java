package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLEnumValuesMustMatchErrorQueryBuilderDsl  {
    public GraphQLEnumValuesMustMatchErrorQueryBuilderDsl() {
    }

    public static GraphQLEnumValuesMustMatchErrorQueryBuilderDsl of() {
        return new GraphQLEnumValuesMustMatchErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLEnumValuesMustMatchErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLEnumValuesMustMatchErrorQueryBuilderDsl::of));
    }
    
}
