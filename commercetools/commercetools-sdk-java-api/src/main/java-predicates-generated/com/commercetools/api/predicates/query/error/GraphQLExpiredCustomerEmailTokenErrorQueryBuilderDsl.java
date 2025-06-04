
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLExpiredCustomerEmailTokenErrorQueryBuilderDsl {
    public GraphQLExpiredCustomerEmailTokenErrorQueryBuilderDsl() {
    }

    public static GraphQLExpiredCustomerEmailTokenErrorQueryBuilderDsl of() {
        return new GraphQLExpiredCustomerEmailTokenErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLExpiredCustomerEmailTokenErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLExpiredCustomerEmailTokenErrorQueryBuilderDsl::of));
    }

}
