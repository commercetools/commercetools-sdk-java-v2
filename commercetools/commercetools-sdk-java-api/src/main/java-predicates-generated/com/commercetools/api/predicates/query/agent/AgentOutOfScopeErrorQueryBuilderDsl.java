
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentOutOfScopeErrorQueryBuilderDsl {
    public AgentOutOfScopeErrorQueryBuilderDsl() {
    }

    public static AgentOutOfScopeErrorQueryBuilderDsl of() {
        return new AgentOutOfScopeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentOutOfScopeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentOutOfScopeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentOutOfScopeErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentOutOfScopeErrorQueryBuilderDsl::of));
    }

}
