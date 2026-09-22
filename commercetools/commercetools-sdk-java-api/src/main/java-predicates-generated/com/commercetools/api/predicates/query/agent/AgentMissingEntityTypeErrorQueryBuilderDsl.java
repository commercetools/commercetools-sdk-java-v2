
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentMissingEntityTypeErrorQueryBuilderDsl {
    public AgentMissingEntityTypeErrorQueryBuilderDsl() {
    }

    public static AgentMissingEntityTypeErrorQueryBuilderDsl of() {
        return new AgentMissingEntityTypeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentMissingEntityTypeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingEntityTypeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentMissingEntityTypeErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingEntityTypeErrorQueryBuilderDsl::of));
    }

}
