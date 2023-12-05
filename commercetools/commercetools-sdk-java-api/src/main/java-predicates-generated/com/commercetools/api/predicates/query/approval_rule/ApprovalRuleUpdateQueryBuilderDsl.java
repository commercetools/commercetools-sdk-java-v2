
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApprovalRuleUpdateQueryBuilderDsl {
    public ApprovalRuleUpdateQueryBuilderDsl() {
    }

    public static ApprovalRuleUpdateQueryBuilderDsl of() {
        return new ApprovalRuleUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ApprovalRuleUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApprovalRuleUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApprovalRuleUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.approval_rule.ApprovalRuleUpdateActionQueryBuilderDsl.of())),
            ApprovalRuleUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApprovalRuleUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, ApprovalRuleUpdateQueryBuilderDsl::of));
    }

}
