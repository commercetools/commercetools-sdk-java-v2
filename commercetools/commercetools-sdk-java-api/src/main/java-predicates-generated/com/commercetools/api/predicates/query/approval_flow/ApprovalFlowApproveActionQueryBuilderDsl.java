
package com.commercetools.api.predicates.query.approval_flow;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowApproveActionQueryBuilderDsl {
    public ApprovalFlowApproveActionQueryBuilderDsl() {
    }

    public static ApprovalFlowApproveActionQueryBuilderDsl of() {
        return new ApprovalFlowApproveActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowApproveActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowApproveActionQueryBuilderDsl::of));
    }

}
