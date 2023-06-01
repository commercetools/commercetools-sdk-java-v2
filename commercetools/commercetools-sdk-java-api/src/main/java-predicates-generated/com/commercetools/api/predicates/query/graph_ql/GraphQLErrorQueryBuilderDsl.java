package com.commercetools.api.predicates.query.graph_ql;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLErrorQueryBuilderDsl  {
    public GraphQLErrorQueryBuilderDsl() {
    }

    public static GraphQLErrorQueryBuilderDsl of() {
        return new GraphQLErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, GraphQLErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<GraphQLErrorQueryBuilderDsl> locations(
        Function<com.commercetools.api.predicates.query.graph_ql.GraphQLErrorLocationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.graph_ql.GraphQLErrorLocationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("locations"))
            .inner(fn.apply(com.commercetools.api.predicates.query.graph_ql.GraphQLErrorLocationQueryBuilderDsl.of())),
            GraphQLErrorQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<GraphQLErrorQueryBuilderDsl> locations() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locations")),
                p -> new CombinationQueryPredicate<>(p, GraphQLErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLErrorQueryBuilderDsl> path() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("path")),
        p -> new CombinationQueryPredicate<>(p, GraphQLErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<GraphQLErrorQueryBuilderDsl> extensions(
        Function<com.commercetools.api.predicates.query.error.GraphQLErrorObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.GraphQLErrorObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("extensions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.error.GraphQLErrorObjectQueryBuilderDsl.of())),
            GraphQLErrorQueryBuilderDsl::of);
    }
    
    
}
