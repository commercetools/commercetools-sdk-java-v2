
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLInvalidJsonInputErrorQueryBuilderDsl {
    public GraphQLInvalidJsonInputErrorQueryBuilderDsl() {
    }

    public static GraphQLInvalidJsonInputErrorQueryBuilderDsl of() {
        return new GraphQLInvalidJsonInputErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidJsonInputErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLInvalidJsonInputErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidJsonInputErrorQueryBuilderDsl> detailedErrorMessage() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("detailedErrorMessage")),
            p -> new CombinationQueryPredicate<>(p, GraphQLInvalidJsonInputErrorQueryBuilderDsl::of));
    }

}
