
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentMissingCountryErrorQueryBuilderDsl {
    public AgentMissingCountryErrorQueryBuilderDsl() {
    }

    public static AgentMissingCountryErrorQueryBuilderDsl of() {
        return new AgentMissingCountryErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentMissingCountryErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingCountryErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentMissingCountryErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentMissingCountryErrorQueryBuilderDsl::of));
    }

}
