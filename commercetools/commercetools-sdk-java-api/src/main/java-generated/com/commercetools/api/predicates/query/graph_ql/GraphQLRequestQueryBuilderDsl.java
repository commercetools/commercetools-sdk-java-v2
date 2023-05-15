
package com.commercetools.api.predicates.query.graph_ql;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLRequestQueryBuilderDsl {
    public GraphQLRequestQueryBuilderDsl() {
    }

    public static GraphQLRequestQueryBuilderDsl of() {
        return new GraphQLRequestQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLRequestQueryBuilderDsl> query() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("query")),
            p -> new CombinationQueryPredicate<>(p, GraphQLRequestQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLRequestQueryBuilderDsl> operationName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("operationName")),
            p -> new CombinationQueryPredicate<>(p, GraphQLRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLRequestQueryBuilderDsl> variables(
            Function<com.commercetools.api.predicates.query.graph_ql.GraphQLVariablesMapQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.graph_ql.GraphQLVariablesMapQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("variables"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.graph_ql.GraphQLVariablesMapQueryBuilderDsl.of())),
            GraphQLRequestQueryBuilderDsl::of);
    }

}
