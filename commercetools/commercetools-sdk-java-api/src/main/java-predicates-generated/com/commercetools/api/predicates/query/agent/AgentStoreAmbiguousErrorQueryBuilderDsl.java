
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentStoreAmbiguousErrorQueryBuilderDsl {
    public AgentStoreAmbiguousErrorQueryBuilderDsl() {
    }

    public static AgentStoreAmbiguousErrorQueryBuilderDsl of() {
        return new AgentStoreAmbiguousErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentStoreAmbiguousErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentStoreAmbiguousErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentStoreAmbiguousErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentStoreAmbiguousErrorQueryBuilderDsl::of));
    }

}
