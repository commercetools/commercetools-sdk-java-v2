package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLEditPreviewFailedErrorQueryBuilderDsl  {
    public GraphQLEditPreviewFailedErrorQueryBuilderDsl() {
    }

    public static GraphQLEditPreviewFailedErrorQueryBuilderDsl of() {
        return new GraphQLEditPreviewFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLEditPreviewFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLEditPreviewFailedErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<GraphQLEditPreviewFailedErrorQueryBuilderDsl> result(
        Function<com.commercetools.api.predicates.query.order_edit.OrderEditPreviewFailureQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditPreviewFailureQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("result"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditPreviewFailureQueryBuilderDsl.of())),
            GraphQLEditPreviewFailedErrorQueryBuilderDsl::of);
    }
    
    
}
