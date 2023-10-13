
package com.commercetools.api.predicates.query.approval_rule;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApproverHierarchyDraftQueryBuilderDsl {
    public ApproverHierarchyDraftQueryBuilderDsl() {
    }

    public static ApproverHierarchyDraftQueryBuilderDsl of() {
        return new ApproverHierarchyDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ApproverHierarchyDraftQueryBuilderDsl> tiers(
            Function<com.commercetools.api.predicates.query.approval_rule.ApproverConjunctionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.approval_rule.ApproverConjunctionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("tiers"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.approval_rule.ApproverConjunctionDraftQueryBuilderDsl.of())),
            ApproverHierarchyDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApproverHierarchyDraftQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
            p -> new CombinationQueryPredicate<>(p, ApproverHierarchyDraftQueryBuilderDsl::of));
    }

}
