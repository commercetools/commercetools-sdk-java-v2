
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLOutOfStockErrorQueryBuilderDsl {
    public GraphQLOutOfStockErrorQueryBuilderDsl() {
    }

    public static GraphQLOutOfStockErrorQueryBuilderDsl of() {
        return new GraphQLOutOfStockErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLOutOfStockErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOutOfStockErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<GraphQLOutOfStockErrorQueryBuilderDsl> lineItems() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOutOfStockErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<GraphQLOutOfStockErrorQueryBuilderDsl> skus() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("skus")),
            p -> new CombinationQueryPredicate<>(p, GraphQLOutOfStockErrorQueryBuilderDsl::of));
    }

}
