
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class GraphQLSyntaxErrorErrorQueryBuilderDsl {
    public GraphQLSyntaxErrorErrorQueryBuilderDsl() {
    }

    public static GraphQLSyntaxErrorErrorQueryBuilderDsl of() {
        return new GraphQLSyntaxErrorErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLSyntaxErrorErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLSyntaxErrorErrorQueryBuilderDsl::of));
    }

}
