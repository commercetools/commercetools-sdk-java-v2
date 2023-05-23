
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLOverCapacityErrorQueryBuilderDsl {
    public GraphQLOverCapacityErrorQueryBuilderDsl() {
    }

    public static GraphQLOverCapacityErrorQueryBuilderDsl of() {
        return new GraphQLOverCapacityErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLOverCapacityErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOverCapacityErrorQueryBuilderDsl::of));
    }

}
