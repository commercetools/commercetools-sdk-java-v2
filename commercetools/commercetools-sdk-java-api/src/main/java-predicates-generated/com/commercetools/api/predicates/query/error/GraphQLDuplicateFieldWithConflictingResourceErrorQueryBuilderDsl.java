
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl {
    public GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl() {
    }

    public static GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl of() {
        return new GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")), p -> new CombinationQueryPredicate<>(p,
                GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")), p -> new CombinationQueryPredicate<>(p,
                GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl> duplicateValue() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("duplicateValue")),
            p -> new CombinationQueryPredicate<>(p,
                GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl> conflictingResource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("conflictingResource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            GraphQLDuplicateFieldWithConflictingResourceErrorQueryBuilderDsl::of);
    }

}
