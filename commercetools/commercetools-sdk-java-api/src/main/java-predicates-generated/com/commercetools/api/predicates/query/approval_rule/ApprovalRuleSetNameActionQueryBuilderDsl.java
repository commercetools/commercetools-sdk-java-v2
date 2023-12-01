
package com.commercetools.api.predicates.query.approval_rule;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleSetNameActionQueryBuilderDsl {
    public ApprovalRuleSetNameActionQueryBuilderDsl() {
    }

    public static ApprovalRuleSetNameActionQueryBuilderDsl of() {
        return new ApprovalRuleSetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetNameActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetNameActionQueryBuilderDsl::of));
    }

}
