
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl {
    public ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl of() {
        return new ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl> oldStatus() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStatus")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleStatusSetMessagePayloadQueryBuilderDsl::of));
    }

}
