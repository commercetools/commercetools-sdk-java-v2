
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl {
    public GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl() {
    }

    public static GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl of() {
        return new GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl> invalidAttributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("invalidAttributeName")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAttributeNameDoesNotExistErrorQueryBuilderDsl::of));
    }

}
