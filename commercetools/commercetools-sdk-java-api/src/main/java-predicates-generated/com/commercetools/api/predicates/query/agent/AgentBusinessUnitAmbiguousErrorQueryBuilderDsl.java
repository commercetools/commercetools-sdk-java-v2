
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentBusinessUnitAmbiguousErrorQueryBuilderDsl {
    public AgentBusinessUnitAmbiguousErrorQueryBuilderDsl() {
    }

    public static AgentBusinessUnitAmbiguousErrorQueryBuilderDsl of() {
        return new AgentBusinessUnitAmbiguousErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentBusinessUnitAmbiguousErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentBusinessUnitAmbiguousErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentBusinessUnitAmbiguousErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentBusinessUnitAmbiguousErrorQueryBuilderDsl::of));
    }

}
