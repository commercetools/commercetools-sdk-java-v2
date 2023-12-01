
package com.commercetools.api.predicates.query.approval_rule;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleSetPredicateActionQueryBuilderDsl {
    public ApprovalRuleSetPredicateActionQueryBuilderDsl() {
    }

    public static ApprovalRuleSetPredicateActionQueryBuilderDsl of() {
        return new ApprovalRuleSetPredicateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetPredicateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetPredicateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetPredicateActionQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetPredicateActionQueryBuilderDsl::of));
    }

}
