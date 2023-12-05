
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl {
    public ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl of() {
        return new ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl> description() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("description")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl> oldDescription() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldDescription")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleDescriptionSetMessagePayloadQueryBuilderDsl::of));
    }

}
