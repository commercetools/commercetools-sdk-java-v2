
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApproverConjunctionDraftQueryBuilderDsl {
    public ApproverConjunctionDraftQueryBuilderDsl() {
    }

    public static ApproverConjunctionDraftQueryBuilderDsl of() {
        return new ApproverConjunctionDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ApproverConjunctionDraftQueryBuilderDsl> and(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverDisjunctionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverDisjunctionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("and"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.approval_rule.ApproverDisjunctionDraftQueryBuilderDsl.of())),
            ApproverConjunctionDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApproverConjunctionDraftQueryBuilderDsl> and() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("and")),
            p -> new CombinationQueryPredicate<>(p, ApproverConjunctionDraftQueryBuilderDsl::of));
    }

}
