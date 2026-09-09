
package com.commercetools.api.predicates.query.agent;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AgentResponsesSuccessQueryBuilderDsl {
    public AgentResponsesSuccessQueryBuilderDsl() {
    }

    public static AgentResponsesSuccessQueryBuilderDsl of() {
        return new AgentResponsesSuccessQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentResponsesSuccessQueryBuilderDsl> entityType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("entityType")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesSuccessQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesSuccessQueryBuilderDsl> warnings(
            Function<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("warnings"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl.of())),
            AgentResponsesSuccessQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AgentResponsesSuccessQueryBuilderDsl> warnings() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("warnings")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesSuccessQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesSuccessQueryBuilderDsl> threadId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("threadId")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesSuccessQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesSuccessQueryBuilderDsl> asCart(
            Function<com.commercetools.api.predicates.query.agent.AgentResponsesCartSuccessQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.agent.AgentResponsesCartSuccessQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.agent.AgentResponsesCartSuccessQueryBuilderDsl.of()),
            AgentResponsesSuccessQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AgentResponsesSuccessQueryBuilderDsl> asQuoteRequest(
            Function<com.commercetools.api.predicates.query.agent.AgentResponsesQuoteRequestSuccessQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.agent.AgentResponsesQuoteRequestSuccessQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.agent.AgentResponsesQuoteRequestSuccessQueryBuilderDsl.of()),
            AgentResponsesSuccessQueryBuilderDsl::of);
    }
}
