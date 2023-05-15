
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLNoMatchingProductDiscountFoundErrorQueryBuilderDsl {
    public GraphQLNoMatchingProductDiscountFoundErrorQueryBuilderDsl() {
    }

    public static GraphQLNoMatchingProductDiscountFoundErrorQueryBuilderDsl of() {
        return new GraphQLNoMatchingProductDiscountFoundErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLNoMatchingProductDiscountFoundErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLNoMatchingProductDiscountFoundErrorQueryBuilderDsl::of));
    }
}
