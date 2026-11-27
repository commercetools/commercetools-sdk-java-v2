
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentMissingCurrencyErrorQueryBuilderDsl {
    public AgentMissingCurrencyErrorQueryBuilderDsl() {
    }

    public static AgentMissingCurrencyErrorQueryBuilderDsl of() {
        return new AgentMissingCurrencyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentMissingCurrencyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingCurrencyErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentMissingCurrencyErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingCurrencyErrorQueryBuilderDsl::of));
    }

}
