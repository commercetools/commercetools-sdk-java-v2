
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLReferenceExistsErrorQueryBuilderDsl {
    public GraphQLReferenceExistsErrorQueryBuilderDsl() {
    }

    public static GraphQLReferenceExistsErrorQueryBuilderDsl of() {
        return new GraphQLReferenceExistsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLReferenceExistsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLReferenceExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLReferenceExistsErrorQueryBuilderDsl> referencedBy() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("referencedBy")),
            p -> new CombinationQueryPredicate<>(p, GraphQLReferenceExistsErrorQueryBuilderDsl::of));
    }
}
