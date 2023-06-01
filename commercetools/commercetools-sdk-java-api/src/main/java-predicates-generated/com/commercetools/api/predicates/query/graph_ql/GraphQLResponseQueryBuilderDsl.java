package com.commercetools.api.predicates.query.graph_ql;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLResponseQueryBuilderDsl  {
    public GraphQLResponseQueryBuilderDsl() {
    }

    public static GraphQLResponseQueryBuilderDsl of() {
        return new GraphQLResponseQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLResponseQueryBuilderDsl> data() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("data")),
        p -> new CombinationQueryPredicate<>(p, GraphQLResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<GraphQLResponseQueryBuilderDsl> errors(
        Function<com.commercetools.api.predicates.query.graph_ql.GraphQLErrorQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.graph_ql.GraphQLErrorQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("errors"))
            .inner(fn.apply(com.commercetools.api.predicates.query.graph_ql.GraphQLErrorQueryBuilderDsl.of())),
            GraphQLResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<GraphQLResponseQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
                p -> new CombinationQueryPredicate<>(p, GraphQLResponseQueryBuilderDsl::of));
    }
    
}
