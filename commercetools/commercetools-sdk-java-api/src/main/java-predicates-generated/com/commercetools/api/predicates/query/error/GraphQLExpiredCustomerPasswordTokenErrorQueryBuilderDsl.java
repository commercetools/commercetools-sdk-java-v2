
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLExpiredCustomerPasswordTokenErrorQueryBuilderDsl {
    public GraphQLExpiredCustomerPasswordTokenErrorQueryBuilderDsl() {
    }

    public static GraphQLExpiredCustomerPasswordTokenErrorQueryBuilderDsl of() {
        return new GraphQLExpiredCustomerPasswordTokenErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExpiredCustomerPasswordTokenErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExpiredCustomerPasswordTokenErrorQueryBuilderDsl::of));
    }

}
