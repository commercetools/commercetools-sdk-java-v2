
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentShoppingListUnresolvedErrorQueryBuilderDsl {
    public AgentShoppingListUnresolvedErrorQueryBuilderDsl() {
    }

    public static AgentShoppingListUnresolvedErrorQueryBuilderDsl of() {
        return new AgentShoppingListUnresolvedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentShoppingListUnresolvedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentShoppingListUnresolvedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentShoppingListUnresolvedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentShoppingListUnresolvedErrorQueryBuilderDsl::of));
    }

}
