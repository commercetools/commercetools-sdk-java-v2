
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentShoppingListUnresolvedErrorQueryBuilderDsl {
    public GraphQLAgentShoppingListUnresolvedErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentShoppingListUnresolvedErrorQueryBuilderDsl of() {
        return new GraphQLAgentShoppingListUnresolvedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentShoppingListUnresolvedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentShoppingListUnresolvedErrorQueryBuilderDsl::of));
    }

}
