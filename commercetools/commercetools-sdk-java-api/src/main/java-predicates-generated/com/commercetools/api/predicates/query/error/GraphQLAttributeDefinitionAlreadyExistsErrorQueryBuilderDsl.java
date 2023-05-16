
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl {
    public GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl() {
    }

    public static GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl of() {
        return new GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl> conflictingProductTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingProductTypeId")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl> conflictingProductTypeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingProductTypeName")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl> conflictingAttributeName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingAttributeName")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAttributeDefinitionAlreadyExistsErrorQueryBuilderDsl::of));
    }

}
