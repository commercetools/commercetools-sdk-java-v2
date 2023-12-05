
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRulePagedQueryResponseQueryBuilderDsl {
    public ApprovalRulePagedQueryResponseQueryBuilderDsl() {
    }

    public static ApprovalRulePagedQueryResponseQueryBuilderDsl of() {
        return new ApprovalRulePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ApprovalRulePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRulePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRulePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApprovalRulePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRulePagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.ApprovalRuleQueryBuilderDsl.of())),
            ApprovalRulePagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalRulePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRulePagedQueryResponseQueryBuilderDsl::of));
    }

}
