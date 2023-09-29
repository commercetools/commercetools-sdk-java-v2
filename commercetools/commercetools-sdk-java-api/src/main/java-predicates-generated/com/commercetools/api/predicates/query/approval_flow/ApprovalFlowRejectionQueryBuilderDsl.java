
package com.commercetools.api.predicates.query.approval_flow;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowRejectionQueryBuilderDsl {
    public ApprovalFlowRejectionQueryBuilderDsl() {
    }

    public static ApprovalFlowRejectionQueryBuilderDsl of() {
        return new ApprovalFlowRejectionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ApprovalFlowRejectionQueryBuilderDsl> rejecter(
            Function<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("rejecter"))
                .inner(fn.apply(com.commercetools.api.predicates.query.business_unit.AssociateQueryBuilderDsl.of())),
            ApprovalFlowRejectionQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<ApprovalFlowRejectionQueryBuilderDsl> rejectedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("rejectedAt")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalFlowRejectionQueryBuilderDsl> reason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reason")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowRejectionQueryBuilderDsl::of));
    }

}
