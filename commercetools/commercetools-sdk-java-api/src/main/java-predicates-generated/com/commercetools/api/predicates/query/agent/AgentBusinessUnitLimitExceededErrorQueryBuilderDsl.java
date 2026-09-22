
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentBusinessUnitLimitExceededErrorQueryBuilderDsl {
    public AgentBusinessUnitLimitExceededErrorQueryBuilderDsl() {
    }

    public static AgentBusinessUnitLimitExceededErrorQueryBuilderDsl of() {
        return new AgentBusinessUnitLimitExceededErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentBusinessUnitLimitExceededErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentBusinessUnitLimitExceededErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentBusinessUnitLimitExceededErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentBusinessUnitLimitExceededErrorQueryBuilderDsl::of));
    }

}
