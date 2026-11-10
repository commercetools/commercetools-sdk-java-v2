
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentMissingShoppingListNameErrorQueryBuilderDsl {
    public GraphQLAgentMissingShoppingListNameErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentMissingShoppingListNameErrorQueryBuilderDsl of() {
        return new GraphQLAgentMissingShoppingListNameErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentMissingShoppingListNameErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentMissingShoppingListNameErrorQueryBuilderDsl::of));
    }

}
