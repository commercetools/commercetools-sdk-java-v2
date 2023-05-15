
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl {
    public GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl() {
    }

    public static GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl of() {
        return new GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl> conflictingEnumKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingEnumKey")),
            p -> new CombinationQueryPredicate<>(p, GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl> conflictingAttributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingAttributeName")),
            p -> new CombinationQueryPredicate<>(p, GraphQLEnumKeyAlreadyExistsErrorQueryBuilderDsl::of));
    }
}
