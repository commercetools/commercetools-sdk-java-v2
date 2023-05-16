
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLInvalidSubjectErrorQueryBuilderDsl {
    public GraphQLInvalidSubjectErrorQueryBuilderDsl() {
    }

    public static GraphQLInvalidSubjectErrorQueryBuilderDsl of() {
        return new GraphQLInvalidSubjectErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLInvalidSubjectErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLInvalidSubjectErrorQueryBuilderDsl::of));
    }

}
