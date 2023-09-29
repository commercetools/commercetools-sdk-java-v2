
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl {
    public ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl() {
    }

    public static ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl of() {
        return new ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl> requesters(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("requesters"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl.of())),
            ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl> requesters() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requesters")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl> oldRequesters(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldRequesters"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleRequesterQueryBuilderDsl.of())),
            ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl> oldRequesters() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldRequesters")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleRequestersSetMessagePayloadQueryBuilderDsl::of));
    }

}
