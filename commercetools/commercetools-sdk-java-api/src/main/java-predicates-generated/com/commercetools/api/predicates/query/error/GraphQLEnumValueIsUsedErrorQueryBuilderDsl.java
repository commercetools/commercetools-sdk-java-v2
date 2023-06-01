package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLEnumValueIsUsedErrorQueryBuilderDsl  {
    public GraphQLEnumValueIsUsedErrorQueryBuilderDsl() {
    }

    public static GraphQLEnumValueIsUsedErrorQueryBuilderDsl of() {
        return new GraphQLEnumValueIsUsedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLEnumValueIsUsedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLEnumValueIsUsedErrorQueryBuilderDsl::of));
    }
    
}
