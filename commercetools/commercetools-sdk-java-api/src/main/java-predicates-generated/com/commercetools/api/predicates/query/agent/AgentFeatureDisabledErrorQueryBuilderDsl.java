
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentFeatureDisabledErrorQueryBuilderDsl {
    public AgentFeatureDisabledErrorQueryBuilderDsl() {
    }

    public static AgentFeatureDisabledErrorQueryBuilderDsl of() {
        return new AgentFeatureDisabledErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentFeatureDisabledErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentFeatureDisabledErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentFeatureDisabledErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentFeatureDisabledErrorQueryBuilderDsl::of));
    }

}
