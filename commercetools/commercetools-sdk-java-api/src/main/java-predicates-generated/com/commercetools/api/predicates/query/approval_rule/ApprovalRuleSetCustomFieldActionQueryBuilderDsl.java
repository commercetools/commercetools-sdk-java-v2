
package com.commercetools.api.predicates.query.approval_rule;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleSetCustomFieldActionQueryBuilderDsl {
    public ApprovalRuleSetCustomFieldActionQueryBuilderDsl() {
    }

    public static ApprovalRuleSetCustomFieldActionQueryBuilderDsl of() {
        return new ApprovalRuleSetCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetCustomFieldActionQueryBuilderDsl::of));
    }

}
