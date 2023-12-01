
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowCompletedMessagePayloadQueryBuilderDsl {
    public ApprovalFlowCompletedMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalFlowCompletedMessagePayloadQueryBuilderDsl of() {
        return new ApprovalFlowCompletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowCompletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowCompletedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalFlowCompletedMessagePayloadQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowCompletedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowCompletedMessagePayloadQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of())),
            ApprovalFlowCompletedMessagePayloadQueryBuilderDsl::of);
    }

}
