
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleKeySetMessagePayloadQueryBuilderDsl {
    public ApprovalRuleKeySetMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalRuleKeySetMessagePayloadQueryBuilderDsl of() {
        return new ApprovalRuleKeySetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleKeySetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleKeySetMessagePayloadQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleKeySetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleKeySetMessagePayloadQueryBuilderDsl> oldKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldKey")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleKeySetMessagePayloadQueryBuilderDsl::of));
    }

}
