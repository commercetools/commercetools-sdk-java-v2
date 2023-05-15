
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class GraphQLDuplicatePriceScopeErrorQueryBuilderDsl {
    public GraphQLDuplicatePriceScopeErrorQueryBuilderDsl() {
    }

    public static GraphQLDuplicatePriceScopeErrorQueryBuilderDsl of() {
        return new GraphQLDuplicatePriceScopeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLDuplicatePriceScopeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLDuplicatePriceScopeErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<GraphQLDuplicatePriceScopeErrorQueryBuilderDsl> conflictingPrice(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("conflictingPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            GraphQLDuplicatePriceScopeErrorQueryBuilderDsl::of);
    }

}
