
package com.commercetools.api.predicates.query.agent;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AgentResponsesQuoteRequestSuccessQueryBuilderDsl {
    public AgentResponsesQuoteRequestSuccessQueryBuilderDsl() {
    }

    public static AgentResponsesQuoteRequestSuccessQueryBuilderDsl of() {
        return new AgentResponsesQuoteRequestSuccessQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentResponsesQuoteRequestSuccessQueryBuilderDsl> entityType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("entityType")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesQuoteRequestSuccessQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesQuoteRequestSuccessQueryBuilderDsl> warnings(
            Function<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("warnings"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl.of())),
            AgentResponsesQuoteRequestSuccessQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AgentResponsesQuoteRequestSuccessQueryBuilderDsl> warnings() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("warnings")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesQuoteRequestSuccessQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesQuoteRequestSuccessQueryBuilderDsl> threadId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("threadId")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesQuoteRequestSuccessQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesQuoteRequestSuccessQueryBuilderDsl> entity(
            Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("entity"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl.of())),
            AgentResponsesQuoteRequestSuccessQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<AgentResponsesQuoteRequestSuccessQueryBuilderDsl> cartId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("cartId")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesQuoteRequestSuccessQueryBuilderDsl::of));
    }

}
