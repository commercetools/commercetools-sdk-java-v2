
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentProductSearchNotEnabledErrorQueryBuilderDsl {
    public AgentProductSearchNotEnabledErrorQueryBuilderDsl() {
    }

    public static AgentProductSearchNotEnabledErrorQueryBuilderDsl of() {
        return new AgentProductSearchNotEnabledErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentProductSearchNotEnabledErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentProductSearchNotEnabledErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentProductSearchNotEnabledErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentProductSearchNotEnabledErrorQueryBuilderDsl::of));
    }

}
