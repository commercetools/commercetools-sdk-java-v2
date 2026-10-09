
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class GraphQLAgentShoppingListCreationFailedErrorQueryBuilderDsl {
    public GraphQLAgentShoppingListCreationFailedErrorQueryBuilderDsl() {
    }

    public static GraphQLAgentShoppingListCreationFailedErrorQueryBuilderDsl of() {
        return new GraphQLAgentShoppingListCreationFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLAgentShoppingListCreationFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, GraphQLAgentShoppingListCreationFailedErrorQueryBuilderDsl::of));
    }

}
