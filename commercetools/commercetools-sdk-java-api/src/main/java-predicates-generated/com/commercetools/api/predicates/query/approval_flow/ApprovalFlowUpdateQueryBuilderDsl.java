
package com.commercetools.api.predicates.query.approval_flow;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowUpdateQueryBuilderDsl {
    public ApprovalFlowUpdateQueryBuilderDsl() {
    }

    public static ApprovalFlowUpdateQueryBuilderDsl of() {
        return new ApprovalFlowUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ApprovalFlowUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_flow.ApprovalFlowUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.approval_flow.ApprovalFlowUpdateActionQueryBuilderDsl.of())),
            ApprovalFlowUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalFlowUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowUpdateQueryBuilderDsl::of));
    }

}
