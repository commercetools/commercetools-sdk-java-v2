
package com.commercetools.api.predicates.query.agent;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AgentResponsesErrorResponseQueryBuilderDsl {
    public AgentResponsesErrorResponseQueryBuilderDsl() {
    }

    public static AgentResponsesErrorResponseQueryBuilderDsl of() {
        return new AgentResponsesErrorResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<AgentResponsesErrorResponseQueryBuilderDsl> statusCode() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("statusCode")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesErrorResponseQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesErrorResponseQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesErrorResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesErrorResponseQueryBuilderDsl> errors(
            Function<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("errors"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl.of())),
            AgentResponsesErrorResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AgentResponsesErrorResponseQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesErrorResponseQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesErrorResponseQueryBuilderDsl> threadId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("threadId")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesErrorResponseQueryBuilderDsl::of));
    }

}
