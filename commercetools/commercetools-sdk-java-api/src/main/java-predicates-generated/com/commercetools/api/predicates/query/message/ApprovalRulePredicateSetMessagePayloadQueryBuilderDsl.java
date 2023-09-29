
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl {
    public ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl of() {
        return new ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl> predicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("predicate")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl> oldPredicate() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldPredicate")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePredicateSetMessagePayloadQueryBuilderDsl::of));
    }

}
