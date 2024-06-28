
package com.commercetools.api.predicates.query.business_unit;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl {
    public BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl() {
    }

    public static BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl of() {
        return new BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl> approvalRuleMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("approvalRuleMode")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitChangeApprovalRuleModeActionQueryBuilderDsl::of));
    }

}
