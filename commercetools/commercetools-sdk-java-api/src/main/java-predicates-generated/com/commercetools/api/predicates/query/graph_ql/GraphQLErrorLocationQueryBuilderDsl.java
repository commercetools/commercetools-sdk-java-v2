package com.commercetools.api.predicates.query.graph_ql;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLErrorLocationQueryBuilderDsl  {
    public GraphQLErrorLocationQueryBuilderDsl() {
    }

    public static GraphQLErrorLocationQueryBuilderDsl of() {
        return new GraphQLErrorLocationQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<GraphQLErrorLocationQueryBuilderDsl> line() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("line")),
        p -> new CombinationQueryPredicate<>(p, GraphQLErrorLocationQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<GraphQLErrorLocationQueryBuilderDsl> column() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("column")),
        p -> new CombinationQueryPredicate<>(p, GraphQLErrorLocationQueryBuilderDsl::of));
    }
    
}
