
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowApprovedMessagePayloadQueryBuilderDsl {
    public ApprovalFlowApprovedMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalFlowApprovedMessagePayloadQueryBuilderDsl of() {
        return new ApprovalFlowApprovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowApprovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowApprovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowApprovedMessagePayloadQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            ApprovalFlowApprovedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowApprovedMessagePayloadQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of())),
            ApprovalFlowApprovedMessagePayloadQueryBuilderDsl::of);
    }

}
