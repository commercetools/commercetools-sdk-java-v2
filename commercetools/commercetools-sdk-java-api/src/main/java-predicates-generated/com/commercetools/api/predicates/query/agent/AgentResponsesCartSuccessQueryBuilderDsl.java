
package com.commercetools.api.predicates.query.agent;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AgentResponsesCartSuccessQueryBuilderDsl {
    public AgentResponsesCartSuccessQueryBuilderDsl() {
    }

    public static AgentResponsesCartSuccessQueryBuilderDsl of() {
        return new AgentResponsesCartSuccessQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentResponsesCartSuccessQueryBuilderDsl> entityType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("entityType")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesCartSuccessQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesCartSuccessQueryBuilderDsl> warnings(
            Function<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("warnings"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl.of())),
            AgentResponsesCartSuccessQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<AgentResponsesCartSuccessQueryBuilderDsl> warnings() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("warnings")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesCartSuccessQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesCartSuccessQueryBuilderDsl> threadId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("threadId")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesCartSuccessQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesCartSuccessQueryBuilderDsl> entity(
            Function<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("entity"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartQueryBuilderDsl.of())),
            AgentResponsesCartSuccessQueryBuilderDsl::of);
    }

}
