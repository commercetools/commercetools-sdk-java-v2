
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLPriceChangedErrorQueryBuilderDsl {
    public GraphQLPriceChangedErrorQueryBuilderDsl() {
    }

    public static GraphQLPriceChangedErrorQueryBuilderDsl of() {
        return new GraphQLPriceChangedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLPriceChangedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLPriceChangedErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<GraphQLPriceChangedErrorQueryBuilderDsl> lineItems() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
            p -> new CombinationQueryPredicate<>(p, GraphQLPriceChangedErrorQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<GraphQLPriceChangedErrorQueryBuilderDsl> shipping() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipping")),
            p -> new CombinationQueryPredicate<>(p, GraphQLPriceChangedErrorQueryBuilderDsl::of));
    }

}
