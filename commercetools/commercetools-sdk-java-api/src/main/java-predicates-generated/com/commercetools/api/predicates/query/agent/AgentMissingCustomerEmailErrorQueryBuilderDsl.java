
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentMissingCustomerEmailErrorQueryBuilderDsl {
    public AgentMissingCustomerEmailErrorQueryBuilderDsl() {
    }

    public static AgentMissingCustomerEmailErrorQueryBuilderDsl of() {
        return new AgentMissingCustomerEmailErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentMissingCustomerEmailErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingCustomerEmailErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentMissingCustomerEmailErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingCustomerEmailErrorQueryBuilderDsl::of));
    }

}
