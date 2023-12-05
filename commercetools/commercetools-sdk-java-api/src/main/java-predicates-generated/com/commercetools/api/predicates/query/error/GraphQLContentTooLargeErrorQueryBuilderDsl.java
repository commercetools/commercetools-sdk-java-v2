
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLContentTooLargeErrorQueryBuilderDsl {
    public GraphQLContentTooLargeErrorQueryBuilderDsl() {
    }

    public static GraphQLContentTooLargeErrorQueryBuilderDsl of() {
        return new GraphQLContentTooLargeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLContentTooLargeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLContentTooLargeErrorQueryBuilderDsl::of));
    }

}
