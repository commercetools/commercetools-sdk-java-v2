
package com.commercetools.api.predicates.query.agent;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AgentResponsesMultipartRequestQueryBuilderDsl {
    public AgentResponsesMultipartRequestQueryBuilderDsl() {
    }

    public static AgentResponsesMultipartRequestQueryBuilderDsl of() {
        return new AgentResponsesMultipartRequestQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AgentResponsesMultipartRequestQueryBuilderDsl> payload(
            Function<com.commercetools.api.predicates.query.agent.AgentResponsesPayloadQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.agent.AgentResponsesPayloadQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("payload"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.agent.AgentResponsesPayloadQueryBuilderDsl.of())),
            AgentResponsesMultipartRequestQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<AgentResponsesMultipartRequestQueryBuilderDsl> files() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("files")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesMultipartRequestQueryBuilderDsl::of));
    }

}
