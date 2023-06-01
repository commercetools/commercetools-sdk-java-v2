package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLDuplicatePriceKeyErrorQueryBuilderDsl  {
    public GraphQLDuplicatePriceKeyErrorQueryBuilderDsl() {
    }

    public static GraphQLDuplicatePriceKeyErrorQueryBuilderDsl of() {
        return new GraphQLDuplicatePriceKeyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicatePriceKeyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLDuplicatePriceKeyErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<GraphQLDuplicatePriceKeyErrorQueryBuilderDsl> conflictingPrice(
        Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("conflictingPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            GraphQLDuplicatePriceKeyErrorQueryBuilderDsl::of);
    }
    
    
}
