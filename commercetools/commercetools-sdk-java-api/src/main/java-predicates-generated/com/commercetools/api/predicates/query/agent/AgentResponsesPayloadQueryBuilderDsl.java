
package com.commercetools.api.predicates.query.agent;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class AgentResponsesPayloadQueryBuilderDsl {
    public AgentResponsesPayloadQueryBuilderDsl() {
    }

    public static AgentResponsesPayloadQueryBuilderDsl of() {
        return new AgentResponsesPayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<AgentResponsesPayloadQueryBuilderDsl> outputType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("outputType")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesPayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesPayloadQueryBuilderDsl> locale() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("locale")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesPayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<AgentResponsesPayloadQueryBuilderDsl> prompt() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prompt")),
            p -> new CombinationQueryPredicate<>(p, AgentResponsesPayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<AgentResponsesPayloadQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitResourceIdentifierQueryBuilderDsl
                            .of())),
            AgentResponsesPayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<AgentResponsesPayloadQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("store"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            AgentResponsesPayloadQueryBuilderDsl::of);
    }

}
