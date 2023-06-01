package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl  {
    public GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl() {
    }

    public static GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl of() {
        return new GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl> errorByExtension(
        Function<com.commercetools.api.predicates.query.error.ErrorByExtensionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorByExtensionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("errorByExtension"))
            .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorByExtensionQueryBuilderDsl.of())),
            GraphQLExtensionPredicateEvaluationFailedErrorQueryBuilderDsl::of);
    }
    
    
}
