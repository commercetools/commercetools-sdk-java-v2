
package com.commercetools.api.predicates.query.approval_rule;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleSetDescriptionActionQueryBuilderDsl {
    public ApprovalRuleSetDescriptionActionQueryBuilderDsl() {
    }

    public static ApprovalRuleSetDescriptionActionQueryBuilderDsl of() {
        return new ApprovalRuleSetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetDescriptionActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleSetDescriptionActionQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleSetDescriptionActionQueryBuilderDsl::of));
    }

}
