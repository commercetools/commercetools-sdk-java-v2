
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLConcurrentModificationErrorQueryBuilderDsl {
    public GraphQLConcurrentModificationErrorQueryBuilderDsl() {
    }

    public static GraphQLConcurrentModificationErrorQueryBuilderDsl of() {
        return new GraphQLConcurrentModificationErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLConcurrentModificationErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLConcurrentModificationErrorQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<GraphQLConcurrentModificationErrorQueryBuilderDsl> currentVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currentVersion")),
            p -> new CombinationQueryPredicate<>(p, GraphQLConcurrentModificationErrorQueryBuilderDsl::of));
    }
}
