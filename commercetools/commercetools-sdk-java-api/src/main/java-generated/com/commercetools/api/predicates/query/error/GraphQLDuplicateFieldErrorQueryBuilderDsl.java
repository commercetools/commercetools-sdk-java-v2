
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLDuplicateFieldErrorQueryBuilderDsl {
    public GraphQLDuplicateFieldErrorQueryBuilderDsl() {
    }

    public static GraphQLDuplicateFieldErrorQueryBuilderDsl of() {
        return new GraphQLDuplicateFieldErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateFieldErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateFieldErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateFieldErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateFieldErrorQueryBuilderDsl> duplicateValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("duplicateValue")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicateFieldErrorQueryBuilderDsl::of));
    }
}
