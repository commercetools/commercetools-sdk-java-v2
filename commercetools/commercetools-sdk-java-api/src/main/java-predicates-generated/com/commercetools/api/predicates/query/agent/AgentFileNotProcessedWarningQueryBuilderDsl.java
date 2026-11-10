
package com.commercetools.api.predicates.query.agent;

import com.commercetools.api.predicates.query.*;

public class AgentFileNotProcessedWarningQueryBuilderDsl {
    public AgentFileNotProcessedWarningQueryBuilderDsl() {
    }

    public static AgentFileNotProcessedWarningQueryBuilderDsl of() {
        return new AgentFileNotProcessedWarningQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentFileNotProcessedWarningQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, AgentFileNotProcessedWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentFileNotProcessedWarningQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentFileNotProcessedWarningQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentFileNotProcessedWarningQueryBuilderDsl> fileName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("fileName")),
            p -> new CombinationQueryPredicate<>(p, AgentFileNotProcessedWarningQueryBuilderDsl::of));
    }

}
