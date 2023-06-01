package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl  {
    public GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl() {
    }

    public static GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl of() {
        return new GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, GraphQLReferencedResourceNotFoundErrorQueryBuilderDsl::of));
    }
    
}
