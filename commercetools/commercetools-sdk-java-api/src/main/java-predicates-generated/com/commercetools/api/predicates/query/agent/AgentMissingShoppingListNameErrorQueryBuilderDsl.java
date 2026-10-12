
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentMissingShoppingListNameErrorQueryBuilderDsl {
    public AgentMissingShoppingListNameErrorQueryBuilderDsl() {
    }

    public static AgentMissingShoppingListNameErrorQueryBuilderDsl of() {
        return new AgentMissingShoppingListNameErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentMissingShoppingListNameErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingShoppingListNameErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentMissingShoppingListNameErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingShoppingListNameErrorQueryBuilderDsl::of));
    }

}
