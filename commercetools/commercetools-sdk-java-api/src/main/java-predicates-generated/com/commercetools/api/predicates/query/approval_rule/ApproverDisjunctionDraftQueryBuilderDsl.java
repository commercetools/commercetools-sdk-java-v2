
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApproverDisjunctionDraftQueryBuilderDsl {
    public ApproverDisjunctionDraftQueryBuilderDsl() {
    }

    public static ApproverDisjunctionDraftQueryBuilderDsl of() {
        return new ApproverDisjunctionDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ApproverDisjunctionDraftQueryBuilderDsl> or(
            Function<com.commercetools.api.predicates.query.approval_rule.RuleApproverDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.RuleApproverDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("or"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.approval_rule.RuleApproverDraftQueryBuilderDsl.of())),
            ApproverDisjunctionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApproverDisjunctionDraftQueryBuilderDsl> or() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("or")),
            p -> new CombinationQueryPredicate<>(p, ApproverDisjunctionDraftQueryBuilderDsl::of));
    }

}
