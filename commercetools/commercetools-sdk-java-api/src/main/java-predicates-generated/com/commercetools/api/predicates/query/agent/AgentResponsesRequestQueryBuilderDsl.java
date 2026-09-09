
package com.commercetools.api.predicates.query.agent;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AgentResponsesRequestQueryBuilderDsl {
    public AgentResponsesRequestQueryBuilderDsl() {
    }

    public static AgentResponsesRequestQueryBuilderDsl of() {
        return new AgentResponsesRequestQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentResponsesRequestQueryBuilderDsl> outputType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("outputType")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesRequestQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesRequestQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesRequestQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesRequestQueryBuilderDsl> prompt() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prompt")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesRequestQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesRequestQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            AgentResponsesRequestQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AgentResponsesRequestQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            AgentResponsesRequestQueryBuilderDsl::of);
    }

}
