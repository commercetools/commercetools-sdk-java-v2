
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLRequiredFieldErrorQueryBuilderDsl {
    public GraphQLRequiredFieldErrorQueryBuilderDsl() {
    }

    public static GraphQLRequiredFieldErrorQueryBuilderDsl of() {
        return new GraphQLRequiredFieldErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLRequiredFieldErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLRequiredFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLRequiredFieldErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, GraphQLRequiredFieldErrorQueryBuilderDsl::of));
    }
}
