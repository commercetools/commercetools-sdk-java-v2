
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentExtractionFailedErrorQueryBuilderDsl {
    public AgentExtractionFailedErrorQueryBuilderDsl() {
    }

    public static AgentExtractionFailedErrorQueryBuilderDsl of() {
        return new AgentExtractionFailedErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentExtractionFailedErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentExtractionFailedErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentExtractionFailedErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentExtractionFailedErrorQueryBuilderDsl::of));
    }

}
