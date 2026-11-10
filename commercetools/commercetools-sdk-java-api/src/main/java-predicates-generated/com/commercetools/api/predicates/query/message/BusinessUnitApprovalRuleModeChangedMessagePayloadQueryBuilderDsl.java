
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl {
    public BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl> approvalRuleMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("approvalRuleMode")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl> oldApprovalRuleMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldApprovalRuleMode")),
            p -> new CombinationQueryPredicate<>(p,
                BusinessUnitApprovalRuleModeChangedMessagePayloadQueryBuilderDsl::of));
    }

}
