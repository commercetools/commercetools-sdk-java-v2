
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleNameSetMessagePayloadQueryBuilderDsl {
    public ApprovalRuleNameSetMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalRuleNameSetMessagePayloadQueryBuilderDsl of() {
        return new ApprovalRuleNameSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleNameSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleNameSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleNameSetMessagePayloadQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleNameSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApprovalRuleNameSetMessagePayloadQueryBuilderDsl> oldName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldName")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleNameSetMessagePayloadQueryBuilderDsl::of));
    }

}
