
package com.commercetools.api.predicates.query.approval_flow;

import com.commercetools.api.predicates.query.*;

public class ApprovalFlowSetCustomFieldActionQueryBuilderDsl {
    public ApprovalFlowSetCustomFieldActionQueryBuilderDsl() {
    }

    public static ApprovalFlowSetCustomFieldActionQueryBuilderDsl of() {
        return new ApprovalFlowSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalFlowSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalFlowSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalFlowSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ApprovalFlowSetCustomFieldActionQueryBuilderDsl::of));
    }

}
