
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLFeatureRemovedErrorQueryBuilderDsl {
    public GraphQLFeatureRemovedErrorQueryBuilderDsl() {
    }

    public static GraphQLFeatureRemovedErrorQueryBuilderDsl of() {
        return new GraphQLFeatureRemovedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLFeatureRemovedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLFeatureRemovedErrorQueryBuilderDsl::of));
    }

}
