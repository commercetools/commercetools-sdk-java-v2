
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentStoreUnresolvedErrorQueryBuilderDsl {
    public AgentStoreUnresolvedErrorQueryBuilderDsl() {
    }

    public static AgentStoreUnresolvedErrorQueryBuilderDsl of() {
        return new AgentStoreUnresolvedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentStoreUnresolvedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentStoreUnresolvedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentStoreUnresolvedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentStoreUnresolvedErrorQueryBuilderDsl::of));
    }

}
