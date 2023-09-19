
package com.commercetools.api.predicates.query.approval_flow;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowRejectActionQueryBuilderDsl {
    public ApprovalFlowRejectActionQueryBuilderDsl() {
    }

    public static ApprovalFlowRejectActionQueryBuilderDsl of() {
        return new ApprovalFlowRejectActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowRejectActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalFlowRejectActionQueryBuilderDsl> reason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reason")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectActionQueryBuilderDsl::of));
    }

}
