package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLExtensionNoResponseErrorQueryBuilderDsl  {
    public GraphQLExtensionNoResponseErrorQueryBuilderDsl() {
    }

    public static GraphQLExtensionNoResponseErrorQueryBuilderDsl of() {
        return new GraphQLExtensionNoResponseErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExtensionNoResponseErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLExtensionNoResponseErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLExtensionNoResponseErrorQueryBuilderDsl> extensionId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionId")),
        p -> new CombinationQueryPredicate<>(p, GraphQLExtensionNoResponseErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLExtensionNoResponseErrorQueryBuilderDsl> extensionKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionKey")),
        p -> new CombinationQueryPredicate<>(p, GraphQLExtensionNoResponseErrorQueryBuilderDsl::of));
    }
    
}
