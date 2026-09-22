
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentBusinessUnitUnresolvedErrorQueryBuilderDsl {
    public AgentBusinessUnitUnresolvedErrorQueryBuilderDsl() {
    }

    public static AgentBusinessUnitUnresolvedErrorQueryBuilderDsl of() {
        return new AgentBusinessUnitUnresolvedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentBusinessUnitUnresolvedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentBusinessUnitUnresolvedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentBusinessUnitUnresolvedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentBusinessUnitUnresolvedErrorQueryBuilderDsl::of));
    }

}
