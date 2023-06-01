package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLProductAssignmentMissingErrorQueryBuilderDsl  {
    public GraphQLProductAssignmentMissingErrorQueryBuilderDsl() {
    }

    public static GraphQLProductAssignmentMissingErrorQueryBuilderDsl of() {
        return new GraphQLProductAssignmentMissingErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLProductAssignmentMissingErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLProductAssignmentMissingErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<GraphQLProductAssignmentMissingErrorQueryBuilderDsl> product(
        Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("product"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            GraphQLProductAssignmentMissingErrorQueryBuilderDsl::of);
    }
    
    
}
