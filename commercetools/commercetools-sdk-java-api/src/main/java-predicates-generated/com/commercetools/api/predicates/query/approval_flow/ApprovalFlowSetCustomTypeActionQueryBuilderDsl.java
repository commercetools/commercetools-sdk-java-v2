
package com.commercetools.api.predicates.query.approval_flow;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowSetCustomTypeActionQueryBuilderDsl {
    public ApprovalFlowSetCustomTypeActionQueryBuilderDsl() {
    }

    public static ApprovalFlowSetCustomTypeActionQueryBuilderDsl of() {
        return new ApprovalFlowSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowSetCustomTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalFlowSetCustomTypeActionQueryBuilderDsl> type(
            Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("type"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            ApprovalFlowSetCustomTypeActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ApprovalFlowSetCustomTypeActionQueryBuilderDsl> fields(
            Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            ApprovalFlowSetCustomTypeActionQueryBuilderDsl::of);
    }

}
