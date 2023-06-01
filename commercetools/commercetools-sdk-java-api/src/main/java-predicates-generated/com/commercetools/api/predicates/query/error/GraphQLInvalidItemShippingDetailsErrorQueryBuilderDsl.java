package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl  {
    public GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl() {
    }

    public static GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl of() {
        return new GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl> subject() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("subject")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl> itemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("itemId")),
        p -> new CombinationQueryPredicate<>(p, GraphQLInvalidItemShippingDetailsErrorQueryBuilderDsl::of));
    }
    
}
