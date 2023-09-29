
package com.commercetools.api.predicates.query.approval_rule;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleSetKeyActionQueryBuilderDsl {
    public ApprovalRuleSetKeyActionQueryBuilderDsl() {
    }

    public static ApprovalRuleSetKeyActionQueryBuilderDsl of() {
        return new ApprovalRuleSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetKeyActionQueryBuilderDsl::of));
    }

}
