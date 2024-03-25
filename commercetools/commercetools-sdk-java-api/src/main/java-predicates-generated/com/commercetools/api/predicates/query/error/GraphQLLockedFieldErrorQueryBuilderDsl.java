
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLLockedFieldErrorQueryBuilderDsl {
    public GraphQLLockedFieldErrorQueryBuilderDsl() {
    }

    public static GraphQLLockedFieldErrorQueryBuilderDsl of() {
        return new GraphQLLockedFieldErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLLockedFieldErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLockedFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLLockedFieldErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, GraphQLLockedFieldErrorQueryBuilderDsl::of));
    }

}
