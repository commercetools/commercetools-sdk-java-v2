
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLCustomerSearchProjectNotIndexedErrorQueryBuilderDsl {
    public GraphQLCustomerSearchProjectNotIndexedErrorQueryBuilderDsl() {
    }

    public static GraphQLCustomerSearchProjectNotIndexedErrorQueryBuilderDsl of() {
        return new GraphQLCustomerSearchProjectNotIndexedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLCustomerSearchProjectNotIndexedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLCustomerSearchProjectNotIndexedErrorQueryBuilderDsl::of));
    }

}
