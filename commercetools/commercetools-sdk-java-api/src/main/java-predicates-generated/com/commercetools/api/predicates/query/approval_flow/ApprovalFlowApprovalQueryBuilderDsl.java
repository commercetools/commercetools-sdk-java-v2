
package com.commercetools.api.predicates.query.approval_flow;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowApprovalQueryBuilderDsl {
    public ApprovalFlowApprovalQueryBuilderDsl() {
    }

    public static ApprovalFlowApprovalQueryBuilderDsl of() {
        return new ApprovalFlowApprovalQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ApprovalFlowApprovalQueryBuilderDsl> approver(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("approver"))
                .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl.of())),
            ApprovalFlowApprovalQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<ApprovalFlowApprovalQueryBuilderDsl> approvedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("approvedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowApprovalQueryBuilderDsl::of));
    }

}
