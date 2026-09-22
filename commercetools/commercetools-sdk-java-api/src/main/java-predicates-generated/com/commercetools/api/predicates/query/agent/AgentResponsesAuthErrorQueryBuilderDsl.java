
package com.commercetools.api.predicates.query.agent;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AgentResponsesAuthErrorQueryBuilderDsl {
    public AgentResponsesAuthErrorQueryBuilderDsl() {
    }

    public static AgentResponsesAuthErrorQueryBuilderDsl of() {
        return new AgentResponsesAuthErrorQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<AgentResponsesAuthErrorQueryBuilderDsl> statusCode() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("statusCode")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesAuthErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesAuthErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesAuthErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesAuthErrorQueryBuilderDsl> errors(
            Function<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("errors"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl.of())),
            AgentResponsesAuthErrorQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AgentResponsesAuthErrorQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesAuthErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesAuthErrorQueryBuilderDsl> error() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("error")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesAuthErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesAuthErrorQueryBuilderDsl> error_description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("error_description")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesAuthErrorQueryBuilderDsl::of));
    }

}
