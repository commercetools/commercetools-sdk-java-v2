
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowRejectedMessagePayloadQueryBuilderDsl {
    public ApprovalFlowRejectedMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalFlowRejectedMessagePayloadQueryBuilderDsl of() {
        return new ApprovalFlowRejectedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowRejectedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowRejectedMessagePayloadQueryBuilderDsl> associate(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("associate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            ApprovalFlowRejectedMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ApprovalFlowRejectedMessagePayloadQueryBuilderDsl> rejectionReason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rejectionReason")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowRejectedMessagePayloadQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of())),
            ApprovalFlowRejectedMessagePayloadQueryBuilderDsl::of);
    }

}
