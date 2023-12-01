
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowCreatedMessagePayloadQueryBuilderDsl {
    public ApprovalFlowCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalFlowCreatedMessagePayloadQueryBuilderDsl of() {
        return new ApprovalFlowCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowCreatedMessagePayloadQueryBuilderDsl> approvalFlow(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("approvalFlow"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_flow.ApprovalFlowQueryBuilderDsl.of())),
            ApprovalFlowCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
