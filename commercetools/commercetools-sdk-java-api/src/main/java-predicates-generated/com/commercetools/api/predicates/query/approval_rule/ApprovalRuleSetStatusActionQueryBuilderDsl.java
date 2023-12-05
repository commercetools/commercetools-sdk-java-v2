
package com.commercetools.api.predicates.query.approval_rule;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleSetStatusActionQueryBuilderDsl {
    public ApprovalRuleSetStatusActionQueryBuilderDsl() {
    }

    public static ApprovalRuleSetStatusActionQueryBuilderDsl of() {
        return new ApprovalRuleSetStatusActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetStatusActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetStatusActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetStatusActionQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetStatusActionQueryBuilderDsl::of));
    }

}
