
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentShoppingListCreationFailedErrorQueryBuilderDsl {
    public AgentShoppingListCreationFailedErrorQueryBuilderDsl() {
    }

    public static AgentShoppingListCreationFailedErrorQueryBuilderDsl of() {
        return new AgentShoppingListCreationFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentShoppingListCreationFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentShoppingListCreationFailedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentShoppingListCreationFailedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentShoppingListCreationFailedErrorQueryBuilderDsl::of));
    }

}
