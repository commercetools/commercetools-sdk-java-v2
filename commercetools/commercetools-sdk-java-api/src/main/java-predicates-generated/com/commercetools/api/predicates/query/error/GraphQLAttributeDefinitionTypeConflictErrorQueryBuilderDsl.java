package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl  {
    public GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl() {
    }

    public static GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl of() {
        return new GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl> conflictingProductTypeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingProductTypeId")),
        p -> new CombinationQueryPredicate<>(p, GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl> conflictingProductTypeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingProductTypeName")),
        p -> new CombinationQueryPredicate<>(p, GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl> conflictingAttributeName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("conflictingAttributeName")),
        p -> new CombinationQueryPredicate<>(p, GraphQLAttributeDefinitionTypeConflictErrorQueryBuilderDsl::of));
    }
    
}
